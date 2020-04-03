package be.matias.service;

import be.matias.domain.repositories.CustomerRepository;
import be.matias.domain.users.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Admin {
    public Admin() {
    }

    public String listAllCustomers() {
        return CustomerRepository.getCustomerList().toString();
    }

    public Customer viewSingleCustomer_usingId(String customerId) {
        return getCustomerWithId(UUID.fromString(customerId));
    }

    public Customer getCustomerWithId(UUID customerId) {
        for (Customer customer : CustomerRepository.getCustomerList()
        ) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
}