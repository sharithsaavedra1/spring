package com.sena.crudbasic.model;
import jakarta.persistence.*;

@Entity @Table(name="product_tags")
public class ProductTag {

    @EmbeddedId
    private ProductTagKey id = new ProductTagKey();

    @ManyToOne @MapsId("productId")
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne @MapsId("tagId")
    @JoinColumn(name="tag_id")
    private Tag tag;
}
