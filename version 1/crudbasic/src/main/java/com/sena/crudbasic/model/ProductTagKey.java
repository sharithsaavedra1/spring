package com.sena.crudbasic.model;
import jakarta.persistence.*; 
import java.io.Serializable;

@Embeddable
public class ProductTagKey implements Serializable {
    private Long productId;
    private Long tagId;
}
