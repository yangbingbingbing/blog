package com.mff.blog.service;

import com.mff.blog.dao.UserRepository;
import com.mff.blog.po.User;
import com.mff.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username,String password){
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));

        return user;
    }
    @Transactional
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

}

