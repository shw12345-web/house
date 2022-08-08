package com.yunzhu.house.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomareaIsNull() {
            addCriterion("roomArea is null");
            return (Criteria) this;
        }

        public Criteria andRoomareaIsNotNull() {
            addCriterion("roomArea is not null");
            return (Criteria) this;
        }

        public Criteria andRoomareaEqualTo(String value) {
            addCriterion("roomArea =", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaNotEqualTo(String value) {
            addCriterion("roomArea <>", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaGreaterThan(String value) {
            addCriterion("roomArea >", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaGreaterThanOrEqualTo(String value) {
            addCriterion("roomArea >=", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaLessThan(String value) {
            addCriterion("roomArea <", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaLessThanOrEqualTo(String value) {
            addCriterion("roomArea <=", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaLike(String value) {
            addCriterion("roomArea like", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaNotLike(String value) {
            addCriterion("roomArea not like", value, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaIn(List<String> values) {
            addCriterion("roomArea in", values, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaNotIn(List<String> values) {
            addCriterion("roomArea not in", values, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaBetween(String value1, String value2) {
            addCriterion("roomArea between", value1, value2, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomareaNotBetween(String value1, String value2) {
            addCriterion("roomArea not between", value1, value2, "roomarea");
            return (Criteria) this;
        }

        public Criteria andRoomdescIsNull() {
            addCriterion("roomDesc is null");
            return (Criteria) this;
        }

        public Criteria andRoomdescIsNotNull() {
            addCriterion("roomDesc is not null");
            return (Criteria) this;
        }

        public Criteria andRoomdescEqualTo(String value) {
            addCriterion("roomDesc =", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescNotEqualTo(String value) {
            addCriterion("roomDesc <>", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescGreaterThan(String value) {
            addCriterion("roomDesc >", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescGreaterThanOrEqualTo(String value) {
            addCriterion("roomDesc >=", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescLessThan(String value) {
            addCriterion("roomDesc <", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescLessThanOrEqualTo(String value) {
            addCriterion("roomDesc <=", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescLike(String value) {
            addCriterion("roomDesc like", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescNotLike(String value) {
            addCriterion("roomDesc not like", value, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescIn(List<String> values) {
            addCriterion("roomDesc in", values, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescNotIn(List<String> values) {
            addCriterion("roomDesc not in", values, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescBetween(String value1, String value2) {
            addCriterion("roomDesc between", value1, value2, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomdescNotBetween(String value1, String value2) {
            addCriterion("roomDesc not between", value1, value2, "roomdesc");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeIsNull() {
            addCriterion("roomTwoDimensionalCode is null");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeIsNotNull() {
            addCriterion("roomTwoDimensionalCode is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeEqualTo(String value) {
            addCriterion("roomTwoDimensionalCode =", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeNotEqualTo(String value) {
            addCriterion("roomTwoDimensionalCode <>", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeGreaterThan(String value) {
            addCriterion("roomTwoDimensionalCode >", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("roomTwoDimensionalCode >=", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeLessThan(String value) {
            addCriterion("roomTwoDimensionalCode <", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeLessThanOrEqualTo(String value) {
            addCriterion("roomTwoDimensionalCode <=", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeLike(String value) {
            addCriterion("roomTwoDimensionalCode like", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeNotLike(String value) {
            addCriterion("roomTwoDimensionalCode not like", value, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeIn(List<String> values) {
            addCriterion("roomTwoDimensionalCode in", values, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeNotIn(List<String> values) {
            addCriterion("roomTwoDimensionalCode not in", values, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeBetween(String value1, String value2) {
            addCriterion("roomTwoDimensionalCode between", value1, value2, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomtwodimensionalcodeNotBetween(String value1, String value2) {
            addCriterion("roomTwoDimensionalCode not between", value1, value2, "roomtwodimensionalcode");
            return (Criteria) this;
        }

        public Criteria andRoomimageIsNull() {
            addCriterion("roomImage is null");
            return (Criteria) this;
        }

        public Criteria andRoomimageIsNotNull() {
            addCriterion("roomImage is not null");
            return (Criteria) this;
        }

        public Criteria andRoomimageEqualTo(String value) {
            addCriterion("roomImage =", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotEqualTo(String value) {
            addCriterion("roomImage <>", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageGreaterThan(String value) {
            addCriterion("roomImage >", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageGreaterThanOrEqualTo(String value) {
            addCriterion("roomImage >=", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLessThan(String value) {
            addCriterion("roomImage <", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLessThanOrEqualTo(String value) {
            addCriterion("roomImage <=", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLike(String value) {
            addCriterion("roomImage like", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotLike(String value) {
            addCriterion("roomImage not like", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageIn(List<String> values) {
            addCriterion("roomImage in", values, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotIn(List<String> values) {
            addCriterion("roomImage not in", values, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageBetween(String value1, String value2) {
            addCriterion("roomImage between", value1, value2, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotBetween(String value1, String value2) {
            addCriterion("roomImage not between", value1, value2, "roomimage");
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