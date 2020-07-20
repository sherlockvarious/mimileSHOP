package edu.scdx.demo.entity;

import java.util.Date;

public class Order {
    private String orderId;

    private String userId;

    private String goodsId;

    private Date creationTime;

    private Date payTime;

    private Date deliveryTime;

    private Date receivingTime;

    private Double moneyOfGoods;

    private Double moneyOfDelivery;

    private Integer orderPoints;

    private String couponId;

    public Order(String orderId, String userId, String goodsId, Date creationTime, Date payTime, Date deliveryTime, Date receivingTime, Double moneyOfGoods, Double moneyOfDelivery, Integer orderPoints, String couponId) {
        this.orderId = orderId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.creationTime = creationTime;
        this.payTime = payTime;
        this.deliveryTime = deliveryTime;
        this.receivingTime = receivingTime;
        this.moneyOfGoods = moneyOfGoods;
        this.moneyOfDelivery = moneyOfDelivery;
        this.orderPoints = orderPoints;
        this.couponId = couponId;
    }

    public Order() {
        super();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }
}