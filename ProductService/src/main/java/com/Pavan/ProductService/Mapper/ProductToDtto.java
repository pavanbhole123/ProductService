package com.Pavan.ProductService.Mapper;

import com.Pavan.ProductService.DTO.FakestoreResponseDto;
import com.Pavan.ProductService.Model.Product;

public class ProductToDtto {

    public Product ProductToDttoconvert(FakestoreResponseDto fakestoreResponseDto){
        Product product = new Product();
        product.setId(fakestoreResponseDto.getId());
        product.setCategory(fakestoreResponseDto.getCategory());
        product.setTitle(fakestoreResponseDto.getTitle());
        product.setPrice(fakestoreResponseDto.getPrice());
        product.setDescription(fakestoreResponseDto.getDescription());
        product.setImage(fakestoreResponseDto.getImage());
        return product;
    }
}
