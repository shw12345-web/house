package com.yunzhu.house.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseownerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseownerExample() {
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

        public Criteria andHouseownercodeIsNull() {
            addCriterion("houseOwnerCode is null");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeIsNotNull() {
            addCriterion("houseOwnerCode is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeEqualTo(String value) {
            addCriterion("houseOwnerCode =", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeNotEqualTo(String value) {
            addCriterion("houseOwnerCode <>", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeGreaterThan(String value) {
            addCriterion("houseOwnerCode >", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerCode >=", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeLessThan(String value) {
            addCriterion("houseOwnerCode <", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerCode <=", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeLike(String value) {
            addCriterion("houseOwnerCode like", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeNotLike(String value) {
            addCriterion("houseOwnerCode not like", value, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeIn(List<String> values) {
            addCriterion("houseOwnerCode in", values, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeNotIn(List<String> values) {
            addCriterion("houseOwnerCode not in", values, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeBetween(String value1, String value2) {
            addCriterion("houseOwnerCode between", value1, value2, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownercodeNotBetween(String value1, String value2) {
            addCriterion("houseOwnerCode not between", value1, value2, "houseownercode");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordIsNull() {
            addCriterion("houseOwnerPassWord is null");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordIsNotNull() {
            addCriterion("houseOwnerPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordEqualTo(String value) {
            addCriterion("houseOwnerPassWord =", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordNotEqualTo(String value) {
            addCriterion("houseOwnerPassWord <>", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordGreaterThan(String value) {
            addCriterion("houseOwnerPassWord >", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerPassWord >=", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordLessThan(String value) {
            addCriterion("houseOwnerPassWord <", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerPassWord <=", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordLike(String value) {
            addCriterion("houseOwnerPassWord like", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordNotLike(String value) {
            addCriterion("houseOwnerPassWord not like", value, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordIn(List<String> values) {
            addCriterion("houseOwnerPassWord in", values, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordNotIn(List<String> values) {
            addCriterion("houseOwnerPassWord not in", values, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordBetween(String value1, String value2) {
            addCriterion("houseOwnerPassWord between", value1, value2, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownerpasswordNotBetween(String value1, String value2) {
            addCriterion("houseOwnerPassWord not between", value1, value2, "houseownerpassword");
            return (Criteria) this;
        }

        public Criteria andHouseownernameIsNull() {
            addCriterion("houseOwnerName is null");
            return (Criteria) this;
        }

        public Criteria andHouseownernameIsNotNull() {
            addCriterion("houseOwnerName is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownernameEqualTo(String value) {
            addCriterion("houseOwnerName =", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameNotEqualTo(String value) {
            addCriterion("houseOwnerName <>", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameGreaterThan(String value) {
            addCriterion("houseOwnerName >", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerName >=", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameLessThan(String value) {
            addCriterion("houseOwnerName <", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerName <=", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameLike(String value) {
            addCriterion("houseOwnerName like", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameNotLike(String value) {
            addCriterion("houseOwnerName not like", value, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameIn(List<String> values) {
            addCriterion("houseOwnerName in", values, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameNotIn(List<String> values) {
            addCriterion("houseOwnerName not in", values, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameBetween(String value1, String value2) {
            addCriterion("houseOwnerName between", value1, value2, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseownernameNotBetween(String value1, String value2) {
            addCriterion("houseOwnerName not between", value1, value2, "houseownername");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyIsNull() {
            addCriterion("houseOwnerIdentify is null");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyIsNotNull() {
            addCriterion("houseOwnerIdentify is not null");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyEqualTo(String value) {
            addCriterion("houseOwnerIdentify =", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyNotEqualTo(String value) {
            addCriterion("houseOwnerIdentify <>", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyGreaterThan(String value) {
            addCriterion("houseOwnerIdentify >", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerIdentify >=", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyLessThan(String value) {
            addCriterion("houseOwnerIdentify <", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerIdentify <=", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyLike(String value) {
            addCriterion("houseOwnerIdentify like", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyNotLike(String value) {
            addCriterion("houseOwnerIdentify not like", value, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyIn(List<String> values) {
            addCriterion("houseOwnerIdentify in", values, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyNotIn(List<String> values) {
            addCriterion("houseOwnerIdentify not in", values, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyBetween(String value1, String value2) {
            addCriterion("houseOwnerIdentify between", value1, value2, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseowneridentifyNotBetween(String value1, String value2) {
            addCriterion("houseOwnerIdentify not between", value1, value2, "houseowneridentify");
            return (Criteria) this;
        }

        public Criteria andHouseownertelIsNull() {
            addCriterion("houseOwnerTel is null");
            return (Criteria) this;
        }

        public Criteria andHouseownertelIsNotNull() {
            addCriterion("houseOwnerTel is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownertelEqualTo(String value) {
            addCriterion("houseOwnerTel =", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelNotEqualTo(String value) {
            addCriterion("houseOwnerTel <>", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelGreaterThan(String value) {
            addCriterion("houseOwnerTel >", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerTel >=", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelLessThan(String value) {
            addCriterion("houseOwnerTel <", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerTel <=", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelLike(String value) {
            addCriterion("houseOwnerTel like", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelNotLike(String value) {
            addCriterion("houseOwnerTel not like", value, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelIn(List<String> values) {
            addCriterion("houseOwnerTel in", values, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelNotIn(List<String> values) {
            addCriterion("houseOwnerTel not in", values, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelBetween(String value1, String value2) {
            addCriterion("houseOwnerTel between", value1, value2, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownertelNotBetween(String value1, String value2) {
            addCriterion("houseOwnerTel not between", value1, value2, "houseownertel");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescIsNull() {
            addCriterion("houseOwnerDesc is null");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescIsNotNull() {
            addCriterion("houseOwnerDesc is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescEqualTo(String value) {
            addCriterion("houseOwnerDesc =", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescNotEqualTo(String value) {
            addCriterion("houseOwnerDesc <>", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescGreaterThan(String value) {
            addCriterion("houseOwnerDesc >", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerDesc >=", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescLessThan(String value) {
            addCriterion("houseOwnerDesc <", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerDesc <=", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescLike(String value) {
            addCriterion("houseOwnerDesc like", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescNotLike(String value) {
            addCriterion("houseOwnerDesc not like", value, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescIn(List<String> values) {
            addCriterion("houseOwnerDesc in", values, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescNotIn(List<String> values) {
            addCriterion("houseOwnerDesc not in", values, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescBetween(String value1, String value2) {
            addCriterion("houseOwnerDesc between", value1, value2, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseownerdescNotBetween(String value1, String value2) {
            addCriterion("houseOwnerDesc not between", value1, value2, "houseownerdesc");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressIsNull() {
            addCriterion("houseOwnerAddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressIsNotNull() {
            addCriterion("houseOwnerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressEqualTo(String value) {
            addCriterion("houseOwnerAddress =", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressNotEqualTo(String value) {
            addCriterion("houseOwnerAddress <>", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressGreaterThan(String value) {
            addCriterion("houseOwnerAddress >", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerAddress >=", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressLessThan(String value) {
            addCriterion("houseOwnerAddress <", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerAddress <=", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressLike(String value) {
            addCriterion("houseOwnerAddress like", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressNotLike(String value) {
            addCriterion("houseOwnerAddress not like", value, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressIn(List<String> values) {
            addCriterion("houseOwnerAddress in", values, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressNotIn(List<String> values) {
            addCriterion("houseOwnerAddress not in", values, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressBetween(String value1, String value2) {
            addCriterion("houseOwnerAddress between", value1, value2, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseowneraddressNotBetween(String value1, String value2) {
            addCriterion("houseOwnerAddress not between", value1, value2, "houseowneraddress");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleIsNull() {
            addCriterion("houseOwnerRole is null");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleIsNotNull() {
            addCriterion("houseOwnerRole is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleEqualTo(Long value) {
            addCriterion("houseOwnerRole =", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleNotEqualTo(Long value) {
            addCriterion("houseOwnerRole <>", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleGreaterThan(Long value) {
            addCriterion("houseOwnerRole >", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleGreaterThanOrEqualTo(Long value) {
            addCriterion("houseOwnerRole >=", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleLessThan(Long value) {
            addCriterion("houseOwnerRole <", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleLessThanOrEqualTo(Long value) {
            addCriterion("houseOwnerRole <=", value, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleIn(List<Long> values) {
            addCriterion("houseOwnerRole in", values, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleNotIn(List<Long> values) {
            addCriterion("houseOwnerRole not in", values, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleBetween(Long value1, Long value2) {
            addCriterion("houseOwnerRole between", value1, value2, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerroleNotBetween(Long value1, Long value2) {
            addCriterion("houseOwnerRole not between", value1, value2, "houseownerrole");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeIsNull() {
            addCriterion("houseOwnerLastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeIsNotNull() {
            addCriterion("houseOwnerLastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime =", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime <>", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime >", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime >=", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeLessThan(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime <", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime <=", value, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime in", values, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime not in", values, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime between", value1, value2, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andHouseownerlastlogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("houseOwnerLastLoginTime not between", value1, value2, "houseownerlastlogintime");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNull() {
            addCriterion("registDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNotNull() {
            addCriterion("registDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistdateEqualTo(Date value) {
            addCriterionForJDBCDate("registDate =", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registDate <>", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThan(Date value) {
            addCriterionForJDBCDate("registDate >", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registDate >=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThan(Date value) {
            addCriterionForJDBCDate("registDate <", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registDate <=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateIn(List<Date> values) {
            addCriterionForJDBCDate("registDate in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registDate not in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registDate between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registDate not between", value1, value2, "registdate");
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

        public Criteria andHouseownerimageIsNull() {
            addCriterion("houseOwnerImage is null");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageIsNotNull() {
            addCriterion("houseOwnerImage is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageEqualTo(String value) {
            addCriterion("houseOwnerImage =", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageNotEqualTo(String value) {
            addCriterion("houseOwnerImage <>", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageGreaterThan(String value) {
            addCriterion("houseOwnerImage >", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerImage >=", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageLessThan(String value) {
            addCriterion("houseOwnerImage <", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerImage <=", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageLike(String value) {
            addCriterion("houseOwnerImage like", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageNotLike(String value) {
            addCriterion("houseOwnerImage not like", value, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageIn(List<String> values) {
            addCriterion("houseOwnerImage in", values, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageNotIn(List<String> values) {
            addCriterion("houseOwnerImage not in", values, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageBetween(String value1, String value2) {
            addCriterion("houseOwnerImage between", value1, value2, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownerimageNotBetween(String value1, String value2) {
            addCriterion("houseOwnerImage not between", value1, value2, "houseownerimage");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeIsNull() {
            addCriterion("houseOwnerTwoDimensionalCode is null");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeIsNotNull() {
            addCriterion("houseOwnerTwoDimensionalCode is not null");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeEqualTo(String value) {
            addCriterion("houseOwnerTwoDimensionalCode =", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeNotEqualTo(String value) {
            addCriterion("houseOwnerTwoDimensionalCode <>", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeGreaterThan(String value) {
            addCriterion("houseOwnerTwoDimensionalCode >", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("houseOwnerTwoDimensionalCode >=", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeLessThan(String value) {
            addCriterion("houseOwnerTwoDimensionalCode <", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeLessThanOrEqualTo(String value) {
            addCriterion("houseOwnerTwoDimensionalCode <=", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeLike(String value) {
            addCriterion("houseOwnerTwoDimensionalCode like", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeNotLike(String value) {
            addCriterion("houseOwnerTwoDimensionalCode not like", value, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeIn(List<String> values) {
            addCriterion("houseOwnerTwoDimensionalCode in", values, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeNotIn(List<String> values) {
            addCriterion("houseOwnerTwoDimensionalCode not in", values, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeBetween(String value1, String value2) {
            addCriterion("houseOwnerTwoDimensionalCode between", value1, value2, "houseownertwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseownertwodimensionalcodeNotBetween(String value1, String value2) {
            addCriterion("houseOwnerTwoDimensionalCode not between", value1, value2, "houseownertwodimensionalcode");
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