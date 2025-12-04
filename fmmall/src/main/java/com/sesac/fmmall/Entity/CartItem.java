package com.sesac.fmmall.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "cart_item")
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class CartItem {

    @Id
    private int cartItemId;
    private int quantity;
    private Date addDate;
    private String checkStatus;
    private Cart cartId;
    @ManyToOne
    private Product productId;

}
