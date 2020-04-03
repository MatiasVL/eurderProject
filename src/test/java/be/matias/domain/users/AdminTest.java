package be.matias.domain.users;

import be.matias.domain.repositories.CustomerRepository;
import be.matias.domain.users.userinfo.PhoneNumber;
import be.matias.service.Admin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import be.matias.domain.users.userinfo.Address;

class AdminTest {
    Admin admin = new Admin();

    @Test
    void listAllCustomers() {
        Assertions.assertThat(admin.listAllCustomers()).isEqualTo(CustomerRepository.getCustomerList().toString());
    }

//    @Test
//    void viewSingleCustomer() {
//        Address defaultAddress = new Address("highstreet", 1, 1000, "brussels");
//        PhoneNumber defaultPhoneNumber = new PhoneNumber(123, 456789);
//        Customer defaultCustomer = new Customer("Bob", "Bobson", "bob@gmail.com", defaultAddress, defaultPhoneNumber);
//        CustomerRepository.addCustomer(defaultCustomer);
//
//        Assertions.assertThat(admin.viewSingleCustomer_usingId(defaultCustomer.getCustomerId().toString())).isEqualTo("Bob Bobson");
//    }
}