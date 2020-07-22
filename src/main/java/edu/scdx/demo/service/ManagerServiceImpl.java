package edu.scdx.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Or;
import edu.scdx.demo.dao.ManagerMapper;
import edu.scdx.demo.dao.OrderMapper;
import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.entity.ManagerExample;
import edu.scdx.demo.entity.Order;
import edu.scdx.demo.entity.OrderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService{
    @Resource
    private ManagerMapper managerMapper;

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Manager login(Manager manager) {
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andManagerIdEqualTo(manager.getManagerId()).andPasswordEqualTo(manager.getPassword());
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        return (managers.size()>0?managers.get(0):null);
    }

    @Override
    public PageInfo<Order> checkSendedOrder(int page, int limit) {

        PageHelper.startPage(page,limit);
        List<Order> orders = orderMapper.selectSendedOrder();
        return  new PageInfo<>(orders);

    }
}
