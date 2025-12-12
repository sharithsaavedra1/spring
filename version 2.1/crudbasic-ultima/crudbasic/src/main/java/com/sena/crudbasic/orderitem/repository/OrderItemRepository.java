
package com.sena.crudbasic.orderitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
