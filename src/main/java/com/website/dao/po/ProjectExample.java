package com.website.dao.po;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andArticlelinkIsNull() {
            addCriterion("articleLink is null");
            return (Criteria) this;
        }

        public Criteria andArticlelinkIsNotNull() {
            addCriterion("articleLink is not null");
            return (Criteria) this;
        }

        public Criteria andArticlelinkEqualTo(String value) {
            addCriterion("articleLink =", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkNotEqualTo(String value) {
            addCriterion("articleLink <>", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkGreaterThan(String value) {
            addCriterion("articleLink >", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkGreaterThanOrEqualTo(String value) {
            addCriterion("articleLink >=", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkLessThan(String value) {
            addCriterion("articleLink <", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkLessThanOrEqualTo(String value) {
            addCriterion("articleLink <=", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkLike(String value) {
            addCriterion("articleLink like", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkNotLike(String value) {
            addCriterion("articleLink not like", value, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkIn(List<String> values) {
            addCriterion("articleLink in", values, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkNotIn(List<String> values) {
            addCriterion("articleLink not in", values, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkBetween(String value1, String value2) {
            addCriterion("articleLink between", value1, value2, "articlelink");
            return (Criteria) this;
        }

        public Criteria andArticlelinkNotBetween(String value1, String value2) {
            addCriterion("articleLink not between", value1, value2, "articlelink");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlIsNull() {
            addCriterion("projectImgUrl is null");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlIsNotNull() {
            addCriterion("projectImgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlEqualTo(String value) {
            addCriterion("projectImgUrl =", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlNotEqualTo(String value) {
            addCriterion("projectImgUrl <>", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlGreaterThan(String value) {
            addCriterion("projectImgUrl >", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("projectImgUrl >=", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlLessThan(String value) {
            addCriterion("projectImgUrl <", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlLessThanOrEqualTo(String value) {
            addCriterion("projectImgUrl <=", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlLike(String value) {
            addCriterion("projectImgUrl like", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlNotLike(String value) {
            addCriterion("projectImgUrl not like", value, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlIn(List<String> values) {
            addCriterion("projectImgUrl in", values, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlNotIn(List<String> values) {
            addCriterion("projectImgUrl not in", values, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlBetween(String value1, String value2) {
            addCriterion("projectImgUrl between", value1, value2, "projectimgurl");
            return (Criteria) this;
        }

        public Criteria andProjectimgurlNotBetween(String value1, String value2) {
            addCriterion("projectImgUrl not between", value1, value2, "projectimgurl");
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