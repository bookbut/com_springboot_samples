package com.admin.mapper;

import com.admin.entity.MKT;
import com.admin.entity.MKTExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface MKTMapper {
    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=MKTSqlProvider.class, method="countByExample")
    int countByExample(MKTExample example);

    /**
     *
     * @mbggenerated
     */
    @DeleteProvider(type=MKTSqlProvider.class, method="deleteByExample")
    int deleteByExample(MKTExample example);

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from marketing",
        "where mkt_id = #{mktId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer mktId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into marketing (mkt_id, mkt_name, ",
        "mkt_img, mkt_url, ",
        "mkt_status)",
        "values (#{mktId,jdbcType=INTEGER}, #{mktName,jdbcType=VARCHAR}, ",
        "#{mktImg,jdbcType=VARCHAR}, #{mktUrl,jdbcType=VARCHAR}, ",
        "#{mktStatus,jdbcType=INTEGER})"
    })
    int insert(MKT record);

    /**
     *
     * @mbggenerated
     */
    @InsertProvider(type=MKTSqlProvider.class, method="insertSelective")
    int insertSelective(MKT record);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=MKTSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mkt_id", property="mktId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mkt_name", property="mktName", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_img", property="mktImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_url", property="mktUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_status", property="mktStatus", jdbcType=JdbcType.INTEGER)
    })
    List<MKT> selectByExampleWithRowbounds(MKTExample example, RowBounds rowBounds);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=MKTSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="mkt_id", property="mktId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mkt_name", property="mktName", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_img", property="mktImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_url", property="mktUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_status", property="mktStatus", jdbcType=JdbcType.INTEGER)
    })
    List<MKT> selectByExample(MKTExample example);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "mkt_id, mkt_name, mkt_img, mkt_url, mkt_status",
        "from marketing",
        "where mkt_id = #{mktId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="mkt_id", property="mktId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="mkt_name", property="mktName", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_img", property="mktImg", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_url", property="mktUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="mkt_status", property="mktStatus", jdbcType=JdbcType.INTEGER)
    })
    MKT selectByPrimaryKey(Integer mktId);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MKTSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MKT record, @Param("example") MKTExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MKTSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MKT record, @Param("example") MKTExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=MKTSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(MKT record);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update marketing",
        "set mkt_name = #{mktName,jdbcType=VARCHAR},",
          "mkt_img = #{mktImg,jdbcType=VARCHAR},",
          "mkt_url = #{mktUrl,jdbcType=VARCHAR},",
          "mkt_status = #{mktStatus,jdbcType=INTEGER}",
        "where mkt_id = #{mktId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MKT record);
}