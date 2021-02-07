package com.wolox.wchallenge.exceptions.handler;

public enum ErrorsEnum {
	JSON_PROCESSING_EXCEPTION("404", "Runtime Server Error");

    private final String code;
    private final String message;

    ErrorsEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
