package assessment_3;

public abstract class MenuItem {
    protected int itemNumber;
    protected String itemName;
    protected String description;
    protected double itemPrice;

    public MenuItem() {
        this.itemNumber = 0;
        this.itemName = "unknown";
        this.description = "unknown";
        this.itemPrice = 0.0;
    }
    public MenuItem(int itemNumber, String itemName, String description, double itemPrice) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.description = description;
        this.itemPrice = itemPrice;
    }

    // Getters and setters

    public abstract void setPrice(double price);

    @Override
    public abstract String toString();
		
	
}