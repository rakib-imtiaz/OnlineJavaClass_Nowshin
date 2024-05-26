package assessment_3;

public class DrinksMenuItem extends MenuItem {
    public DrinksMenuItem(int itemNumber, String itemName, String description, double itemPrice) {
        super(itemNumber, itemName, description, itemPrice);
    }
    @Override
    public void setPrice(double price) {
        this.itemPrice = price;
    }

    @Override
    public String toString() {
        return itemNumber+".Drinks MenuItem: " + itemName + ", Price: $" + itemPrice;
    }
}
