package com.hzj.dao;

import com.hzj.pojo.AdminAdministrator;
import java.util.List;

public interface AdminAdministratorMapper {
    int deleteByPrimaryKey(Integer adminid);

    int insert(AdminAdministrator record);

    AdminAdministrator selectByPrimaryKey(Integer adminid);

    List<AdminAdministrator> selectAll();

    int updateByPrimaryKey(AdminAdministrator record);
}