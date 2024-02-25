package com.acc.products.mapper;

import com.acc.products.dto.ProductDto;
import com.acc.products.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class ProductMapper {

    @Autowired
    private ModelMapper modelMapper;

    public ProductDto toDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public List<ProductDto> toDtoList(List<Product> products) {
        return products.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


    public Product fromDto(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

}
