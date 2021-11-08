package com.orange3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orange3.entity.User;

@Mapper
public interface UserMapper {
	User findUserByUsername(String username);
	
	void updateUserByUsername(User user);
	
	void deleteUserByUsername(String username);
	
	void saveUser(User user);
	
	List<User> getUserList();
}
