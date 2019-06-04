package com.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class MKTExample {
    /**
     * marketing
     */
    protected String orderByClause;

    /**
     * marketing
     */
    protected boolean distinct;

    /**
     * marketing
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public MKTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * marketing null
     */
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

        public Criteria andMktIdIsNull() {
            addCriterion("mkt_id is null");
            return (Criteria) this;
        }

        public Criteria andMktIdIsNotNull() {
            addCriterion("mkt_id is not null");
            return (Criteria) this;
        }

        public Criteria andMktIdEqualTo(Integer value) {
            addCriterion("mkt_id =", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdNotEqualTo(Integer value) {
            addCriterion("mkt_id <>", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdGreaterThan(Integer value) {
            addCriterion("mkt_id >", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mkt_id >=", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdLessThan(Integer value) {
            addCriterion("mkt_id <", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdLessThanOrEqualTo(Integer value) {
            addCriterion("mkt_id <=", value, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdIn(List<Integer> values) {
            addCriterion("mkt_id in", values, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdNotIn(List<Integer> values) {
            addCriterion("mkt_id not in", values, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdBetween(Integer value1, Integer value2) {
            addCriterion("mkt_id between", value1, value2, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mkt_id not between", value1, value2, "mktId");
            return (Criteria) this;
        }

        public Criteria andMktNameIsNull() {
            addCriterion("mkt_name is null");
            return (Criteria) this;
        }

        public Criteria andMktNameIsNotNull() {
            addCriterion("mkt_name is not null");
            return (Criteria) this;
        }

        public Criteria andMktNameEqualTo(String value) {
            addCriterion("mkt_name =", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotEqualTo(String value) {
            addCriterion("mkt_name <>", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameGreaterThan(String value) {
            addCriterion("mkt_name >", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_name >=", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLessThan(String value) {
            addCriterion("mkt_name <", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLessThanOrEqualTo(String value) {
            addCriterion("mkt_name <=", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameLike(String value) {
            addCriterion("mkt_name like", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotLike(String value) {
            addCriterion("mkt_name not like", value, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameIn(List<String> values) {
            addCriterion("mkt_name in", values, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotIn(List<String> values) {
            addCriterion("mkt_name not in", values, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameBetween(String value1, String value2) {
            addCriterion("mkt_name between", value1, value2, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktNameNotBetween(String value1, String value2) {
            addCriterion("mkt_name not between", value1, value2, "mktName");
            return (Criteria) this;
        }

        public Criteria andMktImgIsNull() {
            addCriterion("mkt_img is null");
            return (Criteria) this;
        }

        public Criteria andMktImgIsNotNull() {
            addCriterion("mkt_img is not null");
            return (Criteria) this;
        }

        public Criteria andMktImgEqualTo(String value) {
            addCriterion("mkt_img =", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgNotEqualTo(String value) {
            addCriterion("mkt_img <>", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgGreaterThan(String value) {
            addCriterion("mkt_img >", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_img >=", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgLessThan(String value) {
            addCriterion("mkt_img <", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgLessThanOrEqualTo(String value) {
            addCriterion("mkt_img <=", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgLike(String value) {
            addCriterion("mkt_img like", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgNotLike(String value) {
            addCriterion("mkt_img not like", value, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgIn(List<String> values) {
            addCriterion("mkt_img in", values, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgNotIn(List<String> values) {
            addCriterion("mkt_img not in", values, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgBetween(String value1, String value2) {
            addCriterion("mkt_img between", value1, value2, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktImgNotBetween(String value1, String value2) {
            addCriterion("mkt_img not between", value1, value2, "mktImg");
            return (Criteria) this;
        }

        public Criteria andMktUrlIsNull() {
            addCriterion("mkt_url is null");
            return (Criteria) this;
        }

        public Criteria andMktUrlIsNotNull() {
            addCriterion("mkt_url is not null");
            return (Criteria) this;
        }

        public Criteria andMktUrlEqualTo(String value) {
            addCriterion("mkt_url =", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlNotEqualTo(String value) {
            addCriterion("mkt_url <>", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlGreaterThan(String value) {
            addCriterion("mkt_url >", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mkt_url >=", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlLessThan(String value) {
            addCriterion("mkt_url <", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlLessThanOrEqualTo(String value) {
            addCriterion("mkt_url <=", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlLike(String value) {
            addCriterion("mkt_url like", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlNotLike(String value) {
            addCriterion("mkt_url not like", value, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlIn(List<String> values) {
            addCriterion("mkt_url in", values, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlNotIn(List<String> values) {
            addCriterion("mkt_url not in", values, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlBetween(String value1, String value2) {
            addCriterion("mkt_url between", value1, value2, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktUrlNotBetween(String value1, String value2) {
            addCriterion("mkt_url not between", value1, value2, "mktUrl");
            return (Criteria) this;
        }

        public Criteria andMktStatusIsNull() {
            addCriterion("mkt_status is null");
            return (Criteria) this;
        }

        public Criteria andMktStatusIsNotNull() {
            addCriterion("mkt_status is not null");
            return (Criteria) this;
        }

        public Criteria andMktStatusEqualTo(Integer value) {
            addCriterion("mkt_status =", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusNotEqualTo(Integer value) {
            addCriterion("mkt_status <>", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusGreaterThan(Integer value) {
            addCriterion("mkt_status >", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mkt_status >=", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusLessThan(Integer value) {
            addCriterion("mkt_status <", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mkt_status <=", value, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusIn(List<Integer> values) {
            addCriterion("mkt_status in", values, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusNotIn(List<Integer> values) {
            addCriterion("mkt_status not in", values, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusBetween(Integer value1, Integer value2) {
            addCriterion("mkt_status between", value1, value2, "mktStatus");
            return (Criteria) this;
        }

        public Criteria andMktStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mkt_status not between", value1, value2, "mktStatus");
            return (Criteria) this;
        }
    }

    /**
     * marketing
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * marketing null
     */
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