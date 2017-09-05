package com.brcd.bean;

import java.util.ArrayList;
import java.util.List;

public class TbBusinessUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBusinessUserExample() {
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

        public Criteria andBusinessUidIsNull() {
            addCriterion("business_uid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUidIsNotNull() {
            addCriterion("business_uid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUidEqualTo(Long value) {
            addCriterion("business_uid =", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotEqualTo(Long value) {
            addCriterion("business_uid <>", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidGreaterThan(Long value) {
            addCriterion("business_uid >", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidGreaterThanOrEqualTo(Long value) {
            addCriterion("business_uid >=", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidLessThan(Long value) {
            addCriterion("business_uid <", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidLessThanOrEqualTo(Long value) {
            addCriterion("business_uid <=", value, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidIn(List<Long> values) {
            addCriterion("business_uid in", values, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotIn(List<Long> values) {
            addCriterion("business_uid not in", values, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidBetween(Long value1, Long value2) {
            addCriterion("business_uid between", value1, value2, "businessUid");
            return (Criteria) this;
        }

        public Criteria andBusinessUidNotBetween(Long value1, Long value2) {
            addCriterion("business_uid not between", value1, value2, "businessUid");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentIsNull() {
            addCriterion("affiliation_agent is null");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentIsNotNull() {
            addCriterion("affiliation_agent is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentEqualTo(String value) {
            addCriterion("affiliation_agent =", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentNotEqualTo(String value) {
            addCriterion("affiliation_agent <>", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentGreaterThan(String value) {
            addCriterion("affiliation_agent >", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentGreaterThanOrEqualTo(String value) {
            addCriterion("affiliation_agent >=", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentLessThan(String value) {
            addCriterion("affiliation_agent <", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentLessThanOrEqualTo(String value) {
            addCriterion("affiliation_agent <=", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentLike(String value) {
            addCriterion("affiliation_agent like", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentNotLike(String value) {
            addCriterion("affiliation_agent not like", value, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentIn(List<String> values) {
            addCriterion("affiliation_agent in", values, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentNotIn(List<String> values) {
            addCriterion("affiliation_agent not in", values, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentBetween(String value1, String value2) {
            addCriterion("affiliation_agent between", value1, value2, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andAffiliationAgentNotBetween(String value1, String value2) {
            addCriterion("affiliation_agent not between", value1, value2, "affiliationAgent");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeIsNull() {
            addCriterion("business_user_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeIsNotNull() {
            addCriterion("business_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeEqualTo(String value) {
            addCriterion("business_user_type =", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeNotEqualTo(String value) {
            addCriterion("business_user_type <>", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeGreaterThan(String value) {
            addCriterion("business_user_type >", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_user_type >=", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeLessThan(String value) {
            addCriterion("business_user_type <", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeLessThanOrEqualTo(String value) {
            addCriterion("business_user_type <=", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeLike(String value) {
            addCriterion("business_user_type like", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeNotLike(String value) {
            addCriterion("business_user_type not like", value, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeIn(List<String> values) {
            addCriterion("business_user_type in", values, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeNotIn(List<String> values) {
            addCriterion("business_user_type not in", values, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeBetween(String value1, String value2) {
            addCriterion("business_user_type between", value1, value2, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andBusinessUserTypeNotBetween(String value1, String value2) {
            addCriterion("business_user_type not between", value1, value2, "businessUserType");
            return (Criteria) this;
        }

        public Criteria andManageNameIsNull() {
            addCriterion("manage_name is null");
            return (Criteria) this;
        }

        public Criteria andManageNameIsNotNull() {
            addCriterion("manage_name is not null");
            return (Criteria) this;
        }

        public Criteria andManageNameEqualTo(String value) {
            addCriterion("manage_name =", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotEqualTo(String value) {
            addCriterion("manage_name <>", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameGreaterThan(String value) {
            addCriterion("manage_name >", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameGreaterThanOrEqualTo(String value) {
            addCriterion("manage_name >=", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLessThan(String value) {
            addCriterion("manage_name <", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLessThanOrEqualTo(String value) {
            addCriterion("manage_name <=", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameLike(String value) {
            addCriterion("manage_name like", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotLike(String value) {
            addCriterion("manage_name not like", value, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameIn(List<String> values) {
            addCriterion("manage_name in", values, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotIn(List<String> values) {
            addCriterion("manage_name not in", values, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameBetween(String value1, String value2) {
            addCriterion("manage_name between", value1, value2, "manageName");
            return (Criteria) this;
        }

        public Criteria andManageNameNotBetween(String value1, String value2) {
            addCriterion("manage_name not between", value1, value2, "manageName");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameIsNull() {
            addCriterion("business_username is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameIsNotNull() {
            addCriterion("business_username is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameEqualTo(String value) {
            addCriterion("business_username =", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameNotEqualTo(String value) {
            addCriterion("business_username <>", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameGreaterThan(String value) {
            addCriterion("business_username >", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("business_username >=", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameLessThan(String value) {
            addCriterion("business_username <", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameLessThanOrEqualTo(String value) {
            addCriterion("business_username <=", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameLike(String value) {
            addCriterion("business_username like", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameNotLike(String value) {
            addCriterion("business_username not like", value, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameIn(List<String> values) {
            addCriterion("business_username in", values, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameNotIn(List<String> values) {
            addCriterion("business_username not in", values, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameBetween(String value1, String value2) {
            addCriterion("business_username between", value1, value2, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andBusinessUsernameNotBetween(String value1, String value2) {
            addCriterion("business_username not between", value1, value2, "businessUsername");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameIsNull() {
            addCriterion("legal_people_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameIsNotNull() {
            addCriterion("legal_people_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameEqualTo(String value) {
            addCriterion("legal_people_name =", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameNotEqualTo(String value) {
            addCriterion("legal_people_name <>", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameGreaterThan(String value) {
            addCriterion("legal_people_name >", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_people_name >=", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameLessThan(String value) {
            addCriterion("legal_people_name <", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameLessThanOrEqualTo(String value) {
            addCriterion("legal_people_name <=", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameLike(String value) {
            addCriterion("legal_people_name like", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameNotLike(String value) {
            addCriterion("legal_people_name not like", value, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameIn(List<String> values) {
            addCriterion("legal_people_name in", values, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameNotIn(List<String> values) {
            addCriterion("legal_people_name not in", values, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameBetween(String value1, String value2) {
            addCriterion("legal_people_name between", value1, value2, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleNameNotBetween(String value1, String value2) {
            addCriterion("legal_people_name not between", value1, value2, "legalPeopleName");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardIsNull() {
            addCriterion("legal_people_identity_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardIsNotNull() {
            addCriterion("legal_people_identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardEqualTo(String value) {
            addCriterion("legal_people_identity_card =", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardNotEqualTo(String value) {
            addCriterion("legal_people_identity_card <>", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardGreaterThan(String value) {
            addCriterion("legal_people_identity_card >", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_people_identity_card >=", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardLessThan(String value) {
            addCriterion("legal_people_identity_card <", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("legal_people_identity_card <=", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardLike(String value) {
            addCriterion("legal_people_identity_card like", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardNotLike(String value) {
            addCriterion("legal_people_identity_card not like", value, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardIn(List<String> values) {
            addCriterion("legal_people_identity_card in", values, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardNotIn(List<String> values) {
            addCriterion("legal_people_identity_card not in", values, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardBetween(String value1, String value2) {
            addCriterion("legal_people_identity_card between", value1, value2, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andLegalPeopleIdentityCardNotBetween(String value1, String value2) {
            addCriterion("legal_people_identity_card not between", value1, value2, "legalPeopleIdentityCard");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIsNull() {
            addCriterion("contact_people is null");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIsNotNull() {
            addCriterion("contact_people is not null");
            return (Criteria) this;
        }

        public Criteria andContactPeopleEqualTo(String value) {
            addCriterion("contact_people =", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotEqualTo(String value) {
            addCriterion("contact_people <>", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleGreaterThan(String value) {
            addCriterion("contact_people >", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("contact_people >=", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLessThan(String value) {
            addCriterion("contact_people <", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLessThanOrEqualTo(String value) {
            addCriterion("contact_people <=", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleLike(String value) {
            addCriterion("contact_people like", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotLike(String value) {
            addCriterion("contact_people not like", value, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleIn(List<String> values) {
            addCriterion("contact_people in", values, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotIn(List<String> values) {
            addCriterion("contact_people not in", values, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleBetween(String value1, String value2) {
            addCriterion("contact_people between", value1, value2, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPeopleNotBetween(String value1, String value2) {
            addCriterion("contact_people not between", value1, value2, "contactPeople");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNull() {
            addCriterion("contact_mail is null");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNotNull() {
            addCriterion("contact_mail is not null");
            return (Criteria) this;
        }

        public Criteria andContactMailEqualTo(String value) {
            addCriterion("contact_mail =", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotEqualTo(String value) {
            addCriterion("contact_mail <>", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThan(String value) {
            addCriterion("contact_mail >", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mail >=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThan(String value) {
            addCriterion("contact_mail <", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThanOrEqualTo(String value) {
            addCriterion("contact_mail <=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLike(String value) {
            addCriterion("contact_mail like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotLike(String value) {
            addCriterion("contact_mail not like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailIn(List<String> values) {
            addCriterion("contact_mail in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotIn(List<String> values) {
            addCriterion("contact_mail not in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailBetween(String value1, String value2) {
            addCriterion("contact_mail between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotBetween(String value1, String value2) {
            addCriterion("contact_mail not between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNull() {
            addCriterion("service_phone is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIsNotNull() {
            addCriterion("service_phone is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneEqualTo(String value) {
            addCriterion("service_phone =", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotEqualTo(String value) {
            addCriterion("service_phone <>", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThan(String value) {
            addCriterion("service_phone >", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone >=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThan(String value) {
            addCriterion("service_phone <", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLessThanOrEqualTo(String value) {
            addCriterion("service_phone <=", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneLike(String value) {
            addCriterion("service_phone like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotLike(String value) {
            addCriterion("service_phone not like", value, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneIn(List<String> values) {
            addCriterion("service_phone in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotIn(List<String> values) {
            addCriterion("service_phone not in", values, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneBetween(String value1, String value2) {
            addCriterion("service_phone between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNotBetween(String value1, String value2) {
            addCriterion("service_phone not between", value1, value2, "servicePhone");
            return (Criteria) this;
        }

        public Criteria andManageAddressIsNull() {
            addCriterion("manage_address is null");
            return (Criteria) this;
        }

        public Criteria andManageAddressIsNotNull() {
            addCriterion("manage_address is not null");
            return (Criteria) this;
        }

        public Criteria andManageAddressEqualTo(String value) {
            addCriterion("manage_address =", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotEqualTo(String value) {
            addCriterion("manage_address <>", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressGreaterThan(String value) {
            addCriterion("manage_address >", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressGreaterThanOrEqualTo(String value) {
            addCriterion("manage_address >=", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLessThan(String value) {
            addCriterion("manage_address <", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLessThanOrEqualTo(String value) {
            addCriterion("manage_address <=", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLike(String value) {
            addCriterion("manage_address like", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotLike(String value) {
            addCriterion("manage_address not like", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressIn(List<String> values) {
            addCriterion("manage_address in", values, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotIn(List<String> values) {
            addCriterion("manage_address not in", values, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressBetween(String value1, String value2) {
            addCriterion("manage_address between", value1, value2, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotBetween(String value1, String value2) {
            addCriterion("manage_address not between", value1, value2, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageProvinceIsNull() {
            addCriterion("manage_province is null");
            return (Criteria) this;
        }

        public Criteria andManageProvinceIsNotNull() {
            addCriterion("manage_province is not null");
            return (Criteria) this;
        }

        public Criteria andManageProvinceEqualTo(String value) {
            addCriterion("manage_province =", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceNotEqualTo(String value) {
            addCriterion("manage_province <>", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceGreaterThan(String value) {
            addCriterion("manage_province >", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("manage_province >=", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceLessThan(String value) {
            addCriterion("manage_province <", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceLessThanOrEqualTo(String value) {
            addCriterion("manage_province <=", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceLike(String value) {
            addCriterion("manage_province like", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceNotLike(String value) {
            addCriterion("manage_province not like", value, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceIn(List<String> values) {
            addCriterion("manage_province in", values, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceNotIn(List<String> values) {
            addCriterion("manage_province not in", values, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceBetween(String value1, String value2) {
            addCriterion("manage_province between", value1, value2, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageProvinceNotBetween(String value1, String value2) {
            addCriterion("manage_province not between", value1, value2, "manageProvince");
            return (Criteria) this;
        }

        public Criteria andManageCityIsNull() {
            addCriterion("manage_city is null");
            return (Criteria) this;
        }

        public Criteria andManageCityIsNotNull() {
            addCriterion("manage_city is not null");
            return (Criteria) this;
        }

        public Criteria andManageCityEqualTo(String value) {
            addCriterion("manage_city =", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityNotEqualTo(String value) {
            addCriterion("manage_city <>", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityGreaterThan(String value) {
            addCriterion("manage_city >", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityGreaterThanOrEqualTo(String value) {
            addCriterion("manage_city >=", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityLessThan(String value) {
            addCriterion("manage_city <", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityLessThanOrEqualTo(String value) {
            addCriterion("manage_city <=", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityLike(String value) {
            addCriterion("manage_city like", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityNotLike(String value) {
            addCriterion("manage_city not like", value, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityIn(List<String> values) {
            addCriterion("manage_city in", values, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityNotIn(List<String> values) {
            addCriterion("manage_city not in", values, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityBetween(String value1, String value2) {
            addCriterion("manage_city between", value1, value2, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageCityNotBetween(String value1, String value2) {
            addCriterion("manage_city not between", value1, value2, "manageCity");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIsNull() {
            addCriterion("manage_district is null");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIsNotNull() {
            addCriterion("manage_district is not null");
            return (Criteria) this;
        }

        public Criteria andManageDistrictEqualTo(String value) {
            addCriterion("manage_district =", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotEqualTo(String value) {
            addCriterion("manage_district <>", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictGreaterThan(String value) {
            addCriterion("manage_district >", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("manage_district >=", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictLessThan(String value) {
            addCriterion("manage_district <", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictLessThanOrEqualTo(String value) {
            addCriterion("manage_district <=", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictLike(String value) {
            addCriterion("manage_district like", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotLike(String value) {
            addCriterion("manage_district not like", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIn(List<String> values) {
            addCriterion("manage_district in", values, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotIn(List<String> values) {
            addCriterion("manage_district not in", values, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictBetween(String value1, String value2) {
            addCriterion("manage_district between", value1, value2, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotBetween(String value1, String value2) {
            addCriterion("manage_district not between", value1, value2, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNull() {
            addCriterion("business_license_no is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNotNull() {
            addCriterion("business_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoEqualTo(String value) {
            addCriterion("business_license_no =", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotEqualTo(String value) {
            addCriterion("business_license_no <>", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThan(String value) {
            addCriterion("business_license_no >", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_no >=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThan(String value) {
            addCriterion("business_license_no <", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("business_license_no <=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLike(String value) {
            addCriterion("business_license_no like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotLike(String value) {
            addCriterion("business_license_no not like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIn(List<String> values) {
            addCriterion("business_license_no in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotIn(List<String> values) {
            addCriterion("business_license_no not in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoBetween(String value1, String value2) {
            addCriterion("business_license_no between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotBetween(String value1, String value2) {
            addCriterion("business_license_no not between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNull() {
            addCriterion("register_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIsNotNull() {
            addCriterion("register_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressEqualTo(String value) {
            addCriterion("register_address =", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotEqualTo(String value) {
            addCriterion("register_address <>", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThan(String value) {
            addCriterion("register_address >", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressGreaterThanOrEqualTo(String value) {
            addCriterion("register_address >=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThan(String value) {
            addCriterion("register_address <", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLessThanOrEqualTo(String value) {
            addCriterion("register_address <=", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressLike(String value) {
            addCriterion("register_address like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotLike(String value) {
            addCriterion("register_address not like", value, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressIn(List<String> values) {
            addCriterion("register_address in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotIn(List<String> values) {
            addCriterion("register_address not in", values, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressBetween(String value1, String value2) {
            addCriterion("register_address between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andRegisterAddressNotBetween(String value1, String value2) {
            addCriterion("register_address not between", value1, value2, "registerAddress");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNull() {
            addCriterion("identity_card_front is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIsNotNull() {
            addCriterion("identity_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontEqualTo(String value) {
            addCriterion("identity_card_front =", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotEqualTo(String value) {
            addCriterion("identity_card_front <>", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThan(String value) {
            addCriterion("identity_card_front >", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_front >=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThan(String value) {
            addCriterion("identity_card_front <", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLessThanOrEqualTo(String value) {
            addCriterion("identity_card_front <=", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontLike(String value) {
            addCriterion("identity_card_front like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotLike(String value) {
            addCriterion("identity_card_front not like", value, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontIn(List<String> values) {
            addCriterion("identity_card_front in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotIn(List<String> values) {
            addCriterion("identity_card_front not in", values, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontBetween(String value1, String value2) {
            addCriterion("identity_card_front between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardFrontNotBetween(String value1, String value2) {
            addCriterion("identity_card_front not between", value1, value2, "identityCardFront");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseIsNull() {
            addCriterion("identity_card_reverse is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseIsNotNull() {
            addCriterion("identity_card_reverse is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseEqualTo(String value) {
            addCriterion("identity_card_reverse =", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseNotEqualTo(String value) {
            addCriterion("identity_card_reverse <>", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseGreaterThan(String value) {
            addCriterion("identity_card_reverse >", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_reverse >=", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseLessThan(String value) {
            addCriterion("identity_card_reverse <", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseLessThanOrEqualTo(String value) {
            addCriterion("identity_card_reverse <=", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseLike(String value) {
            addCriterion("identity_card_reverse like", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseNotLike(String value) {
            addCriterion("identity_card_reverse not like", value, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseIn(List<String> values) {
            addCriterion("identity_card_reverse in", values, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseNotIn(List<String> values) {
            addCriterion("identity_card_reverse not in", values, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseBetween(String value1, String value2) {
            addCriterion("identity_card_reverse between", value1, value2, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardReverseNotBetween(String value1, String value2) {
            addCriterion("identity_card_reverse not between", value1, value2, "identityCardReverse");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandIsNull() {
            addCriterion("identity_card_hand is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandIsNotNull() {
            addCriterion("identity_card_hand is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandEqualTo(String value) {
            addCriterion("identity_card_hand =", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandNotEqualTo(String value) {
            addCriterion("identity_card_hand <>", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandGreaterThan(String value) {
            addCriterion("identity_card_hand >", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card_hand >=", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandLessThan(String value) {
            addCriterion("identity_card_hand <", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandLessThanOrEqualTo(String value) {
            addCriterion("identity_card_hand <=", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandLike(String value) {
            addCriterion("identity_card_hand like", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandNotLike(String value) {
            addCriterion("identity_card_hand not like", value, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandIn(List<String> values) {
            addCriterion("identity_card_hand in", values, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandNotIn(List<String> values) {
            addCriterion("identity_card_hand not in", values, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandBetween(String value1, String value2) {
            addCriterion("identity_card_hand between", value1, value2, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andIdentityCardHandNotBetween(String value1, String value2) {
            addCriterion("identity_card_hand not between", value1, value2, "identityCardHand");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontIsNull() {
            addCriterion("bank_card_front is null");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontIsNotNull() {
            addCriterion("bank_card_front is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontEqualTo(String value) {
            addCriterion("bank_card_front =", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontNotEqualTo(String value) {
            addCriterion("bank_card_front <>", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontGreaterThan(String value) {
            addCriterion("bank_card_front >", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_front >=", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontLessThan(String value) {
            addCriterion("bank_card_front <", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontLessThanOrEqualTo(String value) {
            addCriterion("bank_card_front <=", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontLike(String value) {
            addCriterion("bank_card_front like", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontNotLike(String value) {
            addCriterion("bank_card_front not like", value, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontIn(List<String> values) {
            addCriterion("bank_card_front in", values, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontNotIn(List<String> values) {
            addCriterion("bank_card_front not in", values, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontBetween(String value1, String value2) {
            addCriterion("bank_card_front between", value1, value2, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBankCardFrontNotBetween(String value1, String value2) {
            addCriterion("bank_card_front not between", value1, value2, "bankCardFront");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureIsNull() {
            addCriterion("business_license_picture is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureIsNotNull() {
            addCriterion("business_license_picture is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureEqualTo(String value) {
            addCriterion("business_license_picture =", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureNotEqualTo(String value) {
            addCriterion("business_license_picture <>", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureGreaterThan(String value) {
            addCriterion("business_license_picture >", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_picture >=", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureLessThan(String value) {
            addCriterion("business_license_picture <", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureLessThanOrEqualTo(String value) {
            addCriterion("business_license_picture <=", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureLike(String value) {
            addCriterion("business_license_picture like", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureNotLike(String value) {
            addCriterion("business_license_picture not like", value, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureIn(List<String> values) {
            addCriterion("business_license_picture in", values, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureNotIn(List<String> values) {
            addCriterion("business_license_picture not in", values, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureBetween(String value1, String value2) {
            addCriterion("business_license_picture between", value1, value2, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePictureNotBetween(String value1, String value2) {
            addCriterion("business_license_picture not between", value1, value2, "businessLicensePicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureIsNull() {
            addCriterion("door_picture is null");
            return (Criteria) this;
        }

        public Criteria andDoorPictureIsNotNull() {
            addCriterion("door_picture is not null");
            return (Criteria) this;
        }

        public Criteria andDoorPictureEqualTo(String value) {
            addCriterion("door_picture =", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureNotEqualTo(String value) {
            addCriterion("door_picture <>", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureGreaterThan(String value) {
            addCriterion("door_picture >", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureGreaterThanOrEqualTo(String value) {
            addCriterion("door_picture >=", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureLessThan(String value) {
            addCriterion("door_picture <", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureLessThanOrEqualTo(String value) {
            addCriterion("door_picture <=", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureLike(String value) {
            addCriterion("door_picture like", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureNotLike(String value) {
            addCriterion("door_picture not like", value, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureIn(List<String> values) {
            addCriterion("door_picture in", values, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureNotIn(List<String> values) {
            addCriterion("door_picture not in", values, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureBetween(String value1, String value2) {
            addCriterion("door_picture between", value1, value2, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andDoorPictureNotBetween(String value1, String value2) {
            addCriterion("door_picture not between", value1, value2, "doorPicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureIsNull() {
            addCriterion("register_license_picture is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureIsNotNull() {
            addCriterion("register_license_picture is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureEqualTo(String value) {
            addCriterion("register_license_picture =", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureNotEqualTo(String value) {
            addCriterion("register_license_picture <>", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureGreaterThan(String value) {
            addCriterion("register_license_picture >", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureGreaterThanOrEqualTo(String value) {
            addCriterion("register_license_picture >=", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureLessThan(String value) {
            addCriterion("register_license_picture <", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureLessThanOrEqualTo(String value) {
            addCriterion("register_license_picture <=", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureLike(String value) {
            addCriterion("register_license_picture like", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureNotLike(String value) {
            addCriterion("register_license_picture not like", value, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureIn(List<String> values) {
            addCriterion("register_license_picture in", values, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureNotIn(List<String> values) {
            addCriterion("register_license_picture not in", values, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureBetween(String value1, String value2) {
            addCriterion("register_license_picture between", value1, value2, "registerLicensePicture");
            return (Criteria) this;
        }

        public Criteria andRegisterLicensePictureNotBetween(String value1, String value2) {
            addCriterion("register_license_picture not between", value1, value2, "registerLicensePicture");
            return (Criteria) this;
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