package be.matias.domain.items;

import be.matias.domain.repositories.ItemRepository;

import java.time.LocalDate;
import java.util.UUID;

public class ItemGroup {
    private UUID itemId;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroup(UUID itemId, int amount, LocalDate shippingDate) {
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public double calculateItemGroupPrice() {
        return amount * ItemRepository.getItemWithUniqueId(itemId).getPriceInEuros();
    }

    public UUID getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }
}