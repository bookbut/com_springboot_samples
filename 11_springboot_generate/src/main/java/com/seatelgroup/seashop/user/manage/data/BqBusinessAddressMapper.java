package com.seatelgroup.seashop.user.manage.data;

import com.seatelgroup.seashop.user.manage.data.BqBusinessAddress;
import com.seatelgroup.seashop.user.manage.data.BqBusinessAddressCriteria;
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

public interface BqBusinessAddressMapper {
    @SelectProvider(type=BqBusinessAddressSqlProvider.class, method="countByExample")
    long countByExample(BqBusinessAddressCriteria example);

    @DeleteProvider(type=BqBusinessAddressSqlProvider.class, method="deleteByExample")
    int deleteByExample(BqBusinessAddressCriteria example);

    @Delete({
        "delete from bq_business_address",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into bq_business_address (id, district, ",
        "dealername, dealerid, ",
        "address)",
        "values (#{id,jdbcType=INTEGER}, #{district,jdbcType=VARCHAR}, ",
        "#{dealername,jdbcType=VARCHAR}, #{dealerid,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR})"
    })
    int insert(BqBusinessAddress record);

    @InsertProvider(type=BqBusinessAddressSqlProvider.class, method="insertSelective")
    int insertSelective(BqBusinessAddress record);

    @SelectProvider(type=BqBusinessAddressSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealername", property="dealername", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealerid", property="dealerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<BqBusinessAddress> selectByExampleWithRowbounds(BqBusinessAddressCriteria example, RowBounds rowBounds);

    @SelectProvider(type=BqBusinessAddressSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealername", property="dealername", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealerid", property="dealerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<BqBusinessAddress> selectByExample(BqBusinessAddressCriteria example);

    @Select({
        "select",
        "id, district, dealername, dealerid, address",
        "from bq_business_address",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealername", property="dealername", jdbcType=JdbcType.VARCHAR),
        @Result(column="dealerid", property="dealerid", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR)
    })
    BqBusinessAddress selectByPrimaryKey(Integer id);

    @UpdateProvider(type=BqBusinessAddressSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BqBusinessAddress record, @Param("example") BqBusinessAddressCriteria example);

    @UpdateProvider(type=BqBusinessAddressSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BqBusinessAddress record, @Param("example") BqBusinessAddressCriteria example);

    @UpdateProvider(type=BqBusinessAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BqBusinessAddress record);

    @Update({
        "update bq_business_address",
        "set district = #{district,jdbcType=VARCHAR},",
          "dealername = #{dealername,jdbcType=VARCHAR},",
          "dealerid = #{dealerid,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BqBusinessAddress record);
}