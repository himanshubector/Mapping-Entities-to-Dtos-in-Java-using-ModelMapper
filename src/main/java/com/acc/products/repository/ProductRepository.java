package com.acc.products.repository;

import com.acc.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, String>
{
    List<Product> findByBrand(String brand);
}
