package com.brcd.bean;

import java.util.ArrayList;
import java.util.List;

public class TbBankcardInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBankcardInfoExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIsNull() {
            addCriterion("bankcard_type is null");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIsNotNull() {
            addCriterion("bankcard_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeEqualTo(String value) {
            addCriterion("bankcard_type =", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotEqualTo(String value) {
            addCriterion("bankcard_type <>", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeGreaterThan(String value) {
            addCriterion("bankcard_type >", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_type >=", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLessThan(String value) {
            addCriterion("bankcard_type <", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLessThanOrEqualTo(String value) {
            addCriterion("bankcard_type <=", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeLike(String value) {
            addCriterion("bankcard_type like", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotLike(String value) {
            addCriterion("bankcard_type not like", value, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeIn(List<String> values) {
            addCriterion("bankcard_type in", values, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotIn(List<String> values) {
            addCriterion("bankcard_type not in", values, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeBetween(String value1, String value2) {
            addCriterion("bankcard_type between", value1, value2, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardTypeNotBetween(String value1, String value2) {
            addCriterion("bankcard_type not between", value1, value2, "bankcardType");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIsNull() {
            addCriterion("bankcard_name is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIsNotNull() {
            addCriterion("bankcard_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNameEqualTo(String value) {
            addCriterion("bankcard_name =", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotEqualTo(String value) {
            addCriterion("bankcard_name <>", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameGreaterThan(String value) {
            addCriterion("bankcard_name >", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_name >=", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLessThan(String value) {
            addCriterion("bankcard_name <", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLessThanOrEqualTo(String value) {
            addCriterion("bankcard_name <=", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameLike(String value) {
            addCriterion("bankcard_name like", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotLike(String value) {
            addCriterion("bankcard_name not like", value, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameIn(List<String> values) {
            addCriterion("bankcard_name in", values, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotIn(List<String> values) {
            addCriterion("bankcard_name not in", values, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameBetween(String value1, String value2) {
            addCriterion("bankcard_name between", value1, value2, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNameNotBetween(String value1, String value2) {
            addCriterion("bankcard_name not between", value1, value2, "bankcardName");
            return (Criteria) this;
        }

        public Criteria andBankcardNumIsNull() {
            addCriterion("bankcard_num is null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumIsNotNull() {
            addCriterion("bankcard_num is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardNumEqualTo(String value) {
            addCriterion("bankcard_num =", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotEqualTo(String value) {
            addCriterion("bankcard_num <>", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumGreaterThan(String value) {
            addCriterion("bankcard_num >", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumGreaterThanOrEqualTo(String value) {
            addCriterion("bankcard_num >=", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumLessThan(String value) {
            addCriterion("bankcard_num <", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumLessThanOrEqualTo(String value) {
            addCriterion("bankcard_num <=", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumLike(String value) {
            addCriterion("bankcard_num like", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotLike(String value) {
            addCriterion("bankcard_num not like", value, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumIn(List<String> values) {
            addCriterion("bankcard_num in", values, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotIn(List<String> values) {
            addCriterion("bankcard_num not in", values, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumBetween(String value1, String value2) {
            addCriterion("bankcard_num between", value1, value2, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankcardNumNotBetween(String value1, String value2) {
            addCriterion("bankcard_num not between", value1, value2, "bankcardNum");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNull() {
            addCriterion("bank_province is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("bank_province =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("bank_province <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("bank_province >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("bank_province >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("bank_province <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("bank_province <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("bank_province like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("bank_province not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("bank_province in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("bank_province not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("bank_province between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("bank_province not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankDetailedIsNull() {
            addCriterion("bank_detailed is null");
            return (Criteria) this;
        }

        public Criteria andBankDetailedIsNotNull() {
            addCriterion("bank_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andBankDetailedEqualTo(String value) {
            addCriterion("bank_detailed =", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedNotEqualTo(String value) {
            addCriterion("bank_detailed <>", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedGreaterThan(String value) {
            addCriterion("bank_detailed >", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("bank_detailed >=", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedLessThan(String value) {
            addCriterion("bank_detailed <", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedLessThanOrEqualTo(String value) {
            addCriterion("bank_detailed <=", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedLike(String value) {
            addCriterion("bank_detailed like", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedNotLike(String value) {
            addCriterion("bank_detailed not like", value, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedIn(List<String> values) {
            addCriterion("bank_detailed in", values, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedNotIn(List<String> values) {
            addCriterion("bank_detailed not in", values, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedBetween(String value1, String value2) {
            addCriterion("bank_detailed between", value1, value2, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBankDetailedNotBetween(String value1, String value2) {
            addCriterion("bank_detailed not between", value1, value2, "bankDetailed");
            return (Criteria) this;
        }

        public Criteria andBandContactIsNull() {
            addCriterion("band_contact is null");
            return (Criteria) this;
        }

        public Criteria andBandContactIsNotNull() {
            addCriterion("band_contact is not null");
            return (Criteria) this;
        }

        public Criteria andBandContactEqualTo(String value) {
            addCriterion("band_contact =", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactNotEqualTo(String value) {
            addCriterion("band_contact <>", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactGreaterThan(String value) {
            addCriterion("band_contact >", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactGreaterThanOrEqualTo(String value) {
            addCriterion("band_contact >=", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactLessThan(String value) {
            addCriterion("band_contact <", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactLessThanOrEqualTo(String value) {
            addCriterion("band_contact <=", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactLike(String value) {
            addCriterion("band_contact like", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactNotLike(String value) {
            addCriterion("band_contact not like", value, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactIn(List<String> values) {
            addCriterion("band_contact in", values, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactNotIn(List<String> values) {
            addCriterion("band_contact not in", values, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactBetween(String value1, String value2) {
            addCriterion("band_contact between", value1, value2, "bandContact");
            return (Criteria) this;
        }

        public Criteria andBandContactNotBetween(String value1, String value2) {
            addCriterion("band_contact not between", value1, value2, "bandContact");
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