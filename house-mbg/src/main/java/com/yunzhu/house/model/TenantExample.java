package com.yunzhu.house.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TenantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TenantExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTenantnameIsNull() {
            addCriterion("tenantName is null");
            return (Criteria) this;
        }

        public Criteria andTenantnameIsNotNull() {
            addCriterion("tenantName is not null");
            return (Criteria) this;
        }

        public Criteria andTenantnameEqualTo(String value) {
            addCriterion("tenantName =", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameNotEqualTo(String value) {
            addCriterion("tenantName <>", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameGreaterThan(String value) {
            addCriterion("tenantName >", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameGreaterThanOrEqualTo(String value) {
            addCriterion("tenantName >=", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameLessThan(String value) {
            addCriterion("tenantName <", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameLessThanOrEqualTo(String value) {
            addCriterion("tenantName <=", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameLike(String value) {
            addCriterion("tenantName like", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameNotLike(String value) {
            addCriterion("tenantName not like", value, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameIn(List<String> values) {
            addCriterion("tenantName in", values, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameNotIn(List<String> values) {
            addCriterion("tenantName not in", values, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameBetween(String value1, String value2) {
            addCriterion("tenantName between", value1, value2, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantnameNotBetween(String value1, String value2) {
            addCriterion("tenantName not between", value1, value2, "tenantname");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyIsNull() {
            addCriterion("tenantIdentify is null");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyIsNotNull() {
            addCriterion("tenantIdentify is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyEqualTo(String value) {
            addCriterion("tenantIdentify =", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyNotEqualTo(String value) {
            addCriterion("tenantIdentify <>", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyGreaterThan(String value) {
            addCriterion("tenantIdentify >", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyGreaterThanOrEqualTo(String value) {
            addCriterion("tenantIdentify >=", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyLessThan(String value) {
            addCriterion("tenantIdentify <", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyLessThanOrEqualTo(String value) {
            addCriterion("tenantIdentify <=", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyLike(String value) {
            addCriterion("tenantIdentify like", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyNotLike(String value) {
            addCriterion("tenantIdentify not like", value, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyIn(List<String> values) {
            addCriterion("tenantIdentify in", values, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyNotIn(List<String> values) {
            addCriterion("tenantIdentify not in", values, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyBetween(String value1, String value2) {
            addCriterion("tenantIdentify between", value1, value2, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenantidentifyNotBetween(String value1, String value2) {
            addCriterion("tenantIdentify not between", value1, value2, "tenantidentify");
            return (Criteria) this;
        }

        public Criteria andTenanttelIsNull() {
            addCriterion("tenantTel is null");
            return (Criteria) this;
        }

        public Criteria andTenanttelIsNotNull() {
            addCriterion("tenantTel is not null");
            return (Criteria) this;
        }

        public Criteria andTenanttelEqualTo(String value) {
            addCriterion("tenantTel =", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelNotEqualTo(String value) {
            addCriterion("tenantTel <>", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelGreaterThan(String value) {
            addCriterion("tenantTel >", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelGreaterThanOrEqualTo(String value) {
            addCriterion("tenantTel >=", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelLessThan(String value) {
            addCriterion("tenantTel <", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelLessThanOrEqualTo(String value) {
            addCriterion("tenantTel <=", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelLike(String value) {
            addCriterion("tenantTel like", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelNotLike(String value) {
            addCriterion("tenantTel not like", value, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelIn(List<String> values) {
            addCriterion("tenantTel in", values, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelNotIn(List<String> values) {
            addCriterion("tenantTel not in", values, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelBetween(String value1, String value2) {
            addCriterion("tenantTel between", value1, value2, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenanttelNotBetween(String value1, String value2) {
            addCriterion("tenantTel not between", value1, value2, "tenanttel");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenIsNull() {
            addCriterion("tenantFromShen is null");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenIsNotNull() {
            addCriterion("tenantFromShen is not null");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenEqualTo(String value) {
            addCriterion("tenantFromShen =", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenNotEqualTo(String value) {
            addCriterion("tenantFromShen <>", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenGreaterThan(String value) {
            addCriterion("tenantFromShen >", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenGreaterThanOrEqualTo(String value) {
            addCriterion("tenantFromShen >=", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenLessThan(String value) {
            addCriterion("tenantFromShen <", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenLessThanOrEqualTo(String value) {
            addCriterion("tenantFromShen <=", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenLike(String value) {
            addCriterion("tenantFromShen like", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenNotLike(String value) {
            addCriterion("tenantFromShen not like", value, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenIn(List<String> values) {
            addCriterion("tenantFromShen in", values, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenNotIn(List<String> values) {
            addCriterion("tenantFromShen not in", values, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenBetween(String value1, String value2) {
            addCriterion("tenantFromShen between", value1, value2, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshenNotBetween(String value1, String value2) {
            addCriterion("tenantFromShen not between", value1, value2, "tenantfromshen");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiIsNull() {
            addCriterion("tenantFromShi is null");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiIsNotNull() {
            addCriterion("tenantFromShi is not null");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiEqualTo(String value) {
            addCriterion("tenantFromShi =", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiNotEqualTo(String value) {
            addCriterion("tenantFromShi <>", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiGreaterThan(String value) {
            addCriterion("tenantFromShi >", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiGreaterThanOrEqualTo(String value) {
            addCriterion("tenantFromShi >=", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiLessThan(String value) {
            addCriterion("tenantFromShi <", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiLessThanOrEqualTo(String value) {
            addCriterion("tenantFromShi <=", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiLike(String value) {
            addCriterion("tenantFromShi like", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiNotLike(String value) {
            addCriterion("tenantFromShi not like", value, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiIn(List<String> values) {
            addCriterion("tenantFromShi in", values, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiNotIn(List<String> values) {
            addCriterion("tenantFromShi not in", values, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiBetween(String value1, String value2) {
            addCriterion("tenantFromShi between", value1, value2, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromshiNotBetween(String value1, String value2) {
            addCriterion("tenantFromShi not between", value1, value2, "tenantfromshi");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianIsNull() {
            addCriterion("tenantFromXian is null");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianIsNotNull() {
            addCriterion("tenantFromXian is not null");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianEqualTo(String value) {
            addCriterion("tenantFromXian =", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianNotEqualTo(String value) {
            addCriterion("tenantFromXian <>", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianGreaterThan(String value) {
            addCriterion("tenantFromXian >", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianGreaterThanOrEqualTo(String value) {
            addCriterion("tenantFromXian >=", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianLessThan(String value) {
            addCriterion("tenantFromXian <", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianLessThanOrEqualTo(String value) {
            addCriterion("tenantFromXian <=", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianLike(String value) {
            addCriterion("tenantFromXian like", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianNotLike(String value) {
            addCriterion("tenantFromXian not like", value, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianIn(List<String> values) {
            addCriterion("tenantFromXian in", values, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianNotIn(List<String> values) {
            addCriterion("tenantFromXian not in", values, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianBetween(String value1, String value2) {
            addCriterion("tenantFromXian between", value1, value2, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantfromxianNotBetween(String value1, String value2) {
            addCriterion("tenantFromXian not between", value1, value2, "tenantfromxian");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationIsNull() {
            addCriterion("tenantWorkOrganization is null");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationIsNotNull() {
            addCriterion("tenantWorkOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationEqualTo(String value) {
            addCriterion("tenantWorkOrganization =", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationNotEqualTo(String value) {
            addCriterion("tenantWorkOrganization <>", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationGreaterThan(String value) {
            addCriterion("tenantWorkOrganization >", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("tenantWorkOrganization >=", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationLessThan(String value) {
            addCriterion("tenantWorkOrganization <", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationLessThanOrEqualTo(String value) {
            addCriterion("tenantWorkOrganization <=", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationLike(String value) {
            addCriterion("tenantWorkOrganization like", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationNotLike(String value) {
            addCriterion("tenantWorkOrganization not like", value, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationIn(List<String> values) {
            addCriterion("tenantWorkOrganization in", values, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationNotIn(List<String> values) {
            addCriterion("tenantWorkOrganization not in", values, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationBetween(String value1, String value2) {
            addCriterion("tenantWorkOrganization between", value1, value2, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantworkorganizationNotBetween(String value1, String value2) {
            addCriterion("tenantWorkOrganization not between", value1, value2, "tenantworkorganization");
            return (Criteria) this;
        }

        public Criteria andTenantdescIsNull() {
            addCriterion("tenantDesc is null");
            return (Criteria) this;
        }

        public Criteria andTenantdescIsNotNull() {
            addCriterion("tenantDesc is not null");
            return (Criteria) this;
        }

        public Criteria andTenantdescEqualTo(String value) {
            addCriterion("tenantDesc =", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescNotEqualTo(String value) {
            addCriterion("tenantDesc <>", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescGreaterThan(String value) {
            addCriterion("tenantDesc >", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescGreaterThanOrEqualTo(String value) {
            addCriterion("tenantDesc >=", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescLessThan(String value) {
            addCriterion("tenantDesc <", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescLessThanOrEqualTo(String value) {
            addCriterion("tenantDesc <=", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescLike(String value) {
            addCriterion("tenantDesc like", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescNotLike(String value) {
            addCriterion("tenantDesc not like", value, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescIn(List<String> values) {
            addCriterion("tenantDesc in", values, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescNotIn(List<String> values) {
            addCriterion("tenantDesc not in", values, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescBetween(String value1, String value2) {
            addCriterion("tenantDesc between", value1, value2, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantdescNotBetween(String value1, String value2) {
            addCriterion("tenantDesc not between", value1, value2, "tenantdesc");
            return (Criteria) this;
        }

        public Criteria andTenantimageIsNull() {
            addCriterion("tenantImage is null");
            return (Criteria) this;
        }

        public Criteria andTenantimageIsNotNull() {
            addCriterion("tenantImage is not null");
            return (Criteria) this;
        }

        public Criteria andTenantimageEqualTo(String value) {
            addCriterion("tenantImage =", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageNotEqualTo(String value) {
            addCriterion("tenantImage <>", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageGreaterThan(String value) {
            addCriterion("tenantImage >", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageGreaterThanOrEqualTo(String value) {
            addCriterion("tenantImage >=", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageLessThan(String value) {
            addCriterion("tenantImage <", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageLessThanOrEqualTo(String value) {
            addCriterion("tenantImage <=", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageLike(String value) {
            addCriterion("tenantImage like", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageNotLike(String value) {
            addCriterion("tenantImage not like", value, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageIn(List<String> values) {
            addCriterion("tenantImage in", values, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageNotIn(List<String> values) {
            addCriterion("tenantImage not in", values, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageBetween(String value1, String value2) {
            addCriterion("tenantImage between", value1, value2, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andTenantimageNotBetween(String value1, String value2) {
            addCriterion("tenantImage not between", value1, value2, "tenantimage");
            return (Criteria) this;
        }

        public Criteria andCheckopionIsNull() {
            addCriterion("checkOpion is null");
            return (Criteria) this;
        }

        public Criteria andCheckopionIsNotNull() {
            addCriterion("checkOpion is not null");
            return (Criteria) this;
        }

        public Criteria andCheckopionEqualTo(String value) {
            addCriterion("checkOpion =", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionNotEqualTo(String value) {
            addCriterion("checkOpion <>", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionGreaterThan(String value) {
            addCriterion("checkOpion >", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionGreaterThanOrEqualTo(String value) {
            addCriterion("checkOpion >=", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionLessThan(String value) {
            addCriterion("checkOpion <", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionLessThanOrEqualTo(String value) {
            addCriterion("checkOpion <=", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionLike(String value) {
            addCriterion("checkOpion like", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionNotLike(String value) {
            addCriterion("checkOpion not like", value, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionIn(List<String> values) {
            addCriterion("checkOpion in", values, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionNotIn(List<String> values) {
            addCriterion("checkOpion not in", values, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionBetween(String value1, String value2) {
            addCriterion("checkOpion between", value1, value2, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckopionNotBetween(String value1, String value2) {
            addCriterion("checkOpion not between", value1, value2, "checkopion");
            return (Criteria) this;
        }

        public Criteria andCheckeridIsNull() {
            addCriterion("checkerId is null");
            return (Criteria) this;
        }

        public Criteria andCheckeridIsNotNull() {
            addCriterion("checkerId is not null");
            return (Criteria) this;
        }

        public Criteria andCheckeridEqualTo(Long value) {
            addCriterion("checkerId =", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridNotEqualTo(Long value) {
            addCriterion("checkerId <>", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridGreaterThan(Long value) {
            addCriterion("checkerId >", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridGreaterThanOrEqualTo(Long value) {
            addCriterion("checkerId >=", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridLessThan(Long value) {
            addCriterion("checkerId <", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridLessThanOrEqualTo(Long value) {
            addCriterion("checkerId <=", value, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridIn(List<Long> values) {
            addCriterion("checkerId in", values, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridNotIn(List<Long> values) {
            addCriterion("checkerId not in", values, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridBetween(Long value1, Long value2) {
            addCriterion("checkerId between", value1, value2, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckeridNotBetween(Long value1, Long value2) {
            addCriterion("checkerId not between", value1, value2, "checkerid");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNull() {
            addCriterion("checkerName is null");
            return (Criteria) this;
        }

        public Criteria andCheckernameIsNotNull() {
            addCriterion("checkerName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckernameEqualTo(String value) {
            addCriterion("checkerName =", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotEqualTo(String value) {
            addCriterion("checkerName <>", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThan(String value) {
            addCriterion("checkerName >", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameGreaterThanOrEqualTo(String value) {
            addCriterion("checkerName >=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThan(String value) {
            addCriterion("checkerName <", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLessThanOrEqualTo(String value) {
            addCriterion("checkerName <=", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameLike(String value) {
            addCriterion("checkerName like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotLike(String value) {
            addCriterion("checkerName not like", value, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameIn(List<String> values) {
            addCriterion("checkerName in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotIn(List<String> values) {
            addCriterion("checkerName not in", values, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameBetween(String value1, String value2) {
            addCriterion("checkerName between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckernameNotBetween(String value1, String value2) {
            addCriterion("checkerName not between", value1, value2, "checkername");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("checkDate is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("checkDate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Date value) {
            addCriterionForJDBCDate("checkDate =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkDate <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkDate >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkDate >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Date value) {
            addCriterionForJDBCDate("checkDate <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkDate <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Date> values) {
            addCriterionForJDBCDate("checkDate in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkDate not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkDate between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkDate not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIsNull() {
            addCriterion("tenantCode is null");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIsNotNull() {
            addCriterion("tenantCode is not null");
            return (Criteria) this;
        }

        public Criteria andTenantcodeEqualTo(String value) {
            addCriterion("tenantCode =", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotEqualTo(String value) {
            addCriterion("tenantCode <>", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeGreaterThan(String value) {
            addCriterion("tenantCode >", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tenantCode >=", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLessThan(String value) {
            addCriterion("tenantCode <", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLessThanOrEqualTo(String value) {
            addCriterion("tenantCode <=", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeLike(String value) {
            addCriterion("tenantCode like", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotLike(String value) {
            addCriterion("tenantCode not like", value, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeIn(List<String> values) {
            addCriterion("tenantCode in", values, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotIn(List<String> values) {
            addCriterion("tenantCode not in", values, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeBetween(String value1, String value2) {
            addCriterion("tenantCode between", value1, value2, "tenantcode");
            return (Criteria) this;
        }

        public Criteria andTenantcodeNotBetween(String value1, String value2) {
            addCriterion("tenantCode not between", value1, value2, "tenantcode");
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