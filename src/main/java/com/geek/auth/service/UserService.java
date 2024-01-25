package com.geek.auth.service;

import com.geek.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
