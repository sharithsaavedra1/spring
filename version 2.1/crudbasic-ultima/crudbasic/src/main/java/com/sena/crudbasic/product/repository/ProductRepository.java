
package com.sena.crudbasic.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
