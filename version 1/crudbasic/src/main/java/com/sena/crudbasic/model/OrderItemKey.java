package com.sena.crudbasic.model;
import jakarta.persistence.*; 
import java.io.Serializable;

@Embeddable
public class OrderItemKey implements Serializable {
    private Long orderId;
    private Long productId;
}
