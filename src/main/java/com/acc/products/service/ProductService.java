package com.acc.products.service;

import com.acc.products.dto.ProductDto;
import com.acc.products.entity.Product;
import com.acc.products.mapper.ProductMapper;
import com.acc.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    private final ProductMapper productMapper;


    public ProductService(ProductMapper productMapper)
    {
        this.productMapper = productMapper;
    }

    public List<Product> getProductsByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }


    public void saveProduct(ProductDto productDto)
    {
        // Convert ProductDto to Product entity

        Product product = productMapper.fromDto(productDto);

        // Save the product
        productRepository.save(product);
    }
}
