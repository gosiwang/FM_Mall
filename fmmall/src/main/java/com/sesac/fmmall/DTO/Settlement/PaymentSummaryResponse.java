package com.sesac.fmmall.DTO.Settlement;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentSummaryResponse {

    private Long paymentId;
    private String paymentMethodType;
    private LocalDateTime paidAt;
}