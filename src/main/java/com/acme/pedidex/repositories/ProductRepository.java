package com.acme.pedidex.repositories;

import com.acme.pedidex.entities.Category;
import com.acme.pedidex.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
