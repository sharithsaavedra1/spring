package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="inventory")
public class Inventory {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long inventoryId;

    @ManyToOne @JoinColumn(name="product_id")
    private Product product;

    private Integer quantity;
}
