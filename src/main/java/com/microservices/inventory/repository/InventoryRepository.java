package com.microservices.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	public Boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);

}
