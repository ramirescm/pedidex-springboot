package com.acme.pedidex.repositories;

import com.acme.pedidex.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
