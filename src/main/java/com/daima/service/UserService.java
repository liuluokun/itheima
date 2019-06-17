package com.daima.service;


import com.daima.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findOne(Integer id);

    void update(User user);
}
