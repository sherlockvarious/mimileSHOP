package edu.scdx.demo.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String nickName;

    private String realName;

    private String phone;

    private String password;

    private Date lastLoginTime;

    private String lastLoginIp;

    private String email;

    private Boolean sex;

    private Double accountBalance;

    private Integer points;

    private Integer getCouponId;

    public User(Integer userId, String nickName, String realName, String phone, String password, Date lastLoginTime, String lastLoginIp, String email, Boolean sex, Double accountBalance, Integer points, Integer getCouponId) {
        this.userId = userId;
        this.nickName = nickName;
        this.realName = realName;
        this.phone = phone;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.email = email;
        this.sex = sex;
        this.accountBalance = accountBalance;
        this.points = points;
        this.getCouponId = getCouponId;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGetCouponId() {
        return getCouponId;
    }

    public void setGetCouponId(Integer getCouponId) {
        this.getCouponId = getCouponId;
    }
}