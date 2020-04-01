package repositories;

import users.Customer;
import users.userinfo.Address;
import users.userinfo.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    public CustomerRepository() {
    }

    public static void createCustomerAccount(String firstName, String lastName, String email, Address address, PhoneNumber phoneNumber) {
        Customer customer = new Customer(firstName, lastName, email, address, phoneNumber);
        CustomerRepository.addCustomer(customer);
    }

    public static void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }
}