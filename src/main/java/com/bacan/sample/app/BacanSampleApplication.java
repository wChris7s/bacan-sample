package com.bacan.sample.app;

import com.bacan.sample.app.repository.impl.PostgresUserRepository;
import com.bacan.sample.app.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BacanSampleApplication {

    public static void main(String[] args) {

        UserService userService = new UserService(new PostgresUserRepository());

        SpringApplication.run(BacanSampleApplication.class, args);
    }

}
