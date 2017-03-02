package com.gmail.maxdiland.streamapidemo.dto;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Diland
 */

public class Product {
    private String name;
    @NonNull
    private List<ProductVariant> productVariants = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public List<ProductVariant> getProductVariants() {
        return productVariants;
    }

    public void setProductVariants(@NonNull List<ProductVariant> productVariants) {
        this.productVariants = productVariants;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productVariants=" + productVariants +
                '}';
    }
}
