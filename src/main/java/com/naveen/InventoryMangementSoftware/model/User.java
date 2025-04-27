package com.naveen.InventoryMangementSoftware.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.naveen.InventoryMangementSoftware.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Data
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Name Is Requred")
	private String name;

	@NotBlank(message = "Email Is Requred")
	private String email;

	@NotBlank(message = "Password Is Requred")
	private String password;

	@NotBlank(message = "PhoneNumber Is Requred")
	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "created_at")
	private final LocalDateTime created = LocalDateTime.now();

	@OneToMany(mappedBy = "user")
	private List<Transaction> transaction;

	@Enumerated(EnumType.STRING)
	private UserRole role;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", created=" + created + ", transaction=" + transaction + ", role=" + role + "]";
	}

}
