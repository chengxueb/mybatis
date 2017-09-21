package com.bao.bean;

public class Order {

	private Integer id;
	private String sn;
	private User user;

	public Integer getId() {
		return id;
	}

	public String getSn() {
		return sn;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "id=" + id + ", sn=" + sn + ", user=" + user;
	}
}
