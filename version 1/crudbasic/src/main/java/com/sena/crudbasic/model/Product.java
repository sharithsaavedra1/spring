package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="products")
public class Product {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long productId;
    @Column(nullable=false) private String name;

    @ManyToOne @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne @JoinColumn(name="supplier_id")
    private Supplier supplier;

    @Column(nullable=false) private Double price;
}
