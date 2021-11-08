package com.orange3.entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

/**
 * @author orange
 * @Description: 用户实体类
 * @date 2021/10/26
 */
@Alias("user")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private int id;
	private String user_name;
	private String user_password;
	
	public User() {
		
	}
	
	public User(String user_name, String user_password) {
		this.user_name=user_name;
		this.user_password=user_password;
	}
	
	public User(int id, String user_name,String user_password) {
		this.id=id;
		this.user_name=user_name;
		this.user_password=user_password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
}
