package com.hzj.ServerImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzj.Service.UserService;
import com.hzj.dao.TestUserDao;
import com.hzj.pojo.TestUser;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private TestUserDao userDao;
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
	
}
