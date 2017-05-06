package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
@Transactional
public class UserService {
	@Autowired
    private UserDao userDao;
    
    public String add(User user){
        userDao.saveUser(user);
        return "添加成功！";
    }
    
//    public String addUser(String account,String ){
//        User user = new User();
//        user.setAccount(account);
//        userDao.number(user);
//        return "添加成功！";
//    }
//    
//    public User getOneUser(Long id){
//        return userDao.findOne(id);
//    }

}
