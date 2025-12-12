package com.sena.crudbasic.model;
import jakarta.persistence.*; import lombok.Data;
import java.time.LocalDateTime;
@MappedSuperclass @Data
public abstract class BaseEntity {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private LocalDateTime createdAt=LocalDateTime.now();
 private Boolean active=true;
}