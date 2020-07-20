package edu.scdx.demo.entity;

import java.util.Date;

public class Coupon {
    private Integer couponId;

    private Double full;

    private Double minus;

    private Date startDate;

    private Date endDate;

    private String couponName;

    public Coupon(Integer couponId, Double full, Double minus, Date startDate, Date endDate, String couponName) {
        this.couponId = couponId;
        this.full = full;
        this.minus = minus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.couponName = couponName;
    }

    public Coupon() {
        super();
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Double getFull() {
        return full;
    }

    public void setFull(Double full) {
        this.full = full;
    }

    public Double getMinus() {
        return minus;
    }

    public void setMinus(Double minus) {
        this.minus = minus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }
}