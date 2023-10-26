package com.channeladvisor.service.impl;

import com.channeladvisor.csv.ClassReader;
import com.channeladvisor.csv.CsvBuilder;
import com.channeladvisor.model.ChannelAdvisorSendProductsJobModel;
import com.channeladvisor.models.CustomAttribute;
import com.channeladvisor.models.ProductCsvColumn;
import com.channeladvisor.models.ProductCsvRow;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.collections4.CollectionUtils;
/*import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;*/
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;

import static com.channeladvisor.constants.ChanneladvisorConstants.CSV_SEPARATOR;
import static com.channeladvisor.constants.ChanneladvisorConstants.NEW_LINE;


public class ChannelAdvisorProductCSVService {

    private static final String FILE_MIME_TYPE = "application/csv";

    @Resource
    private ConfigurationService configurationService;

    @Resource
    private MediaService mediaService;

    @Resource
    private ModelService modelService;

    @Resource
    private CatalogVersionService catalogVersionService;

    private static final Logger LOG = LoggerFactory.getLogger(ChannelAdvisorProductCSVService.class);

    @Deprecated
    public void convertToCsv(List<ProductCsvRow> rows, StringBuilder builder, final List<String> customAttributeHeaders) throws IllegalAccessException {
        String[] headers = ClassReader.getHeaders(rows.get(0));
        for (ProductCsvRow row:rows) {
            HashMap<String, String> columnToValue = ClassReader.readValues(row);
            // add attributes to CSV row
            for (String header:headers) {
                String cellValue = columnToValue.get(header);
                builder.append(cellValue != null ? cellValue : "").append(CSV_SEPARATOR);
            }

            // add custom attributes
            for (String customAttributeHeader : customAttributeHeaders) {
                if (row.getCustomAttributes() == null || row.getCustomAttributes().get(customAttributeHeader) == null){
                    builder.append(StringUtils.EMPTY).append(CSV_SEPARATOR);
                    continue;
                }
                CustomAttribute customAttribute = row.getCustomAttributes().get(customAttributeHeader);
                builder.append(customAttribute.getValue()).append(CSV_SEPARATOR);
            }

            builder.append("\n");
        }

    }

    public void convertToCsv(List<ProductCsvColumn> columns, StringBuilder builder) {
        int rowSize = columns.get(0).getValues().size();
        for (int i = 0; i < rowSize; i++) {
            Iterator<ProductCsvColumn> columnIterator = columns.iterator();
            while (columnIterator.hasNext()) {
                ProductCsvColumn column = columnIterator.next();
                builder.append(CollectionUtils.isNotEmpty(column.getValues()) ? column.getValues().get(i) : StringUtils.EMPTY)
                        .append(columnIterator.hasNext() ? CSV_SEPARATOR : NEW_LINE);
            }
        }
        validateRows(columns,builder);
    }

    public void validateRows(List<ProductCsvColumn> columns,StringBuilder builder){
        /*Reader reader = new StringReader(builder.toString());
        try {
            CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL.withHeader().withDelimiter(';'));
            List<CSVRecord> csvRecords = parser.getRecords();
            List<CSVRecord> deleteRecords = new ArrayList<>();
            for(CSVRecord record : csvRecords){
                for(int i = 0; i < columns.size(); i++){
                    if(BooleanUtils.isFalse(columns.get(i).getReferable()) && (StringUtils.isEmpty(record.get(i)) || record.get(i).equals("null"))){
                        deleteRecords.add(record);
                        break;
                    }
                }
            }
            csvRecords.removeAll(deleteRecords);
            builder.setLength(0);
            List<String> headerList = new ArrayList<>(parser.getHeaderMap().keySet());
            Iterator<String> headerIterator = headerList.listIterator();
            while (headerIterator.hasNext()){
                String header = headerIterator.next();
                builder.append(header);
                builder.append(headerIterator.hasNext() ? CSV_SEPARATOR : NEW_LINE );
            }
            Iterator<CSVRecord> csvRecordIterator = csvRecords.iterator();
            while (csvRecordIterator.hasNext()) {
                CSVRecord record = csvRecordIterator.next();
                for (int i = 0; i < parser.getHeaderMap().size(); i++) {
                    builder.append(record.get(i));
                    builder.append(CSV_SEPARATOR);
                }
                builder.append(NEW_LINE);
            }

        }catch (IOException ex){
            LOG.error("CSV File parse error", ex);
        }*/
    }

    @Deprecated
    public String getHeaders(List<ProductCsvRow> rows, List<String> customAttributeHeaders)
    {
        String header = CsvBuilder.newInstance().getHeaders(rows);

        if(CollectionUtils.isNotEmpty(customAttributeHeaders)){
            StringBuilder headerBuilder = new StringBuilder(header);
            return buildHeaderWithCustomAttributes(headerBuilder, customAttributeHeaders);
        }
        return header.substring(0, header.length() - 1) + "\n";
    }

    public String getHeaders(List<ProductCsvColumn> columns)
    {
        StringBuilder headerBuilder = new StringBuilder();
        Iterator<ProductCsvColumn> columnIterator = columns.iterator();
        while (columnIterator.hasNext()){
            ProductCsvColumn column = columnIterator.next();
            headerBuilder.append(column.getColumn());
            if (columnIterator.hasNext()){
                headerBuilder.append(CSV_SEPARATOR);
            }
        }
        headerBuilder.append(NEW_LINE);
        return headerBuilder.toString();
    }

    @Deprecated
    private String buildHeaderWithCustomAttributes(StringBuilder header, List<String> customAttributeHeaders){
        for (String attribute: customAttributeHeaders) {
            StringBuilder attrValue = new StringBuilder(attribute);
            header.append(attrValue).append(CSV_SEPARATOR);
        }
        return header.substring(0, header.length() - 1) + "\n";
    }

    public File writeCSVtoFile(String csv, final String fileName, ChannelAdvisorSendProductsJobModel jobModel) throws FileNotFoundException {
        File file = createFile(fileName);
        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter(file))) {
            outputFile.append(csv);
        }catch (IOException e){
            LOG.error("CSV File write error", e);
            return null;
        }
        MediaModel mediaModel = modelService.create(MediaModel.class);
        mediaModel.setCode("LtbCoreConstants.CHANNEL_ADVISOR"+file.getName());
        mediaModel.setMime(FILE_MIME_TYPE);
        mediaModel.setRealFileName(file.getName());
        mediaModel.setCatalogVersion(catalogVersionService.getCatalogVersion("LtbCoreConstants.CONTENT_CATALOG_ID", "LtbCoreConstants.CATALOG_VERSION_ONLINE"));
        List<MediaModel> createdDocuments = new ArrayList<>(jobModel.getCreatedDocuments());
        createdDocuments.add(0, mediaModel);
        jobModel.setCreatedDocuments(createdDocuments);
        modelService.saveAll(mediaModel, jobModel);
        mediaService.setStreamForMedia(mediaModel, new FileInputStream(file));
        return file;
    }

    private File createFile(final String fileName) {
        try {
            final String sftpSource = configurationService.getConfiguration().getString("channel.advisor.csv.dir", "${tenantId}/channelAdvisor");
            final File parentDir = new File(sftpSource + "/");
            parentDir.mkdirs();
            File file = new File(parentDir, fileName);
            file.createNewFile();
            return file;
        } catch (Exception e) {
            LOG.error("CSV File write error", e);
        }
        return null;
    }

}
