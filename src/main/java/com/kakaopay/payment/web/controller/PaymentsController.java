package com.kakaopay.payment.web.controller;

import com.kakaopay.payment.web.dto.PaymentsRequestDto;
import com.kakaopay.payment.web.dto.PaymentsResponseDto;
import com.kakaopay.payment.web.model.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @PostMapping
    public ApiResponse<PaymentsResponseDto> save( @RequestBody PaymentsRequestDto requestDto){
        return ApiResponse.OK();
    }


}
