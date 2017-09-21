package com.bao.mapper;

import java.util.List;
import java.util.Map;

import com.bao.bean.User;

public interface UserMapper {

	public User getUser(Integer id);

	public Integer insertUser(User user);

	public Integer deleteUser(Integer id);

	public Integer getCount();
	
	public List<User> getUserByCond(Map<String, String> params);
}
