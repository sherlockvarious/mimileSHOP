package edu.scdx.demo.entity;

public class Goods {
    private Integer goodsId;

    private String typeName;

    private String brand;

    private String goodsName;

    private String goodsPic;

    private String goodsDetail;

    private String goodsOrigin;

    private Double oldPrice;

    private Double price;

    private Integer goodsOrdernum;

    private Integer goodsHits;

    private Integer count;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic == null ? null : goodsPic.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin == null ? null : goodsOrigin.trim();
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getGoodsOrdernum() {
        return goodsOrdernum;
    }

    public void setGoodsOrdernum(Integer goodsOrdernum) {
        this.goodsOrdernum = goodsOrdernum;
    }

    public Integer getGoodsHits() {
        return goodsHits;
    }

    public void setGoodsHits(Integer goodsHits) {
        this.goodsHits = goodsHits;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}