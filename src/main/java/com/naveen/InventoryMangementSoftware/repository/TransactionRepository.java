package com.naveen.InventoryMangementSoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.naveen.InventoryMangementSoftware.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>,JpaSpecificationExecutor<Transaction>  {

}
