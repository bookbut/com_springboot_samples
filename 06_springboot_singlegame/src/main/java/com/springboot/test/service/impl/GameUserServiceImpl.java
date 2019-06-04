package com.springboot.test.service.impl;

import com.seatel.data.Constants;
import com.seatel.entity.GameUser;
import com.seatel.mapper.GameUserMapper;
import com.seatel.service.GameUserService;
import com.seatelgroup.fivepay.demo.mapper.GameUserMapper;
import com.seatelgroup.fivepay.demo.service.GameUserService;
import com.seatelgroup.fivepay.mapper.GameUserMapper;
import com.seatelgroup.fivepay.service.GameUserService;
import com.seatelgroup.mpay.demo.mapper.GameUserMapper;
import com.seatelgroup.mpay.demo.service.GameUserService;
import com.springboot.test.service.GameUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameUserService")
public class GameUserServiceImpl implements GameUserService {
    @Autowired
    private GameUserMapper gameUserMapper;
    @Override
    public GameUser getGameUser(long userId,String userName) {
        GameUser gameUser = gameUserMapper.getGameUser(userId);
        if(gameUser==null){
            gameUser = new GameUser();
            gameUser.setUserId(userId);
            gameUser.setUserName(userName);
            gameUser.setUserPhoto(Constants.DATA_INIT_PHOTO);
            gameUserMapper.insertGameUser(gameUser);
        }
        return gameUser;
//        return new GameUser();
    }

    @Override
    public int insertGameUser(GameUser gameUser){
        return gameUserMapper.insertGameUser(gameUser);
    }
}
