package com.acme.pedidex.resources;

import com.acme.pedidex.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        return ResponseEntity.ok().body(new User(1L, "test", "test@mail.com", "84 9876534", "123"));
    }
}
