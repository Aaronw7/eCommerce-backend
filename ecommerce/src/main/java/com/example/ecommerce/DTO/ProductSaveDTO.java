package com.example.ecommerce.DTO;

import java.math.BigDecimal;

public class ProductSaveDTO {

    private String productName;
    private BigDecimal price;
    private String description;
    private int initialStock;

    // Constructors
    public ProductSaveDTO() {
    }

    public ProductSaveDTO(String productName, BigDecimal price, String description, int initialStock) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.initialStock = initialStock;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }
}
