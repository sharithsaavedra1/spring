package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="categories")
public class Category {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long categoryId;
    @Column(nullable=false) private String name;
}
