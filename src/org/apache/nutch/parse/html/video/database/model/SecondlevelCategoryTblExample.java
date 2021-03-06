package org.apache.nutch.parse.html.video.database.model;

import java.util.ArrayList;
import java.util.List;

public class SecondlevelCategoryTblExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public SecondlevelCategoryTblExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(Short value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(Short value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(Short value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(Short value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(Short value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(Short value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<Short> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<Short> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(Short value1, Short value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(Short value1, Short value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNull() {
            addCriterion("fc_id is null");
            return (Criteria) this;
        }

        public Criteria andFcIdIsNotNull() {
            addCriterion("fc_id is not null");
            return (Criteria) this;
        }

        public Criteria andFcIdEqualTo(Short value) {
            addCriterion("fc_id =", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotEqualTo(Short value) {
            addCriterion("fc_id <>", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThan(Short value) {
            addCriterion("fc_id >", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdGreaterThanOrEqualTo(Short value) {
            addCriterion("fc_id >=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThan(Short value) {
            addCriterion("fc_id <", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdLessThanOrEqualTo(Short value) {
            addCriterion("fc_id <=", value, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdIn(List<Short> values) {
            addCriterion("fc_id in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotIn(List<Short> values) {
            addCriterion("fc_id not in", values, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdBetween(Short value1, Short value2) {
            addCriterion("fc_id between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andFcIdNotBetween(Short value1, Short value2) {
            addCriterion("fc_id not between", value1, value2, "fcId");
            return (Criteria) this;
        }

        public Criteria andRelateScidIsNull() {
            addCriterion("relate_scid is null");
            return (Criteria) this;
        }

        public Criteria andRelateScidIsNotNull() {
            addCriterion("relate_scid is not null");
            return (Criteria) this;
        }

        public Criteria andRelateScidEqualTo(Short value) {
            addCriterion("relate_scid =", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidNotEqualTo(Short value) {
            addCriterion("relate_scid <>", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidGreaterThan(Short value) {
            addCriterion("relate_scid >", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidGreaterThanOrEqualTo(Short value) {
            addCriterion("relate_scid >=", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidLessThan(Short value) {
            addCriterion("relate_scid <", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidLessThanOrEqualTo(Short value) {
            addCriterion("relate_scid <=", value, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidIn(List<Short> values) {
            addCriterion("relate_scid in", values, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidNotIn(List<Short> values) {
            addCriterion("relate_scid not in", values, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidBetween(Short value1, Short value2) {
            addCriterion("relate_scid between", value1, value2, "relateScid");
            return (Criteria) this;
        }

        public Criteria andRelateScidNotBetween(Short value1, Short value2) {
            addCriterion("relate_scid not between", value1, value2, "relateScid");
            return (Criteria) this;
        }

        public Criteria andIsPubIsNull() {
            addCriterion("is_pub is null");
            return (Criteria) this;
        }

        public Criteria andIsPubIsNotNull() {
            addCriterion("is_pub is not null");
            return (Criteria) this;
        }

        public Criteria andIsPubEqualTo(Boolean value) {
            addCriterion("is_pub =", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubNotEqualTo(Boolean value) {
            addCriterion("is_pub <>", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubGreaterThan(Boolean value) {
            addCriterion("is_pub >", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pub >=", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubLessThan(Boolean value) {
            addCriterion("is_pub <", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pub <=", value, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubIn(List<Boolean> values) {
            addCriterion("is_pub in", values, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubNotIn(List<Boolean> values) {
            addCriterion("is_pub not in", values, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pub between", value1, value2, "isPub");
            return (Criteria) this;
        }

        public Criteria andIsPubNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pub not between", value1, value2, "isPub");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 01 15:11:41 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table secondlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
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