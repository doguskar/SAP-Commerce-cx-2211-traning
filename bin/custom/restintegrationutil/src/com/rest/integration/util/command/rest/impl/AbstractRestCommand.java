package com.rest.integration.util.command.rest.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.rest.integration.util.command.rest.IRestCommand;
import com.rest.integration.util.command.rest.request.IRequest;
import com.rest.integration.util.command.rest.response.IResponse;
import com.rest.integration.util.exception.RestCommandException;
import com.rest.integration.util.model.RequestLogModel;
import com.rest.integration.util.service.RequestLogService;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import javax.annotation.Resource;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public abstract class AbstractRestCommand<REQUEST extends IRequest, RESPONSE extends IResponse> implements IRestCommand<REQUEST, RESPONSE> {
    private static final Logger LOG = LoggerFactory.getLogger(AbstractRestCommand.class);
    @Resource
    private ModelService modelService;
    @Resource(name = "restCommandObjectMapper")
    private ObjectMapper mapper;
    @Resource
    private RequestLogService requestLogService;
    @Resource
    private ConfigurationService configurationService;

    @Override
    public RESPONSE perform(REQUEST request) throws RestCommandException {//, BaseStoreModel baseStore
        HttpResponse response = null;
        HttpRequestBase baseRequest = null;
        RESPONSE processedResponse = null;
        String responseBody = null;
        Exception exception = null;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String uri = getUri();
            // Add path variables
            if (Objects.nonNull(request.getPathVariables())) {
                uri = setPathVariables(uri, request);
            }
            baseRequest = getHttpBaseRequest(uri);
            // Add Headers
            addHeaders(baseRequest, request);
            // Authorization
            addAuthorization(baseRequest, request);
            // Add body or parameters
            addBody(baseRequest, request);
            addQueryString(baseRequest, request);
            // Execute
            response = httpClient.execute(baseRequest);
            HttpEntity responseEntity = response.getEntity();
            responseBody = Objects.nonNull(responseEntity) ? EntityUtils.toString(responseEntity) : StringUtils.EMPTY;
            processedResponse = processResponse(response, responseBody);
            return processedResponse;
        } catch (IOException e) {
            LOG.error("IOException while performing command", e);
            exception = e;
            throw new RestCommandException(e);
        } catch (URISyntaxException e) {
            LOG.error("URISyntaxException while performing command", e);
            exception = e;
            throw new RestCommandException(e);
        } catch (RestCommandException e) {
            LOG.error("RestCommandException while performing command", e);
            exception = e;
            throw new RestCommandException(e);
        } finally {
            // Create request log
            if (isCreateRequestLogActive(request)) {
                final RequestLogModel requestLog = createRequestLog(request, response, baseRequest, responseBody, exception);
                if (Objects.nonNull(processedResponse)) {
                    processedResponse.setRequestLog(requestLog);
                } else {
                    request.setRequestLog(requestLog);
                }
            }
        }
    }

    public void addHeaders(HttpRequestBase baseRequest, REQUEST request) {
        baseRequest.addHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        baseRequest.addHeader(HttpHeaders.CONTENT_TYPE, getContentType());
    }

    public String getContentType() {
        return MediaType.APPLICATION_JSON_VALUE;
    }

    public void addAuthorization(HttpRequestBase baseRequest, REQUEST request) {
        //baseRequest.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + request.getAccessToken());
        //baseRequest.addHeader(HttpHeaders.AUTHORIZATION, "Basic " + Base64.getEncoder().encodeToString(token.getBytes()));
    }

    public void addBody(HttpRequestBase baseRequest, REQUEST request) throws IOException {
        if (baseRequest instanceof HttpEntityEnclosingRequestBase) {
            setRequestBody((HttpEntityEnclosingRequestBase) baseRequest, request);
        }
    }

    public void addQueryString(HttpRequestBase baseRequest, REQUEST request) throws IOException, URISyntaxException {
        if (baseRequest instanceof HttpGet) {
            addQueryStringToUri(baseRequest, request);
        }
    }

    @Override
    public RESPONSE processResponse(HttpResponse response, String responseBody) throws RestCommandException {
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            Status status = Status.fromStatusCode(statusCode);
            Header[] contentTypes = response.getHeaders(HttpHeaders.CONTENT_TYPE);
            String contentType = contentTypes.length > 0 ? contentTypes[0].getValue() : StringUtils.EMPTY;
            if (Objects.nonNull(status) && Status.Family.SUCCESSFUL.equals(status.getFamily())) {
                return StringUtils.isNotBlank(responseBody) && contentType.contains(MediaType.APPLICATION_JSON_VALUE)
                        ? mapper.readValue(responseBody, getResponseClass()) :
                        getResponseClass().getDeclaredConstructor().newInstance();
            }
            LOG.error("Unsuccessful response. statusCode: {}, responseBody: {}", statusCode, responseBody);
            throw new RestCommandException(responseBody);
        } catch (IOException e) {
            LOG.error("IOException is occured during integration response unwrapping:" + e);
            throw new RestCommandException(e);
        } catch (ReflectiveOperationException e) {
            LOG.error("ReflectiveOperationException, new Instance have not been created", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getUri() throws RestCommandException {
        String baseUrl = getBaseUrl();
        if (StringUtils.isNotBlank(baseUrl)) {
            if (StringUtils.endsWith(baseUrl, "/")) {
                baseUrl = StringUtils.removeEnd(baseUrl, "/");
            }
            final String path = getPath();
            return StringUtils.isNotBlank(path) ? StringUtils.startsWith(path, "/") ? baseUrl + path : baseUrl + "/" + path : baseUrl;
        }
        throw new RestCommandException(String.format("uri is null for %s", getResponseClass()));
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public Class<RESPONSE> getResponseClass() {

        Type bound = AbstractRestCommand.class.getTypeParameters()[1].getBounds()[0];
        bound.getClass();
        return null;
    }

    private HttpRequestBase getHttpBaseRequest(String uri) {
        return switch (getMethod()) {
            case GET -> new HttpGet(uri);
            case POST -> new HttpPost(uri);
            case PATCH -> new HttpPatch(uri);
            case PUT -> new HttpPut(uri);
            default -> new HttpGet(uri);
        };
    }

    protected void setRequestBody(HttpEntityEnclosingRequestBase entityEnclosingRequest, REQUEST request) throws IOException {
        String data = null;
        if (getContentType().contains(MediaType.APPLICATION_FORM_URLENCODED_VALUE)) {
            data = getQueryString(request);
        } else if (getContentType().contains(MediaType.APPLICATION_JSON_VALUE)) {
            ObjectWriter writer = mapper.writer();
            data = writer.writeValueAsString(request);
        }
        if (StringUtils.isNotBlank(data)) {
            HttpEntity entity = new ByteArrayEntity(data.getBytes(StandardCharsets.UTF_8));
            entityEnclosingRequest.setEntity(entity);
        }
    }

    public String getQueryString(REQUEST request) {
        final Map<String, String> map = mapper.convertValue(request, new TypeReference<>() {
        });
        StringBuilder bodyBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (bodyBuilder.length() > 0) {
                bodyBuilder.append("&");
            }
            bodyBuilder.append(entry.getKey()).append("=").append(entry.getValue());
        }
        return bodyBuilder.toString();
    }

    public void addQueryStringToUri(HttpRequestBase requestBase, REQUEST request) throws URISyntaxException {
        List<NameValuePair> params = new ArrayList<>();
        Map<String, String> map = mapper.convertValue(request, new TypeReference<>() {
        });
        map.entrySet().forEach(param -> params.add(new BasicNameValuePair(param.getKey(), param.getValue())));

        URI uri = new URIBuilder(requestBase.getURI()).addParameters(params).build();
        requestBase.setURI(uri);
    }

    private String setPathVariables(String uri, REQUEST request) throws URISyntaxException {
        for (Map.Entry<String, String> entry : request.getPathVariables().entrySet()) {
            uri = uri.replace(entry.getKey(), entry.getValue());
        }
        return uri;
    }

    public RequestLogModel createRequestLog(REQUEST request, HttpResponse response, HttpRequestBase baseRequest, String responseBody, Exception exception) {
        if (isCreateRequestLogActive(request)) {
            final int statusCode = response.getStatusLine().getStatusCode();
            final ObjectWriter writer = mapper.writer();
            String requestBody;
            try {
                requestBody = writer.writeValueAsString(request);
            } catch (JsonProcessingException e) {
                requestBody = "JsonProcessingException is throwed";
            }
            return requestLogService.createRequestLog(
                    requestBody,
                    baseRequest.getURI().toString(),
                    responseBody,
                    statusCode,
                    baseRequest.getMethod(),
                    exception);
        }
        return null;
    }

    public boolean isCreateRequestLogActive(REQUEST request) {
        // if you want to create request log always, override this method and return true.
        boolean isCreateRequestLogEnabled = configurationService.getConfiguration().getBoolean(createRequestLogEnabledKey(request), false);
        return isCreateRequestLogEnabled || isCreateRequestLogWhenFailedActive();
    }

    public boolean isCreateRequestLogWhenFailedActive() {
        // if you want to create request log just when request failed, override this method and return true.
        return false;
    }

    private String createRequestLogEnabledKey(REQUEST request) {
        return "create.request.log." + request.getClass() + ".enabled";
    }


    public ModelService getModelService() {
        return modelService;
    }
}
