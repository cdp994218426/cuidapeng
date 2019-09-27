package com.neu.entity;

import java.util.ArrayList;
import java.util.List;

public class PlateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlateExample() {
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

        public Criteria andPlatenameIsNull() {
            addCriterion("platename is null");
            return (Criteria) this;
        }

        public Criteria andPlatenameIsNotNull() {
            addCriterion("platename is not null");
            return (Criteria) this;
        }

        public Criteria andPlatenameEqualTo(String value) {
            addCriterion("platename =", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameNotEqualTo(String value) {
            addCriterion("platename <>", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameGreaterThan(String value) {
            addCriterion("platename >", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameGreaterThanOrEqualTo(String value) {
            addCriterion("platename >=", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameLessThan(String value) {
            addCriterion("platename <", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameLessThanOrEqualTo(String value) {
            addCriterion("platename <=", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameLike(String value) {
            addCriterion("platename like", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameNotLike(String value) {
            addCriterion("platename not like", value, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameIn(List<String> values) {
            addCriterion("platename in", values, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameNotIn(List<String> values) {
            addCriterion("platename not in", values, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameBetween(String value1, String value2) {
            addCriterion("platename between", value1, value2, "platename");
            return (Criteria) this;
        }

        public Criteria andPlatenameNotBetween(String value1, String value2) {
            addCriterion("platename not between", value1, value2, "platename");
            return (Criteria) this;
        }

        public Criteria andDividIsNull() {
            addCriterion("divid is null");
            return (Criteria) this;
        }

        public Criteria andDividIsNotNull() {
            addCriterion("divid is not null");
            return (Criteria) this;
        }

        public Criteria andDividEqualTo(String value) {
            addCriterion("divid =", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividNotEqualTo(String value) {
            addCriterion("divid <>", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividGreaterThan(String value) {
            addCriterion("divid >", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividGreaterThanOrEqualTo(String value) {
            addCriterion("divid >=", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividLessThan(String value) {
            addCriterion("divid <", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividLessThanOrEqualTo(String value) {
            addCriterion("divid <=", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividLike(String value) {
            addCriterion("divid like", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividNotLike(String value) {
            addCriterion("divid not like", value, "divid");
            return (Criteria) this;
        }

        public Criteria andDividIn(List<String> values) {
            addCriterion("divid in", values, "divid");
            return (Criteria) this;
        }

        public Criteria andDividNotIn(List<String> values) {
            addCriterion("divid not in", values, "divid");
            return (Criteria) this;
        }

        public Criteria andDividBetween(String value1, String value2) {
            addCriterion("divid between", value1, value2, "divid");
            return (Criteria) this;
        }

        public Criteria andDividNotBetween(String value1, String value2) {
            addCriterion("divid not between", value1, value2, "divid");
            return (Criteria) this;
        }

        public Criteria andPlateleaderIsNull() {
            addCriterion("plateleader is null");
            return (Criteria) this;
        }

        public Criteria andPlateleaderIsNotNull() {
            addCriterion("plateleader is not null");
            return (Criteria) this;
        }

        public Criteria andPlateleaderEqualTo(String value) {
            addCriterion("plateleader =", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderNotEqualTo(String value) {
            addCriterion("plateleader <>", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderGreaterThan(String value) {
            addCriterion("plateleader >", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderGreaterThanOrEqualTo(String value) {
            addCriterion("plateleader >=", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderLessThan(String value) {
            addCriterion("plateleader <", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderLessThanOrEqualTo(String value) {
            addCriterion("plateleader <=", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderLike(String value) {
            addCriterion("plateleader like", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderNotLike(String value) {
            addCriterion("plateleader not like", value, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderIn(List<String> values) {
            addCriterion("plateleader in", values, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderNotIn(List<String> values) {
            addCriterion("plateleader not in", values, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderBetween(String value1, String value2) {
            addCriterion("plateleader between", value1, value2, "plateleader");
            return (Criteria) this;
        }

        public Criteria andPlateleaderNotBetween(String value1, String value2) {
            addCriterion("plateleader not between", value1, value2, "plateleader");
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