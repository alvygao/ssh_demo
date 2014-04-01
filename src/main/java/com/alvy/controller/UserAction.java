package com.alvy.controller;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alvy.entity.Car;
import com.alvy.entity.User;
import com.alvy.service.UserService;

@Controller("userAction")
public class UserAction {
	@Autowired
	private UserService userService;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String reg() {
		user.setId(UUID.randomUUID().toString());
		user.setRegtime(new Date());
		Car car = new Car();
		car.setUser(user);
		try {
			userService.addUser(user);
			ServletActionContext.getContext().getSession().put("user", user);
			ServletActionContext.getContext().getSession()
					.put("msg", "注册成功了，可以去登陆了");
			return "success";

		} catch (Exception e) {
			e.printStackTrace();
			ServletActionContext.getContext().getSession().put("msg", "注册失败了");
			return "error";
		}
	}
}