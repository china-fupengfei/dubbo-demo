package com.baoy.bean;

import java.io.Serializable;

/**
 * @author baoyou E-mail:curiousby@163.com
 * @version 2016年2月22日 上午10:19:36
 *
 *          desc: ...
 */
public class User implements Serializable{ 
	private static final long serialVersionUID = 4786875484947536748L;
	
	private Integer userId;
	private String userName;
	private String password;
	private String tel;
	private String sex;
	private String description;
	
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", tel=" + tel + ", sex=" + sex
				+ ", description=" + description + "]";
	}
	
	
	public Integer getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getTel() {
		return tel;
	}
	public String getSex() {
		return sex;
	}
	public String getDescription() {
		return description;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
