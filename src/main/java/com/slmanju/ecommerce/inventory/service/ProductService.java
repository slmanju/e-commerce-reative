package com.slmanju.ecommerce.inventory.service;

import com.slmanju.ecommerce.inventory.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    
    Mono<Product> save(Product product);
    
    Mono<Product> find(String id);

    Flux<Product> findAll();
    
}
