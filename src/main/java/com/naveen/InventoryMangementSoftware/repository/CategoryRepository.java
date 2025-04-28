package com.naveen.InventoryMangementSoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.InventoryMangementSoftware.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
