package users;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import repositories.CustomerRepository;
import users.userinfo.Address;
import users.userinfo.PhoneNumber;

class AdminTest {
    Admin admin = new Admin();

    @Test
    void listAllCustomers() {
        Assertions.assertThat(admin.listAllCustomers()).isEqualTo(CustomerRepository.getCustomerList().toString());
    }

    @Test
    void viewSingleCustomer() {
        Address defaultAddress = new Address("highstreet", 1, 1000, "brussels");
        PhoneNumber defaultPhoneNumber = new PhoneNumber(123, 456789);
        Customer defaultCustomer = new Customer("Bob", "Bobson", "bob@gmail.com", defaultAddress, defaultPhoneNumber);
        CustomerRepository.addCustomer(defaultCustomer);

        Assertions.assertThat(admin.viewSingleCustomer_usingId(defaultCustomer.getCustomerId())).isEqualTo("Bob Bobson");
    }
}