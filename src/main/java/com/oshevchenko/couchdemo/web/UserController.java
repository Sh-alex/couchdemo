package com.oshevchenko.couchdemo.web;

import com.oshevchenko.couchdemo.entity.User;
import com.oshevchenko.couchdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAll() {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody User user) {
        service.delete(user);
    }
}
