package com.Pavan.ProductService.Service;

import com.Pavan.ProductService.DTO.FakestoreResponseDto;
import com.Pavan.ProductService.Mapper.ProductToDtto;
import com.Pavan.ProductService.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product ProductById(int id) {
        FakestoreResponseDto fakestoreResponseDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,FakestoreResponseDto.class);
        ProductToDtto convert = new ProductToDtto();
        return convert.ProductToDttoconvert(fakestoreResponseDto);

    }
}
