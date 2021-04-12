package com.kakaopay.payment.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class PaymentsResponseDto {

    private final Long idx;

    private final String data;

}
