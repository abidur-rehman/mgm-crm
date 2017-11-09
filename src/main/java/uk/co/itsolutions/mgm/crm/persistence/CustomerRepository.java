package uk.co.itsolutions.mgm.crm.persistence;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer findCustomerById(Long id);

}
