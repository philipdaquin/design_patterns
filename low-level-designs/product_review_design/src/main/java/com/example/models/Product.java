package com.example.models;

import java.math.BigDecimal;
import java.util.List;

import com.example.models.Review.Review;

public class Product {
    
    public Long productId;
    public String name;
    public String description;
    public BigDecimal price;

    private List<Review> reviews;
}