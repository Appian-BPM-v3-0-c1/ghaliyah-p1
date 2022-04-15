package Main.Java.com.Revature.Store.models;

public class Location {
    private int id;
    private String location;
    private String watch_type;
    private int inventory_qty;

    public Location() {
    }

    public Location(int id, String location, String watch_type, int inventory_qty) {
        this.id = id;
        this.location = location;
        this.watch_type = watch_type;
        this.inventory_qty = inventory_qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWatch_type() {
        return watch_type;
    }

    public void setWatch_type(String watch_type) {
        this.watch_type = watch_type;
    }

    public int getInventory_qty() {
        return inventory_qty;
    }

    public void setInventory_qty(int inventory_qty) {
        this.inventory_qty = inventory_qty;
    }
    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", watch_type='" + watch_type + '\'' +
                ", inventory_qty=" + inventory_qty +
                '}';
    }

}
