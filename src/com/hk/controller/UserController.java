package com.hk.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hk.bean.User;

public class UserController implements Controller{
	//返回多个用户数据
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<User> users  = new ArrayList<User>();
		
		User user = new User();
		user.setUsername("qyh");
		user.setAge(38);
		user.setSex(1);
		user.setBirthday(new Date());
		
		
		users.add(user);
		User user2 = new User();
		user2.setUsername("qyh2");
		user2.setAge(39);
		user2.setSex(0);
		user2.setBirthday(new Date());
		
		users.add(user2);
		
		
		User user3 = new User();
		user3.setUsername("qyh3");
		user3.setAge(39);
		user3.setSex(1);
		user3.setBirthday(new Date());
		
		users.add(user3);
		
		
		//创建一个对象ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//request.setAttribute(key,value)
		//填充数据
		modelAndView.addObject("users", users);
		//绑定视图
		modelAndView.setViewName("/users.jsp");
		
		return modelAndView;
	}
}
