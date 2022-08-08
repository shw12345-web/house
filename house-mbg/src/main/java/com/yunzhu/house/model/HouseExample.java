package com.yunzhu.house.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHousetypeidIsNull() {
            addCriterion("houseTypeId is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeidIsNotNull() {
            addCriterion("houseTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeidEqualTo(Long value) {
            addCriterion("houseTypeId =", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidNotEqualTo(Long value) {
            addCriterion("houseTypeId <>", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidGreaterThan(Long value) {
            addCriterion("houseTypeId >", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("houseTypeId >=", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidLessThan(Long value) {
            addCriterion("houseTypeId <", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidLessThanOrEqualTo(Long value) {
            addCriterion("houseTypeId <=", value, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidIn(List<Long> values) {
            addCriterion("houseTypeId in", values, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidNotIn(List<Long> values) {
            addCriterion("houseTypeId not in", values, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidBetween(Long value1, Long value2) {
            addCriterion("houseTypeId between", value1, value2, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypeidNotBetween(Long value1, Long value2) {
            addCriterion("houseTypeId not between", value1, value2, "housetypeid");
            return (Criteria) this;
        }

        public Criteria andHousetypenameIsNull() {
            addCriterion("houseTypeName is null");
            return (Criteria) this;
        }

        public Criteria andHousetypenameIsNotNull() {
            addCriterion("houseTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypenameEqualTo(String value) {
            addCriterion("houseTypeName =", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameNotEqualTo(String value) {
            addCriterion("houseTypeName <>", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameGreaterThan(String value) {
            addCriterion("houseTypeName >", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("houseTypeName >=", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameLessThan(String value) {
            addCriterion("houseTypeName <", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameLessThanOrEqualTo(String value) {
            addCriterion("houseTypeName <=", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameLike(String value) {
            addCriterion("houseTypeName like", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameNotLike(String value) {
            addCriterion("houseTypeName not like", value, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameIn(List<String> values) {
            addCriterion("houseTypeName in", values, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameNotIn(List<String> values) {
            addCriterion("houseTypeName not in", values, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameBetween(String value1, String value2) {
            addCriterion("houseTypeName between", value1, value2, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHousetypenameNotBetween(String value1, String value2) {
            addCriterion("houseTypeName not between", value1, value2, "housetypename");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNull() {
            addCriterion("houseAddress is null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIsNotNull() {
            addCriterion("houseAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHouseaddressEqualTo(String value) {
            addCriterion("houseAddress =", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotEqualTo(String value) {
            addCriterion("houseAddress <>", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThan(String value) {
            addCriterion("houseAddress >", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressGreaterThanOrEqualTo(String value) {
            addCriterion("houseAddress >=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThan(String value) {
            addCriterion("houseAddress <", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLessThanOrEqualTo(String value) {
            addCriterion("houseAddress <=", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressLike(String value) {
            addCriterion("houseAddress like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotLike(String value) {
            addCriterion("houseAddress not like", value, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressIn(List<String> values) {
            addCriterion("houseAddress in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotIn(List<String> values) {
            addCriterion("houseAddress not in", values, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressBetween(String value1, String value2) {
            addCriterion("houseAddress between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHouseaddressNotBetween(String value1, String value2) {
            addCriterion("houseAddress not between", value1, value2, "houseaddress");
            return (Criteria) this;
        }

        public Criteria andHousecityIsNull() {
            addCriterion("houseCity is null");
            return (Criteria) this;
        }

        public Criteria andHousecityIsNotNull() {
            addCriterion("houseCity is not null");
            return (Criteria) this;
        }

        public Criteria andHousecityEqualTo(String value) {
            addCriterion("houseCity =", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityNotEqualTo(String value) {
            addCriterion("houseCity <>", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityGreaterThan(String value) {
            addCriterion("houseCity >", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityGreaterThanOrEqualTo(String value) {
            addCriterion("houseCity >=", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityLessThan(String value) {
            addCriterion("houseCity <", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityLessThanOrEqualTo(String value) {
            addCriterion("houseCity <=", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityLike(String value) {
            addCriterion("houseCity like", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityNotLike(String value) {
            addCriterion("houseCity not like", value, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityIn(List<String> values) {
            addCriterion("houseCity in", values, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityNotIn(List<String> values) {
            addCriterion("houseCity not in", values, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityBetween(String value1, String value2) {
            addCriterion("houseCity between", value1, value2, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousecityNotBetween(String value1, String value2) {
            addCriterion("houseCity not between", value1, value2, "housecity");
            return (Criteria) this;
        }

        public Criteria andHousefloorIsNull() {
            addCriterion("houseFloor is null");
            return (Criteria) this;
        }

        public Criteria andHousefloorIsNotNull() {
            addCriterion("houseFloor is not null");
            return (Criteria) this;
        }

        public Criteria andHousefloorEqualTo(String value) {
            addCriterion("houseFloor =", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorNotEqualTo(String value) {
            addCriterion("houseFloor <>", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorGreaterThan(String value) {
            addCriterion("houseFloor >", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorGreaterThanOrEqualTo(String value) {
            addCriterion("houseFloor >=", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorLessThan(String value) {
            addCriterion("houseFloor <", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorLessThanOrEqualTo(String value) {
            addCriterion("houseFloor <=", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorLike(String value) {
            addCriterion("houseFloor like", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorNotLike(String value) {
            addCriterion("houseFloor not like", value, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorIn(List<String> values) {
            addCriterion("houseFloor in", values, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorNotIn(List<String> values) {
            addCriterion("houseFloor not in", values, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorBetween(String value1, String value2) {
            addCriterion("houseFloor between", value1, value2, "housefloor");
            return (Criteria) this;
        }

        public Criteria andHousefloorNotBetween(String value1, String value2) {
            addCriterion("houseFloor not between", value1, value2, "housefloor");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberIsNull() {
            addCriterion("buildingNumber is null");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberIsNotNull() {
            addCriterion("buildingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberEqualTo(String value) {
            addCriterion("buildingNumber =", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberNotEqualTo(String value) {
            addCriterion("buildingNumber <>", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberGreaterThan(String value) {
            addCriterion("buildingNumber >", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("buildingNumber >=", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberLessThan(String value) {
            addCriterion("buildingNumber <", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberLessThanOrEqualTo(String value) {
            addCriterion("buildingNumber <=", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberLike(String value) {
            addCriterion("buildingNumber like", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberNotLike(String value) {
            addCriterion("buildingNumber not like", value, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberIn(List<String> values) {
            addCriterion("buildingNumber in", values, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberNotIn(List<String> values) {
            addCriterion("buildingNumber not in", values, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberBetween(String value1, String value2) {
            addCriterion("buildingNumber between", value1, value2, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andBuildingnumberNotBetween(String value1, String value2) {
            addCriterion("buildingNumber not between", value1, value2, "buildingnumber");
            return (Criteria) this;
        }

        public Criteria andExpectedrentIsNull() {
            addCriterion("expectedRent is null");
            return (Criteria) this;
        }

        public Criteria andExpectedrentIsNotNull() {
            addCriterion("expectedRent is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedrentEqualTo(BigDecimal value) {
            addCriterion("expectedRent =", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentNotEqualTo(BigDecimal value) {
            addCriterion("expectedRent <>", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentGreaterThan(BigDecimal value) {
            addCriterion("expectedRent >", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expectedRent >=", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentLessThan(BigDecimal value) {
            addCriterion("expectedRent <", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expectedRent <=", value, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentIn(List<BigDecimal> values) {
            addCriterion("expectedRent in", values, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentNotIn(List<BigDecimal> values) {
            addCriterion("expectedRent not in", values, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectedRent between", value1, value2, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andExpectedrentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expectedRent not between", value1, value2, "expectedrent");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNull() {
            addCriterion("houseArea is null");
            return (Criteria) this;
        }

        public Criteria andHouseareaIsNotNull() {
            addCriterion("houseArea is not null");
            return (Criteria) this;
        }

        public Criteria andHouseareaEqualTo(String value) {
            addCriterion("houseArea =", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotEqualTo(String value) {
            addCriterion("houseArea <>", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThan(String value) {
            addCriterion("houseArea >", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaGreaterThanOrEqualTo(String value) {
            addCriterion("houseArea >=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThan(String value) {
            addCriterion("houseArea <", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLessThanOrEqualTo(String value) {
            addCriterion("houseArea <=", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaLike(String value) {
            addCriterion("houseArea like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotLike(String value) {
            addCriterion("houseArea not like", value, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaIn(List<String> values) {
            addCriterion("houseArea in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotIn(List<String> values) {
            addCriterion("houseArea not in", values, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaBetween(String value1, String value2) {
            addCriterion("houseArea between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andHouseareaNotBetween(String value1, String value2) {
            addCriterion("houseArea not between", value1, value2, "housearea");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNull() {
            addCriterion("houseType is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNotNull() {
            addCriterion("houseType is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeEqualTo(String value) {
            addCriterion("houseType =", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotEqualTo(String value) {
            addCriterion("houseType <>", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThan(String value) {
            addCriterion("houseType >", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("houseType >=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThan(String value) {
            addCriterion("houseType <", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThanOrEqualTo(String value) {
            addCriterion("houseType <=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLike(String value) {
            addCriterion("houseType like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotLike(String value) {
            addCriterion("houseType not like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeIn(List<String> values) {
            addCriterion("houseType in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotIn(List<String> values) {
            addCriterion("houseType not in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeBetween(String value1, String value2) {
            addCriterion("houseType between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotBetween(String value1, String value2) {
            addCriterion("houseType not between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHouseunitIsNull() {
            addCriterion("houseUnit is null");
            return (Criteria) this;
        }

        public Criteria andHouseunitIsNotNull() {
            addCriterion("houseUnit is not null");
            return (Criteria) this;
        }

        public Criteria andHouseunitEqualTo(String value) {
            addCriterion("houseUnit =", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitNotEqualTo(String value) {
            addCriterion("houseUnit <>", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitGreaterThan(String value) {
            addCriterion("houseUnit >", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitGreaterThanOrEqualTo(String value) {
            addCriterion("houseUnit >=", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitLessThan(String value) {
            addCriterion("houseUnit <", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitLessThanOrEqualTo(String value) {
            addCriterion("houseUnit <=", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitLike(String value) {
            addCriterion("houseUnit like", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitNotLike(String value) {
            addCriterion("houseUnit not like", value, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitIn(List<String> values) {
            addCriterion("houseUnit in", values, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitNotIn(List<String> values) {
            addCriterion("houseUnit not in", values, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitBetween(String value1, String value2) {
            addCriterion("houseUnit between", value1, value2, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHouseunitNotBetween(String value1, String value2) {
            addCriterion("houseUnit not between", value1, value2, "houseunit");
            return (Criteria) this;
        }

        public Criteria andHousenumberIsNull() {
            addCriterion("houseNumber is null");
            return (Criteria) this;
        }

        public Criteria andHousenumberIsNotNull() {
            addCriterion("houseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHousenumberEqualTo(String value) {
            addCriterion("houseNumber =", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotEqualTo(String value) {
            addCriterion("houseNumber <>", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberGreaterThan(String value) {
            addCriterion("houseNumber >", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberGreaterThanOrEqualTo(String value) {
            addCriterion("houseNumber >=", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLessThan(String value) {
            addCriterion("houseNumber <", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLessThanOrEqualTo(String value) {
            addCriterion("houseNumber <=", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberLike(String value) {
            addCriterion("houseNumber like", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotLike(String value) {
            addCriterion("houseNumber not like", value, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberIn(List<String> values) {
            addCriterion("houseNumber in", values, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotIn(List<String> values) {
            addCriterion("houseNumber not in", values, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberBetween(String value1, String value2) {
            addCriterion("houseNumber between", value1, value2, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenumberNotBetween(String value1, String value2) {
            addCriterion("houseNumber not between", value1, value2, "housenumber");
            return (Criteria) this;
        }

        public Criteria andHousenameIsNull() {
            addCriterion("houseName is null");
            return (Criteria) this;
        }

        public Criteria andHousenameIsNotNull() {
            addCriterion("houseName is not null");
            return (Criteria) this;
        }

        public Criteria andHousenameEqualTo(String value) {
            addCriterion("houseName =", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameNotEqualTo(String value) {
            addCriterion("houseName <>", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameGreaterThan(String value) {
            addCriterion("houseName >", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameGreaterThanOrEqualTo(String value) {
            addCriterion("houseName >=", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameLessThan(String value) {
            addCriterion("houseName <", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameLessThanOrEqualTo(String value) {
            addCriterion("houseName <=", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameLike(String value) {
            addCriterion("houseName like", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameNotLike(String value) {
            addCriterion("houseName not like", value, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameIn(List<String> values) {
            addCriterion("houseName in", values, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameNotIn(List<String> values) {
            addCriterion("houseName not in", values, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameBetween(String value1, String value2) {
            addCriterion("houseName between", value1, value2, "housename");
            return (Criteria) this;
        }

        public Criteria andHousenameNotBetween(String value1, String value2) {
            addCriterion("houseName not between", value1, value2, "housename");
            return (Criteria) this;
        }

        public Criteria andHousedescIsNull() {
            addCriterion("houseDesc is null");
            return (Criteria) this;
        }

        public Criteria andHousedescIsNotNull() {
            addCriterion("houseDesc is not null");
            return (Criteria) this;
        }

        public Criteria andHousedescEqualTo(String value) {
            addCriterion("houseDesc =", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescNotEqualTo(String value) {
            addCriterion("houseDesc <>", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescGreaterThan(String value) {
            addCriterion("houseDesc >", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescGreaterThanOrEqualTo(String value) {
            addCriterion("houseDesc >=", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescLessThan(String value) {
            addCriterion("houseDesc <", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescLessThanOrEqualTo(String value) {
            addCriterion("houseDesc <=", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescLike(String value) {
            addCriterion("houseDesc like", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescNotLike(String value) {
            addCriterion("houseDesc not like", value, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescIn(List<String> values) {
            addCriterion("houseDesc in", values, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescNotIn(List<String> values) {
            addCriterion("houseDesc not in", values, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescBetween(String value1, String value2) {
            addCriterion("houseDesc between", value1, value2, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousedescNotBetween(String value1, String value2) {
            addCriterion("houseDesc not between", value1, value2, "housedesc");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationIsNull() {
            addCriterion("houseMapLocation is null");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationIsNotNull() {
            addCriterion("houseMapLocation is not null");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationEqualTo(String value) {
            addCriterion("houseMapLocation =", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationNotEqualTo(String value) {
            addCriterion("houseMapLocation <>", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationGreaterThan(String value) {
            addCriterion("houseMapLocation >", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationGreaterThanOrEqualTo(String value) {
            addCriterion("houseMapLocation >=", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationLessThan(String value) {
            addCriterion("houseMapLocation <", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationLessThanOrEqualTo(String value) {
            addCriterion("houseMapLocation <=", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationLike(String value) {
            addCriterion("houseMapLocation like", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationNotLike(String value) {
            addCriterion("houseMapLocation not like", value, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationIn(List<String> values) {
            addCriterion("houseMapLocation in", values, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationNotIn(List<String> values) {
            addCriterion("houseMapLocation not in", values, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationBetween(String value1, String value2) {
            addCriterion("houseMapLocation between", value1, value2, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousemaplocationNotBetween(String value1, String value2) {
            addCriterion("houseMapLocation not between", value1, value2, "housemaplocation");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeIsNull() {
            addCriterion("houseTwoDimensionalCode is null");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeIsNotNull() {
            addCriterion("houseTwoDimensionalCode is not null");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeEqualTo(String value) {
            addCriterion("houseTwoDimensionalCode =", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeNotEqualTo(String value) {
            addCriterion("houseTwoDimensionalCode <>", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeGreaterThan(String value) {
            addCriterion("houseTwoDimensionalCode >", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("houseTwoDimensionalCode >=", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeLessThan(String value) {
            addCriterion("houseTwoDimensionalCode <", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeLessThanOrEqualTo(String value) {
            addCriterion("houseTwoDimensionalCode <=", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeLike(String value) {
            addCriterion("houseTwoDimensionalCode like", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeNotLike(String value) {
            addCriterion("houseTwoDimensionalCode not like", value, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeIn(List<String> values) {
            addCriterion("houseTwoDimensionalCode in", values, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeNotIn(List<String> values) {
            addCriterion("houseTwoDimensionalCode not in", values, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeBetween(String value1, String value2) {
            addCriterion("houseTwoDimensionalCode between", value1, value2, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHousetwodimensionalcodeNotBetween(String value1, String value2) {
            addCriterion("houseTwoDimensionalCode not between", value1, value2, "housetwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andHouseimageIsNull() {
            addCriterion("houseImage is null");
            return (Criteria) this;
        }

        public Criteria andHouseimageIsNotNull() {
            addCriterion("houseImage is not null");
            return (Criteria) this;
        }

        public Criteria andHouseimageEqualTo(String value) {
            addCriterion("houseImage =", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageNotEqualTo(String value) {
            addCriterion("houseImage <>", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageGreaterThan(String value) {
            addCriterion("houseImage >", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageGreaterThanOrEqualTo(String value) {
            addCriterion("houseImage >=", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageLessThan(String value) {
            addCriterion("houseImage <", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageLessThanOrEqualTo(String value) {
            addCriterion("houseImage <=", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageLike(String value) {
            addCriterion("houseImage like", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageNotLike(String value) {
            addCriterion("houseImage not like", value, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageIn(List<String> values) {
            addCriterion("houseImage in", values, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageNotIn(List<String> values) {
            addCriterion("houseImage not in", values, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageBetween(String value1, String value2) {
            addCriterion("houseImage between", value1, value2, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseimageNotBetween(String value1, String value2) {
            addCriterion("houseImage not between", value1, value2, "houseimage");
            return (Criteria) this;
        }

        public Criteria andHouseowneridIsNull() {
            addCriterion("houseOwnerId is null");
            return (Criteria) this;
        }

        public Criteria andHouseowneridIsNotNull() {
            addCriterion("houseOwnerId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseowneridEqualTo(Long value) {
            addCriterion("houseOwnerId =", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridNotEqualTo(Long value) {
            addCriterion("houseOwnerId <>", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridGreaterThan(Long value) {
            addCriterion("houseOwnerId >", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridGreaterThanOrEqualTo(Long value) {
            addCriterion("houseOwnerId >=", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridLessThan(Long value) {
            addCriterion("houseOwnerId <", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridLessThanOrEqualTo(Long value) {
            addCriterion("houseOwnerId <=", value, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridIn(List<Long> values) {
            addCriterion("houseOwnerId in", values, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridNotIn(List<Long> values) {
            addCriterion("houseOwnerId not in", values, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridBetween(Long value1, Long value2) {
            addCriterion("houseOwnerId between", value1, value2, "houseownerid");
            return (Criteria) this;
        }

        public Criteria andHouseowneridNotBetween(Long value1, Long value2) {
            addCriterion("houseOwnerId not between", value1, value2, "houseownerid");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Long value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Long value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Long value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Long value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Long value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Long value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Long> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Long> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Long value1, Long value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Long value1, Long value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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