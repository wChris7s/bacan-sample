package com.bacan.sample.app.service;

import com.bacan.sample.app.model.User;
import com.bacan.sample.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.getAllUsers()
          .stream()
          .map(user -> {
              String name = user.getName().toUpperCase() + "0";
              user.setName(name);
              return user;
          }).toList();
    }
}
