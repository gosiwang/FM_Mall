package com.sesac.fmmall.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "inquiry")
@Getter

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inquiryId;
    private String inquiryContent;
    @Column(name = "created_at", insertable = false, updatable = false) // INSERT 시 쿼리에서 제외하도록 설정
    private LocalDateTime createdAt;
    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

//    @ManyToOne
//    @JoinColumn(name = "userId")
//    private User user;
    private int userId;

//    @ManyToOne
//    @JoinColumn(name = "productId")
//    private Product product;
    private int productId;



}