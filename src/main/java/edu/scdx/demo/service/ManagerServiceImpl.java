package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.dao.CouponMapper;
import edu.scdx.demo.dao.ManagerMapper;
import edu.scdx.demo.dao.ManagerRecordMapper;
import edu.scdx.demo.dao.OrdersMapper;
import edu.scdx.demo.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerMapper managerMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Resource
    private CouponMapper couponMapper;

    @Resource
    ManagerRecordMapper managerRecordMapper;

    @Override
    public PageInfo<Coupon> viewCoupon(int page, int limit) {
        try {
            PageHelper.startPage(page, limit);
            List<Coupon> coupons = couponMapper.selectByExample(new CouponExample());


            return new PageInfo<>(coupons);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Manager login(Manager manager) {

        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andManagerIdEqualTo(manager.getManagerId()).andPasswordEqualTo(manager.getPassword());
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        return (managers.size() > 0 ? managers.get(0) : null);
    }

    @Override
    public PageInfo<Orders> checkSendedOrder(int page, int limit) {
        try {
            PageHelper.startPage(page, limit);
            List<Orders> orders = ordersMapper.selectSendedOrder();


            return new PageInfo<>(orders);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public PageInfo<Orders> waitToSend(int page, int limit) {

        try {
            PageHelper.startPage(page, limit);
            List<Orders> orders = ordersMapper.selectWaitToSendedOrder();
            return new PageInfo<>(orders);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean toDelivery(int orderId) {

        try {
            OrdersExample example = new OrdersExample();
            example.createCriteria().andOrderIdEqualTo(orderId);
            Orders orders = new Orders();
            orders.setDeliveryTime(new Date());


            ordersMapper.updateByExampleSelective(orders, example);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }

    @Override
    public boolean addCoupon(Coupon coupon) {
        try {
            couponMapper.insertSelective(coupon);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean editCoupon(Coupon coupon) {
        try {
            couponMapper.updateByPrimaryKeySelective(coupon);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteCoupon(int couponId) {
        try {
            couponMapper.deleteByPrimaryKey(couponId);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean addManager(Manager manager){
        if (managerMapper.insertSelective(manager)==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteManager(int managerId){
        try {
            managerMapper.deleteByPrimaryKey(managerId);
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean changeManagerPassword(int managerId,String password) {

        try {
            ManagerExample example = new ManagerExample();
            Manager manager = new Manager();
            manager.setPassword(password);
            example.createCriteria().andManagerIdEqualTo(managerId);
            managerMapper.updateByExampleSelective(manager,example);
            return true;
        }catch (Exception e){
            return  false;
        }

    }

    @Override
    public PageInfo<Manager> findManagers(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Manager> manager = managerMapper.selectByExample(null);
        return new PageInfo<>(manager);
    }

    @Override
    public void update(Manager managerInDB) {
        managerMapper.updateByPrimaryKeySelective(managerInDB);
    }

    @Override
    public PageInfo<ManagerRecord> findManagerRecord(int page, int limit) {
        PageHelper.startPage(page,limit);
        List<ManagerRecord> records = managerRecordMapper.selectByExample(null);
        return new PageInfo<>(records);
    }
}
