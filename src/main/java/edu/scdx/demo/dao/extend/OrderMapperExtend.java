package edu.scdx.demo.dao.extend;

import edu.scdx.demo.entity.Order;

import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/22
 * @school SiChuan University
 */

public interface OrderMapperExtend {

    /**
     * 查询已发货订单
     * @return
     */
    List<Order> selectSendedOrder();

}
