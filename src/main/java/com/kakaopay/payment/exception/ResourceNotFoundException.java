package com.kakaopay.payment.exception;

import com.kakaopay.payment.exception.base.BaseException;
import com.kakaopay.payment.exception.base.ErrorResult;
import lombok.Getter;

@Getter
public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(String code, String desc, String extraMessage) {
        super(code, desc, extraMessage);
    }

    public ResourceNotFoundException(ErrorResult results) {
        super(results.getCode(), results.getDesc());
    }

    public ResourceNotFoundException(ErrorResult results, String extraMessage) {
        super(results.getCode(), results.getDesc(), extraMessage);
    }

}
