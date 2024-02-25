package com.acc.products.controller;

import com.acc.products.dto.ProductDto;
import com.acc.products.entity.Product;
import com.acc.products.mapper.ProductMapper;
import com.acc.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

//    @Autowired
//    private ProductService productService;

//     @Autowired
//     private ProductMapper productMapper;


    private final ProductService productService;
    private final ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }


    @GetMapping("/getByBrand")
    public ResponseEntity<List<ProductDto>> getProductsByBrand(@RequestParam String brand) {

         List<Product> productsList = productService.getProductsByBrand(brand);

        List<ProductDto> productDtosList = productMapper.toDtoList(productsList);
        return ResponseEntity.ok(productDtosList);
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(@RequestBody ProductDto productDto) {
        try {
            productService.saveProduct(productDto);
            return new ResponseEntity<>("Product saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to save product: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

