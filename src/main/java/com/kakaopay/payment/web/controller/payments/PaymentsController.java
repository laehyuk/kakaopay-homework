package com.kakaopay.payment.web.controller.payments;

import com.kakaopay.payment.service.payments.PaymentsService;
import com.kakaopay.payment.web.dto.payments.*;
import com.kakaopay.payment.web.model.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsService paymentsService;

    @PostMapping
    public ApiResponse<PaymentsSaveResponseDto> save(@RequestBody PaymentsSaveRequestDto requestDto){
        paymentsService.save(requestDto);
        return ApiResponse.OK();
    }

    @GetMapping("/{idx}")
    public ApiResponse<PaymentsResponseDto> findOne(@PathVariable Long idx){
        paymentsService.findOne(idx);
        return ApiResponse.OK();
    }

    @PatchMapping
    public ApiResponse<PaymentsCancelResponseDto> cancel(@RequestBody PaymentsCancelRequestDto requestDto){
        paymentsService.cancel(requestDto);
        return ApiResponse.OK();
    }

}
