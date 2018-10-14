package com.jianbo.platform.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 */
public class CommonResponse extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public CommonResponse() {
		put("code", 0);
	}
	
	public static CommonResponse error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static CommonResponse error(String msg) {
		return error(500, msg);
	}
	
	public static CommonResponse error(int code, String msg) {
		CommonResponse r = new CommonResponse();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static CommonResponse ok(String msg) {
		CommonResponse r = new CommonResponse();
		r.put("msg", msg);
		return r;
	}
	
	public static CommonResponse ok(Map<String, Object> map) {
		CommonResponse r = new CommonResponse();
		r.putAll(map);
		return r;
	}
	
	public static CommonResponse ok() {
		return new CommonResponse();
	}

	public CommonResponse put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
