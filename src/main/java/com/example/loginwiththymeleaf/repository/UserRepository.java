package com.example.loginwiththymeleaf.repository;

import com.example.loginwiththymeleaf.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
