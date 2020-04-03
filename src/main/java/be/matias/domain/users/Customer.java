package be.matias.domain.users;

import be.matias.domain.items.Item;
import be.matias.domain.items.ItemGroup;
import be.matias.domain.orders.Order;
import be.matias.domain.repositories.ItemRepository;
import be.matias.domain.users.userinfo.Address;
import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.domain.users.userinfo.PhoneNumber;

import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private PhoneNumber phoneNumber;
    private CustomerCart customerCart;

    public Customer(String firstName, String lastName, String email, Address address, PhoneNumber phoneNumber,CustomerCart customerCart) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerCart = customerCart;
    }

    public String getEmail() {
        return email;
    }

    public void addToCart(UUID itemId, int amount) {
        Item selectedItem = ItemRepository.getItemWithUniqueId(itemId);
        ItemGroup itemGroupToAdd = new ItemGroup(itemId, amount, selectedItem.determineShippingDate());
        customerCart.addItemGroupToCart(itemGroupToAdd);
    }

    public Order order() {
        return new Order(customerCart.getItemGroups(), customerId);
    }

    public CustomerCart getCustomerCart() {
        return customerCart;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    @Override
    public String toString() {
        return getFullName() + customerId.toString();
    }
}