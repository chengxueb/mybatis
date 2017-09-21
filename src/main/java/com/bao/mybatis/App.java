package com.bao.mybatis;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		User user = userMapper.getUser(3);
		System.out.println(user);
		user = userMapper.getUser(3);
		System.out.println(user);

		/*
		 * User user = new User(); user.setAge(26); user.setName("包成学"); Integer
		 * res = userMapper.insertUser(user); System.out.println(res);
		 * System.out.println(user.getId());
		 * 
		 * session.commit();
		 */
		/*
		 * Integer res = userMapper.deleteUser(2); System.out.println(res);
		 * session.commit();
		 */
		// System.out.println(userMapper.getCount());

		/*
		 * User user = new User(); user.setName("hello, world");
		 * user.setAge(20); userMapper.insertUser(user); session.commit();
		 */
		/*
		 * Map<String, String> params = new HashMap<String, String>();
		 * params.put("id", 1 + ""); params.put("name", "包成学"); List<User> user
		 * = userMapper.getUserByCond(params); for (User u : user) {
		 * System.out.println(u); if (u != null && u.getUserInfo() != null) {
		 * System.out.println(u.getUserInfo()); } if (u != null &&
		 * u.getOrders().size() != 0) { System.out.println(u.getOrders()); } }
		 */
	}
}
