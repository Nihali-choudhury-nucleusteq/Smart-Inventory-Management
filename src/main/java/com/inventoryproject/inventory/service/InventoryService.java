package com.inventoryproject.inventory.service;

import com.inventoryproject.inventory.entity.Inventory;

public interface InventoryService {
	
	int getStockAvailability(String productId);
	
	Inventory updateStocks(String productId, int stock);

}
