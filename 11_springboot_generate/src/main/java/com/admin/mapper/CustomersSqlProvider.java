package com.admin.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.admin.entity.Customers;
import com.admin.entity.CustomersExample.Criteria;
import com.admin.entity.CustomersExample.Criterion;
import com.admin.entity.CustomersExample;
import java.util.List;
import java.util.Map;

public class CustomersSqlProvider {

    /**
     *
     * @mbggenerated
     */
    public String countByExample(CustomersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("customers");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String deleteByExample(CustomersExample example) {
        BEGIN();
        DELETE_FROM("customers");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String insertSelective(Customers record) {
        BEGIN();
        INSERT_INTO("customers");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCustName() != null) {
            VALUES("cust_name", "#{custName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustPhone() != null) {
            VALUES("cust_phone", "#{custPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getCustEmail() != null) {
            VALUES("cust_email", "#{custEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getCustJob() != null) {
            VALUES("cust_job", "#{custJob,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCredit() != null) {
            VALUES("cust_credit", "#{custCredit,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String selectByExample(CustomersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("cust_id");
        } else {
            SELECT("cust_id");
        }
        SELECT("user_id");
        SELECT("cust_name");
        SELECT("cust_phone");
        SELECT("cust_email");
        SELECT("cust_job");
        SELECT("cust_credit");
        FROM("customers");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Customers record = (Customers) parameter.get("record");
        CustomersExample example = (CustomersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("customers");
        
        if (record.getCustId() != null) {
            SET("cust_id = #{record.custId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getCustName() != null) {
            SET("cust_name = #{record.custName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustPhone() != null) {
            SET("cust_phone = #{record.custPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getCustEmail() != null) {
            SET("cust_email = #{record.custEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getCustJob() != null) {
            SET("cust_job = #{record.custJob,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCredit() != null) {
            SET("cust_credit = #{record.custCredit,jdbcType=INTEGER}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("customers");
        
        SET("cust_id = #{record.custId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("cust_name = #{record.custName,jdbcType=VARCHAR}");
        SET("cust_phone = #{record.custPhone,jdbcType=VARCHAR}");
        SET("cust_email = #{record.custEmail,jdbcType=VARCHAR}");
        SET("cust_job = #{record.custJob,jdbcType=VARCHAR}");
        SET("cust_credit = #{record.custCredit,jdbcType=INTEGER}");
        
        CustomersExample example = (CustomersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Customers record) {
        BEGIN();
        UPDATE("customers");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCustName() != null) {
            SET("cust_name = #{custName,jdbcType=VARCHAR}");
        }
        
        if (record.getCustPhone() != null) {
            SET("cust_phone = #{custPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getCustEmail() != null) {
            SET("cust_email = #{custEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getCustJob() != null) {
            SET("cust_job = #{custJob,jdbcType=VARCHAR}");
        }
        
        if (record.getCustCredit() != null) {
            SET("cust_credit = #{custCredit,jdbcType=INTEGER}");
        }
        
        WHERE("cust_id = #{custId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    protected void applyWhere(CustomersExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}