package com.acme.pedidex.repositories;

import com.acme.pedidex.entities.Order;
import com.acme.pedidex.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
