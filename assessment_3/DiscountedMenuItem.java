package assessment_3;

public class DiscountedMenuItem extends MenuItem {
    private static final double DISCOUNT_PERCENTAGE = 0.05; // 5% discount

    
    public DiscountedMenuItem(int itemNumber, String itemName, String description, double itemPrice) {
        super(itemNumber, itemName, description, itemPrice);
    }

    @Override
    public void setPrice(double price) {
        price *= (1 - DISCOUNT_PERCENTAGE);
        itemPrice=price;
    }

    @Override
    public String toString() {
        return itemNumber+".Discounted MenuItem: " + itemName + ", Price: $" + itemPrice;
    }
}