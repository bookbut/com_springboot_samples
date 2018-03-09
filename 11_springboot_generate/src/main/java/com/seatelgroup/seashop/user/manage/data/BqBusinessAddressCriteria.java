package com.seatelgroup.seashop.user.manage.data;

import java.util.ArrayList;
import java.util.List;

public class BqBusinessAddressCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BqBusinessAddressCriteria() {
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

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDealernameIsNull() {
            addCriterion("dealername is null");
            return (Criteria) this;
        }

        public Criteria andDealernameIsNotNull() {
            addCriterion("dealername is not null");
            return (Criteria) this;
        }

        public Criteria andDealernameEqualTo(String value) {
            addCriterion("dealername =", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameNotEqualTo(String value) {
            addCriterion("dealername <>", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameGreaterThan(String value) {
            addCriterion("dealername >", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameGreaterThanOrEqualTo(String value) {
            addCriterion("dealername >=", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameLessThan(String value) {
            addCriterion("dealername <", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameLessThanOrEqualTo(String value) {
            addCriterion("dealername <=", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameLike(String value) {
            addCriterion("dealername like", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameNotLike(String value) {
            addCriterion("dealername not like", value, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameIn(List<String> values) {
            addCriterion("dealername in", values, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameNotIn(List<String> values) {
            addCriterion("dealername not in", values, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameBetween(String value1, String value2) {
            addCriterion("dealername between", value1, value2, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealernameNotBetween(String value1, String value2) {
            addCriterion("dealername not between", value1, value2, "dealername");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNull() {
            addCriterion("dealerid is null");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNotNull() {
            addCriterion("dealerid is not null");
            return (Criteria) this;
        }

        public Criteria andDealeridEqualTo(String value) {
            addCriterion("dealerid =", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotEqualTo(String value) {
            addCriterion("dealerid <>", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThan(String value) {
            addCriterion("dealerid >", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThanOrEqualTo(String value) {
            addCriterion("dealerid >=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThan(String value) {
            addCriterion("dealerid <", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThanOrEqualTo(String value) {
            addCriterion("dealerid <=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLike(String value) {
            addCriterion("dealerid like", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotLike(String value) {
            addCriterion("dealerid not like", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridIn(List<String> values) {
            addCriterion("dealerid in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotIn(List<String> values) {
            addCriterion("dealerid not in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridBetween(String value1, String value2) {
            addCriterion("dealerid between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotBetween(String value1, String value2) {
            addCriterion("dealerid not between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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