package com.sesac.fmmall.DTO.Refund;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundItemResponse {

    private Long refundItemId;

    private Long orderItemId;
    private Integer refundQuantity;
    private Integer refundPrice;
    private String refundStatus;
}
