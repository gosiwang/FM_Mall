package com.sesac.fmmall.DTO.Order;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemCreateRequest {

    private Long productId;
    private Integer quantity;
}