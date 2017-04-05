package com.hzj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.hzj.Service.UserService;
import com.hzj.pojo.TestUser;

@Controller
@RequestMapping("/hzj")
public class TestController {
	@Resource  
    private UserService userService;  
	@RequestMapping("/ShowNameByID")
	public String Test(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id")); 
		TestUser user=userService.getUserByUserID(userId);
		model.addAttribute("user", user);
		/*List<TestUser> list=userService.getUsers();
		model.addAttribute("list",JSON.toJSONString(list));*/
		return "MyJsp";
	}
	@RequestMapping("/ShowAllByUsingJson")
	public String Test2(HttpServletRequest request,Model model){
		/*int userId = Integer.parseInt(request.getParameter("id")); 
		TestUser user=userService.getUserByUserID(userId);
		model.addAttribute("user", user);*/
		List<TestUser> list=userService.getUsers();
		model.addAttribute("list",JSON.toJSONString(list));
		return "MyJsp";
	}
}
