package com.slmanju.ecommerce.inventory.repository;

import com.slmanju.ecommerce.inventory.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, String> {
}
