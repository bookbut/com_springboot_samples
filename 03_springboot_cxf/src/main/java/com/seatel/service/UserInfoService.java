package com.seatel.service;

import com.seatel.entity.UserInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserInfoService {
    @WebMethod
    String getName(@WebParam(name = "userId") long userId);

    @WebMethod
    UserInfo getUser(long userId);
}
