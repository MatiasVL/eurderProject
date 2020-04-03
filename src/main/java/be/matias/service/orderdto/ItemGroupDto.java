package be.matias.service.orderdto;

public class ItemGroupDto {
    private String itemId;
    private int amount;
    private String shippingDate;

    public ItemGroupDto(String itemId, int amount, String shippingDate) {
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public String getItemId() {
        return itemId;
    }

    public int getAmount() {
        return amount;
    }

    public String getShippingDate() {
        return shippingDate;
    }
}
