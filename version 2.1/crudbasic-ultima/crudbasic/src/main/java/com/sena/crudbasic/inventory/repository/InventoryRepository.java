
package com.sena.crudbasic.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
