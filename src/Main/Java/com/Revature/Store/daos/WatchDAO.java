package Main.Java.com.Revature.Store.daos;
import Main.Java.com.Revature.Store.Connection.DatabaseConnection;

import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WatchDAO implements CrudDAO<Watch> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public void save(Watch obj) {
        try {
            PreparedStatement ps = con.prepareStatement("Insert into watch (watch_brand, watch_type," +
                    " watch_inventory, price) VALUES (?,?,?,?)");

            ps.setString(1, obj.getBrand());
            ps.setString(2, obj.getType());
            ps.setInt(3, obj.getQty());
            ps.setDouble(4, obj.getPrice());

            ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Watch> findAll() {
        List<Watch> watchList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM watch");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Watch watch = new Watch();

                watch.setId(rs.getInt("watch_id"));
                watch.setBrand(rs.getString("watch_brand"));
                watch.setType(rs.getString("watch_type"));
                watch.setQty(rs.getInt("watch_inventory"));
                watch.setPrice(rs.getDouble("price"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return watchList;
    }

    @Override
    public Watch findByID(int id) {
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
    public boolean update(Watch updateObj) {
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

    public List<Watch> findByBrand(String brand) {

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM watch where watch_brand LIKE ?");
            ps.setString(1, "%" + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Watch watch = new Watch();

                watch.setBrand(rs.getString("shoe_brand"));
                watch.setType(rs.getString("shoe_type"));
                watch.setQty(rs.getInt("shoe_inventory"));
                watch.setPrice(rs.getDouble("price"));

                watch.add(watch);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        ArrayList<Watch> watch = new ArrayList<>();
        return watch;
    }

    public void findAllWatch() {
    }
}


