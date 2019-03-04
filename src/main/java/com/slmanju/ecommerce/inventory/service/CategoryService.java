package com.slmanju.ecommerce.inventory.service;

import com.slmanju.ecommerce.inventory.model.Category;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryService {
    
    Mono<Category> save(Category category);
    
    Mono<Category> find(String id);

    Flux<Category> findAll();
    
}
