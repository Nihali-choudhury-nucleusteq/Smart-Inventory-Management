package com.inventoryproject.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryproject.inventory.entity.Inventory;

@RestController
public class InventoryController {
	@GetMapping("/stocksavail")
    public int getStockAvailability(@PathVariable String productId) {
		
		return 0;
	}

	
	public Inventory updateStocks(String productId, int stock) {
		
		return null;
	}

}
