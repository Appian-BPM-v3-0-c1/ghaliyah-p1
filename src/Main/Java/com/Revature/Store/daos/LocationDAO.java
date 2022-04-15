package Main.Java.com.Revature.Store.daos;
import Main.Java.com.Revature.Store.Connection.DatabaseConnection;
import Main.Java.com.Revature.Store.models.Location;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;
import Main.Java.com.Revature.Store.models.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LocationDAO implements CrudDAO<Location> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public void save(Location obj) {
        try{
            PreparedStatement ps = con.prepareStatement("Insert into watch (location, watch_type," +
                    " inventory_qty) VALUES (?,?,?)");


            ps.setString(1, obj.getLocation());
            ps.setString(2, obj.getWatch_type());
            ps.setInt(3, obj.getInventory_qty());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Override
    public List<Location> findAll() {
        List<Location> locationList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (id) FROM locations");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Location location = new Location();
                location.setId(rs.getInt("id"));
                location.setLocation(rs.getString("location"));
                location.setWatch_type(rs.getString("watch_type"));
                location.setInventory_qty(rs.getInt("inventory_qty"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return locationList;
    }
    @Override
    public Location findByID(int id) {
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
    public boolean update(Location updateObj) {
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







