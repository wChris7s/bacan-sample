package com.bacan.sample.app.database.dao.impl;

import com.bacan.sample.app.database.dao.UserDao;
import com.bacan.sample.app.database.entitiy.UserEntity;
import com.bacan.sample.app.database.entitiy.mapper.UserEntityMapper;
import com.bacan.sample.app.database.repository.UserRepository;
import com.bacan.sample.app.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostgresUserRepository implements UserDao {

  private final UserRepository userRepository;

  @Autowired
  public PostgresUserRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User createUser(User user) {
    UserEntity newUser = UserEntityMapper.map(user);
    UserEntity savedUser = this.userRepository.save(newUser);
    return UserEntityMapper.map(savedUser);
  }

  @Override
  public Optional<User> findUserById(Long id) {
    return this.userRepository.findById(id)
      .map(UserEntityMapper::map);
  }

  @Override
  public List<User> findAllUsers() {
    return this.userRepository.findAll()
      .stream()
      .map(UserEntityMapper::map)
      .toList();
  }
}
