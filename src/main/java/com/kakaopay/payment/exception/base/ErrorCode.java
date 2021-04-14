package com.kakaopay.payment.exception.base;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    RESOURCE_NOT_FOUND("RESULT_NOT_FOUND", "The results were not found.");

    private final String code;
    private final String desc;

}
