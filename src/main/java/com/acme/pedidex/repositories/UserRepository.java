package com.acme.pedidex.repositories;

import com.acme.pedidex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// To remember how this interface implements jparepository we dont need registered this class spring already do this
public interface UserRepository extends JpaRepository<User, Long> {
}
