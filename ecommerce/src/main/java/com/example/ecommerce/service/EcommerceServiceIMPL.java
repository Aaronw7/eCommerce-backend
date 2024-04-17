package com.example.ecommerce.service;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;
import com.example.ecommerce.DTO.ProductDetailDTO;
import com.example.ecommerce.DTO.ProductSaveDTO;

@Service
public class EcommerceServiceIMPL implements EcommerceService {

    private final List<ProductDetailDTO> products = new ArrayList<>();
    private final AtomicInteger productIdGenerator = new AtomicInteger(0);

    @Override
    public ProductDetailDTO addProduct(ProductSaveDTO productSaveDTO) {
        ProductDetailDTO product = new ProductDetailDTO(
            productIdGenerator.incrementAndGet(),
            productSaveDTO.getProductName(),
            productSaveDTO.getPrice(),
            productSaveDTO.getDescription(),
            productSaveDTO.getInitialStock(),
            productSaveDTO.getInitialStock() > 0
        );
        products.add(product);
        return product;
    }

    @Override
    public List<ProductDetailDTO> getAllProducts() {
        return new ArrayList<>(products);
    }

    @Override
    public ProductDetailDTO updateProduct(ProductDetailDTO productDetailDTO) {
        products.forEach(p -> {
            if (p.getProductId() == productDetailDTO.getProductId()) {
                p.setProductName(productDetailDTO.getProductName());
                p.setPrice(productDetailDTO.getPrice());
                p.setDescription(productDetailDTO.getDescription());
                p.setStock(productDetailDTO.getStock());
                p.setAvailable(productDetailDTO.getStock() > 0);
            }
        });
        return productDetailDTO;
    }

    @Override
    public boolean deleteProduct(int id) {
        return products.removeIf(p -> p.getProductId() == id);
    }
}
