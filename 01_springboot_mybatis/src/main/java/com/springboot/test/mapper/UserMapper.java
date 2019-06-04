package com.springboot.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.seatel.entity.User;
import com.seatel.enums.UserSex;
//使用
//@Mapper
public interface UserMapper {
	@Select("SELECT * FROM test_users")
	@Results({ @Result(property = "userSex", column = "user_sex", javaType = UserSex.class),
			@Result(property = "nickName", column = "nick_name") })
	public List<User> getUsers();

	@Select("SELECT * FROM test_users WHERE id = #{id}")
	@Results({ @Result(property = "userSex", column = "user_sex", javaType = UserSex.class),
			@Result(property = "nickName", column = "nick_name") })
	public User getUserById(@Param(value = "id") int id);

	@Insert("INSERT INTO test_users(userName,passWord,nick_name,user_sex) VALUES(#{userName},#{passWord},#{nickName},#{userSex})")
	public void insert(@Param(value = "userName") String userName, @Param(value = "passWord") String passWord,
			@Param(value = "nickName") String nickName, @Param(value = "userSex") UserSex userSex);
}
