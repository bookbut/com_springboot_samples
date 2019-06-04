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

import com.admin.entity.Users;
import com.admin.entity.UsersExample.Criteria;
import com.admin.entity.UsersExample.Criterion;
import com.admin.entity.UsersExample;
import java.util.List;
import java.util.Map;

public class UsersSqlProvider {

    /**
     *
     * @mbggenerated
     */
    public String countByExample(UsersExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("users");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String deleteByExample(UsersExample example) {
        BEGIN();
        DELETE_FROM("users");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String insertSelective(Users record) {
        BEGIN();
        INSERT_INTO("users");
        
        if (record.getUserPassword() != null) {
            VALUES("user_password", "#{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNicename() != null) {
            VALUES("user_nicename", "#{userNicename,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            VALUES("user_phone", "#{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            VALUES("user_level", "#{userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserUrl() != null) {
            VALUES("user_url", "#{userUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            VALUES("user_email", "#{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserStatus() != null) {
            VALUES("user_status", "#{userStatus,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String selectByExample(UsersExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("user_id");
        } else {
            SELECT("user_id");
        }
        SELECT("user_password");
        SELECT("user_name");
        SELECT("user_nicename");
        SELECT("user_phone");
        SELECT("user_level");
        SELECT("user_url");
        SELECT("user_email");
        SELECT("user_status");
        FROM("users");
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
        Users record = (Users) parameter.get("record");
        UsersExample example = (UsersExample) parameter.get("example");
        
        BEGIN();
        UPDATE("users");
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserPassword() != null) {
            SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNicename() != null) {
            SET("user_nicename = #{record.userNicename,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            SET("user_phone = #{record.userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            SET("user_level = #{record.userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserUrl() != null) {
            SET("user_url = #{record.userUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            SET("user_email = #{record.userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserStatus() != null) {
            SET("user_status = #{record.userStatus,jdbcType=INTEGER}");
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
        UPDATE("users");
        
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("user_password = #{record.userPassword,jdbcType=VARCHAR}");
        SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        SET("user_nicename = #{record.userNicename,jdbcType=VARCHAR}");
        SET("user_phone = #{record.userPhone,jdbcType=VARCHAR}");
        SET("user_level = #{record.userLevel,jdbcType=INTEGER}");
        SET("user_url = #{record.userUrl,jdbcType=VARCHAR}");
        SET("user_email = #{record.userEmail,jdbcType=VARCHAR}");
        SET("user_status = #{record.userStatus,jdbcType=INTEGER}");
        
        UsersExample example = (UsersExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(Users record) {
        BEGIN();
        UPDATE("users");
        
        if (record.getUserPassword() != null) {
            SET("user_password = #{userPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserNicename() != null) {
            SET("user_nicename = #{userNicename,jdbcType=VARCHAR}");
        }
        
        if (record.getUserPhone() != null) {
            SET("user_phone = #{userPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getUserLevel() != null) {
            SET("user_level = #{userLevel,jdbcType=INTEGER}");
        }
        
        if (record.getUserUrl() != null) {
            SET("user_url = #{userUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getUserEmail() != null) {
            SET("user_email = #{userEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getUserStatus() != null) {
            SET("user_status = #{userStatus,jdbcType=INTEGER}");
        }
        
        WHERE("user_id = #{userId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    protected void applyWhere(UsersExample example, boolean includeExamplePhrase) {
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