package com.example.experiments.service;

import com.example.experiments.model.Account.User;
import com.example.experiments.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(!userOptional.isPresent()) {
            throw new IllegalStateException("No student with id " + userId + " found");
        }
        return userOptional.get();
    }

    public void addUser(User user) {
        Optional<User> userOptional =
                userRepository.findUserByEmail(user.getEmail());
        if(userOptional.isPresent()) {
            throw new IllegalStateException("Email is taken");
        }
        userRepository.save(user);
    }

    @Transactional
    public void updateUser(Long userId, String username, String email) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException(
                        "No student with id " + userId + " found"));
        if(username != null && username.length() > 0 && !user.getId().equals(userId)) {
            user.setUsername(username);
        }

        if(email != null && email.length() > 0 && !user.getEmail().equals(email)) {
            Optional<User> userOptional = userRepository.findUserByEmail(email);
            if(userOptional.isPresent()) {
                throw new IllegalStateException("Email is taken");
            }
            user.setEmail(email);
        }
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
        boolean exists = userRepository.existsById(userId);
        if(!exists) {
            throw new IllegalStateException("student with id " + userId + " does not exist");
        }
        userRepository.deleteById(userId);
    }
}
