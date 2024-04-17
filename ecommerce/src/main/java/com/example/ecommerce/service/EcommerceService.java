package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.DTO.ProductDetailDTO;
import com.example.ecommerce.DTO.ProductSaveDTO;

public interface EcommerceService {
  ProductDetailDTO addProduct(ProductSaveDTO productSaveDTO);

  List<ProductDetailDTO> getAllProducts();

  ProductDetailDTO updateProduct(ProductDetailDTO productDetailDTO);

  boolean deleteProduct(int id);
}
