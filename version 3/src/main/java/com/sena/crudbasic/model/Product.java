package com.sena.crudbasic.model;
import jakarta.persistence.*; import lombok.Data;
@Data @Entity @Table(name="products")
public class Product extends BaseEntity {
 private String name;
 private Double price;
 private Long categoryId;
 private Long brandId;
 private Long supplierId;
}