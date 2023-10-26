package com.channeladvisor.service.impl;/*
package com.channeladvisor.service.impl;

import com.channeladvisor.models.CustomAttribute;
import com.channeladvisor.models.ProductCsvColumn;
import com.channeladvisor.models.ProductCsvRow;
import com.channeladvisor.service.LtbChannelAdvisorProductProviderService;
import com.ltb.core.model.LtbArticleSpecificationModel;
import com.ltb.core.model.LtbGenderDefinitionModel;
import com.ltb.core.model.LtbSizeAndLengthVariantProductModel;
import com.ltb.marketplace.model.MarketplaceModel;
import com.ltb.marketplace.providers.*;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.enumeration.EnumerationService;
import de.hybris.platform.servicelayer.media.MediaService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;

public class LtbChannelAdvisorProductProviderServiceImpl implements LtbChannelAdvisorProductProviderService {

    @Resource(name = "enumerationService")
    private EnumerationService enumerationService;
    @Resource(name = "mediaService")
    private MediaService mediaService;
    @Autowired
    private EanProvider eanProvider;
    @Autowired
    private SkuProvider skuProvider;
    @Autowired
    private BrandNameProvider brandNameProvider;
    @Autowired
    private BrandCodeProvider brandCodeProvider;
    @Autowired
    private SeasonCodeProvider seasonCodeProvider;
    @Autowired
    private SeasonNameProvider seasonNameProvider;
    @Autowired
    private ProductCodeProvider productCodeProvider;
    @Autowired
    private ProductNameProvider productNameProvider;
    @Autowired
    private WashCodeProvider washCodeProvider;
    @Autowired
    private WashNameProvider washNameProvider;
    @Autowired
    private ProductMainGroupNameProvider productMainGroupNameProvider;
    @Autowired
    private ProductSubGroupNameProvider productSubGroupNameProvider;
    @Autowired
    private GenderProvider genderProvider;
    @Autowired
    private FabricDefinitionProvider fabricDefinitionProvider;
    @Autowired
    private SizeAndLengthProvider sizeAndLengthProvider;
    @Autowired
    private OriginProvider originProvider;
    @Autowired
    private ColorProvider colorProvider;
    @Autowired
    private SeasonTypeProvider seasonTypeProvider;
    @Autowired
    private JeanFitMoldTypeProvider jeanFitMoldTypeProvider;
    @Autowired
    private DescriptionProvider descriptionProvider;
    @Autowired
    private ImageUrlProvider imageUrlProvider;
    @Autowired
    private ProductPriceProvider productPriceProvider;

    private Map<String, String> customAttributeMappings;
    private Set<String> customAttributeHeaders;
    private List<LtbArticleSpecificationModel> articleSpecificationModelList;

    private static final Logger LOG = LoggerFactory.getLogger(LtbChannelAdvisorProductProviderServiceImpl.class);

    @Override
    public ProductCsvRow provideProduct(LtbSizeAndLengthVariantProductModel product, MarketplaceModel channelAdvisor, Locale locale) {
        ProductCsvRow row = new ProductCsvRow();

        row.setSku(skuProvider.provide(product, channelAdvisor));
        row.setEan(eanProvider.provide(product, channelAdvisor));
        row.setBrandName(brandNameProvider.provide(product, locale));
        row.setBrandCode(brandCodeProvider.provide(product, channelAdvisor));
        row.setSeasonCode(seasonCodeProvider.provide(product, channelAdvisor));
        row.setSeason(seasonNameProvider.provide(product, locale));
        row.setArticleId(productCodeProvider.provide(product.getBaseProduct(), channelAdvisor));
        row.setArticleName(productNameProvider.provide(product.getBaseProduct(), locale));
        row.setFabricNo(product.getFabricDefinition() != null && StringUtils.isNotBlank(product.getFabricDefinition().getCode()) ? product.getFabricDefinition().getCode() : StringUtils.EMPTY);
        row.setWashCode(washCodeProvider.provide(product, channelAdvisor));
        row.setWashName(washNameProvider.provide(product, locale));
        List<Double> prices = productPriceProvider.provide(product, channelAdvisor);
        row.setEuRrpPrice(!prices.isEmpty() ? prices.get(0).toString() : "0");
        row.setVat(prices.size() >= 3 ? prices.get(2).toString() : "0");
        row.setMainProductGroup(productMainGroupNameProvider.provide(product, locale));
        row.setSubProductGroup(productSubGroupNameProvider.provide(product, locale));
        LtbGenderDefinitionModel gender = genderProvider.provide(product, channelAdvisor);
        row.setGender(gender != null ? gender.getName(locale) : StringUtils.EMPTY);
        row.setComposition(fabricDefinitionProvider.provide(product, locale));
        row.setSize(StringUtils.isNotBlank(product.getSize()) ? product.getSize() : StringUtils.EMPTY);
        row.setLengthSize(StringUtils.isNotBlank(product.getLength()) ? product.getLength() : StringUtils.EMPTY);
        row.setOrigin(originProvider.provide(product, locale));
        row.setMainColor(colorProvider.provide(product, locale));
        row.setCollectionType(seasonTypeProvider.provide(product, channelAdvisor));
        row.setPattern(getPattern(product, locale));
        row.setOccasion(getOccasion(product, locale));
        row.setSizeFit(jeanFitMoldTypeProvider.provide(product, locale));
        row.setInnerseamLegLength(getLegLength(product, locale));
        row.setSleeveDetail(getSleeveLength(product, locale));
        row.setNeckline(getCollar(product, locale));
        row.setProductDescription(descriptionProvider.provide(product, locale));
        row.setWashingDefinition(product.getWashingDefinition() != null ? product.getWashingDefinition().getName(locale) : StringUtils.EMPTY);
        row.setImageFileName(imageUrlProvider.provide(product, channelAdvisor));
        row.setCustomAttributes(createCustomAttributes(product, locale));
        return row;
    }

    @Override
    public void fillProductCsvColumns(LtbSizeAndLengthVariantProductModel product, MarketplaceModel channelAdvisor, Locale locale,
                                      List<ProductCsvColumn> columns) {
        columns.stream().forEach(column -> {
            if (column.getFortius()) {
                final LtbArticleSpecificationModel articleSpecification = product.getArticleSpecs().stream()
                        .filter(as -> as.getGuid().equals(column.getId()))
                        .findFirst().orElse(null);
                final String value = Objects.nonNull(articleSpecification) ? articleSpecification.getValue(locale) : StringUtils.EMPTY;
                column.add(value != null ? value : StringUtils.EMPTY);
            } else {
                List<Double> prices = productPriceProvider.provide(product, channelAdvisor);
                LtbGenderDefinitionModel gender = genderProvider.provide(product, channelAdvisor);
                switch (column.getId()){
                    case "sku" : column.add(skuProvider.provide(product, channelAdvisor)); break;
                    case "ean" : column.add(eanProvider.provide(product, channelAdvisor)); break;
                    case "brandName" : column.add(brandNameProvider.provide(product, locale)); break;
                    case "brandCode" : column.add(brandCodeProvider.provide(product, channelAdvisor)); break;
                    case "seasonCode" : column.add(seasonCodeProvider.provide(product, channelAdvisor)); break;
                    case "season" : column.add(seasonNameProvider.provide(product, locale)); break;
                    case "articleId" : column.add(productCodeProvider.provide(product.getBaseProduct(), channelAdvisor)); break;
                    case "articleName" : column.add(productNameProvider.provide(product.getBaseProduct(), locale)); break;
                    case "fabricNo" : column.add(product.getFabricDefinition() != null && StringUtils.isNotBlank(product.getFabricDefinition().getCode()) ? product.getFabricDefinition().getCode() : StringUtils.EMPTY); break;
                    case "washCode" : column.add(washCodeProvider.provide(product, channelAdvisor)); break;
                    case "washName" : column.add(washNameProvider.provide(product, locale)); break;
                    case "euRrpPrice" : column.add(!prices.isEmpty() ? prices.get(0).toString() : "0"); break;
                    case "vat" : column.add(prices.size() >= 3 ? prices.get(2).toString() : "0"); break;
                    case "mainProductGroup" : column.add(productMainGroupNameProvider.provide(product, locale)); break;
                    case "subProductGroup" : column.add(productSubGroupNameProvider.provide(product, locale)); break;
                    case "gender" : column.add(gender != null ? gender.getName(locale) : StringUtils.EMPTY); break;
                    case "composition" : column.add(fabricDefinitionProvider.provide(product, locale)); break;
                    case "size" : column.add(StringUtils.isNotBlank(product.getSize()) ? product.getSize() : StringUtils.EMPTY); break;
                    case "lengthSize" : column.add(StringUtils.isNotBlank(product.getLength()) ? product.getLength() : StringUtils.EMPTY); break;
                    case "origin" : column.add(originProvider.provide(product, locale)); break;
                    case "mainColor" : column.add(colorProvider.provide(product, locale)); break;
                    case "collectionType" : column.add(seasonTypeProvider.provide(product, channelAdvisor)); break;
                    case "pattern" : column.add(getPattern(product, locale)); break;
                    case "occasion" : column.add(getOccasion(product, locale)); break;
                    case "sizeFit" : column.add(jeanFitMoldTypeProvider.provide(product, locale)); break;
                    case "innerseamLegLength" : column.add(getLegLength(product, locale)); break;
                    case "sleeveDetail" : column.add(getSleeveLength(product, locale)); break;
                    case "neckline" : column.add(getCollar(product, locale)); break;
                    case "productDescription" : column.add(descriptionProvider.provide(product, locale)); break;
                    case "washingDefinition" : column.add(product.getWashingDefinition() != null ? product.getWashingDefinition().getName(locale) : StringUtils.EMPTY); break;
                    case "imageFileName" : column.add(imageUrlProvider.provide(product, channelAdvisor)); break;
                    case "csvImages" : column.add(getImageFullFront(product,column.getGalleryImage())); break;
                    default: column.add(StringUtils.EMPTY);
                }
            }
        });
    }

    private Map<String, CustomAttribute> createCustomAttributes(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        HashMap<String, CustomAttribute> result = new HashMap<>();
        if (MapUtils.isEmpty(customAttributeMappings)) {
            LOG.warn("Custom attribute mapping table is not defined");
            return result;
        }
        if (customAttributeHeaders == null) {
            customAttributeHeaders = new HashSet<>();
        }
        for (Map.Entry<String, String> entry : customAttributeMappings.entrySet()) {
            String headerName = entry.getValue();
            customAttributeHeaders.add(entry.getValue());
            if (CollectionUtils.isEmpty(product.getArticleSpecs())){
                LOG.debug("Custom attribute not found for {}", product.getCode());
                result.put(headerName, new CustomAttribute(getCustomAttributeLabel(entry.getKey(), locale), StringUtils.EMPTY));
                continue;
            }
            Optional<LtbArticleSpecificationModel> articleSpec = product.getArticleSpecs().stream().filter(spec -> spec.getGuid().equals(entry.getKey())).findFirst();
            if (articleSpec.isPresent()) {
                String label = StringUtils.isNotBlank(articleSpec.get().getLabel(locale)) ? articleSpec.get().getLabel(locale) : StringUtils.EMPTY;
                String value = StringUtils.isNotBlank(articleSpec.get().getValue(locale)) ? articleSpec.get().getValue(locale) : StringUtils.EMPTY;
                result.put(headerName, new CustomAttribute(label, value));
            } else {
                result.put(headerName, new CustomAttribute(getCustomAttributeLabel(entry.getKey(), locale), StringUtils.EMPTY));
            }
        }
        return result;

    }

    @Override
    public void setCustomAttributeMappings(Map<String, String> customAttributeMappings) {
        this.customAttributeMappings = customAttributeMappings;
    }

    private String getCustomAttributeLabel(String guid, Locale locale){
        //if product does not have custom attribute, just add label
        if(CollectionUtils.isEmpty(articleSpecificationModelList)){
            return StringUtils.EMPTY;
        }
        Optional<LtbArticleSpecificationModel> articleSpecification = articleSpecificationModelList.stream().filter(a -> a.getGuid().equals(guid)).findFirst();
        if (articleSpecification.isPresent()){
            return StringUtils.isNotBlank(articleSpecification.get().getLabel(locale)) ? articleSpecification.get().getLabel(locale) : StringUtils.EMPTY;
        }
        return StringUtils.EMPTY;
    }

    private String getPattern(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        if (product.getPattern() == null)
            return StringUtils.EMPTY;
        String enumerationName = enumerationService.getEnumerationName(product.getPattern(), locale);
        return StringUtils.isNotBlank(enumerationName) ? enumerationName : StringUtils.EMPTY;
    }

    private String getOccasion(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        if (product.getOccasion() == null)
            return StringUtils.EMPTY;
        String enumerationName = enumerationService.getEnumerationName(product.getOccasion(), locale);
        return StringUtils.isNotBlank(enumerationName) ? enumerationName : StringUtils.EMPTY;
    }

    private String getLegLength(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        if (product.getLegLength() == null)
            return StringUtils.EMPTY;
        String enumerationName = enumerationService.getEnumerationName(product.getLegLength(), locale);
        return StringUtils.isNotBlank(enumerationName) ? enumerationName : StringUtils.EMPTY;
    }

    private String getSleeveLength(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        if (product.getSleeveLength() == null)
            return StringUtils.EMPTY;
        String enumerationName = enumerationService.getEnumerationName(product.getSleeveLength(), locale);
        return StringUtils.isNotBlank(enumerationName) ? enumerationName : StringUtils.EMPTY;
    }

    private String getCollar(LtbSizeAndLengthVariantProductModel product, Locale locale) {
        if (product.getCollar() == null)
            return StringUtils.EMPTY;
        String enumerationName = enumerationService.getEnumerationName(product.getCollar(), locale);
        return StringUtils.isNotBlank(enumerationName) ? enumerationName : StringUtils.EMPTY;
    }

    private String getImageFullFront(LtbSizeAndLengthVariantProductModel product , String imageNumber) {
        ProductModel baseProduct = product.getBaseProduct();
        if (Objects.nonNull(baseProduct) && CollectionUtils.isNotEmpty(baseProduct.getGalleryImages())){
            MediaModel mediaModel = baseProduct.getGalleryImages()
                    .stream()
                    .filter(gi -> gi.getQualifier().substring(gi.getQualifier().length()-1).equalsIgnoreCase(imageNumber))
                    .map(MediaContainerModel::getMedias)
                    .flatMap(Collection::stream)
                    .filter(m -> "ht-Product".equals(m.getMediaFormat().getQualifier())).findFirst().orElse(null);
            return mediaModel != null ? mediaModel.getURL() : StringUtils.EMPTY;
        }
        return StringUtils.EMPTY;
    }

    public List<String> getCustomAttributeHeaders() {
        ArrayList<String> sortedHeaders = new ArrayList<>(customAttributeHeaders);
        Collections.sort(sortedHeaders, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return extractInt(o1) - extractInt(o2);
            }

            int extractInt(String s) {
                String num = s.replaceAll("\\D", "");
                // return 0 if no digits found
                return num.isEmpty() ? 0 : Integer.parseInt(num);
            }
        });
        return sortedHeaders;
    }


    public void setCustomAttributeHeaders(Set<String> customAttributeHeaders) {
        this.customAttributeHeaders = customAttributeHeaders;
    }

    public List<LtbArticleSpecificationModel> getArticleSpecificationModelList() {
        return articleSpecificationModelList;
    }

    public void setArticleSpecificationModelList(List<LtbArticleSpecificationModel> articleSpecificationModelList) {
        this.articleSpecificationModelList = articleSpecificationModelList;
    }
}
*/
