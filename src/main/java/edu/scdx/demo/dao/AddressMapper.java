package edu.scdx.demo.dao;

import edu.scdx.demo.entity.Address;

public interface AddressMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKeyWithBLOBs(Address record);

    int updateByPrimaryKey(Address record);
}