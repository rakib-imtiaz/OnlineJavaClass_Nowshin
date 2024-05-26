package assessment_3;

public class StandardMenuItem extends MenuItem {
    
    public StandardMenuItem() {
        super();
    }

	public StandardMenuItem(int itemNumber, String itemName, String description, double itemPrice) {
        super(itemNumber, itemName, description, itemPrice);
    }

	 @Override
	    public void setPrice(double price) {
	        this.itemPrice = price;
	    }

    @Override
    public String toString() {
        return itemNumber+".Standard MenuItem: " + itemName + ", Price: $" + itemPrice;
    }

	
}