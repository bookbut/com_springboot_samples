package com.seatelgroup.learn.sql;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.seatelgroup.learn.pojo.Learn;

public interface LearnMapper {
	
	@Insert("insert into learn(learnName) values"
			+ "(#{learnName})")
	@Options(useGeneratedKeys = false)
	public void insert(@Param(value = "learnName") String learnName);

	@Select("select * from learn where learnName = #{learnName}")
	public Learn select(@Param(value = "learnName") String learnName);
	
	@Update("update learn set learnName = #{learnName} where learnId = #{learnId}")
	public void update(@Param(value = "learnId") int learnId, @Param(value = "learnName") int learnName);

	@Delete("delete from learn where learnId = #{learnId}")
	public void delete(@Param(value = "learnId") int learnId);

	
}
