package be.matias.service.customerdto;

import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.service.customerdto.AddressDto;
import be.matias.service.customerdto.PhoneNumberDto;

public class CustomerDto {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private AddressDto address;
    private PhoneNumberDto phoneNumber;
    private CustomerCartDto customerCart;

    public CustomerDto(String customerId, String firstName, String lastName, String email, AddressDto address, PhoneNumberDto phoneNumber, CustomerCartDto customerCart) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerCart = customerCart;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public AddressDto getAddress() {
        return address;
    }

    public PhoneNumberDto getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerCartDto getCustomerCart() {
        return customerCart;
    }
}
