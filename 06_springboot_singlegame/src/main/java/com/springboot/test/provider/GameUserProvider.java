package com.springboot.test.provider;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.jdbc.SQL;

public class GameUserProvider {
    public String getGameUser() {
        return new SQL().SELECT("*").FROM("st_game_user").WHERE("userId = #{userId}").toString();
    }

    public String insertGameUser() {
//        @Insert("INSERT INTO test_users(userName,passWord,nick_name,user_sex) VALUES(#{userName},#{passWord},#{nickName},#{userSex})")
//        return new SQL().INSERT_INTO("test_users").VALUES("userId,userName,userPhoto", "#{userId},#{userName},#{userPhoto}").toString();
        return new SQL().INSERT_INTO("st_game_user")
                .VALUES("userPhoto", "#{userPhoto}")
                .VALUES("userId", "#{userId}")
//                .VALUES("userPhoto, userBjAccount", "#{userPhoto}, #{userBjAccount}")
//                .VALUES("userId, userStatus", "#{userId}, #{userStatus}")
//                .VALUES("hexagonStrength", "#{hexagonStrength}")
//                .VALUES("currentDate", "#{currentDate}")
                .VALUES("userName", "#{userName}")
//                .VALUES("snakeStrength", "#{snakeStrength}")
//                .VALUES("snakeCurrentDate", "#{snakeCurrentDate}")
//                .VALUES("smilyCubesStrength", "#{smilyCubesStrength}")
//                .VALUES("smilyCubesCurrentDate", "#{smilyCubesCurrentDate}")
                .VALUES("bingoStrength", "#{bingoStrength}")
                .VALUES("bingoHighSource", "#{bingoHighSource}")
                .VALUES("bingoCurrentDate", "#{bingoCurrentDate}")
                .VALUES("bingoHighPass", "#{bingoHighPass}")
                .toString();
    }
}
