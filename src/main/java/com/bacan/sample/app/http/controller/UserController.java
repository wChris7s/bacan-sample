package com.bacan.sample.app.http.controller;

import com.bacan.sample.app.domain.model.User;
import com.bacan.sample.app.http.dto.CreateUserDto;
import com.bacan.sample.app.http.dto.UserDto;
import com.bacan.sample.app.http.dto.mapper.UserDtoMapper;
import com.bacan.sample.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<UserDto> getAllUsers() {
    return this.userService.getAllUsers()
      .stream()
      .map(UserDtoMapper::map)
      .toList();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UserDto createUser(@RequestBody CreateUserDto createUserDto) {
    User user = UserDtoMapper.map(createUserDto);
    User savedUser = this.userService.createUser(user);
    return UserDtoMapper.map(savedUser);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public UserDto getUserById(@PathVariable Long id) {
    User savedUser = this.userService.getUserById(id);
    return UserDtoMapper.map(savedUser);
  }
}
