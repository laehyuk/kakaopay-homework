package com.kakaopay.payment.service.payments;

import com.kakaopay.payment.domain.payments.Payments;
import com.kakaopay.payment.domain.payments.PaymentsRepository;
import com.kakaopay.payment.exception.ResourceNotFoundException;
import com.kakaopay.payment.web.dto.payments.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.kakaopay.payment.exception.base.ErrorCode.RESOURCE_NOT_FOUND;
import static com.kakaopay.payment.exception.base.ErrorResult.from;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentsService {

    private final PaymentsRepository paymentsRepository;

    @Transactional(rollbackFor = Exception.class)
    public PaymentsSaveResponseDto save( PaymentsSaveRequestDto requestDto){

        return null;
    }

    @Transactional(readOnly = true)
    public PaymentsResponseDto findOne( Long idx){
        Payments payments = findById(idx);

        return PaymentsResponseDto.from(payments);
    }

    @Transactional(rollbackFor = Exception.class)
    public PaymentsCancelResponseDto cancel( PaymentsCancelRequestDto requestDto){
        return null;
    }

    @Transactional(readOnly = true)
    public Payments findById(Long idx){
        return paymentsRepository.findById(idx).orElseThrow(
                () -> new ResourceNotFoundException(from(RESOURCE_NOT_FOUND))
        );
    }
}
