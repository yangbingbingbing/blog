package com.mff.blog.service;

import com.mff.blog.po.User;

public interface UserService {
    User checkUser(String username,String password);
    User saveUser(User user);
}
