package edu.scdx.demo.service;

import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.Coupon;
import edu.scdx.demo.entity.ManagerRecord;
import edu.scdx.demo.entity.Orders;

public interface RecordService {
    public boolean addRecord(ManagerRecord record);
    PageInfo<ManagerRecord> findRecord(int pageNo, int pageSize);

    public Coupon selectCoupon(Coupon coupon);

    public Orders selectOrder(int orderId);

    Coupon selectCouponByPrimarykey(int couponId);
}
