package com.Pavan.ProductService.Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestCOnfig {
    @Bean
    public RestTemplate getResttemplate(){
        return new RestTemplateBuilder().build();
    }
}
