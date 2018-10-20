package com.bookLibrary.bean;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIsNull() {
            addCriterion("isbn_id is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIsNotNull() {
            addCriterion("isbn_id is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnIdEqualTo(Integer value) {
            addCriterion("isbn_id =", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotEqualTo(Integer value) {
            addCriterion("isbn_id <>", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdGreaterThan(Integer value) {
            addCriterion("isbn_id >", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("isbn_id >=", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdLessThan(Integer value) {
            addCriterion("isbn_id <", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdLessThanOrEqualTo(Integer value) {
            addCriterion("isbn_id <=", value, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdIn(List<Integer> values) {
            addCriterion("isbn_id in", values, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotIn(List<Integer> values) {
            addCriterion("isbn_id not in", values, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdBetween(Integer value1, Integer value2) {
            addCriterion("isbn_id between", value1, value2, "isbnId");
            return (Criteria) this;
        }

        public Criteria andIsbnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("isbn_id not between", value1, value2, "isbnId");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNull() {
            addCriterion("pb_id is null");
            return (Criteria) this;
        }

        public Criteria andPbIdIsNotNull() {
            addCriterion("pb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPbIdEqualTo(Integer value) {
            addCriterion("pb_id =", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotEqualTo(Integer value) {
            addCriterion("pb_id <>", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThan(Integer value) {
            addCriterion("pb_id >", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pb_id >=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThan(Integer value) {
            addCriterion("pb_id <", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdLessThanOrEqualTo(Integer value) {
            addCriterion("pb_id <=", value, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdIn(List<Integer> values) {
            addCriterion("pb_id in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotIn(List<Integer> values) {
            addCriterion("pb_id not in", values, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdBetween(Integer value1, Integer value2) {
            addCriterion("pb_id between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andPbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pb_id not between", value1, value2, "pbId");
            return (Criteria) this;
        }

        public Criteria andSStateIsNull() {
            addCriterion("s_state is null");
            return (Criteria) this;
        }

        public Criteria andSStateIsNotNull() {
            addCriterion("s_state is not null");
            return (Criteria) this;
        }

        public Criteria andSStateEqualTo(Integer value) {
            addCriterion("s_state =", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotEqualTo(Integer value) {
            addCriterion("s_state <>", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThan(Integer value) {
            addCriterion("s_state >", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_state >=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThan(Integer value) {
            addCriterion("s_state <", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThanOrEqualTo(Integer value) {
            addCriterion("s_state <=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateIn(List<Integer> values) {
            addCriterion("s_state in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotIn(List<Integer> values) {
            addCriterion("s_state not in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateBetween(Integer value1, Integer value2) {
            addCriterion("s_state between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotBetween(Integer value1, Integer value2) {
            addCriterion("s_state not between", value1, value2, "sState");
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