package edu.scdx.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeIsNull() {
            addCriterion("receiving_time is null");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeIsNotNull() {
            addCriterion("receiving_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeEqualTo(Date value) {
            addCriterion("receiving_time =", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeNotEqualTo(Date value) {
            addCriterion("receiving_time <>", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeGreaterThan(Date value) {
            addCriterion("receiving_time >", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiving_time >=", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeLessThan(Date value) {
            addCriterion("receiving_time <", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeLessThanOrEqualTo(Date value) {
            addCriterion("receiving_time <=", value, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeIn(List<Date> values) {
            addCriterion("receiving_time in", values, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeNotIn(List<Date> values) {
            addCriterion("receiving_time not in", values, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeBetween(Date value1, Date value2) {
            addCriterion("receiving_time between", value1, value2, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andReceivingTimeNotBetween(Date value1, Date value2) {
            addCriterion("receiving_time not between", value1, value2, "receivingTime");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsIsNull() {
            addCriterion("money_of_goods is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsIsNotNull() {
            addCriterion("money_of_goods is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsEqualTo(Double value) {
            addCriterion("money_of_goods =", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsNotEqualTo(Double value) {
            addCriterion("money_of_goods <>", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsGreaterThan(Double value) {
            addCriterion("money_of_goods >", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsGreaterThanOrEqualTo(Double value) {
            addCriterion("money_of_goods >=", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsLessThan(Double value) {
            addCriterion("money_of_goods <", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsLessThanOrEqualTo(Double value) {
            addCriterion("money_of_goods <=", value, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsIn(List<Double> values) {
            addCriterion("money_of_goods in", values, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsNotIn(List<Double> values) {
            addCriterion("money_of_goods not in", values, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsBetween(Double value1, Double value2) {
            addCriterion("money_of_goods between", value1, value2, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfGoodsNotBetween(Double value1, Double value2) {
            addCriterion("money_of_goods not between", value1, value2, "moneyOfGoods");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryIsNull() {
            addCriterion("money_of_delivery is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryIsNotNull() {
            addCriterion("money_of_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryEqualTo(Double value) {
            addCriterion("money_of_delivery =", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryNotEqualTo(Double value) {
            addCriterion("money_of_delivery <>", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryGreaterThan(Double value) {
            addCriterion("money_of_delivery >", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryGreaterThanOrEqualTo(Double value) {
            addCriterion("money_of_delivery >=", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryLessThan(Double value) {
            addCriterion("money_of_delivery <", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryLessThanOrEqualTo(Double value) {
            addCriterion("money_of_delivery <=", value, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryIn(List<Double> values) {
            addCriterion("money_of_delivery in", values, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryNotIn(List<Double> values) {
            addCriterion("money_of_delivery not in", values, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryBetween(Double value1, Double value2) {
            addCriterion("money_of_delivery between", value1, value2, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andMoneyOfDeliveryNotBetween(Double value1, Double value2) {
            addCriterion("money_of_delivery not between", value1, value2, "moneyOfDelivery");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIsNull() {
            addCriterion("order_points is null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIsNotNull() {
            addCriterion("order_points is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsEqualTo(Integer value) {
            addCriterion("order_points =", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotEqualTo(Integer value) {
            addCriterion("order_points <>", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGreaterThan(Integer value) {
            addCriterion("order_points >", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_points >=", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsLessThan(Integer value) {
            addCriterion("order_points <", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsLessThanOrEqualTo(Integer value) {
            addCriterion("order_points <=", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIn(List<Integer> values) {
            addCriterion("order_points in", values, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotIn(List<Integer> values) {
            addCriterion("order_points not in", values, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsBetween(Integer value1, Integer value2) {
            addCriterion("order_points between", value1, value2, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("order_points not between", value1, value2, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}