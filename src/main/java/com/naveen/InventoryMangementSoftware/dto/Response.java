package com.naveen.InventoryMangementSoftware.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.naveen.InventoryMangementSoftware.enums.UserRole;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

	private int status;
	private String message;
	private String token;
	private UserRole role;
	private String expirationTime;
	private Integer totalPage;
	private Long totalElement;
	private UserDto user;
	private List<UserDto> users;
	private SupplierDto supplier;
	private List<SupplierDto> suppliers;
	private ProductDto product;
	private List<ProductDto> products;
	private TransactionDto transaction;
	private List<TransactionDto> transactions;
	private final LocalDateTime timestamp = LocalDateTime.now();
}
