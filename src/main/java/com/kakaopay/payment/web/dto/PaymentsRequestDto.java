package com.kakaopay.payment.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class PaymentsRequestDto {

    private final String cardNumber;

    private final Integer expiryDate;

    private final Integer cvc;

    private final Integer installments;

    private final Long amount;

    private Long vat;

}
