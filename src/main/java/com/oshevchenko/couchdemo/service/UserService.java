package com.oshevchenko.couchdemo.service;

import com.oshevchenko.couchdemo.entity.User;
import com.oshevchenko.couchdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> getAll() {
        Iterable<User> all = repository.findAll();
        List<User> result = new ArrayList<>();
        all.forEach(result::add);

        return result;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public User update(User user) {
        return repository.save(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }
}
