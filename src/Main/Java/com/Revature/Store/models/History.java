package Main.Java.com.Revature.Store.models;

public class History {
    private int id;
    private int watch_id;
    private int user_id;
    private int cart_id;
    private String location;

    public History() {
    }

    public History(int id, int watch_id, int user_id, int cart_id, String location) {
        this.id = id;
        this.watch_id = watch_id;
        this.user_id = user_id;
        this.cart_id = cart_id;
        this.location = location;
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

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", watch_id=" + watch_id +
                ", user_id=" + user_id +
                ", cart_id=" + cart_id +
                ", location='" + location + '\'' +
                '}';
    }
}
