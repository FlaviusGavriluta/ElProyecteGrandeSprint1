package com.codecool.onlineshop.repository;

import com.codecool.onlineshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    User save(User save);


}
