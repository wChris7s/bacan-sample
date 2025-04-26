package com.bacan.sample.app.database.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Lombok
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// Jakarta
@Entity(name = "user")
@Table(name = "user", schema = "public", indexes = {
  @Index(columnList = "email", name = "user_email_unique", unique = true),
  @Index(columnList = "id", name = "user_pk", unique = true)
})
public class UserEntity {
  @Id
  @SequenceGenerator(name = "user_sequence", sequenceName = "user_id_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
  private Long id;

  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String lastname;
  @Column(nullable = false)
  private String email;

  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;
  @Column(name = "updated_at", nullable = false)
  private LocalDateTime updatedAt;
}