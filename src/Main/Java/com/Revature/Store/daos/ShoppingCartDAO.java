package Main.Java.com.Revature.Store.daos;


import Main.Java.com.Revature.Store.Connection.DatabaseConnection;
import Main.Java.com.Revature.Store.models.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//public class ShoppingCartDAO implements CrudDAO<Cart> {
    //Connection con = new DatabaseConnection().getCon();

    //@Override
    //public int save(Cart obj) {
        //int n = 0;

        //try {
            //PreparedStatement ps = con.prepareStatement("INSERT INTO jewelry (cart_id, user_id, itemName, itemStyle," +
                    //"total_price, quantity) VALUES (?, ?, ?, ?, ?, ?");
           // ps.setInt(1, obj.getCart_id());
            //ps.setInt(2, obj.getUser_id());
            //ps.setString(3, obj.getItemName());
            //ps.setString(4, obj.getItemStyle());
//ps.setDouble(5, obj.getTotal_price());
//ps.setInt(6, obj.getQuantity());

//ps.executeUpdate();

//} catch (SQLException e) {
// e.printStackTrace();
//}
//return n;
//}



   // @Override

    //public List<Cart> findAll() {
        //return null;
    //}
    //@Override
    //public Cart findById(int id) {
        //return null;
    //}

    //@Override
    //public List<Cart> findAllById(int id) {
        //return null;
    //}

    //@Override
    //public boolean update(Cart updatedObj) {
        //return false;
    //}

    //@Override
    //public boolean removeById(String id) {
        //return false;
    //}

    //@Override
    //public int getUserId(String username) {
        //int id = 0;

        //try {
            //PreparedStatement ps = con.prepareStatement("SELECT (id) FROM users where username = ?");
            //ps.setString(1, username);
            //ResultSet rs = ps.executeQuery();

            //while (rs.next()) {
                //id = rs.getInt("id");
            //}
       //} catch (SQLException e) {
            //e.printStackTrace();
        //}

        //return id;
    //}
//}


