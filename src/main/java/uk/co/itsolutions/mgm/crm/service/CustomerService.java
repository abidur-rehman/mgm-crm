package uk.co.itsolutions.mgm.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.itsolutions.mgm.crm.persistence.Customer;
import uk.co.itsolutions.mgm.crm.persistence.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer findCustomerById(String id) {
        return repository.findCustomerById(Long.parseLong(id));
    }

    public Iterable<Customer> findAll() {
        return repository.findAll();
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }
}
