package com.inventoryproject.inventory.service.implementation;

import org.springframework.stereotype.Service;

import com.inventoryproject.inventory.entity.Inventory;
import com.inventoryproject.inventory.service.InventoryService;


@Service
public class InventoryServiceImpl implements InventoryService {

	@Override
	public int getStockAvailability(String productId) {
		
		return 0;
	}

	@Override
	public Inventory updateStocks(String productId, int stock) {
		
		return null;
	}

}
