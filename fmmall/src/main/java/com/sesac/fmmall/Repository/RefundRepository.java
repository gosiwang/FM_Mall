package com.sesac.fmmall.Repository;

import com.sesac.fmmall.Entity.Order;
import com.sesac.fmmall.Entity.Payment;
import com.sesac.fmmall.Entity.Refund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefundRepository extends JpaRepository<Refund, Long> {


    List<Refund> findByOrder(Order order);
    List<Refund> findByOrder_Id(Long orderId);


    List<Refund> findByPayment(Payment payment);
    List<Refund> findByPayment_Id(Long paymentId);
}