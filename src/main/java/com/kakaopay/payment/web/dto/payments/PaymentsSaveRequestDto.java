package com.kakaopay.payment.web.dto.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class PaymentsSaveRequestDto {

    private final String cardNumber;

    private final Integer expiryDate;

    private final Integer cvc;

    private final Integer installments;

    private final Long amount;

    private Long vat;

}
