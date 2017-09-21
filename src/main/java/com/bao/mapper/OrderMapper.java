package com.bao.mapper;

import java.util.List;

import com.bao.bean.Order;

public interface OrderMapper {
	public List<Order> getOrdersByUserId(Integer userId);
}
