package Main.Java.com.Revature.Store.daos;
import Main.Java.com.Revature.Store.models.Cart;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;
import java.util.List;

public interface CrudDAO <T> {
    void save(T obj);

    List<T> findAll();

    T findByID(int id);

    Watch findByID(String id);

    Watch findById(int id);

    List<User> findAllById(int id);

    Watch findById(String id);

    boolean update(T updateObj);

    boolean removeById(String id);

    boolean removeByID(int id);


    int getUserId(String username);
}

