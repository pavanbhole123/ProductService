package com.Pavan.ProductService.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String description;
    private  String title;
    private double price;
    private String category;
    private String image;
}
