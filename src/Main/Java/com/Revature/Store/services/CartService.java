package Main.Java.com.Revature.Store.services;
import Main.Java.com.Revature.Store.daos.CrudDAO;
import Main.Java.com.Revature.Store.daos.CartDAO;
import Main.Java.com.Revature.Store.models.Cart;


public class CartService {
    private static CartDAO cartDAO = new CartDAO();

    public CartService(CartDAO cartDAO) {
        this.cartDAO = cartDAO;
    }


    public static CartDAO getCartDAO() {
        return cartDAO;
    }
}
