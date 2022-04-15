package Main.Java.com.Revature.Store.daos;
import Main.Java.com.Revature.Store.Connection.DatabaseConnection;
import Main.Java.com.Revature.Store.models.Cart;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CartDAO implements CrudDAO<Cart>{
    Connection con = new DatabaseConnection().getCon();


    @Override
    public void save(Cart obj) {
        try {
            PreparedStatement ps = con.prepareStatement("Insert into watch (watch_id, user_id," +
                    " inventory_id) VALUES (?,?,?)");


            ps.setInt(1, obj.getWatch_id());
            ps.setInt(2, obj.getUser_id());
            ps.setInt(3, obj.getInventory_id());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Cart> findAll() {
        List<Cart> cartList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (id) FROM watch");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Cart cart = new Cart();
                cart.setId(rs.getInt("id"));
                cart.setWatch_id(rs.getInt("watch_id"));
                cart.setUser_id(rs.getInt("user_id"));
                cart.setInventory_id(rs.getInt("inventory_id"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return cartList;
    }


    @Override
    public Cart findByID(int id) {
        return null;
    }

    @Override
    public Watch findByID(String id) {
        return null;
    }

    @Override
    public Watch findById(int id) {
        return null;
    }

    @Override
    public List<User> findAllById(int id) {
        return null;
    }

    @Override
    public Watch findById(String id) {
        return null;
    }

    @Override
    public boolean update(Cart updateObj) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        return false;
    }

    @Override
    public boolean removeByID(int id) {
        return false;
    }

    @Override
    public int getUserId(String username) {
        return 0;
    }
}
