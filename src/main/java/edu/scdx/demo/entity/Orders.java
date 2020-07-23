package edu.scdx.demo.entity;

import edu.scdx.demo.entity.extend.OrdersExtend;

import java.util.Date;

public class Orders extends OrdersExtend {
    private Integer orderId;

    private Integer userId;

    private Integer goodsId;

    private Date creationTime;

    private Date payTime;

    private Date deliveryTime;

    private Date receivingTime;

    private Double moneyOfGoods;

    private Double moneyOfDelivery;

    private Integer orderPoints;

    private Integer couponId;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", creationTime=" + creationTime +
                ", payTime=" + payTime +
                ", deliveryTime=" + deliveryTime +
                ", receivingTime=" + receivingTime +
                ", moneyOfGoods=" + moneyOfGoods +
                ", moneyOfDelivery=" + moneyOfDelivery +
                ", orderPoints=" + orderPoints +
                ", couponId=" + couponId +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceivingTime() {
        return receivingTime;
    }

    public void setReceivingTime(Date receivingTime) {
        this.receivingTime = receivingTime;
    }

    public Double getMoneyOfGoods() {
        return moneyOfGoods;
    }

    public void setMoneyOfGoods(Double moneyOfGoods) {
        this.moneyOfGoods = moneyOfGoods;
    }

    public Double getMoneyOfDelivery() {
        return moneyOfDelivery;
    }

    public void setMoneyOfDelivery(Double moneyOfDelivery) {
        this.moneyOfDelivery = moneyOfDelivery;
    }

    public Integer getOrderPoints() {
        return orderPoints;
    }

    public void setOrderPoints(Integer orderPoints) {
        this.orderPoints = orderPoints;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }
}