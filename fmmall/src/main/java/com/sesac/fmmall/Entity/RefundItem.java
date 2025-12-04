package com.sesac.fmmall.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "refund_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_item_id")
    private Long id;

    @Column(name = "refund_quantity", nullable = false)
    private Integer refundQuantity;

    @Column(name = "refund_price", nullable = false)
    private Integer refundPrice;

    @Column(name = "refund_status", length = 20, nullable = false)
    private String refundStatus;   // REQUESTED, COMPLETED 등

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "refund_id", nullable = false)
    private Refund refund;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_item_id", nullable = false)
    private OrderItem orderItem;
}