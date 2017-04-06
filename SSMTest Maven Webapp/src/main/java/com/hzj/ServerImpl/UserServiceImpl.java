package com.hzj.ServerImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzj.Service.UserService;
import com.hzj.dao.AdminAdministratorDao;
import com.hzj.dao.TestUserDao;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.TestUser;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private TestUserDao userDao;
	@Resource
	private AdminAdministratorDao administratorDao;
	@Override
	public TestUser getUserByUserID(Integer userid) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userid);
	}
	@Override
	public List<TestUser> getUsers() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}
	@Override
	public AdminAdministrator selectByName(String adminaccount) {
		// TODO Auto-generated method stub
		return administratorDao.selectByName(adminaccount);
	}
	@Override
	public int insertAdmin(AdminAdministrator adminAdministrator) {
		// TODO Auto-generated method stub
		return administratorDao.insert(adminAdministrator);
	}

}
