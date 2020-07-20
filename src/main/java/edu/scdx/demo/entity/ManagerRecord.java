package edu.scdx.demo.entity;

import java.util.Date;

public class ManagerRecord {
    private String recordId;

    private String managerId;

    private String detail;

    private Date time;

    private String orderId;

    private String goodsId;

    public ManagerRecord(String recordId, String managerId, String detail, Date time, String orderId, String goodsId) {
        this.recordId = recordId;
        this.managerId = managerId;
        this.detail = detail;
        this.time = time;
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public ManagerRecord() {
        super();
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }
}