package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="suppliers")
public class Supplier {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long supplierId;
    @Column(nullable=false) private String name;
    private String phone;
}
