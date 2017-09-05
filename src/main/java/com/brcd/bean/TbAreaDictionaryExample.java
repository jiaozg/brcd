package com.brcd.bean;

import java.util.ArrayList;
import java.util.List;

public class TbAreaDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAreaDictionaryExample() {
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

        public Criteria andArceNameIsNull() {
            addCriterion("arce_name is null");
            return (Criteria) this;
        }

        public Criteria andArceNameIsNotNull() {
            addCriterion("arce_name is not null");
            return (Criteria) this;
        }

        public Criteria andArceNameEqualTo(String value) {
            addCriterion("arce_name =", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameNotEqualTo(String value) {
            addCriterion("arce_name <>", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameGreaterThan(String value) {
            addCriterion("arce_name >", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameGreaterThanOrEqualTo(String value) {
            addCriterion("arce_name >=", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameLessThan(String value) {
            addCriterion("arce_name <", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameLessThanOrEqualTo(String value) {
            addCriterion("arce_name <=", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameLike(String value) {
            addCriterion("arce_name like", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameNotLike(String value) {
            addCriterion("arce_name not like", value, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameIn(List<String> values) {
            addCriterion("arce_name in", values, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameNotIn(List<String> values) {
            addCriterion("arce_name not in", values, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameBetween(String value1, String value2) {
            addCriterion("arce_name between", value1, value2, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceNameNotBetween(String value1, String value2) {
            addCriterion("arce_name not between", value1, value2, "arceName");
            return (Criteria) this;
        }

        public Criteria andArceCodeIsNull() {
            addCriterion("arce_code is null");
            return (Criteria) this;
        }

        public Criteria andArceCodeIsNotNull() {
            addCriterion("arce_code is not null");
            return (Criteria) this;
        }

        public Criteria andArceCodeEqualTo(Integer value) {
            addCriterion("arce_code =", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeNotEqualTo(Integer value) {
            addCriterion("arce_code <>", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeGreaterThan(Integer value) {
            addCriterion("arce_code >", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("arce_code >=", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeLessThan(Integer value) {
            addCriterion("arce_code <", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("arce_code <=", value, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeIn(List<Integer> values) {
            addCriterion("arce_code in", values, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeNotIn(List<Integer> values) {
            addCriterion("arce_code not in", values, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeBetween(Integer value1, Integer value2) {
            addCriterion("arce_code between", value1, value2, "arceCode");
            return (Criteria) this;
        }

        public Criteria andArceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("arce_code not between", value1, value2, "arceCode");
            return (Criteria) this;
        }

        public Criteria andUpArceNameIsNull() {
            addCriterion("up_arce_name is null");
            return (Criteria) this;
        }

        public Criteria andUpArceNameIsNotNull() {
            addCriterion("up_arce_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpArceNameEqualTo(String value) {
            addCriterion("up_arce_name =", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameNotEqualTo(String value) {
            addCriterion("up_arce_name <>", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameGreaterThan(String value) {
            addCriterion("up_arce_name >", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameGreaterThanOrEqualTo(String value) {
            addCriterion("up_arce_name >=", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameLessThan(String value) {
            addCriterion("up_arce_name <", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameLessThanOrEqualTo(String value) {
            addCriterion("up_arce_name <=", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameLike(String value) {
            addCriterion("up_arce_name like", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameNotLike(String value) {
            addCriterion("up_arce_name not like", value, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameIn(List<String> values) {
            addCriterion("up_arce_name in", values, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameNotIn(List<String> values) {
            addCriterion("up_arce_name not in", values, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameBetween(String value1, String value2) {
            addCriterion("up_arce_name between", value1, value2, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceNameNotBetween(String value1, String value2) {
            addCriterion("up_arce_name not between", value1, value2, "upArceName");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeIsNull() {
            addCriterion("up_arce_ode is null");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeIsNotNull() {
            addCriterion("up_arce_ode is not null");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeEqualTo(Integer value) {
            addCriterion("up_arce_ode =", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeNotEqualTo(Integer value) {
            addCriterion("up_arce_ode <>", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeGreaterThan(Integer value) {
            addCriterion("up_arce_ode >", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_arce_ode >=", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeLessThan(Integer value) {
            addCriterion("up_arce_ode <", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeLessThanOrEqualTo(Integer value) {
            addCriterion("up_arce_ode <=", value, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeIn(List<Integer> values) {
            addCriterion("up_arce_ode in", values, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeNotIn(List<Integer> values) {
            addCriterion("up_arce_ode not in", values, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeBetween(Integer value1, Integer value2) {
            addCriterion("up_arce_ode between", value1, value2, "upArceOde");
            return (Criteria) this;
        }

        public Criteria andUpArceOdeNotBetween(Integer value1, Integer value2) {
            addCriterion("up_arce_ode not between", value1, value2, "upArceOde");
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