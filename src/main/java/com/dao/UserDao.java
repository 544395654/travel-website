package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveUser(User user){
		String sql = "insert into user (username,userpwd) values("+user.getAccount()+","+user.getPassword()+")";
		int number = jdbcTemplate.update(sql);
		return number;
	}
	
}
