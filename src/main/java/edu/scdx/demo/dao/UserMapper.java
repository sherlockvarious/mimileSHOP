package edu.scdx.demo.dao;

import edu.scdx.demo.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     *
     * @param email  邮箱
     * @return   找到的数目（count)
     */
    int selectCountByEmail(String email);
}