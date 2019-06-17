package com.daima.controller;

import com.daima.domain.User;
import com.daima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    //查询所有
    @RequestMapping(value = "/findAll")
    public List<User> findAll(){
      List<User> list= userService.findAll();

        System.out.println("查询所有方法执行了");
      return list;
    }


    //根据id查询一个
    @RequestMapping(value = "/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
        System.out.println("查询一个方法执行了");
        User user = userService.findOne(id);
        System.out.println(user);
        return user;
    }

    //更新
    @RequestMapping(value = "/update")
    public void update(@RequestBody User user){
        System.out.println("更新方法执行了");
        userService.update(user);
    }
}
