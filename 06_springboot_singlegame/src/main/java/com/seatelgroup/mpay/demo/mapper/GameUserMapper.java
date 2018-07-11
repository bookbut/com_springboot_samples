package com.seatelgroup.mpay.demo.mapper;

import com.seatel.entity.GameUser;
import com.seatel.provider.GameUserProvider;
import com.seatelgroup.mpay.demo.provider.GameUserProvider;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface GameUserMapper {
//    @Select("SELECT * FROM test_users")
//    @Results({ @Result(property = "userSex", column = "user_sex", javaType = UserSex.class),
//            @Result(property = "nickName", column = "nick_name") })
//    public List<User> getUsers();

    //    @Select("SELECT * FROM st_game_user WHERE userId = #{userId}")
    @SelectProvider(type = GameUserProvider.class, method = "getGameUser")
    public GameUser getGameUser(long userId);

    @InsertProvider(type=GameUserProvider.class, method="insertGameUser")
    @Options(useGeneratedKeys = true, keyProperty = "userPk")
    public int insertGameUser(GameUser gameUser);
}
