
package com.sena.crudbasic.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
