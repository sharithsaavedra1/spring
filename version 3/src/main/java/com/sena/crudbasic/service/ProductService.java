package com.sena.crudbasic.service;
import com.sena.crudbasic.model.Product;
import com.sena.crudbasic.dto.ProductDto;
import java.util.List;
public interface ProductService{
 List<Product> findAll();
 Product findById(Long id);
 Product create(ProductDto dto);
 Product update(Long id, ProductDto dto);
 void deleteLogical(Long id);
 void deletePhysical(Long id);
}