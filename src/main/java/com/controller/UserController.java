package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("/frame")
public class UserController {
	@Autowired
    private UserService userService;
    
    @RequestMapping(value = "/saveUser",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public String saveUser(String username,String password){
    	System.out.println("username:"+username);
    	System.out.println("password:"+password);
    	User user = new User();
    	user.setAccount(username);
    	user.setPassword(password);
//    	return "2222222222";
        return userService.add(user);
    }
    
//    @RequestMapping(value = "/saveUser/{account}",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
//    public String add(@PathVariable String account){
//        return userService.addUser(account);
//    }
//    
//    @RequestMapping(value = "/user/{id}",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
//    public User add(@PathVariable Long id){
//        return userService.getOneUser(id);
//    }
}
