package com.hzj.dao;

import com.hzj.pojo.TestUser;
import java.util.List;

public interface TestUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    List<TestUser> selectAll();

    int updateByPrimaryKey(TestUser record);
}