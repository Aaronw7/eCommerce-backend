package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface EcommerceRepo extends JpaRepository<Product,Integer> {
}
