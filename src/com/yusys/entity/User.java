package com.yusys.entity;

/**
 * 用户实体类
 * @author snailjw
 *
 */
public class User {

	/**
	 * 用户编码
	 */
	private int id;
	
	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;

	public User() {
		super();
	}
	

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	/*
	 * public void setPassword(String password) { this.password = password; }
	 */
	
	
}
