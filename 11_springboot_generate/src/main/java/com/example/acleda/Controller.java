package com.example.acleda;

import com.seatelgroup.foundation.businessapi.http.HttpsClient;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @ApiOperation(value = "openSessionv", httpMethod = "GET")
    @RequestMapping(value = "/openSessionv")
    public String openSessionv2() {
        JSONObject params = new JSONObject();
        params.put("loginId", "seatel");
        params.put("password", "778seatel@usr");
        params.put("merchantID", "OiiV9lElGi7dr9W8vEJ+s7AiNuU=");
        params.put("signature", "88e75ffa7cd6");
        JSONObject transactionDetails = new JSONObject();
        transactionDetails.put("txid", "012345");
        transactionDetails.put("purchaseAmount", 100);
        transactionDetails.put("purchaseCurrency", "USD");
        transactionDetails.put("purchaseDate", "04-10-2017");
        transactionDetails.put("purchaseDesc", "mobile");
        transactionDetails.put("invoiceid", 543210);
        transactionDetails.put("item", "2");
        transactionDetails.put("quantity", 2);
        transactionDetails.put("expiryTime", 5);
        params.put("transactionDetails", transactionDetails);

        return HttpsClient.executeBody("https://epaymentuat.acledabank.com.kh:8443/SEATEL/XPAYMobilePayment/XPAYRestRS/openSessionv2", params.toString(), "application/json");
    }


    @ApiOperation(value = "SetDirection", httpMethod = "GET")
    @RequestMapping(value = "/SetDirection")
    public String SetDirection(@ApiParam(required = true, value = "sessionid") @RequestParam(value = "sessionid", required = true) String sessionid,
                               @ApiParam(required = true, value = "ptokenId") @RequestParam(value = "ptokenId", required = true) String ptokenId) {
        JSONObject params = new JSONObject();

        params.put("sessionid", sessionid);
        params.put("ptokenId", ptokenId);
        params.put("direction", 1);
        params.put("accountnumber", "09000869822011");

        return HttpsClient.executeBody("https://epaymentuat.acledabank.com.kh:8443/SEATEL/XPAYMobilePayment/XPAYRestRS/SetDirection", params.toString(), "application/json");
    }

    @ApiOperation(value = "getTransactionStatus", httpMethod = "GET")
    @RequestMapping(value = "/getTransactionStatus")
    public String getTransactionStatus(@ApiParam(required = true, value = "sessionid") @RequestParam(value = "sessionid", required = true) String sessionid,
                                       @ApiParam(required = true, value = "ptokenId") @RequestParam(value = "ptokenId", required = true) String ptokenId) {
        JSONObject params = new JSONObject();

        params.put("sessionid", sessionid);
        params.put("ptokenId", ptokenId);
        return HttpsClient.executeBody("https://epaymentuat.acledabank.com.kh:8443/SEATEL/XPAYMobilePayment/XPAYRestRS/getTransactionStatus", params.toString(), "application/json");
    }

    @ApiOperation(value = "CloseSession", httpMethod = "GET")
    @RequestMapping(value = "/CloseSession")
    public String CloseSession(@ApiParam(required = true, value = "sessionid") @RequestParam(value = "sessionid", required = true) String sessionid) {
        JSONObject params = new JSONObject();

        params.put("sessionid", sessionid);
        return HttpsClient.executeBody("https://epaymentuat.acledabank.com.kh:8443/SEATEL/XPAYMobilePayment/XPAYRestRS/CloseSession", params.toString(), "application/json");
    }
}
