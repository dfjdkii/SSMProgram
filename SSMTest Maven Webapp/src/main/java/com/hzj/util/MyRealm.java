package com.hzj.util;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.hzj.Service.AdminService;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.AdminPermission;
import com.hzj.pojo.AdminRole;

public class MyRealm extends AuthorizingRealm {

	@Resource
	private AdminService adminService = null;
    /*权限验证*/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// TODO Auto-generated method stub
		if (principals == null) {  
            throw new AuthorizationException(  
                    "PrincipalCollection method argument cannot be null.");  
        }
		/*初始化权限设置*/
		String userName = principals.getPrimaryPrincipal().toString();		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> roleSet = new HashSet<>();
		Set<String> permissionSet = new HashSet<>();
		/*获取用户的角色与权限并放进集合中*/
		AdminAdministrator adminAdministrator = adminService.selectByName(userName);
		roleSet.add(adminAdministrator.getAdminRole().getRolename());
		AdminRole adminRole = adminService.getAdminRole(adminAdministrator.getAdminRole().getRoleid());
		for(AdminPermission p:adminRole.getPermissions()){
			permissionSet.add(p.getPermissionname());
		}
		info.setRoles(roleSet);
		info.setStringPermissions(permissionSet);		
		return info;
	}

	/*登录验证*/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		String userName = token.getPrincipal().toString();
		AdminAdministrator adminAdministrator=adminService.selectByName(userName);
		if(adminAdministrator!=null){
			SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(adminAdministrator.getAdminaccount(), adminAdministrator.getAdminpassword(), "");
			return authenticationInfo;
		}
		else{
			return null;
		}
		
	}

}
