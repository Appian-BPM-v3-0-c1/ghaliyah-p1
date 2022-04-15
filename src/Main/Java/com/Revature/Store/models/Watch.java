package Main.Java.com.Revature.Store.models;

public class Watch {
    private int id;
    private String brand;
    private String type;
    private int qty;
    private double price;

    public Watch() {

    }


    public Watch(int id, String brand, String type, int qty, double price) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public void add(Watch watch) {
    }
}