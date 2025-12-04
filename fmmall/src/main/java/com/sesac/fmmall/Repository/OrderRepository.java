package com.sesac.fmmall.Repository;

import com.sesac.fmmall.Entity.Order;
import com.sesac.fmmall.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


    List<Order> findByUser(User user);


    List<Order> findByUser_Id(Long userId);


    Order findByIdAndUser_Id(Long orderId, Long userId);
}
