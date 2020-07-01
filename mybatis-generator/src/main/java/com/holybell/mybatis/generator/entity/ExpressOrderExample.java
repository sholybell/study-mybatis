package com.holybell.mybatis.generator.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpressOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpressOrderExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Integer value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Integer value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Integer value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Integer value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Integer> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Integer> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Integer value1, Integer value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNull() {
            addCriterion("bill_no is null");
            return (Criteria) this;
        }

        public Criteria andBillNoIsNotNull() {
            addCriterion("bill_no is not null");
            return (Criteria) this;
        }

        public Criteria andBillNoEqualTo(String value) {
            addCriterion("bill_no =", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotEqualTo(String value) {
            addCriterion("bill_no <>", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThan(String value) {
            addCriterion("bill_no >", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("bill_no >=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThan(String value) {
            addCriterion("bill_no <", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLessThanOrEqualTo(String value) {
            addCriterion("bill_no <=", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoLike(String value) {
            addCriterion("bill_no like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotLike(String value) {
            addCriterion("bill_no not like", value, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoIn(List<String> values) {
            addCriterion("bill_no in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotIn(List<String> values) {
            addCriterion("bill_no not in", values, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoBetween(String value1, String value2) {
            addCriterion("bill_no between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andBillNoNotBetween(String value1, String value2) {
            addCriterion("bill_no not between", value1, value2, "billNo");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightIsNull() {
            addCriterion("adjust_weight is null");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightIsNotNull() {
            addCriterion("adjust_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightEqualTo(BigDecimal value) {
            addCriterion("adjust_weight =", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightNotEqualTo(BigDecimal value) {
            addCriterion("adjust_weight <>", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightGreaterThan(BigDecimal value) {
            addCriterion("adjust_weight >", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjust_weight >=", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightLessThan(BigDecimal value) {
            addCriterion("adjust_weight <", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjust_weight <=", value, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightIn(List<BigDecimal> values) {
            addCriterion("adjust_weight in", values, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightNotIn(List<BigDecimal> values) {
            addCriterion("adjust_weight not in", values, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjust_weight between", value1, value2, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andAdjustWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjust_weight not between", value1, value2, "adjustWeight");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNull() {
            addCriterion("identity_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIsNotNull() {
            addCriterion("identity_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNoEqualTo(String value) {
            addCriterion("identity_no =", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotEqualTo(String value) {
            addCriterion("identity_no <>", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThan(String value) {
            addCriterion("identity_no >", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("identity_no >=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThan(String value) {
            addCriterion("identity_no <", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("identity_no <=", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoLike(String value) {
            addCriterion("identity_no like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotLike(String value) {
            addCriterion("identity_no not like", value, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoIn(List<String> values) {
            addCriterion("identity_no in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotIn(List<String> values) {
            addCriterion("identity_no not in", values, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoBetween(String value1, String value2) {
            addCriterion("identity_no between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andIdentityNoNotBetween(String value1, String value2) {
            addCriterion("identity_no not between", value1, value2, "identityNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIsNull() {
            addCriterion("sender_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIsNotNull() {
            addCriterion("sender_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSenderMobileEqualTo(String value) {
            addCriterion("sender_mobile =", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotEqualTo(String value) {
            addCriterion("sender_mobile <>", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileGreaterThan(String value) {
            addCriterion("sender_mobile >", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileGreaterThanOrEqualTo(String value) {
            addCriterion("sender_mobile >=", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLessThan(String value) {
            addCriterion("sender_mobile <", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLessThanOrEqualTo(String value) {
            addCriterion("sender_mobile <=", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileLike(String value) {
            addCriterion("sender_mobile like", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotLike(String value) {
            addCriterion("sender_mobile not like", value, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileIn(List<String> values) {
            addCriterion("sender_mobile in", values, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotIn(List<String> values) {
            addCriterion("sender_mobile not in", values, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileBetween(String value1, String value2) {
            addCriterion("sender_mobile between", value1, value2, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderMobileNotBetween(String value1, String value2) {
            addCriterion("sender_mobile not between", value1, value2, "senderMobile");
            return (Criteria) this;
        }

        public Criteria andSenderProvIsNull() {
            addCriterion("sender_prov is null");
            return (Criteria) this;
        }

        public Criteria andSenderProvIsNotNull() {
            addCriterion("sender_prov is not null");
            return (Criteria) this;
        }

        public Criteria andSenderProvEqualTo(String value) {
            addCriterion("sender_prov =", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvNotEqualTo(String value) {
            addCriterion("sender_prov <>", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvGreaterThan(String value) {
            addCriterion("sender_prov >", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvGreaterThanOrEqualTo(String value) {
            addCriterion("sender_prov >=", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvLessThan(String value) {
            addCriterion("sender_prov <", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvLessThanOrEqualTo(String value) {
            addCriterion("sender_prov <=", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvLike(String value) {
            addCriterion("sender_prov like", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvNotLike(String value) {
            addCriterion("sender_prov not like", value, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvIn(List<String> values) {
            addCriterion("sender_prov in", values, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvNotIn(List<String> values) {
            addCriterion("sender_prov not in", values, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvBetween(String value1, String value2) {
            addCriterion("sender_prov between", value1, value2, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderProvNotBetween(String value1, String value2) {
            addCriterion("sender_prov not between", value1, value2, "senderProv");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNull() {
            addCriterion("sender_city is null");
            return (Criteria) this;
        }

        public Criteria andSenderCityIsNotNull() {
            addCriterion("sender_city is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCityEqualTo(String value) {
            addCriterion("sender_city =", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotEqualTo(String value) {
            addCriterion("sender_city <>", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThan(String value) {
            addCriterion("sender_city >", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityGreaterThanOrEqualTo(String value) {
            addCriterion("sender_city >=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThan(String value) {
            addCriterion("sender_city <", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLessThanOrEqualTo(String value) {
            addCriterion("sender_city <=", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityLike(String value) {
            addCriterion("sender_city like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotLike(String value) {
            addCriterion("sender_city not like", value, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityIn(List<String> values) {
            addCriterion("sender_city in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotIn(List<String> values) {
            addCriterion("sender_city not in", values, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityBetween(String value1, String value2) {
            addCriterion("sender_city between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCityNotBetween(String value1, String value2) {
            addCriterion("sender_city not between", value1, value2, "senderCity");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIsNull() {
            addCriterion("sender_county is null");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIsNotNull() {
            addCriterion("sender_county is not null");
            return (Criteria) this;
        }

        public Criteria andSenderCountyEqualTo(String value) {
            addCriterion("sender_county =", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotEqualTo(String value) {
            addCriterion("sender_county <>", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyGreaterThan(String value) {
            addCriterion("sender_county >", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyGreaterThanOrEqualTo(String value) {
            addCriterion("sender_county >=", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLessThan(String value) {
            addCriterion("sender_county <", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLessThanOrEqualTo(String value) {
            addCriterion("sender_county <=", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyLike(String value) {
            addCriterion("sender_county like", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotLike(String value) {
            addCriterion("sender_county not like", value, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyIn(List<String> values) {
            addCriterion("sender_county in", values, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotIn(List<String> values) {
            addCriterion("sender_county not in", values, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyBetween(String value1, String value2) {
            addCriterion("sender_county between", value1, value2, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderCountyNotBetween(String value1, String value2) {
            addCriterion("sender_county not between", value1, value2, "senderCounty");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverProvIsNull() {
            addCriterion("receiver_prov is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvIsNotNull() {
            addCriterion("receiver_prov is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvEqualTo(String value) {
            addCriterion("receiver_prov =", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvNotEqualTo(String value) {
            addCriterion("receiver_prov <>", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvGreaterThan(String value) {
            addCriterion("receiver_prov >", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_prov >=", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvLessThan(String value) {
            addCriterion("receiver_prov <", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvLessThanOrEqualTo(String value) {
            addCriterion("receiver_prov <=", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvLike(String value) {
            addCriterion("receiver_prov like", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvNotLike(String value) {
            addCriterion("receiver_prov not like", value, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvIn(List<String> values) {
            addCriterion("receiver_prov in", values, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvNotIn(List<String> values) {
            addCriterion("receiver_prov not in", values, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvBetween(String value1, String value2) {
            addCriterion("receiver_prov between", value1, value2, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverProvNotBetween(String value1, String value2) {
            addCriterion("receiver_prov not between", value1, value2, "receiverProv");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNull() {
            addCriterion("receiver_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIsNotNull() {
            addCriterion("receiver_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCityEqualTo(String value) {
            addCriterion("receiver_city =", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotEqualTo(String value) {
            addCriterion("receiver_city <>", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThan(String value) {
            addCriterion("receiver_city >", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_city >=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThan(String value) {
            addCriterion("receiver_city <", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLessThanOrEqualTo(String value) {
            addCriterion("receiver_city <=", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityLike(String value) {
            addCriterion("receiver_city like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotLike(String value) {
            addCriterion("receiver_city not like", value, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityIn(List<String> values) {
            addCriterion("receiver_city in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotIn(List<String> values) {
            addCriterion("receiver_city not in", values, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityBetween(String value1, String value2) {
            addCriterion("receiver_city between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCityNotBetween(String value1, String value2) {
            addCriterion("receiver_city not between", value1, value2, "receiverCity");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyIsNull() {
            addCriterion("receiver_county is null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyIsNotNull() {
            addCriterion("receiver_county is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyEqualTo(String value) {
            addCriterion("receiver_county =", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyNotEqualTo(String value) {
            addCriterion("receiver_county <>", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyGreaterThan(String value) {
            addCriterion("receiver_county >", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_county >=", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyLessThan(String value) {
            addCriterion("receiver_county <", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyLessThanOrEqualTo(String value) {
            addCriterion("receiver_county <=", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyLike(String value) {
            addCriterion("receiver_county like", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyNotLike(String value) {
            addCriterion("receiver_county not like", value, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyIn(List<String> values) {
            addCriterion("receiver_county in", values, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyNotIn(List<String> values) {
            addCriterion("receiver_county not in", values, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyBetween(String value1, String value2) {
            addCriterion("receiver_county between", value1, value2, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverCountyNotBetween(String value1, String value2) {
            addCriterion("receiver_county not between", value1, value2, "receiverCounty");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoIsNull() {
            addCriterion("original_express_no is null");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoIsNotNull() {
            addCriterion("original_express_no is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoEqualTo(String value) {
            addCriterion("original_express_no =", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoNotEqualTo(String value) {
            addCriterion("original_express_no <>", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoGreaterThan(String value) {
            addCriterion("original_express_no >", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("original_express_no >=", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoLessThan(String value) {
            addCriterion("original_express_no <", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoLessThanOrEqualTo(String value) {
            addCriterion("original_express_no <=", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoLike(String value) {
            addCriterion("original_express_no like", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoNotLike(String value) {
            addCriterion("original_express_no not like", value, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoIn(List<String> values) {
            addCriterion("original_express_no in", values, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoNotIn(List<String> values) {
            addCriterion("original_express_no not in", values, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoBetween(String value1, String value2) {
            addCriterion("original_express_no between", value1, value2, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andOriginalExpressNoNotBetween(String value1, String value2) {
            addCriterion("original_express_no not between", value1, value2, "originalExpressNo");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeIsNull() {
            addCriterion("first_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeIsNotNull() {
            addCriterion("first_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeEqualTo(Date value) {
            addCriterion("first_arrive_time =", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeNotEqualTo(Date value) {
            addCriterion("first_arrive_time <>", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeGreaterThan(Date value) {
            addCriterion("first_arrive_time >", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_arrive_time >=", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeLessThan(Date value) {
            addCriterion("first_arrive_time <", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_arrive_time <=", value, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeIn(List<Date> values) {
            addCriterion("first_arrive_time in", values, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeNotIn(List<Date> values) {
            addCriterion("first_arrive_time not in", values, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeBetween(Date value1, Date value2) {
            addCriterion("first_arrive_time between", value1, value2, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andFirstArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_arrive_time not between", value1, value2, "firstArriveTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNull() {
            addCriterion("rec_time is null");
            return (Criteria) this;
        }

        public Criteria andRecTimeIsNotNull() {
            addCriterion("rec_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecTimeEqualTo(Date value) {
            addCriterion("rec_time =", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotEqualTo(Date value) {
            addCriterion("rec_time <>", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThan(Date value) {
            addCriterion("rec_time >", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rec_time >=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThan(Date value) {
            addCriterion("rec_time <", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeLessThanOrEqualTo(Date value) {
            addCriterion("rec_time <=", value, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeIn(List<Date> values) {
            addCriterion("rec_time in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotIn(List<Date> values) {
            addCriterion("rec_time not in", values, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeBetween(Date value1, Date value2) {
            addCriterion("rec_time between", value1, value2, "recTime");
            return (Criteria) this;
        }

        public Criteria andRecTimeNotBetween(Date value1, Date value2) {
            addCriterion("rec_time not between", value1, value2, "recTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Byte value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Byte value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Byte value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Byte value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Byte value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Byte> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Byte> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andCargoTypeIsNull() {
            addCriterion("cargo_type is null");
            return (Criteria) this;
        }

        public Criteria andCargoTypeIsNotNull() {
            addCriterion("cargo_type is not null");
            return (Criteria) this;
        }

        public Criteria andCargoTypeEqualTo(String value) {
            addCriterion("cargo_type =", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeNotEqualTo(String value) {
            addCriterion("cargo_type <>", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeGreaterThan(String value) {
            addCriterion("cargo_type >", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_type >=", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeLessThan(String value) {
            addCriterion("cargo_type <", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeLessThanOrEqualTo(String value) {
            addCriterion("cargo_type <=", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeLike(String value) {
            addCriterion("cargo_type like", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeNotLike(String value) {
            addCriterion("cargo_type not like", value, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeIn(List<String> values) {
            addCriterion("cargo_type in", values, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeNotIn(List<String> values) {
            addCriterion("cargo_type not in", values, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeBetween(String value1, String value2) {
            addCriterion("cargo_type between", value1, value2, "cargoType");
            return (Criteria) this;
        }

        public Criteria andCargoTypeNotBetween(String value1, String value2) {
            addCriterion("cargo_type not between", value1, value2, "cargoType");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNull() {
            addCriterion("is_return is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNotNull() {
            addCriterion("is_return is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnEqualTo(Boolean value) {
            addCriterion("is_return =", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotEqualTo(Boolean value) {
            addCriterion("is_return <>", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThan(Boolean value) {
            addCriterion("is_return >", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_return >=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThan(Boolean value) {
            addCriterion("is_return <", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThanOrEqualTo(Boolean value) {
            addCriterion("is_return <=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnIn(List<Boolean> values) {
            addCriterion("is_return in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotIn(List<Boolean> values) {
            addCriterion("is_return not in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnBetween(Boolean value1, Boolean value2) {
            addCriterion("is_return between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_return not between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Boolean value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Boolean value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Boolean value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Boolean value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Boolean> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Boolean> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andInitFeeIsNull() {
            addCriterion("init_fee is null");
            return (Criteria) this;
        }

        public Criteria andInitFeeIsNotNull() {
            addCriterion("init_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInitFeeEqualTo(BigDecimal value) {
            addCriterion("init_fee =", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeNotEqualTo(BigDecimal value) {
            addCriterion("init_fee <>", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeGreaterThan(BigDecimal value) {
            addCriterion("init_fee >", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("init_fee >=", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeLessThan(BigDecimal value) {
            addCriterion("init_fee <", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("init_fee <=", value, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeIn(List<BigDecimal> values) {
            addCriterion("init_fee in", values, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeNotIn(List<BigDecimal> values) {
            addCriterion("init_fee not in", values, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_fee between", value1, value2, "initFee");
            return (Criteria) this;
        }

        public Criteria andInitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("init_fee not between", value1, value2, "initFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNull() {
            addCriterion("paid_fee is null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNotNull() {
            addCriterion("paid_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeEqualTo(BigDecimal value) {
            addCriterion("paid_fee =", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotEqualTo(BigDecimal value) {
            addCriterion("paid_fee <>", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThan(BigDecimal value) {
            addCriterion("paid_fee >", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_fee >=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThan(BigDecimal value) {
            addCriterion("paid_fee <", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_fee <=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIn(List<BigDecimal> values) {
            addCriterion("paid_fee in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotIn(List<BigDecimal> values) {
            addCriterion("paid_fee not in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_fee between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_fee not between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeIsNull() {
            addCriterion("repay_fee is null");
            return (Criteria) this;
        }

        public Criteria andRepayFeeIsNotNull() {
            addCriterion("repay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRepayFeeEqualTo(BigDecimal value) {
            addCriterion("repay_fee =", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeNotEqualTo(BigDecimal value) {
            addCriterion("repay_fee <>", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeGreaterThan(BigDecimal value) {
            addCriterion("repay_fee >", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_fee >=", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeLessThan(BigDecimal value) {
            addCriterion("repay_fee <", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_fee <=", value, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeIn(List<BigDecimal> values) {
            addCriterion("repay_fee in", values, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeNotIn(List<BigDecimal> values) {
            addCriterion("repay_fee not in", values, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_fee between", value1, value2, "repayFee");
            return (Criteria) this;
        }

        public Criteria andRepayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_fee not between", value1, value2, "repayFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeIsNull() {
            addCriterion("final_fee is null");
            return (Criteria) this;
        }

        public Criteria andFinalFeeIsNotNull() {
            addCriterion("final_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFinalFeeEqualTo(BigDecimal value) {
            addCriterion("final_fee =", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeNotEqualTo(BigDecimal value) {
            addCriterion("final_fee <>", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeGreaterThan(BigDecimal value) {
            addCriterion("final_fee >", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_fee >=", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeLessThan(BigDecimal value) {
            addCriterion("final_fee <", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_fee <=", value, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeIn(List<BigDecimal> values) {
            addCriterion("final_fee in", values, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeNotIn(List<BigDecimal> values) {
            addCriterion("final_fee not in", values, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_fee between", value1, value2, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_fee not between", value1, value2, "finalFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeIsNull() {
            addCriterion("final_paid_fee is null");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeIsNotNull() {
            addCriterion("final_paid_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeEqualTo(BigDecimal value) {
            addCriterion("final_paid_fee =", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeNotEqualTo(BigDecimal value) {
            addCriterion("final_paid_fee <>", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeGreaterThan(BigDecimal value) {
            addCriterion("final_paid_fee >", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_paid_fee >=", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeLessThan(BigDecimal value) {
            addCriterion("final_paid_fee <", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_paid_fee <=", value, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeIn(List<BigDecimal> values) {
            addCriterion("final_paid_fee in", values, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeNotIn(List<BigDecimal> values) {
            addCriterion("final_paid_fee not in", values, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_paid_fee between", value1, value2, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andFinalPaidFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_paid_fee not between", value1, value2, "finalPaidFee");
            return (Criteria) this;
        }

        public Criteria andIsRepayIsNull() {
            addCriterion("is_repay is null");
            return (Criteria) this;
        }

        public Criteria andIsRepayIsNotNull() {
            addCriterion("is_repay is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepayEqualTo(Boolean value) {
            addCriterion("is_repay =", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotEqualTo(Boolean value) {
            addCriterion("is_repay <>", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayGreaterThan(Boolean value) {
            addCriterion("is_repay >", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_repay >=", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayLessThan(Boolean value) {
            addCriterion("is_repay <", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_repay <=", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayIn(List<Boolean> values) {
            addCriterion("is_repay in", values, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotIn(List<Boolean> values) {
            addCriterion("is_repay not in", values, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repay between", value1, value2, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repay not between", value1, value2, "isRepay");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andImg1IsNull() {
            addCriterion("img1 is null");
            return (Criteria) this;
        }

        public Criteria andImg1IsNotNull() {
            addCriterion("img1 is not null");
            return (Criteria) this;
        }

        public Criteria andImg1EqualTo(String value) {
            addCriterion("img1 =", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1NotEqualTo(String value) {
            addCriterion("img1 <>", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1GreaterThan(String value) {
            addCriterion("img1 >", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1GreaterThanOrEqualTo(String value) {
            addCriterion("img1 >=", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1LessThan(String value) {
            addCriterion("img1 <", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1LessThanOrEqualTo(String value) {
            addCriterion("img1 <=", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1Like(String value) {
            addCriterion("img1 like", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1NotLike(String value) {
            addCriterion("img1 not like", value, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1In(List<String> values) {
            addCriterion("img1 in", values, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1NotIn(List<String> values) {
            addCriterion("img1 not in", values, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1Between(String value1, String value2) {
            addCriterion("img1 between", value1, value2, "img1");
            return (Criteria) this;
        }

        public Criteria andImg1NotBetween(String value1, String value2) {
            addCriterion("img1 not between", value1, value2, "img1");
            return (Criteria) this;
        }

        public Criteria andImg2IsNull() {
            addCriterion("img2 is null");
            return (Criteria) this;
        }

        public Criteria andImg2IsNotNull() {
            addCriterion("img2 is not null");
            return (Criteria) this;
        }

        public Criteria andImg2EqualTo(String value) {
            addCriterion("img2 =", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2NotEqualTo(String value) {
            addCriterion("img2 <>", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2GreaterThan(String value) {
            addCriterion("img2 >", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2GreaterThanOrEqualTo(String value) {
            addCriterion("img2 >=", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2LessThan(String value) {
            addCriterion("img2 <", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2LessThanOrEqualTo(String value) {
            addCriterion("img2 <=", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2Like(String value) {
            addCriterion("img2 like", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2NotLike(String value) {
            addCriterion("img2 not like", value, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2In(List<String> values) {
            addCriterion("img2 in", values, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2NotIn(List<String> values) {
            addCriterion("img2 not in", values, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2Between(String value1, String value2) {
            addCriterion("img2 between", value1, value2, "img2");
            return (Criteria) this;
        }

        public Criteria andImg2NotBetween(String value1, String value2) {
            addCriterion("img2 not between", value1, value2, "img2");
            return (Criteria) this;
        }

        public Criteria andImg3IsNull() {
            addCriterion("img3 is null");
            return (Criteria) this;
        }

        public Criteria andImg3IsNotNull() {
            addCriterion("img3 is not null");
            return (Criteria) this;
        }

        public Criteria andImg3EqualTo(String value) {
            addCriterion("img3 =", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3NotEqualTo(String value) {
            addCriterion("img3 <>", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3GreaterThan(String value) {
            addCriterion("img3 >", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3GreaterThanOrEqualTo(String value) {
            addCriterion("img3 >=", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3LessThan(String value) {
            addCriterion("img3 <", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3LessThanOrEqualTo(String value) {
            addCriterion("img3 <=", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3Like(String value) {
            addCriterion("img3 like", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3NotLike(String value) {
            addCriterion("img3 not like", value, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3In(List<String> values) {
            addCriterion("img3 in", values, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3NotIn(List<String> values) {
            addCriterion("img3 not in", values, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3Between(String value1, String value2) {
            addCriterion("img3 between", value1, value2, "img3");
            return (Criteria) this;
        }

        public Criteria andImg3NotBetween(String value1, String value2) {
            addCriterion("img3 not between", value1, value2, "img3");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andIsMembershipIsNull() {
            addCriterion("is_membership is null");
            return (Criteria) this;
        }

        public Criteria andIsMembershipIsNotNull() {
            addCriterion("is_membership is not null");
            return (Criteria) this;
        }

        public Criteria andIsMembershipEqualTo(Boolean value) {
            addCriterion("is_membership =", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipNotEqualTo(Boolean value) {
            addCriterion("is_membership <>", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipGreaterThan(Boolean value) {
            addCriterion("is_membership >", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_membership >=", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipLessThan(Boolean value) {
            addCriterion("is_membership <", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipLessThanOrEqualTo(Boolean value) {
            addCriterion("is_membership <=", value, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipIn(List<Boolean> values) {
            addCriterion("is_membership in", values, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipNotIn(List<Boolean> values) {
            addCriterion("is_membership not in", values, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipBetween(Boolean value1, Boolean value2) {
            addCriterion("is_membership between", value1, value2, "isMembership");
            return (Criteria) this;
        }

        public Criteria andIsMembershipNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_membership not between", value1, value2, "isMembership");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeIsNull() {
            addCriterion("urge_time is null");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeIsNotNull() {
            addCriterion("urge_time is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeEqualTo(Integer value) {
            addCriterion("urge_time =", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeNotEqualTo(Integer value) {
            addCriterion("urge_time <>", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeGreaterThan(Integer value) {
            addCriterion("urge_time >", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("urge_time >=", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeLessThan(Integer value) {
            addCriterion("urge_time <", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("urge_time <=", value, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeIn(List<Integer> values) {
            addCriterion("urge_time in", values, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeNotIn(List<Integer> values) {
            addCriterion("urge_time not in", values, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeBetween(Integer value1, Integer value2) {
            addCriterion("urge_time between", value1, value2, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andUrgeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("urge_time not between", value1, value2, "urgeTime");
            return (Criteria) this;
        }

        public Criteria andShanghuIdIsNull() {
            addCriterion("shanghu_id is null");
            return (Criteria) this;
        }

        public Criteria andShanghuIdIsNotNull() {
            addCriterion("shanghu_id is not null");
            return (Criteria) this;
        }

        public Criteria andShanghuIdEqualTo(Integer value) {
            addCriterion("shanghu_id =", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdNotEqualTo(Integer value) {
            addCriterion("shanghu_id <>", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdGreaterThan(Integer value) {
            addCriterion("shanghu_id >", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shanghu_id >=", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdLessThan(Integer value) {
            addCriterion("shanghu_id <", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdLessThanOrEqualTo(Integer value) {
            addCriterion("shanghu_id <=", value, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdIn(List<Integer> values) {
            addCriterion("shanghu_id in", values, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdNotIn(List<Integer> values) {
            addCriterion("shanghu_id not in", values, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdBetween(Integer value1, Integer value2) {
            addCriterion("shanghu_id between", value1, value2, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andShanghuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shanghu_id not between", value1, value2, "shanghuId");
            return (Criteria) this;
        }

        public Criteria andCanCommissionIsNull() {
            addCriterion("can_commission is null");
            return (Criteria) this;
        }

        public Criteria andCanCommissionIsNotNull() {
            addCriterion("can_commission is not null");
            return (Criteria) this;
        }

        public Criteria andCanCommissionEqualTo(Byte value) {
            addCriterion("can_commission =", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionNotEqualTo(Byte value) {
            addCriterion("can_commission <>", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionGreaterThan(Byte value) {
            addCriterion("can_commission >", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionGreaterThanOrEqualTo(Byte value) {
            addCriterion("can_commission >=", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionLessThan(Byte value) {
            addCriterion("can_commission <", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionLessThanOrEqualTo(Byte value) {
            addCriterion("can_commission <=", value, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionIn(List<Byte> values) {
            addCriterion("can_commission in", values, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionNotIn(List<Byte> values) {
            addCriterion("can_commission not in", values, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionBetween(Byte value1, Byte value2) {
            addCriterion("can_commission between", value1, value2, "canCommission");
            return (Criteria) this;
        }

        public Criteria andCanCommissionNotBetween(Byte value1, Byte value2) {
            addCriterion("can_commission not between", value1, value2, "canCommission");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdIsNull() {
            addCriterion("agent_shanghu_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdIsNotNull() {
            addCriterion("agent_shanghu_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdEqualTo(Integer value) {
            addCriterion("agent_shanghu_id =", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdNotEqualTo(Integer value) {
            addCriterion("agent_shanghu_id <>", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdGreaterThan(Integer value) {
            addCriterion("agent_shanghu_id >", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_shanghu_id >=", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdLessThan(Integer value) {
            addCriterion("agent_shanghu_id <", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_shanghu_id <=", value, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdIn(List<Integer> values) {
            addCriterion("agent_shanghu_id in", values, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdNotIn(List<Integer> values) {
            addCriterion("agent_shanghu_id not in", values, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_shanghu_id between", value1, value2, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andAgentShanghuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_shanghu_id not between", value1, value2, "agentShanghuId");
            return (Criteria) this;
        }

        public Criteria andIsArriveIsNull() {
            addCriterion("is_arrive is null");
            return (Criteria) this;
        }

        public Criteria andIsArriveIsNotNull() {
            addCriterion("is_arrive is not null");
            return (Criteria) this;
        }

        public Criteria andIsArriveEqualTo(Byte value) {
            addCriterion("is_arrive =", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveNotEqualTo(Byte value) {
            addCriterion("is_arrive <>", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveGreaterThan(Byte value) {
            addCriterion("is_arrive >", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_arrive >=", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveLessThan(Byte value) {
            addCriterion("is_arrive <", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveLessThanOrEqualTo(Byte value) {
            addCriterion("is_arrive <=", value, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveIn(List<Byte> values) {
            addCriterion("is_arrive in", values, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveNotIn(List<Byte> values) {
            addCriterion("is_arrive not in", values, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveBetween(Byte value1, Byte value2) {
            addCriterion("is_arrive between", value1, value2, "isArrive");
            return (Criteria) this;
        }

        public Criteria andIsArriveNotBetween(Byte value1, Byte value2) {
            addCriterion("is_arrive not between", value1, value2, "isArrive");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlIsNull() {
            addCriterion("arrive_img_url is null");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlIsNotNull() {
            addCriterion("arrive_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlEqualTo(String value) {
            addCriterion("arrive_img_url =", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlNotEqualTo(String value) {
            addCriterion("arrive_img_url <>", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlGreaterThan(String value) {
            addCriterion("arrive_img_url >", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_img_url >=", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlLessThan(String value) {
            addCriterion("arrive_img_url <", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlLessThanOrEqualTo(String value) {
            addCriterion("arrive_img_url <=", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlLike(String value) {
            addCriterion("arrive_img_url like", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlNotLike(String value) {
            addCriterion("arrive_img_url not like", value, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlIn(List<String> values) {
            addCriterion("arrive_img_url in", values, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlNotIn(List<String> values) {
            addCriterion("arrive_img_url not in", values, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlBetween(String value1, String value2) {
            addCriterion("arrive_img_url between", value1, value2, "arriveImgUrl");
            return (Criteria) this;
        }

        public Criteria andArriveImgUrlNotBetween(String value1, String value2) {
            addCriterion("arrive_img_url not between", value1, value2, "arriveImgUrl");
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