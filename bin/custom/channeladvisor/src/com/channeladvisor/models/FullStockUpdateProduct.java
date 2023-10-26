package com.channeladvisor.models;

import com.channeladvisor.data.ProductData;
import com.opencsv.bean.CsvBindByName;

public class FullStockUpdateProduct extends ProductData {
    @CsvBindByName(column = "ID")
    private Integer id;
    @CsvBindByName(column = "Sku")
    private String sku;
    @CsvBindByName(column = "TotalAvailableQuantity")
    private Integer totalAvailableQuantity;
    @CsvBindByName(column = "EAN")
    private String ean;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getSku() {
        return sku;
    }

    @Override
    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public Integer getTotalAvailableQuantity() {
        return totalAvailableQuantity;
    }

    @Override
    public void setTotalAvailableQuantity(Integer totalAvailableQuantity) {
        this.totalAvailableQuantity = totalAvailableQuantity;
    }

    @Override
    public String getEan() {
        return ean;
    }

    @Override
    public void setEan(String ean) {
        this.ean = ean;
    }
}
