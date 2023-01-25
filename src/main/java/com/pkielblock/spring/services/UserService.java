package com.pkielblock.spring.services;

import com.pkielblock.spring.entities.User;
import com.pkielblock.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        if(obj.isPresent()) {
            return obj.get();
        } else {
            return null;
        }
    }
}