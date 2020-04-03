package be.matias.controller;

import be.matias.domain.repositories.CustomerRepository;
import be.matias.domain.users.Customer;
import be.matias.domain.users.userinfo.Address;
import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.domain.users.userinfo.PhoneNumber;
import be.matias.service.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/customers", produces = "application/json")
@RestController
public class CustomerController {

    Admin admin;

    @Autowired
    public CustomerController(Admin admin) {
        this.admin = admin;
    }

    @GetMapping
    public String getAllCustomer() {
        return admin.listAllCustomers();
    }

    @GetMapping(path = "/{id}")
    public Customer viewSingleCustomer_usingId(@PathVariable String id) {
        return admin.viewSingleCustomer_usingId(id);
    }

    @PostMapping
    public void createCustomer() {
        Address defaultAddress = new Address("highstreet", "1", "1000", "brussels");
        PhoneNumber defaultPhoneNumber = new PhoneNumber(123, 456789);
        Customer defaultCustomer = new Customer("Bob", "Bobson", "bob@gmail.com", defaultAddress, defaultPhoneNumber,new CustomerCart());
        CustomerRepository.addCustomer(defaultCustomer);
    }
}
