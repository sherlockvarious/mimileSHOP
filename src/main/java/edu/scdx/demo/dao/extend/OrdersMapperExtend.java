package edu.scdx.demo.dao.extend;

import edu.scdx.demo.entity.Orders;

import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/22
 * @school SiChuan University
 */

public interface OrdersMapperExtend {

    /**
     * 查询已发货订单
     * @return
     */
    List<Orders> selectSendedOrder();

    List<Orders> selectWaitToSendedOrder();
}
