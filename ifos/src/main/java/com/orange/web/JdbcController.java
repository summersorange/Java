package com.orange.web;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orange.entity.User;



@RestController
@RequestMapping(value = "/jdbc")
public class JdbcController {
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/user")
	@ResponseBody
	public List<User> list(ModelMap map){
		String sql="SELECT * FROM user";
		List<User> userList=jdbcTemplate.query(sql,new RowMapper<User>(){
		User user=null;
		@Override
		public User mapRow(ResultSet rs,int rowNum) throws SQLException{
			user=new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setSex(rs.getString("sex"));
			user.setAge(rs.getString("age"));
			return user;
		}
		});
		for(User user:userList) {
			System.out.println(user.toString());
		}
		return userList;
	}	
	
	
	@RequestMapping("/userList")
	public String userList(ModelMap map) {
	String sql="SELECT * FROM user";
	List<User> userList=jdbcTemplate.query(sql,new RowMapper<User>(){
	User user=null;
	@Override
	public User mapRow(ResultSet rs,int rowNum) throws SQLException{
		user=new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setSex(rs.getString("sex"));
		user.setAge(rs.getString("age"));
		return user;
	}
	});
	map.addAttribute("users",userList);
	return "user";
	}
}