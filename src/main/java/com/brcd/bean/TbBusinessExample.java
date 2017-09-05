package com.brcd.bean;

import java.util.ArrayList;
import java.util.List;

public class TbBusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBusinessExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andWechatPayIsNull() {
            addCriterion("wechat_pay is null");
            return (Criteria) this;
        }

        public Criteria andWechatPayIsNotNull() {
            addCriterion("wechat_pay is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPayEqualTo(Integer value) {
            addCriterion("wechat_pay =", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayNotEqualTo(Integer value) {
            addCriterion("wechat_pay <>", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayGreaterThan(Integer value) {
            addCriterion("wechat_pay >", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_pay >=", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayLessThan(Integer value) {
            addCriterion("wechat_pay <", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_pay <=", value, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayIn(List<Integer> values) {
            addCriterion("wechat_pay in", values, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayNotIn(List<Integer> values) {
            addCriterion("wechat_pay not in", values, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayBetween(Integer value1, Integer value2) {
            addCriterion("wechat_pay between", value1, value2, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatPayNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_pay not between", value1, value2, "wechatPay");
            return (Criteria) this;
        }

        public Criteria andWechatRateIsNull() {
            addCriterion("wechat_rate is null");
            return (Criteria) this;
        }

        public Criteria andWechatRateIsNotNull() {
            addCriterion("wechat_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWechatRateEqualTo(Integer value) {
            addCriterion("wechat_rate =", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateNotEqualTo(Integer value) {
            addCriterion("wechat_rate <>", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateGreaterThan(Integer value) {
            addCriterion("wechat_rate >", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_rate >=", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateLessThan(Integer value) {
            addCriterion("wechat_rate <", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateLessThanOrEqualTo(Integer value) {
            addCriterion("wechat_rate <=", value, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateIn(List<Integer> values) {
            addCriterion("wechat_rate in", values, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateNotIn(List<Integer> values) {
            addCriterion("wechat_rate not in", values, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateBetween(Integer value1, Integer value2) {
            addCriterion("wechat_rate between", value1, value2, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatRateNotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_rate not between", value1, value2, "wechatRate");
            return (Criteria) this;
        }

        public Criteria andWechatT0IsNull() {
            addCriterion("wechat_t_0 is null");
            return (Criteria) this;
        }

        public Criteria andWechatT0IsNotNull() {
            addCriterion("wechat_t_0 is not null");
            return (Criteria) this;
        }

        public Criteria andWechatT0EqualTo(Integer value) {
            addCriterion("wechat_t_0 =", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0NotEqualTo(Integer value) {
            addCriterion("wechat_t_0 <>", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0GreaterThan(Integer value) {
            addCriterion("wechat_t_0 >", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0GreaterThanOrEqualTo(Integer value) {
            addCriterion("wechat_t_0 >=", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0LessThan(Integer value) {
            addCriterion("wechat_t_0 <", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0LessThanOrEqualTo(Integer value) {
            addCriterion("wechat_t_0 <=", value, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0In(List<Integer> values) {
            addCriterion("wechat_t_0 in", values, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0NotIn(List<Integer> values) {
            addCriterion("wechat_t_0 not in", values, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0Between(Integer value1, Integer value2) {
            addCriterion("wechat_t_0 between", value1, value2, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatT0NotBetween(Integer value1, Integer value2) {
            addCriterion("wechat_t_0 not between", value1, value2, "wechatT0");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryIsNull() {
            addCriterion("wechat_industry is null");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryIsNotNull() {
            addCriterion("wechat_industry is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryEqualTo(String value) {
            addCriterion("wechat_industry =", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryNotEqualTo(String value) {
            addCriterion("wechat_industry <>", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryGreaterThan(String value) {
            addCriterion("wechat_industry >", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_industry >=", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryLessThan(String value) {
            addCriterion("wechat_industry <", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryLessThanOrEqualTo(String value) {
            addCriterion("wechat_industry <=", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryLike(String value) {
            addCriterion("wechat_industry like", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryNotLike(String value) {
            addCriterion("wechat_industry not like", value, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryIn(List<String> values) {
            addCriterion("wechat_industry in", values, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryNotIn(List<String> values) {
            addCriterion("wechat_industry not in", values, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryBetween(String value1, String value2) {
            addCriterion("wechat_industry between", value1, value2, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatIndustryNotBetween(String value1, String value2) {
            addCriterion("wechat_industry not between", value1, value2, "wechatIndustry");
            return (Criteria) this;
        }

        public Criteria andWechatTypeIsNull() {
            addCriterion("wechat_type is null");
            return (Criteria) this;
        }

        public Criteria andWechatTypeIsNotNull() {
            addCriterion("wechat_type is not null");
            return (Criteria) this;
        }

        public Criteria andWechatTypeEqualTo(String value) {
            addCriterion("wechat_type =", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeNotEqualTo(String value) {
            addCriterion("wechat_type <>", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeGreaterThan(String value) {
            addCriterion("wechat_type >", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_type >=", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeLessThan(String value) {
            addCriterion("wechat_type <", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeLessThanOrEqualTo(String value) {
            addCriterion("wechat_type <=", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeLike(String value) {
            addCriterion("wechat_type like", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeNotLike(String value) {
            addCriterion("wechat_type not like", value, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeIn(List<String> values) {
            addCriterion("wechat_type in", values, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeNotIn(List<String> values) {
            addCriterion("wechat_type not in", values, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeBetween(String value1, String value2) {
            addCriterion("wechat_type between", value1, value2, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatTypeNotBetween(String value1, String value2) {
            addCriterion("wechat_type not between", value1, value2, "wechatType");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNull() {
            addCriterion("wechat_num is null");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNotNull() {
            addCriterion("wechat_num is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNumEqualTo(String value) {
            addCriterion("wechat_num =", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotEqualTo(String value) {
            addCriterion("wechat_num <>", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThan(String value) {
            addCriterion("wechat_num >", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_num >=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThan(String value) {
            addCriterion("wechat_num <", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThanOrEqualTo(String value) {
            addCriterion("wechat_num <=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLike(String value) {
            addCriterion("wechat_num like", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotLike(String value) {
            addCriterion("wechat_num not like", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumIn(List<String> values) {
            addCriterion("wechat_num in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotIn(List<String> values) {
            addCriterion("wechat_num not in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumBetween(String value1, String value2) {
            addCriterion("wechat_num between", value1, value2, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotBetween(String value1, String value2) {
            addCriterion("wechat_num not between", value1, value2, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(Integer value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(Integer value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(Integer value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(Integer value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(Integer value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<Integer> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<Integer> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(Integer value1, Integer value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(Integer value1, Integer value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAliRateIsNull() {
            addCriterion("ali_rate is null");
            return (Criteria) this;
        }

        public Criteria andAliRateIsNotNull() {
            addCriterion("ali_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAliRateEqualTo(Integer value) {
            addCriterion("ali_rate =", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateNotEqualTo(Integer value) {
            addCriterion("ali_rate <>", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateGreaterThan(Integer value) {
            addCriterion("ali_rate >", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ali_rate >=", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateLessThan(Integer value) {
            addCriterion("ali_rate <", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateLessThanOrEqualTo(Integer value) {
            addCriterion("ali_rate <=", value, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateIn(List<Integer> values) {
            addCriterion("ali_rate in", values, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateNotIn(List<Integer> values) {
            addCriterion("ali_rate not in", values, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateBetween(Integer value1, Integer value2) {
            addCriterion("ali_rate between", value1, value2, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliRateNotBetween(Integer value1, Integer value2) {
            addCriterion("ali_rate not between", value1, value2, "aliRate");
            return (Criteria) this;
        }

        public Criteria andAliT0IsNull() {
            addCriterion("ali_t_0 is null");
            return (Criteria) this;
        }

        public Criteria andAliT0IsNotNull() {
            addCriterion("ali_t_0 is not null");
            return (Criteria) this;
        }

        public Criteria andAliT0EqualTo(Integer value) {
            addCriterion("ali_t_0 =", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0NotEqualTo(Integer value) {
            addCriterion("ali_t_0 <>", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0GreaterThan(Integer value) {
            addCriterion("ali_t_0 >", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0GreaterThanOrEqualTo(Integer value) {
            addCriterion("ali_t_0 >=", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0LessThan(Integer value) {
            addCriterion("ali_t_0 <", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0LessThanOrEqualTo(Integer value) {
            addCriterion("ali_t_0 <=", value, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0In(List<Integer> values) {
            addCriterion("ali_t_0 in", values, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0NotIn(List<Integer> values) {
            addCriterion("ali_t_0 not in", values, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0Between(Integer value1, Integer value2) {
            addCriterion("ali_t_0 between", value1, value2, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliT0NotBetween(Integer value1, Integer value2) {
            addCriterion("ali_t_0 not between", value1, value2, "aliT0");
            return (Criteria) this;
        }

        public Criteria andAliIndustryIsNull() {
            addCriterion("ali_industry is null");
            return (Criteria) this;
        }

        public Criteria andAliIndustryIsNotNull() {
            addCriterion("ali_industry is not null");
            return (Criteria) this;
        }

        public Criteria andAliIndustryEqualTo(String value) {
            addCriterion("ali_industry =", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryNotEqualTo(String value) {
            addCriterion("ali_industry <>", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryGreaterThan(String value) {
            addCriterion("ali_industry >", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("ali_industry >=", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryLessThan(String value) {
            addCriterion("ali_industry <", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryLessThanOrEqualTo(String value) {
            addCriterion("ali_industry <=", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryLike(String value) {
            addCriterion("ali_industry like", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryNotLike(String value) {
            addCriterion("ali_industry not like", value, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryIn(List<String> values) {
            addCriterion("ali_industry in", values, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryNotIn(List<String> values) {
            addCriterion("ali_industry not in", values, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryBetween(String value1, String value2) {
            addCriterion("ali_industry between", value1, value2, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliIndustryNotBetween(String value1, String value2) {
            addCriterion("ali_industry not between", value1, value2, "aliIndustry");
            return (Criteria) this;
        }

        public Criteria andAliTypeIsNull() {
            addCriterion("ali_type is null");
            return (Criteria) this;
        }

        public Criteria andAliTypeIsNotNull() {
            addCriterion("ali_type is not null");
            return (Criteria) this;
        }

        public Criteria andAliTypeEqualTo(String value) {
            addCriterion("ali_type =", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeNotEqualTo(String value) {
            addCriterion("ali_type <>", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeGreaterThan(String value) {
            addCriterion("ali_type >", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ali_type >=", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeLessThan(String value) {
            addCriterion("ali_type <", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeLessThanOrEqualTo(String value) {
            addCriterion("ali_type <=", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeLike(String value) {
            addCriterion("ali_type like", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeNotLike(String value) {
            addCriterion("ali_type not like", value, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeIn(List<String> values) {
            addCriterion("ali_type in", values, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeNotIn(List<String> values) {
            addCriterion("ali_type not in", values, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeBetween(String value1, String value2) {
            addCriterion("ali_type between", value1, value2, "aliType");
            return (Criteria) this;
        }

        public Criteria andAliTypeNotBetween(String value1, String value2) {
            addCriterion("ali_type not between", value1, value2, "aliType");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNull() {
            addCriterion("alipay_num is null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNotNull() {
            addCriterion("alipay_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumEqualTo(String value) {
            addCriterion("alipay_num =", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotEqualTo(String value) {
            addCriterion("alipay_num <>", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThan(String value) {
            addCriterion("alipay_num >", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_num >=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThan(String value) {
            addCriterion("alipay_num <", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThanOrEqualTo(String value) {
            addCriterion("alipay_num <=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLike(String value) {
            addCriterion("alipay_num like", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotLike(String value) {
            addCriterion("alipay_num not like", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIn(List<String> values) {
            addCriterion("alipay_num in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotIn(List<String> values) {
            addCriterion("alipay_num not in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumBetween(String value1, String value2) {
            addCriterion("alipay_num between", value1, value2, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotBetween(String value1, String value2) {
            addCriterion("alipay_num not between", value1, value2, "alipayNum");
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