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

import com.admin.entity.MKT;
import com.admin.entity.MKTExample.Criteria;
import com.admin.entity.MKTExample.Criterion;
import com.admin.entity.MKTExample;
import java.util.List;
import java.util.Map;

public class MKTSqlProvider {

    /**
     *
     * @mbggenerated
     */
    public String countByExample(MKTExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("marketing");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String deleteByExample(MKTExample example) {
        BEGIN();
        DELETE_FROM("marketing");
        applyWhere(example, false);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String insertSelective(MKT record) {
        BEGIN();
        INSERT_INTO("marketing");
        
        if (record.getMktId() != null) {
            VALUES("mkt_id", "#{mktId,jdbcType=INTEGER}");
        }
        
        if (record.getMktName() != null) {
            VALUES("mkt_name", "#{mktName,jdbcType=VARCHAR}");
        }
        
        if (record.getMktImg() != null) {
            VALUES("mkt_img", "#{mktImg,jdbcType=VARCHAR}");
        }
        
        if (record.getMktUrl() != null) {
            VALUES("mkt_url", "#{mktUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMktStatus() != null) {
            VALUES("mkt_status", "#{mktStatus,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String selectByExample(MKTExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("mkt_id");
        } else {
            SELECT("mkt_id");
        }
        SELECT("mkt_name");
        SELECT("mkt_img");
        SELECT("mkt_url");
        SELECT("mkt_status");
        FROM("marketing");
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
        MKT record = (MKT) parameter.get("record");
        MKTExample example = (MKTExample) parameter.get("example");
        
        BEGIN();
        UPDATE("marketing");
        
        if (record.getMktId() != null) {
            SET("mkt_id = #{record.mktId,jdbcType=INTEGER}");
        }
        
        if (record.getMktName() != null) {
            SET("mkt_name = #{record.mktName,jdbcType=VARCHAR}");
        }
        
        if (record.getMktImg() != null) {
            SET("mkt_img = #{record.mktImg,jdbcType=VARCHAR}");
        }
        
        if (record.getMktUrl() != null) {
            SET("mkt_url = #{record.mktUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMktStatus() != null) {
            SET("mkt_status = #{record.mktStatus,jdbcType=INTEGER}");
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
        UPDATE("marketing");
        
        SET("mkt_id = #{record.mktId,jdbcType=INTEGER}");
        SET("mkt_name = #{record.mktName,jdbcType=VARCHAR}");
        SET("mkt_img = #{record.mktImg,jdbcType=VARCHAR}");
        SET("mkt_url = #{record.mktUrl,jdbcType=VARCHAR}");
        SET("mkt_status = #{record.mktStatus,jdbcType=INTEGER}");
        
        MKTExample example = (MKTExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(MKT record) {
        BEGIN();
        UPDATE("marketing");
        
        if (record.getMktName() != null) {
            SET("mkt_name = #{mktName,jdbcType=VARCHAR}");
        }
        
        if (record.getMktImg() != null) {
            SET("mkt_img = #{mktImg,jdbcType=VARCHAR}");
        }
        
        if (record.getMktUrl() != null) {
            SET("mkt_url = #{mktUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getMktStatus() != null) {
            SET("mkt_status = #{mktStatus,jdbcType=INTEGER}");
        }
        
        WHERE("mkt_id = #{mktId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     *
     * @mbggenerated
     */
    protected void applyWhere(MKTExample example, boolean includeExamplePhrase) {
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