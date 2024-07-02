package com.Pavan.ProductService.Service;

import com.Pavan.ProductService.Model.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    public Product ProductById(int id);
}
