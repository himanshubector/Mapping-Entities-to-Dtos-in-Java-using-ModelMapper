package com.acc.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class ReviewDto
{
    @JsonProperty("id")
    private long id;

    @JsonProperty("comment")
    private String reviewComment;
}
