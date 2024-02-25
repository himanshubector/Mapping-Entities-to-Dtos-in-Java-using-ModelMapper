package com.acc.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class RatingDto
{
    @JsonProperty("id")
    private long id;

    @JsonProperty("ratingValue")
    private double ratingValue;
}
