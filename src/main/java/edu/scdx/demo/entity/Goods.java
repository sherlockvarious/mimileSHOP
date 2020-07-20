package edu.scdx.demo.entity;

public class Goods {
    private Integer goodsId;

    private String typeName;

    private String brand;

    private String goodsName;

    private String goodsPic;

    private Integer goodsDetail;

    private String goodsOrigin;

    private Double oldPrice;

    private Double price;

    private Integer goodsOrdernum;

    private Integer goodsHits;

    private Integer count;

    public Goods(Integer goodsId, String typeName, String brand, String goodsName, String goodsPic, Integer goodsDetail, String goodsOrigin, Double oldPrice, Double price, Integer goodsOrdernum, Integer goodsHits, Integer count) {
        this.goodsId = goodsId;
        this.typeName = typeName;
        this.brand = brand;
        this.goodsName = goodsName;
        this.goodsPic = goodsPic;
        this.goodsDetail = goodsDetail;
        this.goodsOrigin = goodsOrigin;
        this.oldPrice = oldPrice;
        this.price = price;
        this.goodsOrdernum = goodsOrdernum;
        this.goodsHits = goodsHits;
        this.count = count;
    }

    public Goods() {
        super();
    }

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

    public Integer getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(Integer goodsDetail) {
        this.goodsDetail = goodsDetail;
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