package com.kakaopay.payment.web.dto.payments;

import com.kakaopay.payment.domain.payments.Payments;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class PaymentsResponseDto {

    private final Long idx;

    private final String data;

    public static PaymentsResponseDto from(Payments payments){
        return PaymentsResponseDto.builder().build();
    }

}
