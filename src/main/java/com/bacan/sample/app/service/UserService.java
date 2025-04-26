package com.bacan.sample.app.service;

import com.bacan.sample.app.database.dao.UserDao;
import com.bacan.sample.app.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

  private final UserDao userDao;

  @Autowired
  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public User createUser(User user) {
    return this.userDao.createUser(user
      .withCreatedAt(LocalDateTime.now())
      .withUpdatedAt(LocalDateTime.now()));
  }

  public User getUserById(Long id) {
    return this.userDao.findUserById(id)
      .orElseThrow(() -> new RuntimeException("User not found"));
  }

  public List<User> getAllUsers() {
    return this.userDao.findAllUsers();
  }
}
