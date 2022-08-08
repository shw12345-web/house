package com.yunzhu.house.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseDetailExample() {
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

        public Criteria andHouseidIsNull() {
            addCriterion("houseId is null");
            return (Criteria) this;
        }

        public Criteria andHouseidIsNotNull() {
            addCriterion("houseId is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidEqualTo(Long value) {
            addCriterion("houseId =", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotEqualTo(Long value) {
            addCriterion("houseId <>", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThan(Long value) {
            addCriterion("houseId >", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("houseId >=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThan(Long value) {
            addCriterion("houseId <", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidLessThanOrEqualTo(Long value) {
            addCriterion("houseId <=", value, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidIn(List<Long> values) {
            addCriterion("houseId in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotIn(List<Long> values) {
            addCriterion("houseId not in", values, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidBetween(Long value1, Long value2) {
            addCriterion("houseId between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andHouseidNotBetween(Long value1, Long value2) {
            addCriterion("houseId not between", value1, value2, "houseid");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNull() {
            addCriterion("orientation is null");
            return (Criteria) this;
        }

        public Criteria andOrientationIsNotNull() {
            addCriterion("orientation is not null");
            return (Criteria) this;
        }

        public Criteria andOrientationEqualTo(String value) {
            addCriterion("orientation =", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotEqualTo(String value) {
            addCriterion("orientation <>", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThan(String value) {
            addCriterion("orientation >", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("orientation >=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThan(String value) {
            addCriterion("orientation <", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLessThanOrEqualTo(String value) {
            addCriterion("orientation <=", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationLike(String value) {
            addCriterion("orientation like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotLike(String value) {
            addCriterion("orientation not like", value, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationIn(List<String> values) {
            addCriterion("orientation in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotIn(List<String> values) {
            addCriterion("orientation not in", values, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationBetween(String value1, String value2) {
            addCriterion("orientation between", value1, value2, "orientation");
            return (Criteria) this;
        }

        public Criteria andOrientationNotBetween(String value1, String value2) {
            addCriterion("orientation not between", value1, value2, "orientation");
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

        public Criteria andRenovationIsNull() {
            addCriterion("renovation is null");
            return (Criteria) this;
        }

        public Criteria andRenovationIsNotNull() {
            addCriterion("renovation is not null");
            return (Criteria) this;
        }

        public Criteria andRenovationEqualTo(String value) {
            addCriterion("renovation =", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationNotEqualTo(String value) {
            addCriterion("renovation <>", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationGreaterThan(String value) {
            addCriterion("renovation >", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationGreaterThanOrEqualTo(String value) {
            addCriterion("renovation >=", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationLessThan(String value) {
            addCriterion("renovation <", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationLessThanOrEqualTo(String value) {
            addCriterion("renovation <=", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationLike(String value) {
            addCriterion("renovation like", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationNotLike(String value) {
            addCriterion("renovation not like", value, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationIn(List<String> values) {
            addCriterion("renovation in", values, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationNotIn(List<String> values) {
            addCriterion("renovation not in", values, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationBetween(String value1, String value2) {
            addCriterion("renovation between", value1, value2, "renovation");
            return (Criteria) this;
        }

        public Criteria andRenovationNotBetween(String value1, String value2) {
            addCriterion("renovation not between", value1, value2, "renovation");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesIsNull() {
            addCriterion("houseFacilities is null");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesIsNotNull() {
            addCriterion("houseFacilities is not null");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesEqualTo(String value) {
            addCriterion("houseFacilities =", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesNotEqualTo(String value) {
            addCriterion("houseFacilities <>", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesGreaterThan(String value) {
            addCriterion("houseFacilities >", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("houseFacilities >=", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesLessThan(String value) {
            addCriterion("houseFacilities <", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesLessThanOrEqualTo(String value) {
            addCriterion("houseFacilities <=", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesLike(String value) {
            addCriterion("houseFacilities like", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesNotLike(String value) {
            addCriterion("houseFacilities not like", value, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesIn(List<String> values) {
            addCriterion("houseFacilities in", values, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesNotIn(List<String> values) {
            addCriterion("houseFacilities not in", values, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesBetween(String value1, String value2) {
            addCriterion("houseFacilities between", value1, value2, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andHousefacilitiesNotBetween(String value1, String value2) {
            addCriterion("houseFacilities not between", value1, value2, "housefacilities");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(String value) {
            addCriterion("paymentMethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(String value) {
            addCriterion("paymentMethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(String value) {
            addCriterion("paymentMethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(String value) {
            addCriterion("paymentMethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(String value) {
            addCriterion("paymentMethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(String value) {
            addCriterion("paymentMethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLike(String value) {
            addCriterion("paymentMethod like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotLike(String value) {
            addCriterion("paymentMethod not like", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<String> values) {
            addCriterion("paymentMethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<String> values) {
            addCriterion("paymentMethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(String value1, String value2) {
            addCriterion("paymentMethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(String value1, String value2) {
            addCriterion("paymentMethod not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andLeasetermIsNull() {
            addCriterion("leaseTerm is null");
            return (Criteria) this;
        }

        public Criteria andLeasetermIsNotNull() {
            addCriterion("leaseTerm is not null");
            return (Criteria) this;
        }

        public Criteria andLeasetermEqualTo(String value) {
            addCriterion("leaseTerm =", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermNotEqualTo(String value) {
            addCriterion("leaseTerm <>", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermGreaterThan(String value) {
            addCriterion("leaseTerm >", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermGreaterThanOrEqualTo(String value) {
            addCriterion("leaseTerm >=", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermLessThan(String value) {
            addCriterion("leaseTerm <", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermLessThanOrEqualTo(String value) {
            addCriterion("leaseTerm <=", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermLike(String value) {
            addCriterion("leaseTerm like", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermNotLike(String value) {
            addCriterion("leaseTerm not like", value, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermIn(List<String> values) {
            addCriterion("leaseTerm in", values, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermNotIn(List<String> values) {
            addCriterion("leaseTerm not in", values, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermBetween(String value1, String value2) {
            addCriterion("leaseTerm between", value1, value2, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andLeasetermNotBetween(String value1, String value2) {
            addCriterion("leaseTerm not between", value1, value2, "leaseterm");
            return (Criteria) this;
        }

        public Criteria andChargewaterIsNull() {
            addCriterion("chargeWater is null");
            return (Criteria) this;
        }

        public Criteria andChargewaterIsNotNull() {
            addCriterion("chargeWater is not null");
            return (Criteria) this;
        }

        public Criteria andChargewaterEqualTo(BigDecimal value) {
            addCriterion("chargeWater =", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterNotEqualTo(BigDecimal value) {
            addCriterion("chargeWater <>", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterGreaterThan(BigDecimal value) {
            addCriterion("chargeWater >", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chargeWater >=", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterLessThan(BigDecimal value) {
            addCriterion("chargeWater <", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chargeWater <=", value, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterIn(List<BigDecimal> values) {
            addCriterion("chargeWater in", values, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterNotIn(List<BigDecimal> values) {
            addCriterion("chargeWater not in", values, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargeWater between", value1, value2, "chargewater");
            return (Criteria) this;
        }

        public Criteria andChargewaterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chargeWater not between", value1, value2, "chargewater");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesIsNull() {
            addCriterion("electricityFees is null");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesIsNotNull() {
            addCriterion("electricityFees is not null");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesEqualTo(BigDecimal value) {
            addCriterion("electricityFees =", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesNotEqualTo(BigDecimal value) {
            addCriterion("electricityFees <>", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesGreaterThan(BigDecimal value) {
            addCriterion("electricityFees >", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("electricityFees >=", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesLessThan(BigDecimal value) {
            addCriterion("electricityFees <", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("electricityFees <=", value, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesIn(List<BigDecimal> values) {
            addCriterion("electricityFees in", values, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesNotIn(List<BigDecimal> values) {
            addCriterion("electricityFees not in", values, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electricityFees between", value1, value2, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andElectricityfeesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("electricityFees not between", value1, value2, "electricityfees");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionIsNull() {
            addCriterion("houseIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionIsNotNull() {
            addCriterion("houseIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionEqualTo(String value) {
            addCriterion("houseIntroduction =", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionNotEqualTo(String value) {
            addCriterion("houseIntroduction <>", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionGreaterThan(String value) {
            addCriterion("houseIntroduction >", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("houseIntroduction >=", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionLessThan(String value) {
            addCriterion("houseIntroduction <", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionLessThanOrEqualTo(String value) {
            addCriterion("houseIntroduction <=", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionLike(String value) {
            addCriterion("houseIntroduction like", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionNotLike(String value) {
            addCriterion("houseIntroduction not like", value, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionIn(List<String> values) {
            addCriterion("houseIntroduction in", values, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionNotIn(List<String> values) {
            addCriterion("houseIntroduction not in", values, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionBetween(String value1, String value2) {
            addCriterion("houseIntroduction between", value1, value2, "houseintroduction");
            return (Criteria) this;
        }

        public Criteria andHouseintroductionNotBetween(String value1, String value2) {
            addCriterion("houseIntroduction not between", value1, value2, "houseintroduction");
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