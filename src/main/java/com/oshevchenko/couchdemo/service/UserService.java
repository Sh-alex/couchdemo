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
    UserRepository userRepository;

    public List<User> getAll() {
        Iterable<User> all = userRepository.findAll();
        List<User> result = new ArrayList<>();
        all.forEach(result::add);

        return result;

    }
}
