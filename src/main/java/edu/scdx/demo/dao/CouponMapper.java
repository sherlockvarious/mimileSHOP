package edu.scdx.demo.dao;

import edu.scdx.demo.entity.Coupon;

public interface CouponMapper {
    int deleteByPrimaryKey(String couponId);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(String couponId);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}