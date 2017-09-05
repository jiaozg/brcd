package com.brcd.bean;

import java.util.ArrayList;
import java.util.List;

public class TbAgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAgentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAgentNumberIsNull() {
            addCriterion("agent_number is null");
            return (Criteria) this;
        }

        public Criteria andAgentNumberIsNotNull() {
            addCriterion("agent_number is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNumberEqualTo(Long value) {
            addCriterion("agent_number =", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberNotEqualTo(Long value) {
            addCriterion("agent_number <>", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberGreaterThan(Long value) {
            addCriterion("agent_number >", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("agent_number >=", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberLessThan(Long value) {
            addCriterion("agent_number <", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberLessThanOrEqualTo(Long value) {
            addCriterion("agent_number <=", value, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberIn(List<Long> values) {
            addCriterion("agent_number in", values, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberNotIn(List<Long> values) {
            addCriterion("agent_number not in", values, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberBetween(Long value1, Long value2) {
            addCriterion("agent_number between", value1, value2, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentNumberNotBetween(Long value1, Long value2) {
            addCriterion("agent_number not between", value1, value2, "agentNumber");
            return (Criteria) this;
        }

        public Criteria andAgentGradeIsNull() {
            addCriterion("agent_grade is null");
            return (Criteria) this;
        }

        public Criteria andAgentGradeIsNotNull() {
            addCriterion("agent_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAgentGradeEqualTo(Integer value) {
            addCriterion("agent_grade =", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeNotEqualTo(Integer value) {
            addCriterion("agent_grade <>", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeGreaterThan(Integer value) {
            addCriterion("agent_grade >", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_grade >=", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeLessThan(Integer value) {
            addCriterion("agent_grade <", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeLessThanOrEqualTo(Integer value) {
            addCriterion("agent_grade <=", value, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeIn(List<Integer> values) {
            addCriterion("agent_grade in", values, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeNotIn(List<Integer> values) {
            addCriterion("agent_grade not in", values, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeBetween(Integer value1, Integer value2) {
            addCriterion("agent_grade between", value1, value2, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_grade not between", value1, value2, "agentGrade");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameIsNull() {
            addCriterion("agent_full_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameIsNotNull() {
            addCriterion("agent_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameEqualTo(String value) {
            addCriterion("agent_full_name =", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameNotEqualTo(String value) {
            addCriterion("agent_full_name <>", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameGreaterThan(String value) {
            addCriterion("agent_full_name >", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_full_name >=", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameLessThan(String value) {
            addCriterion("agent_full_name <", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameLessThanOrEqualTo(String value) {
            addCriterion("agent_full_name <=", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameLike(String value) {
            addCriterion("agent_full_name like", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameNotLike(String value) {
            addCriterion("agent_full_name not like", value, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameIn(List<String> values) {
            addCriterion("agent_full_name in", values, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameNotIn(List<String> values) {
            addCriterion("agent_full_name not in", values, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameBetween(String value1, String value2) {
            addCriterion("agent_full_name between", value1, value2, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentFullNameNotBetween(String value1, String value2) {
            addCriterion("agent_full_name not between", value1, value2, "agentFullName");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneIsNull() {
            addCriterion("agent_contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneIsNotNull() {
            addCriterion("agent_contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneEqualTo(String value) {
            addCriterion("agent_contact_phone =", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneNotEqualTo(String value) {
            addCriterion("agent_contact_phone <>", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneGreaterThan(String value) {
            addCriterion("agent_contact_phone >", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_contact_phone >=", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneLessThan(String value) {
            addCriterion("agent_contact_phone <", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("agent_contact_phone <=", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneLike(String value) {
            addCriterion("agent_contact_phone like", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneNotLike(String value) {
            addCriterion("agent_contact_phone not like", value, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneIn(List<String> values) {
            addCriterion("agent_contact_phone in", values, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneNotIn(List<String> values) {
            addCriterion("agent_contact_phone not in", values, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneBetween(String value1, String value2) {
            addCriterion("agent_contact_phone between", value1, value2, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andAgentContactPhoneNotBetween(String value1, String value2) {
            addCriterion("agent_contact_phone not between", value1, value2, "agentContactPhone");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsIsNull() {
            addCriterion("officially_Accounts is null");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsIsNotNull() {
            addCriterion("officially_Accounts is not null");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsEqualTo(String value) {
            addCriterion("officially_Accounts =", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsNotEqualTo(String value) {
            addCriterion("officially_Accounts <>", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsGreaterThan(String value) {
            addCriterion("officially_Accounts >", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("officially_Accounts >=", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsLessThan(String value) {
            addCriterion("officially_Accounts <", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsLessThanOrEqualTo(String value) {
            addCriterion("officially_Accounts <=", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsLike(String value) {
            addCriterion("officially_Accounts like", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsNotLike(String value) {
            addCriterion("officially_Accounts not like", value, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsIn(List<String> values) {
            addCriterion("officially_Accounts in", values, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsNotIn(List<String> values) {
            addCriterion("officially_Accounts not in", values, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsBetween(String value1, String value2) {
            addCriterion("officially_Accounts between", value1, value2, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andOfficiallyAccountsNotBetween(String value1, String value2) {
            addCriterion("officially_Accounts not between", value1, value2, "officiallyAccounts");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNull() {
            addCriterion("business_Area is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNotNull() {
            addCriterion("business_Area is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaEqualTo(String value) {
            addCriterion("business_Area =", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotEqualTo(String value) {
            addCriterion("business_Area <>", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThan(String value) {
            addCriterion("business_Area >", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThanOrEqualTo(String value) {
            addCriterion("business_Area >=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThan(String value) {
            addCriterion("business_Area <", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThanOrEqualTo(String value) {
            addCriterion("business_Area <=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLike(String value) {
            addCriterion("business_Area like", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotLike(String value) {
            addCriterion("business_Area not like", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIn(List<String> values) {
            addCriterion("business_Area in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotIn(List<String> values) {
            addCriterion("business_Area not in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaBetween(String value1, String value2) {
            addCriterion("business_Area between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotBetween(String value1, String value2) {
            addCriterion("business_Area not between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(String value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(String value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(String value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(String value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLike(String value) {
            addCriterion("account_type like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotLike(String value) {
            addCriterion("account_type not like", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<String> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<String> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(String value1, String value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(String value1, String value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberIsNull() {
            addCriterion("register_card_number is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberIsNotNull() {
            addCriterion("register_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberEqualTo(Long value) {
            addCriterion("register_card_number =", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberNotEqualTo(Long value) {
            addCriterion("register_card_number <>", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberGreaterThan(Long value) {
            addCriterion("register_card_number >", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("register_card_number >=", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberLessThan(Long value) {
            addCriterion("register_card_number <", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberLessThanOrEqualTo(Long value) {
            addCriterion("register_card_number <=", value, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberIn(List<Long> values) {
            addCriterion("register_card_number in", values, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberNotIn(List<Long> values) {
            addCriterion("register_card_number not in", values, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberBetween(Long value1, Long value2) {
            addCriterion("register_card_number between", value1, value2, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardNumberNotBetween(Long value1, Long value2) {
            addCriterion("register_card_number not between", value1, value2, "registerCardNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesIsNull() {
            addCriterion("register_card_provinces is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesIsNotNull() {
            addCriterion("register_card_provinces is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesEqualTo(String value) {
            addCriterion("register_card_provinces =", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesNotEqualTo(String value) {
            addCriterion("register_card_provinces <>", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesGreaterThan(String value) {
            addCriterion("register_card_provinces >", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesGreaterThanOrEqualTo(String value) {
            addCriterion("register_card_provinces >=", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesLessThan(String value) {
            addCriterion("register_card_provinces <", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesLessThanOrEqualTo(String value) {
            addCriterion("register_card_provinces <=", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesLike(String value) {
            addCriterion("register_card_provinces like", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesNotLike(String value) {
            addCriterion("register_card_provinces not like", value, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesIn(List<String> values) {
            addCriterion("register_card_provinces in", values, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesNotIn(List<String> values) {
            addCriterion("register_card_provinces not in", values, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesBetween(String value1, String value2) {
            addCriterion("register_card_provinces between", value1, value2, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andRegisterCardProvincesNotBetween(String value1, String value2) {
            addCriterion("register_card_provinces not between", value1, value2, "registerCardProvinces");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankIsNull() {
            addCriterion("sub_branch_bank is null");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankIsNotNull() {
            addCriterion("sub_branch_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankEqualTo(String value) {
            addCriterion("sub_branch_bank =", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankNotEqualTo(String value) {
            addCriterion("sub_branch_bank <>", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankGreaterThan(String value) {
            addCriterion("sub_branch_bank >", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankGreaterThanOrEqualTo(String value) {
            addCriterion("sub_branch_bank >=", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankLessThan(String value) {
            addCriterion("sub_branch_bank <", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankLessThanOrEqualTo(String value) {
            addCriterion("sub_branch_bank <=", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankLike(String value) {
            addCriterion("sub_branch_bank like", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankNotLike(String value) {
            addCriterion("sub_branch_bank not like", value, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankIn(List<String> values) {
            addCriterion("sub_branch_bank in", values, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankNotIn(List<String> values) {
            addCriterion("sub_branch_bank not in", values, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankBetween(String value1, String value2) {
            addCriterion("sub_branch_bank between", value1, value2, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSubBranchBankNotBetween(String value1, String value2) {
            addCriterion("sub_branch_bank not between", value1, value2, "subBranchBank");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNull() {
            addCriterion("secret_key is null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNotNull() {
            addCriterion("secret_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyEqualTo(String value) {
            addCriterion("secret_key =", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotEqualTo(String value) {
            addCriterion("secret_key <>", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThan(String value) {
            addCriterion("secret_key >", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("secret_key >=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThan(String value) {
            addCriterion("secret_key <", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("secret_key <=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLike(String value) {
            addCriterion("secret_key like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotLike(String value) {
            addCriterion("secret_key not like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIn(List<String> values) {
            addCriterion("secret_key in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotIn(List<String> values) {
            addCriterion("secret_key not in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyBetween(String value1, String value2) {
            addCriterion("secret_key between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotBetween(String value1, String value2) {
            addCriterion("secret_key not between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameIsNull() {
            addCriterion("register_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameIsNotNull() {
            addCriterion("register_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameEqualTo(String value) {
            addCriterion("register_bank_name =", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameNotEqualTo(String value) {
            addCriterion("register_bank_name <>", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameGreaterThan(String value) {
            addCriterion("register_bank_name >", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_bank_name >=", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameLessThan(String value) {
            addCriterion("register_bank_name <", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameLessThanOrEqualTo(String value) {
            addCriterion("register_bank_name <=", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameLike(String value) {
            addCriterion("register_bank_name like", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameNotLike(String value) {
            addCriterion("register_bank_name not like", value, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameIn(List<String> values) {
            addCriterion("register_bank_name in", values, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameNotIn(List<String> values) {
            addCriterion("register_bank_name not in", values, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameBetween(String value1, String value2) {
            addCriterion("register_bank_name between", value1, value2, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterBankNameNotBetween(String value1, String value2) {
            addCriterion("register_bank_name not between", value1, value2, "registerBankName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameIsNull() {
            addCriterion("register_account_name is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameIsNotNull() {
            addCriterion("register_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameEqualTo(String value) {
            addCriterion("register_account_name =", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameNotEqualTo(String value) {
            addCriterion("register_account_name <>", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameGreaterThan(String value) {
            addCriterion("register_account_name >", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("register_account_name >=", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameLessThan(String value) {
            addCriterion("register_account_name <", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameLessThanOrEqualTo(String value) {
            addCriterion("register_account_name <=", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameLike(String value) {
            addCriterion("register_account_name like", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameNotLike(String value) {
            addCriterion("register_account_name not like", value, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameIn(List<String> values) {
            addCriterion("register_account_name in", values, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameNotIn(List<String> values) {
            addCriterion("register_account_name not in", values, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameBetween(String value1, String value2) {
            addCriterion("register_account_name between", value1, value2, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterAccountNameNotBetween(String value1, String value2) {
            addCriterion("register_account_name not between", value1, value2, "registerAccountName");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityIsNull() {
            addCriterion("register_card_city is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityIsNotNull() {
            addCriterion("register_card_city is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityEqualTo(String value) {
            addCriterion("register_card_city =", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityNotEqualTo(String value) {
            addCriterion("register_card_city <>", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityGreaterThan(String value) {
            addCriterion("register_card_city >", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityGreaterThanOrEqualTo(String value) {
            addCriterion("register_card_city >=", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityLessThan(String value) {
            addCriterion("register_card_city <", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityLessThanOrEqualTo(String value) {
            addCriterion("register_card_city <=", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityLike(String value) {
            addCriterion("register_card_city like", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityNotLike(String value) {
            addCriterion("register_card_city not like", value, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityIn(List<String> values) {
            addCriterion("register_card_city in", values, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityNotIn(List<String> values) {
            addCriterion("register_card_city not in", values, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityBetween(String value1, String value2) {
            addCriterion("register_card_city between", value1, value2, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andRegisterCardCityNotBetween(String value1, String value2) {
            addCriterion("register_card_city not between", value1, value2, "registerCardCity");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberIsNull() {
            addCriterion("union_bank_number is null");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberIsNotNull() {
            addCriterion("union_bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberEqualTo(String value) {
            addCriterion("union_bank_number =", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberNotEqualTo(String value) {
            addCriterion("union_bank_number <>", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberGreaterThan(String value) {
            addCriterion("union_bank_number >", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("union_bank_number >=", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberLessThan(String value) {
            addCriterion("union_bank_number <", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberLessThanOrEqualTo(String value) {
            addCriterion("union_bank_number <=", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberLike(String value) {
            addCriterion("union_bank_number like", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberNotLike(String value) {
            addCriterion("union_bank_number not like", value, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberIn(List<String> values) {
            addCriterion("union_bank_number in", values, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberNotIn(List<String> values) {
            addCriterion("union_bank_number not in", values, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberBetween(String value1, String value2) {
            addCriterion("union_bank_number between", value1, value2, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andUnionBankNumberNotBetween(String value1, String value2) {
            addCriterion("union_bank_number not between", value1, value2, "unionBankNumber");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsIsNull() {
            addCriterion("into_permissions is null");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsIsNotNull() {
            addCriterion("into_permissions is not null");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsEqualTo(String value) {
            addCriterion("into_permissions =", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsNotEqualTo(String value) {
            addCriterion("into_permissions <>", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsGreaterThan(String value) {
            addCriterion("into_permissions >", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsGreaterThanOrEqualTo(String value) {
            addCriterion("into_permissions >=", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsLessThan(String value) {
            addCriterion("into_permissions <", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsLessThanOrEqualTo(String value) {
            addCriterion("into_permissions <=", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsLike(String value) {
            addCriterion("into_permissions like", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsNotLike(String value) {
            addCriterion("into_permissions not like", value, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsIn(List<String> values) {
            addCriterion("into_permissions in", values, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsNotIn(List<String> values) {
            addCriterion("into_permissions not in", values, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsBetween(String value1, String value2) {
            addCriterion("into_permissions between", value1, value2, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andIntoPermissionsNotBetween(String value1, String value2) {
            addCriterion("into_permissions not between", value1, value2, "intoPermissions");
            return (Criteria) this;
        }

        public Criteria andShareBenefitIsNull() {
            addCriterion("share_benefit is null");
            return (Criteria) this;
        }

        public Criteria andShareBenefitIsNotNull() {
            addCriterion("share_benefit is not null");
            return (Criteria) this;
        }

        public Criteria andShareBenefitEqualTo(String value) {
            addCriterion("share_benefit =", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitNotEqualTo(String value) {
            addCriterion("share_benefit <>", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitGreaterThan(String value) {
            addCriterion("share_benefit >", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitGreaterThanOrEqualTo(String value) {
            addCriterion("share_benefit >=", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitLessThan(String value) {
            addCriterion("share_benefit <", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitLessThanOrEqualTo(String value) {
            addCriterion("share_benefit <=", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitLike(String value) {
            addCriterion("share_benefit like", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitNotLike(String value) {
            addCriterion("share_benefit not like", value, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitIn(List<String> values) {
            addCriterion("share_benefit in", values, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitNotIn(List<String> values) {
            addCriterion("share_benefit not in", values, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitBetween(String value1, String value2) {
            addCriterion("share_benefit between", value1, value2, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andShareBenefitNotBetween(String value1, String value2) {
            addCriterion("share_benefit not between", value1, value2, "shareBenefit");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeIsNull() {
            addCriterion("whether_dredge is null");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeIsNotNull() {
            addCriterion("whether_dredge is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeEqualTo(Integer value) {
            addCriterion("whether_dredge =", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeNotEqualTo(Integer value) {
            addCriterion("whether_dredge <>", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeGreaterThan(Integer value) {
            addCriterion("whether_dredge >", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_dredge >=", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeLessThan(Integer value) {
            addCriterion("whether_dredge <", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeLessThanOrEqualTo(Integer value) {
            addCriterion("whether_dredge <=", value, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeIn(List<Integer> values) {
            addCriterion("whether_dredge in", values, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeNotIn(List<Integer> values) {
            addCriterion("whether_dredge not in", values, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeBetween(Integer value1, Integer value2) {
            addCriterion("whether_dredge between", value1, value2, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andWhetherDredgeNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_dredge not between", value1, value2, "whetherDredge");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusIsNull() {
            addCriterion("t_and_o_status is null");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusIsNotNull() {
            addCriterion("t_and_o_status is not null");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusEqualTo(Integer value) {
            addCriterion("t_and_o_status =", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusNotEqualTo(Integer value) {
            addCriterion("t_and_o_status <>", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusGreaterThan(Integer value) {
            addCriterion("t_and_o_status >", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_and_o_status >=", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusLessThan(Integer value) {
            addCriterion("t_and_o_status <", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusLessThanOrEqualTo(Integer value) {
            addCriterion("t_and_o_status <=", value, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusIn(List<Integer> values) {
            addCriterion("t_and_o_status in", values, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusNotIn(List<Integer> values) {
            addCriterion("t_and_o_status not in", values, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusBetween(Integer value1, Integer value2) {
            addCriterion("t_and_o_status between", value1, value2, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andTAndOStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("t_and_o_status not between", value1, value2, "tAndOStatus");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdIsNull() {
            addCriterion("superior_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdIsNotNull() {
            addCriterion("superior_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdEqualTo(Long value) {
            addCriterion("superior_agency_id =", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdNotEqualTo(Long value) {
            addCriterion("superior_agency_id <>", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdGreaterThan(Long value) {
            addCriterion("superior_agency_id >", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("superior_agency_id >=", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdLessThan(Long value) {
            addCriterion("superior_agency_id <", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdLessThanOrEqualTo(Long value) {
            addCriterion("superior_agency_id <=", value, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdIn(List<Long> values) {
            addCriterion("superior_agency_id in", values, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdNotIn(List<Long> values) {
            addCriterion("superior_agency_id not in", values, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdBetween(Long value1, Long value2) {
            addCriterion("superior_agency_id between", value1, value2, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andSuperiorAgencyIdNotBetween(Long value1, Long value2) {
            addCriterion("superior_agency_id not between", value1, value2, "superiorAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdIsNull() {
            addCriterion("original_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdIsNotNull() {
            addCriterion("original_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdEqualTo(Long value) {
            addCriterion("original_agency_id =", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdNotEqualTo(Long value) {
            addCriterion("original_agency_id <>", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdGreaterThan(Long value) {
            addCriterion("original_agency_id >", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("original_agency_id >=", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdLessThan(Long value) {
            addCriterion("original_agency_id <", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdLessThanOrEqualTo(Long value) {
            addCriterion("original_agency_id <=", value, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdIn(List<Long> values) {
            addCriterion("original_agency_id in", values, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdNotIn(List<Long> values) {
            addCriterion("original_agency_id not in", values, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdBetween(Long value1, Long value2) {
            addCriterion("original_agency_id between", value1, value2, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andOriginalAgencyIdNotBetween(Long value1, Long value2) {
            addCriterion("original_agency_id not between", value1, value2, "originalAgencyId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Long value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Long value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Long value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Long value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Long> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Long> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Long value1, Long value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureIsNull() {
            addCriterion("head_sculpture is null");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureIsNotNull() {
            addCriterion("head_sculpture is not null");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureEqualTo(String value) {
            addCriterion("head_sculpture =", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureNotEqualTo(String value) {
            addCriterion("head_sculpture <>", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureGreaterThan(String value) {
            addCriterion("head_sculpture >", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureGreaterThanOrEqualTo(String value) {
            addCriterion("head_sculpture >=", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureLessThan(String value) {
            addCriterion("head_sculpture <", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureLessThanOrEqualTo(String value) {
            addCriterion("head_sculpture <=", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureLike(String value) {
            addCriterion("head_sculpture like", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureNotLike(String value) {
            addCriterion("head_sculpture not like", value, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureIn(List<String> values) {
            addCriterion("head_sculpture in", values, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureNotIn(List<String> values) {
            addCriterion("head_sculpture not in", values, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureBetween(String value1, String value2) {
            addCriterion("head_sculpture between", value1, value2, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andHeadSculptureNotBetween(String value1, String value2) {
            addCriterion("head_sculpture not between", value1, value2, "headSculpture");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationIsNull() {
            addCriterion("company_affiliation is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationIsNotNull() {
            addCriterion("company_affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationEqualTo(String value) {
            addCriterion("company_affiliation =", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationNotEqualTo(String value) {
            addCriterion("company_affiliation <>", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationGreaterThan(String value) {
            addCriterion("company_affiliation >", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("company_affiliation >=", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationLessThan(String value) {
            addCriterion("company_affiliation <", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationLessThanOrEqualTo(String value) {
            addCriterion("company_affiliation <=", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationLike(String value) {
            addCriterion("company_affiliation like", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationNotLike(String value) {
            addCriterion("company_affiliation not like", value, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationIn(List<String> values) {
            addCriterion("company_affiliation in", values, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationNotIn(List<String> values) {
            addCriterion("company_affiliation not in", values, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationBetween(String value1, String value2) {
            addCriterion("company_affiliation between", value1, value2, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andCompanyAffiliationNotBetween(String value1, String value2) {
            addCriterion("company_affiliation not between", value1, value2, "companyAffiliation");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentIsNull() {
            addCriterion("attribution_department is null");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentIsNotNull() {
            addCriterion("attribution_department is not null");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentEqualTo(String value) {
            addCriterion("attribution_department =", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentNotEqualTo(String value) {
            addCriterion("attribution_department <>", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentGreaterThan(String value) {
            addCriterion("attribution_department >", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("attribution_department >=", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentLessThan(String value) {
            addCriterion("attribution_department <", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentLessThanOrEqualTo(String value) {
            addCriterion("attribution_department <=", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentLike(String value) {
            addCriterion("attribution_department like", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentNotLike(String value) {
            addCriterion("attribution_department not like", value, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentIn(List<String> values) {
            addCriterion("attribution_department in", values, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentNotIn(List<String> values) {
            addCriterion("attribution_department not in", values, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentBetween(String value1, String value2) {
            addCriterion("attribution_department between", value1, value2, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andAttributionDepartmentNotBetween(String value1, String value2) {
            addCriterion("attribution_department not between", value1, value2, "attributionDepartment");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
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