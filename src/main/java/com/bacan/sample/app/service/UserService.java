package com.bacan.sample.app.service;

import com.bacan.sample.app.repository.UserRepository;

public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object[] getAllUsersByQuery(Object query) {
        return this.userRepository.getAllUsers(query);
    }
}
