package com.discoverit.app.controller;

import com.discoverit.app.model.User;
import com.discoverit.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users") // Base URL for all user-related endpoints
@CrossOrigin // Allow Vue app's URLs
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Get a user by username
    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        return userRepository.findByUsername(username)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update user information
    @PutMapping("/{username}")
    public ResponseEntity<User> updateUser(@PathVariable String username, @RequestBody User userDetails) {
        return userRepository.findByUsername(username)
                .map(user -> {
                    user.setEmail(userDetails.getEmail());
                    user.setPassword(userDetails.getPassword());
                    User updatedUser = userRepository.save(user); // Save the updated user
                    return ResponseEntity.ok(updatedUser); // Return the updated user wrapped in ResponseEntity
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete a user by username
    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable String username) {
        return userRepository.findByUsername(username)
                .map(user -> {
                    userRepository.delete(user);
                    return ResponseEntity.noContent().<Void>build(); // Explicitly specify Void here
                })
                .orElse(ResponseEntity.notFound().build());
    }
}




