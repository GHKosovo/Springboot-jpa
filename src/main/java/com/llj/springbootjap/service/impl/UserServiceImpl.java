package com.llj.springbootjap.service.impl;

import com.llj.springbootjap.entity.User;
import com.llj.springbootjap.repo.UserRepository;
import com.llj.springbootjap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public void printUser() {
        System.out.printf("我是菜徐坤"+"\n");
    }
}
