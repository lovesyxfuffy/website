package com.website.dao.po;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentIsNull() {
            addCriterion("departmentContent is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentIsNotNull() {
            addCriterion("departmentContent is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentEqualTo(String value) {
            addCriterion("departmentContent =", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentNotEqualTo(String value) {
            addCriterion("departmentContent <>", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentGreaterThan(String value) {
            addCriterion("departmentContent >", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("departmentContent >=", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentLessThan(String value) {
            addCriterion("departmentContent <", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentLessThanOrEqualTo(String value) {
            addCriterion("departmentContent <=", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentLike(String value) {
            addCriterion("departmentContent like", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentNotLike(String value) {
            addCriterion("departmentContent not like", value, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentIn(List<String> values) {
            addCriterion("departmentContent in", values, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentNotIn(List<String> values) {
            addCriterion("departmentContent not in", values, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentBetween(String value1, String value2) {
            addCriterion("departmentContent between", value1, value2, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentcontentNotBetween(String value1, String value2) {
            addCriterion("departmentContent not between", value1, value2, "departmentcontent");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkIsNull() {
            addCriterion("departmentArticleLink is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkIsNotNull() {
            addCriterion("departmentArticleLink is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkEqualTo(String value) {
            addCriterion("departmentArticleLink =", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkNotEqualTo(String value) {
            addCriterion("departmentArticleLink <>", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkGreaterThan(String value) {
            addCriterion("departmentArticleLink >", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkGreaterThanOrEqualTo(String value) {
            addCriterion("departmentArticleLink >=", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkLessThan(String value) {
            addCriterion("departmentArticleLink <", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkLessThanOrEqualTo(String value) {
            addCriterion("departmentArticleLink <=", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkLike(String value) {
            addCriterion("departmentArticleLink like", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkNotLike(String value) {
            addCriterion("departmentArticleLink not like", value, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkIn(List<String> values) {
            addCriterion("departmentArticleLink in", values, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkNotIn(List<String> values) {
            addCriterion("departmentArticleLink not in", values, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkBetween(String value1, String value2) {
            addCriterion("departmentArticleLink between", value1, value2, "departmentarticlelink");
            return (Criteria) this;
        }

        public Criteria andDepartmentarticlelinkNotBetween(String value1, String value2) {
            addCriterion("departmentArticleLink not between", value1, value2, "departmentarticlelink");
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