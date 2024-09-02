package com.APITask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APITask.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}