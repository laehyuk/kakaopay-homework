package com.kakaopay.payment.web.dto.payments;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PaymentsCancelResponseDto {

    private final Long idx;

    private final String data;

}
