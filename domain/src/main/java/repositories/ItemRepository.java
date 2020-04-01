package repositories;

import items.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private static List<Item> itemList = new ArrayList<>();

    public ItemRepository() {
    }

    public static void addItem (Item item) {
        itemList.add(item);
    }

    public static List<Item> getItemList() {
        return itemList;
    }
}
