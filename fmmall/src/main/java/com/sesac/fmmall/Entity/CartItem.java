package com.sesac.fmmall.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "cart_item")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CartItem {

    @Id
    private int cartItemId;
    private int quantity;
    private Date addDate;
    private String checkStatus;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cartId;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;

}
