package assessment_3;

public class PremiumMenuItem extends MenuItem {
    private static final double SURCHARGE_PERCENTAGE = 0.2; // 20% surcharge

    public PremiumMenuItem(int itemNumber, String itemName, String description, double itemPrice) {
        super(itemNumber, itemName, description, itemPrice);
    }

    @Override
    public void setPrice(double price) {
    	price *= (1 + SURCHARGE_PERCENTAGE);
    	itemPrice=price;
    }

    @Override
    public String toString() {
        return itemNumber+".Premium MenuItem: " + itemName + ", Price: $" + itemPrice;
    }
}