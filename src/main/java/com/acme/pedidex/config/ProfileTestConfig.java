package com.acme.pedidex.config;

import com.acme.pedidex.entities.Order;
import com.acme.pedidex.entities.User;
import com.acme.pedidex.repositories.OrderRepository;
import com.acme.pedidex.repositories.UserRepository;
import com.acme.pedidex.resources.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class ProfileTestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        var u1 = new User(null, "Maria", "maria@gmail.com", "48  99555-5555", "123");
        var u2 = new User(null, "João", "joao@gmail.com", "48  99555-4444", "456");

        userRepository.saveAll(Arrays.asList(u1, u2));


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
