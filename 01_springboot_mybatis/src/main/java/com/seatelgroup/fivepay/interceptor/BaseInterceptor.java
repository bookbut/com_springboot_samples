package com.seatelgroup.fivepay.interceptor;

//import com.seatelgroup.api.data.ResponseConstants;
//import com.seatelgroup.api.util.MD5;
//import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseInterceptor implements HandlerInterceptor {
	
	@Value("${systemSettings.key:seashop#seatelgroup}")
	private String key;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
//		Map<String, String[]> params = request.getParameterMap();
//		JSONObject result = new JSONObject();
//		response.setContentType("application/json;charset=utf-8");
//		if(params.get("sign") == null || params.get("timestamp") == null){
//			result.put(ResponseConstants.STATUS_CONSTANTS, ResponseConstants.SYS_PARAM_ERROR);
//			result.put(ResponseConstants.DESC_CONSTENTS, ResponseConstants.SYS_PARAM_DESC);
//			response.getWriter().println(result.toString());
//			return false;
//		}
//		String sign = params.get("sign")[0];
//		String timestamp = params.get("timestamp")[0];
//		String verifySign = MD5.md5(key + timestamp);
//		if(!sign.equals(verifySign)){
//			result.put(ResponseConstants.STATUS_CONSTANTS, ResponseConstants.SYS_VILIDATE_ERROR);
//			result.put(ResponseConstants.DESC_CONSTENTS, ResponseConstants.SYS_VILIDATE_DESC);
//			response.getWriter().println(result.toString());
//			return false;
//		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
