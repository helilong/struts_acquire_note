package com.acquire.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaohe.pojo.User;

public class Acquire2Action extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return "success";
	}

	
}
