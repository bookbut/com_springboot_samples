package com.seatel.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.seatel.entity.User;
import com.seatel.enums.UserSex;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM users")
	@Results({ @Result(property = "userSex", column = "user_sex", javaType = UserSex.class),
			@Result(property = "nickName", column = "nick_name") })
	public List<User> getUsers();

	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({ @Result(property = "userSex", column = "user_sex", javaType = UserSex.class),
			@Result(property = "nickName", column = "nick_name") })
	public User getUserById(@Param(value = "id") int id);

	@Insert("INSERT INTO users(userName,passWord,nick_name,user_sex) VALUES(#{userName},#{passWord},#{nickName},#{userSex})")
	public void insert(@Param(value = "userName") String userName, @Param(value = "passWord") String passWord,
			@Param(value = "nickName") String nickName, @Param(value = "userSex") UserSex userSex);
}
