package com.sena.crudbasic.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity @Table(name="orders")
public class Order {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne @JoinColumn(name="customer_id")
    private Customer customer;

    private LocalDateTime orderDate = LocalDateTime.now();
    private Double total;
}
