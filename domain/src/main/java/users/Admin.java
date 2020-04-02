package users;

import repositories.CustomerRepository;

import java.util.UUID;

public class Admin {
    public Admin() {
    }

    public String listAllCustomers() {
        return CustomerRepository.getCustomerList().toString();
    }

    public String viewSingleCustomer_usingId(UUID customerId) {
        return getCustomerWithId(customerId).toString();
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
