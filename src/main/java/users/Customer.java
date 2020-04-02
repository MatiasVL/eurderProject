package users;

import items.Item;
import items.ItemGroup;
import orders.Order;
import repositories.ItemRepository;
import users.userinfo.Address;
import users.userinfo.PhoneNumber;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private PhoneNumber phoneNumber;
    private List<ItemGroup> customerCart;
    private String fullName;

    public Customer(String firstName, String lastName, String email, Address address, PhoneNumber phoneNumber) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        customerCart = new ArrayList<>();
        fullName = firstName+" "+lastName;
    }

    public String getEmail() {
        return email;
    }

    public void addToCart(UUID itemId, int amount) {
        Item selectedItem = ItemRepository.getItemWithUniqueId(itemId);
        ItemGroup itemGroupToAdd = new ItemGroup(itemId, amount, selectedItem.determineShippingDate());
        customerCart.add(itemGroupToAdd);
    }

    public Order order() {
        return new Order(customerCart, customerId);
    }

    public List<ItemGroup> getCustomerCart() {
        return customerCart;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return fullName;
    }
}