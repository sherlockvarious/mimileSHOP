package edu.scdx.demo.dao;

import edu.scdx.demo.entity.getCoupon;
import edu.scdx.demo.entity.getCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface getCouponMapper {
    long countByExample(getCouponExample example);

    int deleteByExample(getCouponExample example);

    int deleteByPrimaryKey(Integer getCouponId);

    int insert(getCoupon record);

    int insertSelective(getCoupon record);

    List<getCoupon> selectByExample(getCouponExample example);

    getCoupon selectByPrimaryKey(Integer getCouponId);

    int updateByExampleSelective(@Param("record") getCoupon record, @Param("example") getCouponExample example);

    int updateByExample(@Param("record") getCoupon record, @Param("example") getCouponExample example);

    int updateByPrimaryKeySelective(getCoupon record);

    int updateByPrimaryKey(getCoupon record);
}