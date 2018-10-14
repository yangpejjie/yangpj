package com.jianbo.platform.common.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jianbo.platform.common.utils.CommonResponse;

/**
 * 异常处理器
 */
@RestControllerAdvice
public class JianBoExceptionHandler {
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 自定义异常
	 */
	@ExceptionHandler(JianBoException.class)
	public CommonResponse handleRRException(JianBoException e){
		CommonResponse r = new CommonResponse();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(DuplicateKeyException.class)
	public CommonResponse handleDuplicateKeyException(DuplicateKeyException e){
		logger.error(e.getMessage(), e);
		return CommonResponse.error("数据库中已存在该记录");
	}

	@ExceptionHandler(AuthorizationException.class)
	public CommonResponse handleAuthorizationException(AuthorizationException e){
		logger.error(e.getMessage(), e);
		return CommonResponse.error("没有权限，请联系管理员授权");
	}

	@ExceptionHandler(Exception.class)
	public CommonResponse handleException(Exception e){
		logger.error(e.getMessage(), e);
		return CommonResponse.error();
	}
}
