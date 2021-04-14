package com.kakaopay.payment.web.dto.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class PaymentsCancelRequestDto {

    private final String idx;

    private final Long amount;

    private Long vat;

}
