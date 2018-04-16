package com.oshevchenko.couchdemo.repository;

import com.oshevchenko.couchdemo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
