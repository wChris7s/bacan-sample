package com.bacan.sample.app.database.dao;

import com.bacan.sample.app.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
  User createUser(User user);

  Optional<User> findUserById(Long id);

  List<User> findAllUsers();
}
