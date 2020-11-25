package com.developia.bookstore.service.impl;

import com.developia.bookstore.model.User;
import com.developia.bookstore.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User register(User user) {

        //TODO check password equals, at least 5 symbol
        //TODO set role to User

        System.out.println("Register " + user);
        return null;
    }

    @Override
    public User login(String email, String password) {
        return null;
    }
}
