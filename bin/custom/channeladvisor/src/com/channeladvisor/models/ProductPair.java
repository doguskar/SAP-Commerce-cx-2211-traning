package com.channeladvisor.models;

import com.channeladvisor.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;

public class ProductPair {
    private ProductData productData;
    private ProductModel productModel;

    public ProductData getProductData() {
        return productData;
    }

    public void setProductData(ProductData productData) {
        this.productData = productData;
    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }
}
