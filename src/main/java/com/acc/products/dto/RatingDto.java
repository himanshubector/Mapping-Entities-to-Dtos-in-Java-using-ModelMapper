package com.acc.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingDto
{
    @JsonProperty("id")
    private long id;

    @JsonProperty("ratingValue")
    private double ratingValue;
}
