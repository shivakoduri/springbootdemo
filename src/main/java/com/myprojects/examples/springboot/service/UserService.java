package com.myprojects.examples.springboot.service;

import com.myprojects.examples.springboot.model.User;

public interface UserService {

    public User findUserByEmail(String email);
    public void saveUser(User user);
}
