package com.lishch.model;

public class User {
	private int userId;
	private String userName;
	private String userInfo;
	private java.sql.Date userBirth;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public java.sql.Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(java.sql.Date userBirth) {
		this.userBirth = userBirth;
	}
}
