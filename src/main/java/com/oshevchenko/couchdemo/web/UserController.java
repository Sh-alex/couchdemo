package com.oshevchenko.couchdemo.web;

import com.oshevchenko.couchdemo.entity.User;
import com.oshevchenko.couchdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void delete(@PathVariable String id) {
        List<User> users = service.getAll();
        User userToDelete = users.stream()
                .filter(user -> user.getId().equalsIgnoreCase(id))
                .findFirst()
                .get();

        service.delete(userToDelete);
    }
}
