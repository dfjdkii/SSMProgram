package com.hzj.controller;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzj.Service.AdminService;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.util.MD5Util;


@Controller
@RequestMapping("/homepage")
public class AdminController {
	@Resource
	private AdminService adminService = null;
	@RequestMapping("/loginAdmin")
	public String login(AdminAdministrator administrator,Model model){
		Subject subject = SecurityUtils.getSubject();
		//MD5加密传入的用户密码
		administrator.setAdminpassword(MD5Util.md5String(administrator.getAdminpassword(), "Hzj19940131x"));
		//
		UsernamePasswordToken token = new UsernamePasswordToken(administrator.getAdminaccount(), administrator.getAdminpassword(), false);
		try {
			subject.login(token);
			return "admin";
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			model.addAttribute("error","用户名或密码错误");
			return "Back";
		}
		
	}
}
