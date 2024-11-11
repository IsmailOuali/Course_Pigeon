package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepoInterface;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {
    @Autowired
    private UserRepoInterface userRepo;
    @Override
    public User insertUser(User user){
        userRepo.save(user);
        return user;
    }




}
