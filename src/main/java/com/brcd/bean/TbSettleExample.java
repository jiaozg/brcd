package com.brcd.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSettleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSettleExample() {
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

        public Criteria andPayoffNumIsNull() {
            addCriterion("payoff_num is null");
            return (Criteria) this;
        }

        public Criteria andPayoffNumIsNotNull() {
            addCriterion("payoff_num is not null");
            return (Criteria) this;
        }

        public Criteria andPayoffNumEqualTo(String value) {
            addCriterion("payoff_num =", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumNotEqualTo(String value) {
            addCriterion("payoff_num <>", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumGreaterThan(String value) {
            addCriterion("payoff_num >", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumGreaterThanOrEqualTo(String value) {
            addCriterion("payoff_num >=", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumLessThan(String value) {
            addCriterion("payoff_num <", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumLessThanOrEqualTo(String value) {
            addCriterion("payoff_num <=", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumLike(String value) {
            addCriterion("payoff_num like", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumNotLike(String value) {
            addCriterion("payoff_num not like", value, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumIn(List<String> values) {
            addCriterion("payoff_num in", values, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumNotIn(List<String> values) {
            addCriterion("payoff_num not in", values, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumBetween(String value1, String value2) {
            addCriterion("payoff_num between", value1, value2, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andPayoffNumNotBetween(String value1, String value2) {
            addCriterion("payoff_num not between", value1, value2, "payoffNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumIsNull() {
            addCriterion("settle_num is null");
            return (Criteria) this;
        }

        public Criteria andSettleNumIsNotNull() {
            addCriterion("settle_num is not null");
            return (Criteria) this;
        }

        public Criteria andSettleNumEqualTo(String value) {
            addCriterion("settle_num =", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotEqualTo(String value) {
            addCriterion("settle_num <>", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumGreaterThan(String value) {
            addCriterion("settle_num >", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumGreaterThanOrEqualTo(String value) {
            addCriterion("settle_num >=", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLessThan(String value) {
            addCriterion("settle_num <", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLessThanOrEqualTo(String value) {
            addCriterion("settle_num <=", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumLike(String value) {
            addCriterion("settle_num like", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotLike(String value) {
            addCriterion("settle_num not like", value, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumIn(List<String> values) {
            addCriterion("settle_num in", values, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotIn(List<String> values) {
            addCriterion("settle_num not in", values, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumBetween(String value1, String value2) {
            addCriterion("settle_num between", value1, value2, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleNumNotBetween(String value1, String value2) {
            addCriterion("settle_num not between", value1, value2, "settleNum");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNull() {
            addCriterion("settle_time is null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIsNotNull() {
            addCriterion("settle_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTimeEqualTo(Date value) {
            addCriterion("settle_time =", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotEqualTo(Date value) {
            addCriterion("settle_time <>", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThan(Date value) {
            addCriterion("settle_time >", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settle_time >=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThan(Date value) {
            addCriterion("settle_time <", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeLessThanOrEqualTo(Date value) {
            addCriterion("settle_time <=", value, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeIn(List<Date> values) {
            addCriterion("settle_time in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotIn(List<Date> values) {
            addCriterion("settle_time not in", values, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeBetween(Date value1, Date value2) {
            addCriterion("settle_time between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andSettleTimeNotBetween(Date value1, Date value2) {
            addCriterion("settle_time not between", value1, value2, "settleTime");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNull() {
            addCriterion("customer_num is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIsNotNull() {
            addCriterion("customer_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumEqualTo(String value) {
            addCriterion("customer_num =", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotEqualTo(String value) {
            addCriterion("customer_num <>", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThan(String value) {
            addCriterion("customer_num >", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumGreaterThanOrEqualTo(String value) {
            addCriterion("customer_num >=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThan(String value) {
            addCriterion("customer_num <", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLessThanOrEqualTo(String value) {
            addCriterion("customer_num <=", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumLike(String value) {
            addCriterion("customer_num like", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotLike(String value) {
            addCriterion("customer_num not like", value, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumIn(List<String> values) {
            addCriterion("customer_num in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotIn(List<String> values) {
            addCriterion("customer_num not in", values, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumBetween(String value1, String value2) {
            addCriterion("customer_num between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerNumNotBetween(String value1, String value2) {
            addCriterion("customer_num not between", value1, value2, "customerNum");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNull() {
            addCriterion("settle_type is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNotNull() {
            addCriterion("settle_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeEqualTo(String value) {
            addCriterion("settle_type =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(String value) {
            addCriterion("settle_type <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(String value) {
            addCriterion("settle_type >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_type >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(String value) {
            addCriterion("settle_type <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(String value) {
            addCriterion("settle_type <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLike(String value) {
            addCriterion("settle_type like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotLike(String value) {
            addCriterion("settle_type not like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<String> values) {
            addCriterion("settle_type in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<String> values) {
            addCriterion("settle_type not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(String value1, String value2) {
            addCriterion("settle_type between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(String value1, String value2) {
            addCriterion("settle_type not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNull() {
            addCriterion("settle_mode is null");
            return (Criteria) this;
        }

        public Criteria andSettleModeIsNotNull() {
            addCriterion("settle_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSettleModeEqualTo(String value) {
            addCriterion("settle_mode =", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotEqualTo(String value) {
            addCriterion("settle_mode <>", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThan(String value) {
            addCriterion("settle_mode >", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeGreaterThanOrEqualTo(String value) {
            addCriterion("settle_mode >=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThan(String value) {
            addCriterion("settle_mode <", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLessThanOrEqualTo(String value) {
            addCriterion("settle_mode <=", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeLike(String value) {
            addCriterion("settle_mode like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotLike(String value) {
            addCriterion("settle_mode not like", value, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeIn(List<String> values) {
            addCriterion("settle_mode in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotIn(List<String> values) {
            addCriterion("settle_mode not in", values, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeBetween(String value1, String value2) {
            addCriterion("settle_mode between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andSettleModeNotBetween(String value1, String value2) {
            addCriterion("settle_mode not between", value1, value2, "settleMode");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andSettleFeeIsNull() {
            addCriterion("settle_fee is null");
            return (Criteria) this;
        }

        public Criteria andSettleFeeIsNotNull() {
            addCriterion("settle_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSettleFeeEqualTo(BigDecimal value) {
            addCriterion("settle_fee =", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeNotEqualTo(BigDecimal value) {
            addCriterion("settle_fee <>", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeGreaterThan(BigDecimal value) {
            addCriterion("settle_fee >", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_fee >=", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeLessThan(BigDecimal value) {
            addCriterion("settle_fee <", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_fee <=", value, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeIn(List<BigDecimal> values) {
            addCriterion("settle_fee in", values, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeNotIn(List<BigDecimal> values) {
            addCriterion("settle_fee not in", values, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_fee between", value1, value2, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_fee not between", value1, value2, "settleFee");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNull() {
            addCriterion("settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNotNull() {
            addCriterion("settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountEqualTo(BigDecimal value) {
            addCriterion("settle_amount =", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotEqualTo(BigDecimal value) {
            addCriterion("settle_amount <>", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThan(BigDecimal value) {
            addCriterion("settle_amount >", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amount >=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThan(BigDecimal value) {
            addCriterion("settle_amount <", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("settle_amount <=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIn(List<BigDecimal> values) {
            addCriterion("settle_amount in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotIn(List<BigDecimal> values) {
            addCriterion("settle_amount not in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amount between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("settle_amount not between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(String value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(String value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(String value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(String value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(String value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLike(String value) {
            addCriterion("settle_status like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotLike(String value) {
            addCriterion("settle_status not like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<String> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<String> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(String value1, String value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(String value1, String value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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