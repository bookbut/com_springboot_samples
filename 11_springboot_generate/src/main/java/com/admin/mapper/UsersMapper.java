package com.admin.mapper;

import com.admin.entity.Users;
import com.admin.entity.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface UsersMapper {
    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=UsersSqlProvider.class, method="countByExample")
    int countByExample(UsersExample example);

    /**
     *
     * @mbggenerated
     */
    @DeleteProvider(type=UsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsersExample example);

    /**
     *
     * @mbggenerated
     */
    @Delete({
        "delete from users",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated
     */
    @Insert({
        "insert into users (user_password, user_name, ",
        "user_nicename, user_phone, ",
        "user_level, user_url, ",
        "user_email, user_status)",
        "values (#{userPassword,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{userNicename,jdbcType=VARCHAR}, #{userPhone,jdbcType=VARCHAR}, ",
        "#{userLevel,jdbcType=INTEGER}, #{userUrl,jdbcType=VARCHAR}, ",
        "#{userEmail,jdbcType=VARCHAR}, #{userStatus,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="userId")
    int insert(Users record);

    /**
     *
     * @mbggenerated
     */
    @InsertProvider(type=UsersSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="userId")
    int insertSelective(Users record);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_nicename", property="userNicename", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_level", property="userLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="user_url", property="userUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_status", property="userStatus", jdbcType=JdbcType.INTEGER)
    })
    List<Users> selectByExampleWithRowbounds(UsersExample example, RowBounds rowBounds);

    /**
     *
     * @mbggenerated
     */
    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_nicename", property="userNicename", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_level", property="userLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="user_url", property="userUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_status", property="userStatus", jdbcType=JdbcType.INTEGER)
    })
    List<Users> selectByExample(UsersExample example);

    /**
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "user_id, user_password, user_name, user_nicename, user_phone, user_level, user_url, ",
        "user_email, user_status",
        "from users",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_password", property="userPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_nicename", property="userNicename", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_phone", property="userPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_level", property="userLevel", jdbcType=JdbcType.INTEGER),
        @Result(column="user_url", property="userUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_email", property="userEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_status", property="userStatus", jdbcType=JdbcType.INTEGER)
    })
    Users selectByPrimaryKey(Integer userId);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     *
     * @mbggenerated
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Users record);

    /**
     *
     * @mbggenerated
     */
    @Update({
        "update users",
        "set user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_nicename = #{userNicename,jdbcType=VARCHAR},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_level = #{userLevel,jdbcType=INTEGER},",
          "user_url = #{userUrl,jdbcType=VARCHAR},",
          "user_email = #{userEmail,jdbcType=VARCHAR},",
          "user_status = #{userStatus,jdbcType=INTEGER}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Users record);
}