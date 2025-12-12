package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="customers")
public class Customer {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long customerId;
    @Column(nullable=false) private String firstName;
    @Column(nullable=false) private String lastName;
    @Column(unique=true) private String email;
    private String phone;
}
