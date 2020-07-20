package edu.scdx.demo.entity;

public class Address {
    private String addressId;

    private String userId;

    private String phone;

    private String country;

    private String province;

    private String city;

    private String district;

    private String detail;

    private Boolean isDefault;

    private byte[] name;

    public Address(String addressId, String userId, String phone, String country, String province, String city, String district, String detail, Boolean isDefault, byte[] name) {
        this.addressId = addressId;
        this.userId = userId;
        this.phone = phone;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.detail = detail;
        this.isDefault = isDefault;
        this.name = name;
    }

    public Address() {
        super();
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public byte[] getName() {
        return name;
    }

    public void setName(byte[] name) {
        this.name = name;
    }
}