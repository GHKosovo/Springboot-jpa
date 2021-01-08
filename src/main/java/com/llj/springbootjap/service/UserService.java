package com.llj.springbootjap.service;

import com.llj.springbootjap.entity.User;

public interface UserService {

    void addUser(User user);

    User getUser(Integer id);

    void printUser();
}
