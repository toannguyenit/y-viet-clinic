package com.yviet.app.clinic.exception;


import lombok.Getter;
import lombok.Setter;

/**
 * AppException -
 *
 * @param
 * @return
 * @throws
 */
@Getter
@Setter
public class AppException extends RuntimeException{

    private ErrorCode errorCode;
    private Object data;

    public AppException(ErrorCode errorCode){
        super(errorCode.getMessageEng());
        this.errorCode = errorCode;

    }

}
