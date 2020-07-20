package edu.scdx.demo.dao;

import edu.scdx.demo.entity.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(String managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}