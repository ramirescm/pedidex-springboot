package com.acme.pedidex.config;

import com.acme.pedidex.entities.User;
import com.acme.pedidex.repositories.UserRepository;
import com.acme.pedidex.resources.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class ProfileTestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        var user1 = new User(null, "Maria","maria@gmail.com","48  99555-5555","123");
        var user2 = new User(null, "João","joao@gmail.com","48  99555-4444","456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
