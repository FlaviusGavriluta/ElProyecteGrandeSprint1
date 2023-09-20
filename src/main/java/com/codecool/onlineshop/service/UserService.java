package com.codecool.onlineshop.service;
import com.codecool.onlineshop.exceptions.UserNotFoundException;
import com.codecool.onlineshop.model.User;
import com.codecool.onlineshop.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {




    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void addUser(User user) {
        usersRepository.save(user);
    }


   public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
   }

    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return usersRepository.findById(id);
    }

    public User updateByUserId(Long userId, User updatedUser) {
        User existingUser = usersRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));

        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setAddress(updatedUser.getAddress());
        existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
        existingUser.setPaymentInfo(updatedUser.getPaymentInfo());

        return usersRepository.save(existingUser);
    }
}
