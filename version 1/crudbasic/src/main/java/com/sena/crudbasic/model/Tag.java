package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="tags")
public class Tag {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long tagId;
    @Column(nullable=false, unique=true)
    private String name;
}
