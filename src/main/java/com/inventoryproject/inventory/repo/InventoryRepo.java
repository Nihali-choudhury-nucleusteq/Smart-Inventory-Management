package com.inventoryproject.inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventoryproject.inventory.entity.Inventory;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, String>{

}
