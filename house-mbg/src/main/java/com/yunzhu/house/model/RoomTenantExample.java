package com.yunzhu.house.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomTenantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomTenantExample() {
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

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Long value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Long value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Long value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Long value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Long value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Long value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Long> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Long> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Long value1, Long value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Long value1, Long value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNull() {
            addCriterion("roomName is null");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNotNull() {
            addCriterion("roomName is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnameEqualTo(String value) {
            addCriterion("roomName =", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotEqualTo(String value) {
            addCriterion("roomName <>", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThan(String value) {
            addCriterion("roomName >", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("roomName >=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThan(String value) {
            addCriterion("roomName <", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThanOrEqualTo(String value) {
            addCriterion("roomName <=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLike(String value) {
            addCriterion("roomName like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotLike(String value) {
            addCriterion("roomName not like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameIn(List<String> values) {
            addCriterion("roomName in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotIn(List<String> values) {
            addCriterion("roomName not in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameBetween(String value1, String value2) {
            addCriterion("roomName between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotBetween(String value1, String value2) {
            addCriterion("roomName not between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("tenantId is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("tenantId is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Long value) {
            addCriterion("tenantId =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Long value) {
            addCriterion("tenantId <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Long value) {
            addCriterion("tenantId >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Long value) {
            addCriterion("tenantId >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Long value) {
            addCriterion("tenantId <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Long value) {
            addCriterion("tenantId <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Long> values) {
            addCriterion("tenantId in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Long> values) {
            addCriterion("tenantId not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Long value1, Long value2) {
            addCriterion("tenantId between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Long value1, Long value2) {
            addCriterion("tenantId not between", value1, value2, "tenantid");
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

        public Criteria andDescinfoIsNull() {
            addCriterion("descInfo is null");
            return (Criteria) this;
        }

        public Criteria andDescinfoIsNotNull() {
            addCriterion("descInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDescinfoEqualTo(String value) {
            addCriterion("descInfo =", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoNotEqualTo(String value) {
            addCriterion("descInfo <>", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoGreaterThan(String value) {
            addCriterion("descInfo >", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoGreaterThanOrEqualTo(String value) {
            addCriterion("descInfo >=", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoLessThan(String value) {
            addCriterion("descInfo <", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoLessThanOrEqualTo(String value) {
            addCriterion("descInfo <=", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoLike(String value) {
            addCriterion("descInfo like", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoNotLike(String value) {
            addCriterion("descInfo not like", value, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoIn(List<String> values) {
            addCriterion("descInfo in", values, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoNotIn(List<String> values) {
            addCriterion("descInfo not in", values, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoBetween(String value1, String value2) {
            addCriterion("descInfo between", value1, value2, "descinfo");
            return (Criteria) this;
        }

        public Criteria andDescinfoNotBetween(String value1, String value2) {
            addCriterion("descInfo not between", value1, value2, "descinfo");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate not between", value1, value2, "enddate");
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

        public Criteria andIshistoryIsNull() {
            addCriterion("isHistory is null");
            return (Criteria) this;
        }

        public Criteria andIshistoryIsNotNull() {
            addCriterion("isHistory is not null");
            return (Criteria) this;
        }

        public Criteria andIshistoryEqualTo(String value) {
            addCriterion("isHistory =", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotEqualTo(String value) {
            addCriterion("isHistory <>", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThan(String value) {
            addCriterion("isHistory >", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThanOrEqualTo(String value) {
            addCriterion("isHistory >=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThan(String value) {
            addCriterion("isHistory <", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThanOrEqualTo(String value) {
            addCriterion("isHistory <=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLike(String value) {
            addCriterion("isHistory like", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotLike(String value) {
            addCriterion("isHistory not like", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryIn(List<String> values) {
            addCriterion("isHistory in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotIn(List<String> values) {
            addCriterion("isHistory not in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryBetween(String value1, String value2) {
            addCriterion("isHistory between", value1, value2, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotBetween(String value1, String value2) {
            addCriterion("isHistory not between", value1, value2, "ishistory");
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