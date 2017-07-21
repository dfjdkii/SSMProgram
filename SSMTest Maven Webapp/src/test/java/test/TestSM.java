package test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hzj.Service.AdminService;
import com.hzj.Service.UserService;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.AdminPermission;
import com.hzj.pojo.AdminRole;
import com.hzj.pojo.AdminRoleandpermission;
import com.hzj.pojo.TestUser;
import com.hzj.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestSM {
	 private static Logger logger = Logger.getLogger(TestSM.class);  
	 @Resource
	 private UserService userService = null; 
	 @Resource
	 private AdminService adminService = null;
	 @Test
	 public void test1(){
		 /*int integer=1125;
		 TestUser user=userService.getUserByUserID(integer);*/
		 /*List<TestUser> list=userService.getUsers();
		 logger.info(JSON.toJSONString(list));*/
		 /*查询所有管理员*/
		 /*List<AdminAdministrator> adminList = adminService.selectAllAdList();
		 logger.info(JSON.toJSONString(adminList));*/
		 /*根据名称查询*/
		 /*AdminAdministrator administrator=adminService.selectByName("dfjdkii");
		 logger.info(JSON.toJSONString(administrator));*/
		 /*插入*/
		 /*AdminAdministrator adminAdministrator=new AdminAdministrator();
		 adminAdministrator.setAdminaccount("dfjdkkk");
		 adminAdministrator.setAdminpassword(MD5Util.md5String("123456", "Hzj19940131x"));
		 adminAdministrator.setAdminpasswordsalt("Hzj19940131x");
		 AdminRole role = adminService.getAdminRole(2);
		 adminAdministrator.setAdminRole(role);
		 //adminAdministrator.setCreatetime(new Date());
		 int i = adminService.insertAdmin(adminAdministrator);
		 System.out.print(i);*/
		 /*删除*/
		 /*AdminAdministrator administrator=adminService.selectByName("dfjdkkk");
		 int i = adminService.deleteAdmin(administrator.getAdminid());
		 System.out.print(i);*/
		 /*更新*/
		 /*AdminAdministrator administrator=adminService.selectByName("dfjdkpp");
		 AdminRole role = adminService.getAdminRole(2);
		 administrator.setAdminRole(role);
		 int i = adminService.updateAdmin(administrator);
		 System.out.print(i);*/
		 /*根据角色id获取所有权限集合*/
		 /*AdminRole role = adminService.selectPermissionsByroleID(1);
		 logger.info(JSON.toJSONString(role));*/
		 /*根据权限id获取所有角色集合*/
		 AdminPermission permission = adminService.selectRolesByPermissionID(1);
		 logger.info(JSON.toJSONString(permission));
		 /*插入角色同时定义权限*/
		 /*AdminRole role = new AdminRole();
		 role.setRolename("自定义角色1");
		 List<AdminPermission> permissions = new ArrayList<>();
		 for(int i=1;i<3;i++){
			 permissions.add(adminService.getAdminPermission(i));
		 }
		 role.setPermissions(permissions);
		 int i = adminService.insertRole(role);
		 if(i!=0){
			 int roleid = role.getRoleid();
			 AdminRoleandpermission roleandpermission = new AdminRoleandpermission();
			 for (AdminPermission adminPermission : permissions) {
				roleandpermission.setRoleid(roleid);
				roleandpermission.setPermissionid(adminPermission.getPermissionid());
				adminService.insertRoleandPermission(roleandpermission);
			}			
		 }
		 System.out.print(i);*/
		 /*删除角色同时删除权限*/
		 /*AdminRole role = adminService.getAdminRole(3);
		 int i = adminService.deleteRoleandPermission(role.getRoleid(), 0);
		 if(i!=0){
			 i = adminService.deleteRole(role.getRoleid());
		 }
		 System.out.print(i);*/
		 /*插入权限同时定义角色*/
		 
		 
		 
	 }
}
