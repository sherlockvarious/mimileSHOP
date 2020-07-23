package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.scdx.demo.dao.CouponMapper;
import edu.scdx.demo.dao.ManagerRecordMapper;
import edu.scdx.demo.dao.OrdersMapper;
import edu.scdx.demo.entity.Coupon;
import edu.scdx.demo.entity.ManagerRecord;
import edu.scdx.demo.entity.Orders;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    ManagerRecordMapper recordMapper;

    @Resource
    CouponMapper couponMapper;

    @Resource
    OrdersMapper ordersMapper;

    @Override
    public boolean addRecord(ManagerRecord record) {
        if (recordMapper.insertSelective(record) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public PageInfo<ManagerRecord> findRecord(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<ManagerRecord> records = recordMapper.selectByExample(null);
        return new PageInfo<>(records);
    }

    @Override
    public Coupon selectCoupon(Coupon coupon) {
        return couponMapper.selectByPrimaryKey(coupon.getCouponId());
    }

    @Override
    public Orders selectOrder(int orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);

    }

    @Override
    public Coupon selectCouponByPrimarykey(int couponId) {
        return couponMapper.selectByPrimaryKey(couponId);
    }
}

