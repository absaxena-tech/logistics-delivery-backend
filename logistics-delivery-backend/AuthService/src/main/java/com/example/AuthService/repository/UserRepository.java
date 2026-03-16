package com.example.AuthService.repository;

import com.example.AuthService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByPhoneNumber(String phone);

    Optional<User> findByEmailOrPhoneNumber(String email, String phone);
}
