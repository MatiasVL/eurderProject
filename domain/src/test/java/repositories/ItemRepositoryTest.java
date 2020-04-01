package repositories;

import items.Item;
import items.Price;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Currency;
import java.util.Locale;

class ItemRepositoryTest {
    @Test
    void addingItem_createsAnItem() {
        Price laptopPrice = new Price(1000, Currency.getInstance(Locale.FRANCE));
        Item defaultLaptop = new Item("laptop", "use for computering", laptopPrice, 10);
        ItemRepository.addItem(defaultLaptop);
        Assertions.assertThat(ItemRepository.getItemList().get(0).getName().equals("laptop"));
    }
}