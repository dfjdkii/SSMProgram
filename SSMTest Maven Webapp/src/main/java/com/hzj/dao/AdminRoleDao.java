package com.hzj.dao;

import com.hzj.pojo.AdminRole;
import java.util.List;

public interface AdminRoleDao {
    int deleteByPrimaryKey(Integer roleid);

    int insert(AdminRole record);

    AdminRole selectByPrimaryKey(Integer roleid);

    List<AdminRole> selectAll();

    int updateByPrimaryKey(AdminRole record);
    
    AdminRole selectPermissionsByroleID(Integer roleid);
}