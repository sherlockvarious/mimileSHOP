package edu.scdx.demo.dao;

import edu.scdx.demo.entity.ManagerRecord;
import edu.scdx.demo.entity.ManagerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerRecordMapper {
    long countByExample(ManagerRecordExample example);

    int deleteByExample(ManagerRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(ManagerRecord record);

    int insertSelective(ManagerRecord record);

    List<ManagerRecord> selectByExample(ManagerRecordExample example);

    ManagerRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") ManagerRecord record, @Param("example") ManagerRecordExample example);

    int updateByExample(@Param("record") ManagerRecord record, @Param("example") ManagerRecordExample example);

    int updateByPrimaryKeySelective(ManagerRecord record);

    int updateByPrimaryKey(ManagerRecord record);
}