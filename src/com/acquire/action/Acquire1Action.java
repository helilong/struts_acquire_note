package com.acquire.action;

import com.opensymphony.xwork2.ActionSupport;

public class Acquire1Action extends ActionSupport{
	
	private String username;
	private String password;
	private int  age;
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String execute() throws Exception {
			
		System.out.println(username);
		System.out.println(password);
		System.out.println(age);
		return "success";
	}

}
