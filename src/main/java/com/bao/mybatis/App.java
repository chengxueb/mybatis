package com.bao.mybatis;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bao.bean.User;
import com.bao.mapper.UserMapper;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws IOException {
		SqlSessionFactory factory = new SqlSessionFactoryBuilder()
				.build(Resources.getResourceAsStream("mybatis-config.xml"));
		SqlSession session = factory.openSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		
		User user = userMapper.getUser(2);
		System.out.println(user);
		/*
		User user = new User();
		user.setAge(26);
		user.setName("包成学");
		Integer res = userMapper.insertUser(user);
		System.out.println(res);
		System.out.println(user.getId());
		
		session.commit();
		*/
	}
}
