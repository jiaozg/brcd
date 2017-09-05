package com.brcd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumIsNull() {
            addCriterion("business_num is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumIsNotNull() {
            addCriterion("business_num is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNumEqualTo(String value) {
            addCriterion("business_num =", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotEqualTo(String value) {
            addCriterion("business_num <>", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumGreaterThan(String value) {
            addCriterion("business_num >", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumGreaterThanOrEqualTo(String value) {
            addCriterion("business_num >=", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumLessThan(String value) {
            addCriterion("business_num <", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumLessThanOrEqualTo(String value) {
            addCriterion("business_num <=", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumLike(String value) {
            addCriterion("business_num like", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotLike(String value) {
            addCriterion("business_num not like", value, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumIn(List<String> values) {
            addCriterion("business_num in", values, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotIn(List<String> values) {
            addCriterion("business_num not in", values, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumBetween(String value1, String value2) {
            addCriterion("business_num between", value1, value2, "businessNum");
            return (Criteria) this;
        }

        public Criteria andBusinessNumNotBetween(String value1, String value2) {
            addCriterion("business_num not between", value1, value2, "businessNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumIsNull() {
            addCriterion("proxy_num is null");
            return (Criteria) this;
        }

        public Criteria andProxyNumIsNotNull() {
            addCriterion("proxy_num is not null");
            return (Criteria) this;
        }

        public Criteria andProxyNumEqualTo(String value) {
            addCriterion("proxy_num =", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumNotEqualTo(String value) {
            addCriterion("proxy_num <>", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumGreaterThan(String value) {
            addCriterion("proxy_num >", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumGreaterThanOrEqualTo(String value) {
            addCriterion("proxy_num >=", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumLessThan(String value) {
            addCriterion("proxy_num <", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumLessThanOrEqualTo(String value) {
            addCriterion("proxy_num <=", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumLike(String value) {
            addCriterion("proxy_num like", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumNotLike(String value) {
            addCriterion("proxy_num not like", value, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumIn(List<String> values) {
            addCriterion("proxy_num in", values, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumNotIn(List<String> values) {
            addCriterion("proxy_num not in", values, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumBetween(String value1, String value2) {
            addCriterion("proxy_num between", value1, value2, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andProxyNumNotBetween(String value1, String value2) {
            addCriterion("proxy_num not between", value1, value2, "proxyNum");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(String value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(String value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(String value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLike(String value) {
            addCriterion("order_state like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotLike(String value) {
            addCriterion("order_state not like", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<String> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyIsNull() {
            addCriterion("num_money is null");
            return (Criteria) this;
        }

        public Criteria andNumMoneyIsNotNull() {
            addCriterion("num_money is not null");
            return (Criteria) this;
        }

        public Criteria andNumMoneyEqualTo(Long value) {
            addCriterion("num_money =", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyNotEqualTo(Long value) {
            addCriterion("num_money <>", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyGreaterThan(Long value) {
            addCriterion("num_money >", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("num_money >=", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyLessThan(Long value) {
            addCriterion("num_money <", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyLessThanOrEqualTo(Long value) {
            addCriterion("num_money <=", value, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyIn(List<Long> values) {
            addCriterion("num_money in", values, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyNotIn(List<Long> values) {
            addCriterion("num_money not in", values, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyBetween(Long value1, Long value2) {
            addCriterion("num_money between", value1, value2, "numMoney");
            return (Criteria) this;
        }

        public Criteria andNumMoneyNotBetween(Long value1, Long value2) {
            addCriterion("num_money not between", value1, value2, "numMoney");
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

        public Criteria andCheckSettleStateIsNull() {
            addCriterion("check_settle_state is null");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateIsNotNull() {
            addCriterion("check_settle_state is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateEqualTo(String value) {
            addCriterion("check_settle_state =", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateNotEqualTo(String value) {
            addCriterion("check_settle_state <>", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateGreaterThan(String value) {
            addCriterion("check_settle_state >", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateGreaterThanOrEqualTo(String value) {
            addCriterion("check_settle_state >=", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateLessThan(String value) {
            addCriterion("check_settle_state <", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateLessThanOrEqualTo(String value) {
            addCriterion("check_settle_state <=", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateLike(String value) {
            addCriterion("check_settle_state like", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateNotLike(String value) {
            addCriterion("check_settle_state not like", value, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateIn(List<String> values) {
            addCriterion("check_settle_state in", values, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateNotIn(List<String> values) {
            addCriterion("check_settle_state not in", values, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateBetween(String value1, String value2) {
            addCriterion("check_settle_state between", value1, value2, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andCheckSettleStateNotBetween(String value1, String value2) {
            addCriterion("check_settle_state not between", value1, value2, "checkSettleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateIsNull() {
            addCriterion("settle_state is null");
            return (Criteria) this;
        }

        public Criteria andSettleStateIsNotNull() {
            addCriterion("settle_state is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStateEqualTo(String value) {
            addCriterion("settle_state =", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotEqualTo(String value) {
            addCriterion("settle_state <>", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThan(String value) {
            addCriterion("settle_state >", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateGreaterThanOrEqualTo(String value) {
            addCriterion("settle_state >=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThan(String value) {
            addCriterion("settle_state <", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLessThanOrEqualTo(String value) {
            addCriterion("settle_state <=", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateLike(String value) {
            addCriterion("settle_state like", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotLike(String value) {
            addCriterion("settle_state not like", value, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateIn(List<String> values) {
            addCriterion("settle_state in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotIn(List<String> values) {
            addCriterion("settle_state not in", values, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateBetween(String value1, String value2) {
            addCriterion("settle_state between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andSettleStateNotBetween(String value1, String value2) {
            addCriterion("settle_state not between", value1, value2, "settleState");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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