package com.boilerplate.boilerplate.repository;

import com.boilerplate.boilerplate.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
    User getOne(@Param("id") Integer id);
    List<User> findByName(@Param("name") String name);
}
