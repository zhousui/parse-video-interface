package org.apache.nutch.parse.html.video.database.model;

import java.util.ArrayList;
import java.util.List;

public class FirstlevelCategoryTblExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public FirstlevelCategoryTblExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
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
     * This method corresponds to the database table firstlevel_category_tbl
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
     * This method corresponds to the database table firstlevel_category_tbl
     *
     * @mbggenerated Fri Feb 01 15:11:41 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firstlevel_category_tbl
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
     * This class corresponds to the database table firstlevel_category_tbl
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

        public Criteria andFcNameIsNull() {
            addCriterion("fc_name is null");
            return (Criteria) this;
        }

        public Criteria andFcNameIsNotNull() {
            addCriterion("fc_name is not null");
            return (Criteria) this;
        }

        public Criteria andFcNameEqualTo(String value) {
            addCriterion("fc_name =", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotEqualTo(String value) {
            addCriterion("fc_name <>", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThan(String value) {
            addCriterion("fc_name >", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThanOrEqualTo(String value) {
            addCriterion("fc_name >=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThan(String value) {
            addCriterion("fc_name <", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThanOrEqualTo(String value) {
            addCriterion("fc_name <=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLike(String value) {
            addCriterion("fc_name like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotLike(String value) {
            addCriterion("fc_name not like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameIn(List<String> values) {
            addCriterion("fc_name in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotIn(List<String> values) {
            addCriterion("fc_name not in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameBetween(String value1, String value2) {
            addCriterion("fc_name between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotBetween(String value1, String value2) {
            addCriterion("fc_name not between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcImgPathIsNull() {
            addCriterion("fc_img_path is null");
            return (Criteria) this;
        }

        public Criteria andFcImgPathIsNotNull() {
            addCriterion("fc_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andFcImgPathEqualTo(String value) {
            addCriterion("fc_img_path =", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathNotEqualTo(String value) {
            addCriterion("fc_img_path <>", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathGreaterThan(String value) {
            addCriterion("fc_img_path >", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("fc_img_path >=", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathLessThan(String value) {
            addCriterion("fc_img_path <", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathLessThanOrEqualTo(String value) {
            addCriterion("fc_img_path <=", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathLike(String value) {
            addCriterion("fc_img_path like", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathNotLike(String value) {
            addCriterion("fc_img_path not like", value, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathIn(List<String> values) {
            addCriterion("fc_img_path in", values, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathNotIn(List<String> values) {
            addCriterion("fc_img_path not in", values, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathBetween(String value1, String value2) {
            addCriterion("fc_img_path between", value1, value2, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andFcImgPathNotBetween(String value1, String value2) {
            addCriterion("fc_img_path not between", value1, value2, "fcImgPath");
            return (Criteria) this;
        }

        public Criteria andRelateFcidIsNull() {
            addCriterion("relate_fcid is null");
            return (Criteria) this;
        }

        public Criteria andRelateFcidIsNotNull() {
            addCriterion("relate_fcid is not null");
            return (Criteria) this;
        }

        public Criteria andRelateFcidEqualTo(Short value) {
            addCriterion("relate_fcid =", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidNotEqualTo(Short value) {
            addCriterion("relate_fcid <>", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidGreaterThan(Short value) {
            addCriterion("relate_fcid >", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidGreaterThanOrEqualTo(Short value) {
            addCriterion("relate_fcid >=", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidLessThan(Short value) {
            addCriterion("relate_fcid <", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidLessThanOrEqualTo(Short value) {
            addCriterion("relate_fcid <=", value, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidIn(List<Short> values) {
            addCriterion("relate_fcid in", values, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidNotIn(List<Short> values) {
            addCriterion("relate_fcid not in", values, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidBetween(Short value1, Short value2) {
            addCriterion("relate_fcid between", value1, value2, "relateFcid");
            return (Criteria) this;
        }

        public Criteria andRelateFcidNotBetween(Short value1, Short value2) {
            addCriterion("relate_fcid not between", value1, value2, "relateFcid");
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
     * This class corresponds to the database table firstlevel_category_tbl
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
     * This class corresponds to the database table firstlevel_category_tbl
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