package com.Pavan.ProductService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakestoreResponseDto {
    private Long id;
    private String description;
    private  String title;
    private double price;
    private String category;
    private String image;
}
