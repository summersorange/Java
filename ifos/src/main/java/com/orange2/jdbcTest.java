package com.orange2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTest {
	public static void main(String[] args) throws SQLException{
		
		String sql1="SELECT * FROM USER";
		Connection conn=DBUtil.getConnection();
		//开启事务
		conn.setAutoCommit(false);
		//调用方法创建一个参数为sql的对象实例
		PreparedStatement preparedStatement=conn.prepareStatement(sql1);
		//提交事务
		ResultSet rs=preparedStatement.executeQuery();
		while(rs.next()) {
			//要与数据库对应的字段对应
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			String age=rs.getString("age");
			System.out.println(name +" " + sex + " " + age);
		}
		
		String sql2 ="CREATE TABLE IF NOT EXISTS user2 ("
				+"id INT UNSIGNED AUTO_INCREMENT,"
					+"user_name VARCHAR(100) NOT NULL,"
					+"user_password VARCHAR(100) NOT NULL,"
					+"PRIMARY KEY(id)"
					+")ENGINE=InnoDB DEFAULT CHARSET=utf8;";
		preparedStatement=conn.prepareStatement(sql2);
		preparedStatement.executeUpdate();
		
		String sql3="INSERT INTO USER2 (user_name,user_password) "
				+"VALUES('老王','123456')";	//USER表大小写不敏感，指代同一个表
		preparedStatement=conn.prepareStatement(sql3);
		preparedStatement.executeUpdate();
		
		String sql4="DELETE FROM USER2 WHERE user_name='老王' ";
		preparedStatement=conn.prepareStatement(sql4);
		preparedStatement.executeUpdate();
		
		String sql5="UPDATE USER2 SET user_password='12333' WHERE user_name='bohuan' ";
		preparedStatement=conn.prepareStatement(sql5);
		preparedStatement.executeUpdate();
		conn.commit();
		//要注意关闭与数据库的连接，实际过程中最好标准一点
		conn.close();
		}
	
}
