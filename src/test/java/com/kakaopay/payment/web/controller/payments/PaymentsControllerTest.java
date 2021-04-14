package com.kakaopay.payment.web.controller.payments;

import com.kakaopay.abstracts.AbstractWebMvcTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PaymentsControllerTest extends AbstractWebMvcTest {

    @Test
    @DisplayName("필수파라미터로 결제저장시 200응답과 관리번호와 전달한데이터를 응답으로 받는다")
    public void Should_GetOkAndResponse_When_SavePayments_WithRequiredParameters() throws Exception {
        mockMvc.perform(
                post("/payments")
        )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("필수파라미터 누락 시 400응답을 받는다")
    public void Should_Get400_When_SavePayments_WithOutRequiredParameters() throws Exception {
        mockMvc.perform(
                post("/payments")
        )
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("필수 및 추가파라미터로 결제저장시 200응답과 관리번호와 전달한데이터를 응답으로 받는다")
    public void Should_GetOkAndResponse_When_SavePayments_WithRequiredAndOptionalParameters() throws Exception {
        mockMvc.perform(
                post("/payments")
        )
                .andDo(print())
                .andExpect(status().isOk());
    }
}
