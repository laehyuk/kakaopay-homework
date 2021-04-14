package com.kakaopay.payment.exception.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class ErrorResult {
    private final String code;
    private final String desc;
    private String extraMessage;

    public static ErrorResult from(ErrorCode errorCode){
        return ErrorResult
                .builder()
                .code(errorCode.getCode())
                .desc(errorCode.getDesc())
                .build();
    }

    public static ErrorResult from(ErrorCode errorCode, String extraMessage){
        return ErrorResult
                .builder()
                .code(errorCode.getCode())
                .desc(errorCode.getDesc())
                .extraMessage(extraMessage)
                .build();
    }
}
