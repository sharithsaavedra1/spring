
package com.sena.crudbasic.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
