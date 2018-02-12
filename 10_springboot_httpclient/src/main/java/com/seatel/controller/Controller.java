package com.seatel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aliang
 */

@RestController
@Api(value = "流量业务", description = "流量业务")
//@RequestMapping("/seashop/operator")
public class Controller {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ApiOperation(value = "测试httpclient")
    public String test() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello test";
    }

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    @ApiOperation(value = "json")
    public String buyTrafficTime(@ApiParam(required = true, value = "{\"phone\":\"电话\",\"token\":\"令牌\"}") @RequestBody String param) {
        return param;
    }


}
