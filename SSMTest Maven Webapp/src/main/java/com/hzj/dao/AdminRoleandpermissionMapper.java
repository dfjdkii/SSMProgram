package com.hzj.dao;

import com.hzj.pojo.AdminRoleandpermission;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminRoleandpermissionMapper {
    int deleteByPrimaryKey(@Param("roleid") Integer roleid, @Param("permissionid") Integer permissionid);

    int insert(AdminRoleandpermission record);

    List<AdminRoleandpermission> selectAll();
}