package com.example.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.DTO.ProductDetailDTO;
import com.example.ecommerce.DTO.ProductSaveDTO;
import com.example.ecommerce.service.EcommerceService;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class EcommerceController {

    private final EcommerceService ecommerceService;

    public EcommerceController(EcommerceService ecommerceService) {
        this.ecommerceService = ecommerceService;
    }

    @PostMapping
    public ResponseEntity<ProductDetailDTO> addProduct(@RequestBody ProductSaveDTO productSaveDTO) {
        ProductDetailDTO productDetail = ecommerceService.addProduct(productSaveDTO);
        return new ResponseEntity<>(productDetail, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductDetailDTO>> getAllProducts() {
        List<ProductDetailDTO> products = ecommerceService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDetailDTO> updateProduct(@PathVariable int id, @RequestBody ProductDetailDTO productDetailDTO) {
        productDetailDTO.setProductId(id);
        ProductDetailDTO updatedProduct = ecommerceService.updateProduct(productDetailDTO);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id) {
        boolean isDeleted = ecommerceService.deleteProduct(id);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
