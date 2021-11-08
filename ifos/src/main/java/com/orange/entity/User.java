package com.orange.entity;

import java.io.Serializable;

/**
 * @author orange
 * @Description: 用户实体类
 * @date 2021/10/21
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String age;
	private String sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
		
	@Override
	public String toString() {
		return "User{" +"id='" + id + '\'' +

				", name='" + name + '\'' +

				", age='" + age + '\'' +

				", sex='" + sex + '\'' +

				'}';

	}
}
