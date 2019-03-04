package com.slmanju.ecommerce.inventory.controller;

import com.slmanju.ecommerce.inventory.model.Category;
import com.slmanju.ecommerce.inventory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = { "", "/" })
    public Flux<Category> getAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Category> getCategory(@PathVariable String id) {
        return categoryService.find(id);
    }

    @PostMapping
    public Mono<Category> save(@RequestBody Category category) {
        return categoryService.save(category);
    }

}
