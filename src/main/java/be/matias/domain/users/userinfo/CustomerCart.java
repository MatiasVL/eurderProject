package be.matias.domain.users.userinfo;

import be.matias.domain.items.ItemGroup;

import java.util.ArrayList;
import java.util.List;

public class CustomerCart {
    private List<ItemGroup> itemGroups;

    public CustomerCart(List<ItemGroup> itemGroups) {
        this.itemGroups = itemGroups;
    }

    public CustomerCart() {
        itemGroups = new ArrayList<>();
    }

    public List<ItemGroup> getItemGroups() {
        return itemGroups;
    }

    public void addItemGroupToCart(ItemGroup itemGroup) {
        itemGroups.add(itemGroup);
    }

    public int getCartSize () {return itemGroups.size();}
}
