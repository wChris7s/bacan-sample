package com.bacan.sample.app.domain.model;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.time.LocalDateTime;

@Value
@Builder
public class User {
  Long id;
  String name;
  String lastname;
  String email;
  @With
  LocalDateTime createdAt;
  @With
  LocalDateTime updatedAt;
}
