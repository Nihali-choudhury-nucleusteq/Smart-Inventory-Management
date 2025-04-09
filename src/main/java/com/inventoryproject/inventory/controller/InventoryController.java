package com.inventoryproject.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryproject.inventory.entity.Inventory;
import com.inventoryproject.inventory.service.InventoryService;

@RestController
public class InventoryController {
	@Autowired
	InventoryService inventoryService;
	@GetMapping("/stocksavail/{productId}")	
    public int getStockAvailability(@PathVariable String productId) {
		int result = inventoryService.getStockAvailability(productId);
		return result;
	}

	@PutMapping("/updatestock/{productId}/{quantity}")
	public Inventory updateStocks(@RequestBody Inventory inv, @PathVariable String productId,@PathVariable int quantity) {
		Inventory  inventory = inventoryService.updateStocks(productId, quantity);
		return inventory;
	}

}
