package repositories;

import org.junit.jupiter.api.Test;
import users.userinfo.Address;
import users.userinfo.PhoneNumber;
import org.assertj.core.api.Assertions;

class CustomerRepositoryTest {
    Address defaultAddress = new Address("highstreet",1,1000,"brussels");
    PhoneNumber defaultPhoneNumber = new PhoneNumber(123,456789);


    @Test
    void creatingACustomerAccount_addsCustomerToCustomerList() {
        CustomerRepository.createCustomerAccount("Bob","Bobson","bob@gmail.com",defaultAddress,defaultPhoneNumber);
        Assertions.assertThat(CustomerRepository.getCustomerList().get(0).getEmail().equals("bob@gmail.com"));
    }
}