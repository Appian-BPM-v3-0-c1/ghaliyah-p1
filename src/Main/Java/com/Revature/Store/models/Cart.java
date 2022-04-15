package Main.Java.com.Revature.Store.models;


public class Cart {
    private int id;
    private int watch_id;
    private int user_id;
    private int inventory_id;

    public Cart() {

    }

    public void Cart(int id, int watch_id, int user_id, int inventory_id) {
        this.id = id;
        this.watch_id = watch_id;
        this.user_id = user_id;
        this.inventory_id = inventory_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWatch_id() {
        return watch_id;
    }

    public void setWatch_id(int watch_id) {
        this.watch_id = watch_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(int inventory_id) {
        this.inventory_id = inventory_id;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", watch_id=" + watch_id +
                ", user_id=" + user_id +
                ", inventory_id=" + inventory_id +
                '}';
    }
}

