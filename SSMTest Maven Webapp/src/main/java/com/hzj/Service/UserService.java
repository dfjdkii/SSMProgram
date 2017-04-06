package com.hzj.Service;

import java.util.List;

import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.TestUser;

public interface UserService {
	public TestUser getUserByUserID(Integer userid);
	public List<TestUser> getUsers();
	public AdminAdministrator selectByName(String adminaccount);
	public int insertAdmin(AdminAdministrator adminAdministrator);
}
