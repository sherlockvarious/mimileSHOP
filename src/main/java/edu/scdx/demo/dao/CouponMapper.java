package edu.scdx.demo.dao;

import edu.scdx.demo.entity.Coupon;
import edu.scdx.demo.entity.CouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponMapper {
    long countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(String couponId);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(String couponId);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}