package com.acme.pedidex.config;

import com.acme.pedidex.entities.Category;
import com.acme.pedidex.entities.Order;
import com.acme.pedidex.entities.Product;
import com.acme.pedidex.entities.User;
import com.acme.pedidex.enums.OrderStatus;
import com.acme.pedidex.repositories.CategoryRepository;
import com.acme.pedidex.repositories.OrderRepository;
import com.acme.pedidex.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        var c1 = new Category(null, "Eletronics");
        var c2 = new Category(null, "Books");
        var c3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));


        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        var u1 = new User(null, "Maria", "maria@gmail.com", "48  99555-5555", "123");
        var u2 = new User(null, "João", "joao@gmail.com", "48  99555-4444", "456");

        userRepository.saveAll(Arrays.asList(u1, u2));


        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAIT_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
