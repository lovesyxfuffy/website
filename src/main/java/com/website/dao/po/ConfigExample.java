package com.website.dao.po;

import java.util.ArrayList;
import java.util.List;

public class ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigExample() {
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

        public Criteria andConfignameIsNull() {
            addCriterion("configName is null");
            return (Criteria) this;
        }

        public Criteria andConfignameIsNotNull() {
            addCriterion("configName is not null");
            return (Criteria) this;
        }

        public Criteria andConfignameEqualTo(String value) {
            addCriterion("configName =", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotEqualTo(String value) {
            addCriterion("configName <>", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameGreaterThan(String value) {
            addCriterion("configName >", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameGreaterThanOrEqualTo(String value) {
            addCriterion("configName >=", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLessThan(String value) {
            addCriterion("configName <", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLessThanOrEqualTo(String value) {
            addCriterion("configName <=", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameLike(String value) {
            addCriterion("configName like", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotLike(String value) {
            addCriterion("configName not like", value, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameIn(List<String> values) {
            addCriterion("configName in", values, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotIn(List<String> values) {
            addCriterion("configName not in", values, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameBetween(String value1, String value2) {
            addCriterion("configName between", value1, value2, "configname");
            return (Criteria) this;
        }

        public Criteria andConfignameNotBetween(String value1, String value2) {
            addCriterion("configName not between", value1, value2, "configname");
            return (Criteria) this;
        }

        public Criteria andConfigcontentIsNull() {
            addCriterion("configContent is null");
            return (Criteria) this;
        }

        public Criteria andConfigcontentIsNotNull() {
            addCriterion("configContent is not null");
            return (Criteria) this;
        }

        public Criteria andConfigcontentEqualTo(String value) {
            addCriterion("configContent =", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentNotEqualTo(String value) {
            addCriterion("configContent <>", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentGreaterThan(String value) {
            addCriterion("configContent >", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentGreaterThanOrEqualTo(String value) {
            addCriterion("configContent >=", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentLessThan(String value) {
            addCriterion("configContent <", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentLessThanOrEqualTo(String value) {
            addCriterion("configContent <=", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentLike(String value) {
            addCriterion("configContent like", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentNotLike(String value) {
            addCriterion("configContent not like", value, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentIn(List<String> values) {
            addCriterion("configContent in", values, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentNotIn(List<String> values) {
            addCriterion("configContent not in", values, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentBetween(String value1, String value2) {
            addCriterion("configContent between", value1, value2, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigcontentNotBetween(String value1, String value2) {
            addCriterion("configContent not between", value1, value2, "configcontent");
            return (Criteria) this;
        }

        public Criteria andConfigtypeIsNull() {
            addCriterion("configType is null");
            return (Criteria) this;
        }

        public Criteria andConfigtypeIsNotNull() {
            addCriterion("configType is not null");
            return (Criteria) this;
        }

        public Criteria andConfigtypeEqualTo(String value) {
            addCriterion("configType =", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeNotEqualTo(String value) {
            addCriterion("configType <>", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeGreaterThan(String value) {
            addCriterion("configType >", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeGreaterThanOrEqualTo(String value) {
            addCriterion("configType >=", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeLessThan(String value) {
            addCriterion("configType <", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeLessThanOrEqualTo(String value) {
            addCriterion("configType <=", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeLike(String value) {
            addCriterion("configType like", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeNotLike(String value) {
            addCriterion("configType not like", value, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeIn(List<String> values) {
            addCriterion("configType in", values, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeNotIn(List<String> values) {
            addCriterion("configType not in", values, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeBetween(String value1, String value2) {
            addCriterion("configType between", value1, value2, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigtypeNotBetween(String value1, String value2) {
            addCriterion("configType not between", value1, value2, "configtype");
            return (Criteria) this;
        }

        public Criteria andConfigmodelIsNull() {
            addCriterion("configModel is null");
            return (Criteria) this;
        }

        public Criteria andConfigmodelIsNotNull() {
            addCriterion("configModel is not null");
            return (Criteria) this;
        }

        public Criteria andConfigmodelEqualTo(Integer value) {
            addCriterion("configModel =", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelNotEqualTo(Integer value) {
            addCriterion("configModel <>", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelGreaterThan(Integer value) {
            addCriterion("configModel >", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelGreaterThanOrEqualTo(Integer value) {
            addCriterion("configModel >=", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelLessThan(Integer value) {
            addCriterion("configModel <", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelLessThanOrEqualTo(Integer value) {
            addCriterion("configModel <=", value, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelIn(List<Integer> values) {
            addCriterion("configModel in", values, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelNotIn(List<Integer> values) {
            addCriterion("configModel not in", values, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelBetween(Integer value1, Integer value2) {
            addCriterion("configModel between", value1, value2, "configmodel");
            return (Criteria) this;
        }

        public Criteria andConfigmodelNotBetween(Integer value1, Integer value2) {
            addCriterion("configModel not between", value1, value2, "configmodel");
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