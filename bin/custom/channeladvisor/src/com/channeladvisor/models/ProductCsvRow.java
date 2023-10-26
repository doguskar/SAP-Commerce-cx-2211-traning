package com.channeladvisor.models;

import com.channeladvisor.csv.CsvHeader;

import java.io.Serializable;
import java.util.Map;

public class ProductCsvRow implements Serializable {

    @CsvHeader(headerName = "SKU")
    private String sku;

    @CsvHeader(headerName = "EAN")
    private String ean;

    @CsvHeader(headerName = "Brand Name")
    private String brandName;

    @CsvHeader(headerName = "Brand Code")
    private String brandCode;

    @CsvHeader(headerName = "Season Code")
    private String seasonCode;

    @CsvHeader(headerName = "season")
    private String season;

    @CsvHeader(headerName = "Article ID")
    private String articleId;

    @CsvHeader(headerName = "Article Name")
    private String articleName;

    @CsvHeader(headerName = "Fabric NO")
    private String fabricNo;

    @CsvHeader(headerName = "Wash Code")
    private String washCode;

    @CsvHeader(headerName = "Wash name")
    private String washName;

    @CsvHeader(headerName = "EU RRP Price")
    private String euRrpPrice;

    @CsvHeader(headerName = "VAT")
    private String vat;

    @CsvHeader(headerName = "Main Product Group")
    private String mainProductGroup;

    @CsvHeader(headerName = "Sub Product Group")
    private String subProductGroup;

    @CsvHeader(headerName = "Gender")
    private String gender;

    @CsvHeader(headerName = "Composition")
    private String composition;

    @CsvHeader(headerName = "Size")
    private String size;

    @CsvHeader(headerName = "Length Size")
    private String lengthSize;

    @CsvHeader(headerName = "Origin")
    private String origin;

    @CsvHeader(headerName = "Main Color")
    private String mainColor;

    @CsvHeader(headerName = "Collection Year")
    private String collectionYear;

    @CsvHeader(headerName = "Collection Type")
    private String collectionType;

    @CsvHeader(headerName = "Pattern")
    private String pattern;

    @CsvHeader(headerName = "Occasion")
    private String occasion;

    @CsvHeader(headerName = "Size Fit")
    private String sizeFit;

    @CsvHeader(headerName = "Innerseam Leg Length (in CM)")
    private String innerseamLegLength;

    @CsvHeader(headerName = "Sleeve Detail")
    private String sleeveDetail;

    @CsvHeader(headerName = "Neckline")
    private String neckline;

    @CsvHeader(headerName = "Product Description")
    private String productDescription;

    @CsvHeader(headerName = "Washing Definition")
    private String washingDefinition;

    @CsvHeader(headerName = "Image filename")
    private String imageFileName;

    @CsvHeader(headerName = "Image Url")
    private String csvImages;

    private Map<String, CustomAttribute> customAttributes;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getSeasonCode() {
        return seasonCode;
    }

    public void setSeasonCode(String seasonCode) {
        this.seasonCode = seasonCode;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getFabricNo() {
        return fabricNo;
    }

    public void setFabricNo(String fabricNo) {
        this.fabricNo = fabricNo;
    }

    public String getWashCode() {
        return washCode;
    }

    public void setWashCode(String washCode) {
        this.washCode = washCode;
    }

    public String getWashName() {
        return washName;
    }

    public void setWashName(String washName) {
        this.washName = washName;
    }

    public String getEuRrpPrice() {
        return euRrpPrice;
    }

    public void setEuRrpPrice(String euRrpPrice) {
        this.euRrpPrice = euRrpPrice;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getMainProductGroup() {
        return mainProductGroup;
    }

    public void setMainProductGroup(String mainProductGroup) {
        this.mainProductGroup = mainProductGroup;
    }

    public String getSubProductGroup() {
        return subProductGroup;
    }

    public void setSubProductGroup(String subProductGroup) {
        this.subProductGroup = subProductGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLengthSize() {
        return lengthSize;
    }

    public void setLengthSize(String lengthSize) {
        this.lengthSize = lengthSize;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public String getCollectionYear() {
        return collectionYear;
    }

    public void setCollectionYear(String collectionYear) {
        this.collectionYear = collectionYear;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getSizeFit() {
        return sizeFit;
    }

    public void setSizeFit(String sizeFit) {
        this.sizeFit = sizeFit;
    }

    public String getInnerseamLegLength() {
        return innerseamLegLength;
    }

    public void setInnerseamLegLength(String innerseamLegLength) {
        this.innerseamLegLength = innerseamLegLength;
    }

    public String getSleeveDetail() {
        return sleeveDetail;
    }

    public void setSleeveDetail(String sleeveDetail) {
        this.sleeveDetail = sleeveDetail;
    }

    public String getNeckline() {
        return neckline;
    }

    public void setNeckline(String neckline) {
        this.neckline = neckline;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getWashingDefinition() {
        return washingDefinition;
    }

    public void setWashingDefinition(String washingDefinition) {
        this.washingDefinition = washingDefinition;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public Map<String, CustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(Map<String, CustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public String getCsvImages() {
        return csvImages;
    }

    public void setCsvImages(String csvImages) {
        this.csvImages = csvImages;
    }
}
