package com.bacan.sample.app.http.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {
  private String name;
  private String lastname;
  private String email;
}
