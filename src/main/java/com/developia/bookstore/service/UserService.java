package com.developia.bookstore.service;

import com.developia.bookstore.model.User;

public interface UserService {
    User register(User user);

    User login(String email, String password);
}
