package com.bacan.sample.app.database.entitiy.mapper;

import com.bacan.sample.app.database.entitiy.UserEntity;
import com.bacan.sample.app.domain.model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserEntityMapper {
  public static UserEntity map(User user) {
    return UserEntity.builder()
      .id(user.getId())
      .name(user.getName())
      .lastname(user.getLastname())
      .email(user.getEmail())
      .createdAt(user.getCreatedAt())
      .updatedAt(user.getUpdatedAt())
      .build();
  }

  public static User map(UserEntity user) {
    return User.builder()
      .id(user.getId())
      .name(user.getName())
      .lastname(user.getLastname())
      .email(user.getEmail())
      .createdAt(user.getCreatedAt())
      .updatedAt(user.getUpdatedAt())
      .build();
  }
}
