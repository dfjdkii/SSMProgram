package com.hzj.util;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.hzj.Service.UserService;
import com.hzj.pojo.AdminAdministrator;

public class MyRealm extends AuthorizingRealm {

	@Resource  
    private UserService userService; 
    /*权限验证*/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/*登录验证*/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName=token.getPrincipal().toString();
		AdminAdministrator adminAdministrator=userService.selectByName(userName);
		if(adminAdministrator!=null){
			SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(adminAdministrator.getAdminaccount(), adminAdministrator.getAdminpassword(), "");
			return authenticationInfo;
		}
		else{
			return null;
		}
		
	}

}
