package com.bacan.sample.app.http.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {
  private Long id;
  private String name;
  private String lastname;
  private String email;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
