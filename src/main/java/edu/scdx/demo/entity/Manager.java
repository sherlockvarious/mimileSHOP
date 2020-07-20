package edu.scdx.demo.entity;

import java.util.Date;

public class Manager {
    private String managerId;

    private String name;

    private String password;

    private Date lastLoginTime;

    private String lastLoginIp;

    public Manager(String managerId, String name, String password, Date lastLoginTime, String lastLoginIp) {
        this.managerId = managerId;
        this.name = name;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
    }

    public Manager() {
        super();
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
}