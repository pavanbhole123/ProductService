package com.Pavan.ProductService.Controller;

import com.Pavan.ProductService.Model.Product;
import com.Pavan.ProductService.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product ProductById(@PathVariable int id){
        return productService.ProductById(id);
    }
}
