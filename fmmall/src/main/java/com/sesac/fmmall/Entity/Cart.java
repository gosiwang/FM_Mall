package com.sesac.fmmall.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {

    @Id
    private int cartId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
