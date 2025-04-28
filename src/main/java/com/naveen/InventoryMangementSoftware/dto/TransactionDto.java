package com.naveen.InventoryMangementSoftware.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.naveen.InventoryMangementSoftware.enums.TransactionStatus;
import com.naveen.InventoryMangementSoftware.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDto {
	private Long id;

	private Integer totalProduct;
	private BigDecimal totalPrice;

	private TransactionType transactionType;

	private TransactionStatus transactionStatus;

	private String description;

	private String note;

	private LocalDateTime createdAt;

	private LocalDateTime upadteAt;

	private ProductDto product;

	private UserDto user;

	private SupplierDto supplier;

}
