package com.bacan.sample.app.repository.impl;

import com.bacan.sample.app.repository.UserRepository;

public class PostgresUserRepository implements UserRepository {
    @Override
    public Object[] getAllUsers(Object query) {
        return new Object[0];
    }
}
