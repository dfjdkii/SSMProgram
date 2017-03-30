package com.hzj.Service;

import java.util.List;

import com.hzj.pojo.TestUser;

public interface UserService {
	public TestUser getUserByUserID(Integer userid);
	public List<TestUser> getUsers();
}
