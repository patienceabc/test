package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){
        System.out.println("username: " + username + ", password: " + password);
        return "login successful";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String query(String username){
        return "query successful";
    }

    @RequestMapping("/logout")
    @ResponseBody
    public String logout(){
        return "logout successful";
    }
}
