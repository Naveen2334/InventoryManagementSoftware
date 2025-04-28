package com.naveen.InventoryMangementSoftware.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.InventoryMangementSoftware.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);

}
