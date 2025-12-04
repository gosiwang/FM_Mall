package com.sesac.fmmall.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "cart_item")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemId;

    private int quantity;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime addDate;

    @Column(length = 1)
    private String checkStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void updateCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

}
