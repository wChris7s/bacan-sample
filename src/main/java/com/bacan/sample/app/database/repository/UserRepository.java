package com.bacan.sample.app.database.repository;

import com.bacan.sample.app.database.entitiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}