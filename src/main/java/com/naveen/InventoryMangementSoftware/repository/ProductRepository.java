package com.naveen.InventoryMangementSoftware.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.InventoryMangementSoftware.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	List<Product> findByNameContainingDescriptionContaining(String name, String description);
}
