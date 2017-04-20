package com.hzj.Service;

import java.util.List;

import com.hzj.pojo.AdminAdministrator;
import com.hzj.pojo.AdminPermission;
import com.hzj.pojo.AdminRole;
import com.hzj.pojo.AdminRoleandpermission;

public interface AdminService {
	/*查询所有管理员列表*/
	public List<AdminAdministrator> selectAllAdList();
	/*通过名称查询管理员*/
	public AdminAdministrator selectByName(String adminaccount);
	/*新增管理员*/
	public int insertAdmin(AdminAdministrator adminAdministrator);
	/*删除管理员*/
	public int deleteAdmin(int adminid);
	/*更新管理员信息*/
	public int updateAdmin(AdminAdministrator adminAdministrator);
	/*通过id获取角色*/
	public AdminRole getAdminRole(int roleid);
	/*通过角色id获取所有权限*/
	public AdminRole selectPermissionsByroleID(int roleid);
	/*通过权限id获取所有角色*/
	public AdminPermission selectRolesByPermissionID(int permissionid);
	/*通过id获取权限*/
	public AdminPermission getAdminPermission(int permissionid);
	/*新增角色*/
	public int insertRole(AdminRole role);
	/*删除角色*/
	public int deleteRole(int roleid);
	/*新增角色-权限表*/
	public int insertRoleandPermission(AdminRoleandpermission record);
	/*删除角色-权限表*/
	public int deleteRoleandPermission(int roleid,int permissionid);
}
