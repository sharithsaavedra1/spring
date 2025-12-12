package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="order_items")
public class OrderItem {

    @EmbeddedId
    private OrderItemKey id = new OrderItemKey();

    @ManyToOne @MapsId("orderId")
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne @MapsId("productId")
    @JoinColumn(name="product_id")
    private Product product;

    private Integer quantity;
    private Double unitPrice;
}
