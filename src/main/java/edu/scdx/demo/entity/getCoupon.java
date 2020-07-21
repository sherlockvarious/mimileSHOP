package edu.scdx.demo.entity;

public class getCoupon {
    private Integer getCouponId;

    private Integer couponId;

    private Integer userId;

    private Integer count;

    public getCoupon(Integer getCouponId, Integer couponId, Integer userId, Integer count) {
        this.getCouponId = getCouponId;
        this.couponId = couponId;
        this.userId = userId;
        this.count = count;
    }

    public getCoupon() {
        super();
    }

    public Integer getGetCouponId() {
        return getCouponId;
    }

    public void setGetCouponId(Integer getCouponId) {
        this.getCouponId = getCouponId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}