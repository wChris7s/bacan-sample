package com.bacan.sample.app.http.dto.mapper;

import com.bacan.sample.app.domain.model.User;
import com.bacan.sample.app.http.dto.CreateUserDto;
import com.bacan.sample.app.http.dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserDtoMapper {
  public static UserDto map(User user) {
    return UserDto.builder()
      .id(user.getId())
      .name(user.getName())
      .lastname(user.getLastname())
      .email(user.getEmail())
      .createdAt(user.getCreatedAt())
      .updatedAt(user.getUpdatedAt())
      .build();
  }

  public static User map(CreateUserDto createUserDto) {
    return User.builder()
      .name(createUserDto.getName())
      .lastname(createUserDto.getLastname())
      .email(createUserDto.getEmail())
      .build();
  }
}
