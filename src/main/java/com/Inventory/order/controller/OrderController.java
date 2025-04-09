package com.Inventory.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.order.entity.Orders;
import com.Inventory.order.service.OrdersSrevice;

@RestController
public class OrderController {
	
	@Autowired
	OrdersSrevice ordersSrevice;
	
	@PostMapping("/addorder")
    public Orders createOrders(@RequestBody Orders order) {
		Orders orders = ordersSrevice.createOrders(order);
		return orders;
	}
	

}
