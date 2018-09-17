package com.lishch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lishch.model.User;
import com.lishch.service.UserService;

@Controller
public class UserController {
	@RequestMapping(value = "/getuser2",method = RequestMethod.GET)
	@ResponseBody
	public User getUser(){
		User user = new User();
		user.setUserName("クレオン新之助");
		return user;
	}
	
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public String findUserById(@RequestParam(value = "userId", required = true) int userId,
    		Model model) {
        User user =  userService.findUserById(userId);
        model.addAttribute("user",user);
        return "hello";
    }
}
