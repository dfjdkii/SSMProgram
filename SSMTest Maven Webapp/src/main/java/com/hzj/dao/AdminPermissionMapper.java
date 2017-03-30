package com.hzj.dao;

import com.hzj.pojo.AdminPermission;
import java.util.List;

public interface AdminPermissionMapper {
    int deleteByPrimaryKey(Integer permissionid);

    int insert(AdminPermission record);

    AdminPermission selectByPrimaryKey(Integer permissionid);

    List<AdminPermission> selectAll();

    int updateByPrimaryKey(AdminPermission record);
}