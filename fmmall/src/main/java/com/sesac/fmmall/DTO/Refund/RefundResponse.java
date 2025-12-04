package com.sesac.fmmall.DTO.Refund;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundResponse {

    private Long refundId;

    private String reasonCode;
    private String reasonDetail;
    private Integer totalAmount;
    private String refundType;
    private String isTrue;

    private Long orderId;
    private Long paymentId;

    private List<RefundItemResponse> items;
}