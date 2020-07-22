package edu.scdx.demo.service;

import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.entity.Order;

import java.util.List;

public interface ManagerService {
    public Manager login(Manager manager);

    public PageInfo<Order> checkSendedOrder(int page, int limit);
}
