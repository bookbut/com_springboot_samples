package com.springboot.test.data;

public class Constants {
//    每天初始化体力与第一次进游戏金币
    public static int DATA_INIT_STRENGTH = 6;
    public static int DATA_INIT_ACCOUNT = 300;
    public static String DATA_INIT_PHOTO = "0";
//错误状态码
    public static String STATUS = "status";
    public static String DESC = "desc";
    public static String DATA = "data";

    public static int RESULT_SUCCESS_STATUS = 1;
    public static String RESULT_SUCCESS_DESC = "系统成功";
    public static int RESULT_SYS_BUSY_STATUS = 2;
    public static String RESULT_SYS_BUSY_DESC = "系统繁忙";
    public static int RESULT_PARAM_ERROR_STATUS = 3;
    public static String RESULT_PARAM_ERROR_DESC = "参数错误";
    public static int RESULT_LOGIN_TIMEOUT_STATUS = 4;
    public static String RESULT_LOGIN_TIMEOUT_DESC = "登录超时";
    public static int RESULT_VERIFY_FAIL_STATUS = 5;
    public static String RESULT_VERIFY_FAIL_DESC = "参数验证失败";
}
