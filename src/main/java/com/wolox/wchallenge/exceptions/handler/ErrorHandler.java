package com.wolox.wchallenge.exceptions.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wolox.wchallenge.exceptions.JsonPlaceHolderServiceExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
	
	private final Logger logger = LoggerFactory.getLogger(getClass().getName());
	
	@ExceptionHandler(JsonPlaceHolderServiceExceptionHandler.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	protected ErrorResponse JsonPlaceHolderServiceExceptionHandler(JsonPlaceHolderServiceExceptionHandler ex) {

		logger.error("An error occurred while trying to consume JsonPlaceHolder Service.");
		
		return ErrorResponse.builder().code(ErrorsEnum.JSON_PROCESSING_EXCEPTION.getCode()).message(ErrorsEnum.JSON_PROCESSING_EXCEPTION.getMessage()).build();
	}

}
