package edu.scdx.demo.dao;

import edu.scdx.demo.entity.ManagerRecord;

public interface ManagerRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(ManagerRecord record);

    int insertSelective(ManagerRecord record);

    ManagerRecord selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(ManagerRecord record);

    int updateByPrimaryKey(ManagerRecord record);
}