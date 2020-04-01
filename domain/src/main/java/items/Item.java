package items;

public class Item {
    private String name;
    private String description;
    private Price price;
    private int stockAmount;

    public Item(String name, String description, Price price, int stockAmount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }
}
