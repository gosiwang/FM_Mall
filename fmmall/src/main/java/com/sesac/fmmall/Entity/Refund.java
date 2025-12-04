package com.sesac.fmmall.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "refund")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id")
    private Long id;

    @Column(name = "reason_code", length = 10, nullable = false)
    private String reasonCode;

    @Column(name = "reason_detail", length = 255, nullable = false)
    private String reasonDetail;

    @Column(name = "total_amount", nullable = false)
    private Integer totalAmount;

    @Column(name = "refund_type", length = 20, nullable = false)
    private String refundType;   // FULL / PARTIAL 등

    @Column(name = "is_true", length = 1, nullable = false)
    private String isTrue;       // 'Y' / 'N' 등 (나중에 enum/boolean으로 감싸도 됨)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @OneToMany(mappedBy = "refund", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<RefundItem> refundItems = new ArrayList<>();
}