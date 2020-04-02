package repositories;

import items.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemRepositoryTest {
    @Test
    void addingItem_createsAnItem() {
        Item defaultLaptop = new Item("laptop", "use for computering", 1000, 10);
        ItemRepository.addItem(defaultLaptop);
        Assertions.assertThat(ItemRepository.getItemList().get(0).getName().equals("laptop"));
    }
}