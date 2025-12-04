package com.sesac.fmmall.Repository;

import com.sesac.fmmall.Entity.OrderItem;
import com.sesac.fmmall.Entity.Refund;
import com.sesac.fmmall.Entity.RefundItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RefundItemRepository extends JpaRepository<RefundItem, Long> {


    List<RefundItem> findByRefund(Refund refund);
    List<RefundItem> findByRefund_Id(Long refundId);


    List<RefundItem> findByOrderItem(OrderItem orderItem);
    List<RefundItem> findByOrderItem_Id(Long orderItemId);
}