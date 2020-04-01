package items;

import java.util.Currency;

public class Price {
    private double priceAmount;
    private Currency currency;

    public Price(double priceAmount, Currency currency) {
        this.priceAmount = priceAmount;
        this.currency = currency;
    }
}
