package com.Inventory.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Inventory.order.service.OrderItemsService;

@RestController
public class OrderItemsController {
	
	
	@Autowired
	OrderItemsService orderItemsService;
	
	
  

}
