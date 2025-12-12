
package com.sena.crudbasic.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sena.crudbasic.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
