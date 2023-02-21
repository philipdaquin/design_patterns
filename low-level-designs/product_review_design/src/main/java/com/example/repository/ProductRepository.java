package com.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.models.Product;


public class ProductRepository { 

    List<Product> products = new ArrayList<>();
    Map<Long, Product> productMap = new HashMap<>();
}