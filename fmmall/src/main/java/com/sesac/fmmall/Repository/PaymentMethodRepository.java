package com.sesac.fmmall.Repository;

import com.sesac.fmmall.Entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Long> {

    List<PaymentMethod> findByUserId(Long userId);

    Optional<PaymentMethod> findByUserIdAndIsDefault(Long userId, Boolean isDefault);
}
