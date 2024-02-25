package com.acc.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductDetailsDto
{
    @JsonProperty("productDetailsId")
    private int productDetailsId;

    @JsonProperty("technicalSpecs")
    private String technicalSpecifications;

    @JsonProperty("extraFeatures")
    private String specialFeatures;

    @JsonProperty("extendedDescription")
    private String extendedDescription;
}
