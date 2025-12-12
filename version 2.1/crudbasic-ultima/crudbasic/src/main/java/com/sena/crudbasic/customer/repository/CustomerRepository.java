
package com.sena.crudbasic.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
