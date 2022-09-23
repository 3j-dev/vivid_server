package com.chicplay.mediaserver.global.error.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // Common
    INVALID_INPUT_VALUE("C01", "Invalid Input Value.",400),
    METHOD_NOT_ALLOWED("C02", "Invalid Input Value.",405),
    ENTITY_NOT_FOUND( "C03", "Entity Not Found.",400),
    INTERNAL_SERVER_ERROR( "C04", "Server Error.",400),
    INVALID_TYPE_VALUE("C05", " Invalid Type Value.",400),
    HANDLE_ACCESS_DENIED( "C06", "Access is Denied.",403),

    // account
    PASSWORD_FAILED_EXCEEDED("A01", "Password attempts exceeded.", 400),
    EMAIL_DUPLICATION("A02", "Email is Duplication",400),
    TOKEN_EXPIRED("A03", "Token is Expired",400),
    TOKEN_NOT_SUPPORTED("A04", "Token is Unsupported Token",400),
    TOKEN_ILLEGAL_STATE("A05", "Token is Illegal State",400),
    TOKEN_NOT_MATCHED("A05", "Token is Should not be Trusted.",400),
    REFRESH_TOKEN_NOT_FOUND("A06", "Refreshed Token Not Found.",400),

    // video
    IMAGE_UPLOAD_FAILED("V02", "Image upload is failed.",500);

    private final String code;
    private final String message;
    private int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
