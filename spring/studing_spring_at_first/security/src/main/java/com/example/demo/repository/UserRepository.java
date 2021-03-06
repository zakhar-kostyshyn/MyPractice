package com.example.demo.repository;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional findByUsername(String userName);

    Boolean existsByUsername(String userName);

    Boolean existsByEmail(String email);

}
