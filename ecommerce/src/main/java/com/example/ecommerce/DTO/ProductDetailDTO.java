package com.example.ecommerce.DTO;

import java.math.BigDecimal;

public class ProductDetailDTO {

    private int productId;
    private String productName;
    private BigDecimal price;
    private String description;
    private int stock;
    private boolean isAvailable;

    // Constructors
    public ProductDetailDTO() {
    }

    public ProductDetailDTO(int productId, String productName, BigDecimal price, String description, int stock, boolean isAvailable) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.isAvailable = stock > 0;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        this.isAvailable = stock > 0;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
