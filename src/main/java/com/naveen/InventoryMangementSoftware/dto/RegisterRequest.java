package com.naveen.InventoryMangementSoftware.dto;

import com.naveen.InventoryMangementSoftware.enums.UserRole;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

	@NotBlank(message = "Name is required")
	private String name;

	@NotBlank(message = "email is requred")
	private String email;

	@NotBlank(message = "password is required")
	private String password;

	private UserRole role;
	

}
