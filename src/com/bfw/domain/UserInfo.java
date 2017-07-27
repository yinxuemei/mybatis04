package com.bfw.domain;

import java.util.Date;

public class UserInfo {

	private Integer userId;
	
	private String username;
	
	private Integer userAge;
	
	
	private String userSex;
	
	private Date userBrithday;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Date getUserBrithday() {
		return userBrithday;
	}

	public void setUserBrithday(Date userBrithday) {
		this.userBrithday = userBrithday;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", username=" + username
				+ ", userAge=" + userAge + ", userSex=" + userSex
				+ ", userBrithday=" + userBrithday + "]";
	}
	
	
	
	
}
