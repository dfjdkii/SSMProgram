package test;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hzj.Service.UserService;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.AdminRole;
import com.hzj.pojo.TestUser;
import com.hzj.util.MD5Util;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class TestSM {
	 private static Logger logger = Logger.getLogger(TestSM.class);  
	 @Resource
	 private UserService userService = null;  
	 @Test
	 public void test1(){
		 /*int integer=1125;
		 TestUser user=userService.getUserByUserID(integer);*/
		 /*List<TestUser> list=userService.getUsers();
		 logger.info(JSON.toJSONString(list));*/
		 /*查询*/
		 /*AdminAdministrator administrator=userService.selectByName("dfjdkii");
		 logger.info(JSON.toJSONString(administrator));*/
		 /*插入*/
		 AdminAdministrator adminAdministrator=new AdminAdministrator();
//		 adminAdministrator.setAdminid(2);
		 adminAdministrator.setAdminaccount("dfjdkpp");
		 adminAdministrator.setAdminpassword(MD5Util.md5String("123456", "Hzj19940131x"));
		 adminAdministrator.setAdminpasswordsalt("Hzj19940131x");
		 AdminRole role = userService.getAdminRole(1);
		 adminAdministrator.setAdminRole(role);
		 adminAdministrator.setCreatetime(new Date());
		 int i = userService.insertAdmin(adminAdministrator);
		 System.out.print(i);
		 /*删除*/
		 /*AdminAdministrator administrator=userService.selectByName("dfjdkpp");
		 AdminRole role = userService.getAdminRole(2);
		 administrator.setAdminRole(role);
		 int i = userService.deleteAdmin(2);
		 System.out.print(i);*/
		 /*更新*/
		 /*AdminAdministrator administrator=userService.selectByName("dfjdkpp");
		 AdminRole role = userService.getAdminRole(2);
		 administrator.setAdminRole(role);
		 int i = userService.updateAdmin(administrator);
		 System.out.print(i);*/
	 }
}
