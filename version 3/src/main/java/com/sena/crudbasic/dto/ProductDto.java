package com.sena.crudbasic.dto;
import lombok.Data; import jakarta.validation.constraints.*;
@Data
public class ProductDto {
 @NotBlank private String name;
 @NotNull @DecimalMin("0.01") private Double price;
 private Long categoryId;
 private Long brandId;
 private Long supplierId;
}