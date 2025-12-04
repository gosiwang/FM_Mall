package com.sesac.fmmall.DTO.CartItem;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartItemResponseDTO {

    private Long cartItemId;
    private Long productId;
    private String productName;
    private int productPrice;
    private String productImage;
    private int quantity;
    private int totalPrice;
    private String checkStatus;
    private LocalDateTime addDate;

}
