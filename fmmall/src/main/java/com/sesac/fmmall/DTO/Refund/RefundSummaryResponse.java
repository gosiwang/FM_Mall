package com.sesac.fmmall.DTO.Refund;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundSummaryResponse {

    private Long refundId;
    private String refundType;
    private Integer totalAmount;
    private String isTrue;
}