package com.bacan.sample.app.repository;

import com.bacan.sample.app.model.User;

import java.util.List;

public interface UserRepository {
  List<User> getAllUsers();
}
