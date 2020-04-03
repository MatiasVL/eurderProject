package be.matias.domain.items;

import java.time.LocalDate;
import java.util.UUID;

public class Item {
    private String name;
    private String description;
    private double priceInEuros;
    private int stockAmount;
    private UUID itemId;

    public Item(String name, String description, double priceInEuros, int stockAmount) {
        this.name = name;
        this.description = description;
        this.priceInEuros = priceInEuros;
        this.stockAmount = stockAmount;
        itemId = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getItemId() {
        return itemId;
    }

    public boolean itemIsInStock() {
        return stockAmount > 0;
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }

    public LocalDate determineShippingDate() {
        LocalDate shippingDate = LocalDate.now().plusDays(1);
        if (!itemIsInStock()) {
            shippingDate = LocalDate.now().plusDays(7);
        }
        return shippingDate;
    }
}
