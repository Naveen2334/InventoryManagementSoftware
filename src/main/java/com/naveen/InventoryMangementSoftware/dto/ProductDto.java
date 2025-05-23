package com.naveen.InventoryMangementSoftware.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto {

	private Long id;
	private Long categoryId;
	private Long productId;
	private Long supplierId;
	private String name;
	private String sku;
	private BigDecimal price;
	private Integer stockQuantity;
	private String description;
	private String expiryDate;
	private String imageUrl;
	private CategoryDto category;

}
