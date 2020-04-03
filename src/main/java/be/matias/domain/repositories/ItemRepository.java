package be.matias.domain.repositories;

import be.matias.domain.items.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ItemRepository {
    private static List<Item> itemList = new ArrayList<>();

    public ItemRepository() {
    }

    public static void addItem(Item item) {
        itemList.add(item);
    }

    public static List<Item> getItemList() {
        return itemList;
    }

    public static Item getItemWithUniqueId(UUID itemId) {
        return itemList.stream().filter(item -> item.getItemId() == itemId).findFirst().orElse(null);
    }
}