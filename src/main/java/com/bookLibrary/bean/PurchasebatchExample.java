package com.bookLibrary.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchasebatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchasebatchExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andPbTimeIsNull() {
            addCriterion("pb_time is null");
            return (Criteria) this;
        }

        public Criteria andPbTimeIsNotNull() {
            addCriterion("pb_time is not null");
            return (Criteria) this;
        }

        public Criteria andPbTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pb_time =", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pb_time <>", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pb_time >", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pb_time >=", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeLessThan(Date value) {
            addCriterionForJDBCDate("pb_time <", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pb_time <=", value, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pb_time in", values, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pb_time not in", values, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pb_time between", value1, value2, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pb_time not between", value1, value2, "pbTime");
            return (Criteria) this;
        }

        public Criteria andPbNotesIsNull() {
            addCriterion("pb_notes is null");
            return (Criteria) this;
        }

        public Criteria andPbNotesIsNotNull() {
            addCriterion("pb_notes is not null");
            return (Criteria) this;
        }

        public Criteria andPbNotesEqualTo(String value) {
            addCriterion("pb_notes =", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesNotEqualTo(String value) {
            addCriterion("pb_notes <>", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesGreaterThan(String value) {
            addCriterion("pb_notes >", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesGreaterThanOrEqualTo(String value) {
            addCriterion("pb_notes >=", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesLessThan(String value) {
            addCriterion("pb_notes <", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesLessThanOrEqualTo(String value) {
            addCriterion("pb_notes <=", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesLike(String value) {
            addCriterion("pb_notes like", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesNotLike(String value) {
            addCriterion("pb_notes not like", value, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesIn(List<String> values) {
            addCriterion("pb_notes in", values, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesNotIn(List<String> values) {
            addCriterion("pb_notes not in", values, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesBetween(String value1, String value2) {
            addCriterion("pb_notes between", value1, value2, "pbNotes");
            return (Criteria) this;
        }

        public Criteria andPbNotesNotBetween(String value1, String value2) {
            addCriterion("pb_notes not between", value1, value2, "pbNotes");
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