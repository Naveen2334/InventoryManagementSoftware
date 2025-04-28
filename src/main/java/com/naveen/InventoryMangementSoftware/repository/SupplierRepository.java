package com.naveen.InventoryMangementSoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.InventoryMangementSoftware.model.Supplier;

public interface SupplierRepository  extends JpaRepository<Supplier, Long>{
}
