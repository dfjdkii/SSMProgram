package com.hzj.ServerImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hzj.Service.AdminService;
import com.hzj.dao.AdminAdministratorDao;
import com.hzj.dao.AdminPermissionDao;
import com.hzj.dao.AdminRoleDao;
import com.hzj.dao.AdminRoleandpermissionDao;
import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.AdminPermission;
import com.hzj.pojo.AdminRole;
import com.hzj.pojo.AdminRoleandpermission;
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminAdministratorDao administratorDao;
	@Resource
	private AdminRoleDao adminRoleDao;
	@Resource
	private AdminPermissionDao adminPermissionDao;
	@Resource
	private AdminRoleandpermissionDao adminRoleandpermissionDao;
	
	@Override
	public List<AdminAdministrator> selectAllAdList() {
		// TODO Auto-generated method stub
		return administratorDao.selectAll();
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
	@Override
	public int updateAdmin(AdminAdministrator adminAdministrator) {
		// TODO Auto-generated method stub
		return administratorDao.updateByPrimaryKey(adminAdministrator);
	}
	@Override
	public int deleteAdmin(int adminid) {
		// TODO Auto-generated method stub
		return administratorDao.deleteByPrimaryKey(adminid);
	}
	@Override
	public AdminRole getAdminRole(int roleid) {
		// TODO Auto-generated method stub
		return adminRoleDao.selectByPrimaryKey(roleid);
	}
	@Override
	public AdminRole selectPermissionsByroleID(int roleid) {
		// TODO Auto-generated method stub
		return adminRoleDao.selectPermissionsByroleID(roleid);
	}
	@Override
	public AdminPermission selectRolesByPermissionID(int permissionid) {
		// TODO Auto-generated method stub
		return adminPermissionDao.selectRolesByPermissionID(permissionid);
	}
	@Override
	public AdminPermission getAdminPermission(int permissionid) {
		// TODO Auto-generated method stub
		return adminPermissionDao.selectByPrimaryKey(permissionid);
	}
	@Override
	public int insertRole(AdminRole role) {
		// TODO Auto-generated method stub
		return adminRoleDao.insert(role);
	}
	@Override
	public int insertRoleandPermission(AdminRoleandpermission record) {
		// TODO Auto-generated method stub
		return adminRoleandpermissionDao.insert(record);
	}
	@Override
	public int deleteRoleandPermission(int roleid, int permissionid) {
		// TODO Auto-generated method stub
		return adminRoleandpermissionDao.deleteByPrimaryKey(roleid, permissionid);
	}
	@Override
	public int deleteRole(int roleid) {
		// TODO Auto-generated method stub
		return adminRoleDao.deleteByPrimaryKey(roleid);
	}


}
