package test;
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
import com.hzj.pojo.TestUser;

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
		 AdminAdministrator administrator=userService.selectByName("dfjdkii");
		 logger.info(JSON.toJSONString(administrator));
	 }
}
