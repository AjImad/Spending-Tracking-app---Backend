package com.apptracker.spendingtracker.repository;

import com.apptracker.spendingtracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByUserID(Integer userID);
}
