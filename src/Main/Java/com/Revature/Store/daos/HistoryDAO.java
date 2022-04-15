package Main.Java.com.Revature.Store.daos;
import Main.Java.com.Revature.Store.Connection.DatabaseConnection;
import Main.Java.com.Revature.Store.models.History;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HistoryDAO implements CrudDAO<History> {
    Connection con = DatabaseConnection.getCon();

    @Override
    public void save(History obj) {
        try {
            PreparedStatement ps = con.prepareStatement("Insert into history (watch_id, user_id, cart_id, location)" +
                    ") VALUES (?,?,?,?)");

            ps.setInt(1,obj.getWatch_id());
            ps.setInt(2,obj.getUser_id());
            ps.setInt(3,obj.getCart_id());
            ps.setString(4,obj.getLocation());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<History> findAll() {
        List<History> historyList = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT (id) from history");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                History history = new History();

                history.setId(rs.getInt("id"));
                history.setWatch_id(rs.getInt("watch_id"));
                history.setUser_id(rs.getInt("user_id"));
                history.setCart_id(rs.getInt("cart_id"));
                history.setLocation(rs.getString("location"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historyList;
    }

    @Override
    public History findByID(int id) {
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
    public boolean update(History updateObj) {
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




