package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="brands")
public class Brand {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long brandId;
    @Column(nullable=false) private String name;
}
