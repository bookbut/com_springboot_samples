package com.seatelgroup.mpay.demo.service;

import com.seatel.entity.GameUser;

public interface GameUserService {
    public GameUser getGameUser(long userId,String userName);
    public int insertGameUser(GameUser gameUser);
}
