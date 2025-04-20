package com.bacan.sample.app.repository.impl;

import com.bacan.sample.app.model.User;
import com.bacan.sample.app.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostgresUserRepository implements UserRepository {

  private List<User> users = List.of(
    new User("John", "Doe", "john.doe@example.com"),
    new User("Anna", "Perez", "anna.perez@example.com"),
    new User("Pedro", "Sum", "pedro.sum@example.com")
  );

  @Override
  public List<User> getAllUsers() {
    return users;
  }
}
