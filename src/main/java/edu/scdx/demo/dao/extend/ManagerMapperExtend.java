package edu.scdx.demo.dao.extend;

import edu.scdx.demo.entity.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapperExtend {
    List<Manager> selectByName(@Param("id") int id, @Param("manager") Manager manager);

    void myInsert(Manager manager);

    List<Manager> selectByAdmin(@Param("manager") Manager manager);

    void deleteByIds(@Param("arr") List<Integer> arr);

    void insetByList(@Param("list") List<Manager> list);
}
