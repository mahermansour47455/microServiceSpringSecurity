package com.maher.microsservice.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maher.microsservice.entities.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    @Query("select u from User u where u.user_id = ?1")
    User findUserById(Long id);





}