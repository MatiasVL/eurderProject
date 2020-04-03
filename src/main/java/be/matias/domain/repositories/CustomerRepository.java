package be.matias.domain.repositories;

import be.matias.domain.users.Customer;
import be.matias.domain.users.userinfo.Address;
import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.domain.users.userinfo.PhoneNumber;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    public CustomerRepository() {
    }

    public static void createCustomerAccount(String firstName, String lastName, String email, Address address, PhoneNumber phoneNumber, CustomerCart customerCart) {
        Customer customer = new Customer(firstName, lastName, email, address, phoneNumber,customerCart);
        CustomerRepository.addCustomer(customer);
    }

    public static void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }
}