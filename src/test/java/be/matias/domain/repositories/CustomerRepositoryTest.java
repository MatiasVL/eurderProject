package be.matias.domain.repositories;

import be.matias.domain.items.Item;
import be.matias.domain.users.Customer;
import be.matias.domain.users.userinfo.Address;
import be.matias.domain.users.userinfo.CustomerCart;
import be.matias.domain.users.userinfo.PhoneNumber;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.time.LocalDate;

class CustomerRepositoryTest {
    Address defaultAddress = new Address("highstreet", "1", "1000", "brussels");
    PhoneNumber defaultPhoneNumber = new PhoneNumber(123, 456789);
    Customer defaultCustomer = new Customer("Bob", "Bobson", "bob@gmail.com", defaultAddress, defaultPhoneNumber,new CustomerCart());
    Item defaultLaptop = new Item("laptop", "use for computering", 1000, 10);
    Item defaultFridge = new Item("fridge", "use for cooling", 300, 0);

    @Test
    void creatingACustomerAccount_addsCustomerToCustomerList() {
        CustomerRepository.createCustomerAccount("Bob", "Bobson", "bob@gmail.com", defaultAddress, defaultPhoneNumber,new CustomerCart());
        Assertions.assertThat(CustomerRepository.getCustomerList().get(0).getEmail().equals("bob@gmail.com"));
    }

    @Test
    void customerCanAddToCart() {
        addSomeItemsToItemRepoAndCart();
        Assertions.assertThat(defaultCustomer.getCustomerCart().getCartSize()).isEqualTo(2);
    }

    @Test
    void orderHasCorrectPrice() {
        addSomeItemsToItemRepoAndCart();
        Assertions.assertThat(defaultCustomer.order().getTotalPrice()).isEqualTo(2300);
    }

    @Test
    void orderHasCorrectDeliveryDate() {
        addSomeItemsToItemRepoAndCart();
        LocalDate expectedOrderShippingDate = LocalDate.now().plusDays(7);
        Assertions.assertThat(defaultCustomer.order().getOrderShippingDate()).isEqualTo(expectedOrderShippingDate);
    }

    private void addSomeItemsToItemRepoAndCart() {
        ItemRepository.addItem(defaultLaptop);
        ItemRepository.addItem(defaultFridge);
        defaultCustomer.addToCart(defaultLaptop.getItemId(), 2);
        defaultCustomer.addToCart(defaultFridge.getItemId(), 1);
    }
}