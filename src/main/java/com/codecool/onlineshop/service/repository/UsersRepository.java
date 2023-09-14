package com.codecool.onlineshop.service.repository;

import com.codecool.onlineshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    User save(User save);
}
