package assessment_3;

public class Customer {
    private String name;
    private double discount;
    private String status;

    public Customer() {
        this.name = "unknown";
        this.discount = 0.0;
        this.status = "unknown";
    }
    public Customer(String name, String status) {
        this.name = name;
        this.status = status;
        setDiscount();
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public String getStatus() {
        return status;
    }

    public void setDiscount() {
        if (status.equalsIgnoreCase("active")) {
            discount = 0.1; // 10% discount
        } else if (status.equalsIgnoreCase("vip")) {
            discount = 0.15; // 15% discount
        } else {
            discount = 0.0; // No discount
        }
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Status: " + status + ", Discount: " + (discount * 100) + "%";
    }
}
