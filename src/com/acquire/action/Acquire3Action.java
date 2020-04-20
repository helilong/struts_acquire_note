package com.acquire.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaohe.pojo.User;

public class Acquire3Action extends ActionSupport {

	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return "success";
	}
}
