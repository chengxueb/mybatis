package com.bao.mapper;

import com.bao.bean.User;

public interface UserMapper {

	public User getUser(Integer id);
	
	public Integer insertUser(User user);
}
