package edu.scdx.demo.service;

import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.Coupon;
import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.entity.Orders;

public interface ManagerService {
    public Manager login(Manager manager);

    public PageInfo<Orders> checkSendedOrder(int page, int limit);

    public PageInfo<Orders> waitToSend(int page, int limit);

    public boolean toDelivery(int orderId);

    public PageInfo<Coupon> viewCoupon(int page, int limit);

    public boolean addCoupon(Coupon coupon);

    public boolean editCoupon(Coupon coupon);

    public boolean deleteCoupon(int couponId);

    public boolean addManager(Manager manager);

    public boolean deleteManager(int managerId);

    public boolean changeManagerPassword(int managerId,String password);

    public PageInfo<Manager> findManagers(int pageNo, int pageSize);

}
