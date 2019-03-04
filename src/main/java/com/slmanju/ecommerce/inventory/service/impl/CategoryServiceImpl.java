package com.slmanju.ecommerce.inventory.service.impl;

import com.slmanju.ecommerce.inventory.model.Category;
import com.slmanju.ecommerce.inventory.repository.CategoryRepository;
import com.slmanju.ecommerce.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CategoryServiceImpl implements CategoryService {
    
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Mono<Category> save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Mono<Category> find(String id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Flux<Category> findAll() {
        return categoryRepository.findAll();
    }

}
