package com.example.demo.service;

import com.example.demo.entity.User; // or model.User
import com.example.demo.repository.UserRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    @CircuitBreaker(name = "userService", fallbackMethod = "fallback")
    public List<User> getUsers() {
        return repo.findAll();
    }

    public List<User> fallback(Exception e) {
        return List.of(new User());
    }
}
