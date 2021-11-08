package com.orange3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange3.dao.UserMapper;
import com.orange3.entity.User;

@RestController
public class UserController {
	@Autowired
	UserMapper userMapper;
	
	 //http://localhost:8888/getUser?username=xinyi
	@RequestMapping("/getUser")
	public String getUser(String username) {
		//User对象调用userMapper接口中的方法这个方法由userMapper.xml中的sql语句进行实现
		User user=userMapper.findUserByUsername(username);
		
		return user!=null ? username+"密码是"+user.getUser_password():"不存在用户名为"+username+"的用户";
	}
	
	 //http://localhost:8888/updateUser?username=xinyi&password=12
	@RequestMapping("/updateUser")
	public String updateUser(String password, String username) {
		//需要同时提供账号密码才能更新用户信息
		User user=new User(username, password);
		userMapper.updateUserByUsername(user);
		return "success！";
	}
	//http://localhost:8888/addUser?username=xinyi&password=12
	@RequestMapping("/addUser")
    public String addUser(String username,String password){
        User user = new User(username,password);
        userMapper.saveUser(user);
        return "success!";
    }
	
	//http://localhost:8888/addUser?username=xinyi
	@RequestMapping("/deleteUser")
	public String deleteUser(String username) {
		userMapper.deleteUserByUsername(username);
		return "success!";
	}
	
	//http://localhost:8888/getUserList
	@RequestMapping("/getUserList")
	public List<User> getUserList(String name,String password) {
		return userMapper.getUserList();
	}
}
