package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="addresses")
public class Address {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long addressId;
    @ManyToOne @JoinColumn(name="customer_id")
    private Customer customer;
    @Column(nullable=false) private String street;
    @Column(nullable=false) private String city;
    private String country = "Colombia";
}
