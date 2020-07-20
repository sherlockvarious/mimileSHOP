package edu.scdx.demo.entity;

import java.util.Date;

public class Manager {
    private Integer managerId;

    private String name;

    private String password;

    private Date lastLoginTime;

    private String lastLoginIp;

    public Manager(Integer managerId, String name, String password, Date lastLoginTime, String lastLoginIp) {
        this.managerId = managerId;
        this.name = name;
        this.password = password;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
    }

    public Manager() {
        super();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
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