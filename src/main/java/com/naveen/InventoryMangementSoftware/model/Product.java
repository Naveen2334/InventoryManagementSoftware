package com.naveen.InventoryMangementSoftware.model;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Product Name is reqired")
	private String name;

	@Column(unique = true)
	@NotBlank(message = "sku is reqired")
	private String sku;

	@Positive(message = "Product Price must be positive value")
	private BigDecimal price;

	@Min(value = 0, message = "Stock quantity cannnot be negative")
	private Integer stockQuantity;

	private String description;

	private String expiryDate;

	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", sku=" + sku + ", price=" + price + ", stockQuantity="
				+ stockQuantity + ", description=" + description + ", expiryDate=" + expiryDate + ", imageUrl="
				+ imageUrl + ", category=" + category + "]";
	}

}
