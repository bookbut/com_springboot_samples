package com.springboot.test.mapper;


import com.springboot.test.entity.UserEntity;
import com.springboot.test.enums.UserSexEnum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {
	@Select("SELECT * FROM test_users")
	@Results({
		@Result(property = "userSex",  column = "user_sex",javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
    List<UserEntity> getAll();
	
	@Select("SELECT * FROM test_users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex",javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
    UserEntity getOne(Long id);
	
	@Insert("INSERT INTO test_users(userName,passWord,user_sex) VALUES(#{userName},#{passWord},#{userSex})")
	void insert(UserEntity user);
	
	@Update("UPDATE test_users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);
	
	@Delete("DELETE FROM test_users WHERE id =#{id}")
	void delete(Long id);
}
