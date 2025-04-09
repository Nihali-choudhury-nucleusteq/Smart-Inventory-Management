package com.Inventory.order.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Inventory.order.entity.OrderItems;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItems, UUID>{

}
