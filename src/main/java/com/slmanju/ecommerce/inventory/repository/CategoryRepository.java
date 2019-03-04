package com.slmanju.ecommerce.inventory.repository;

import com.slmanju.ecommerce.inventory.model.Category;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CategoryRepository extends ReactiveCrudRepository<Category, String> {
}
