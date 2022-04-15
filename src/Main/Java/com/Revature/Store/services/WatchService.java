package Main.Java.com.Revature.Store.services;

import Main.Java.com.Revature.Store.daos.CrudDAO;
import Main.Java.com.Revature.Store.daos.WatchDAO;
import Main.Java.com.Revature.Store.models.Watch;

import java.util.List;

public class WatchService {
    static WatchDAO watchDAO = new WatchDAO();

    public WatchService(WatchDAO watchDAO) {
        this.watchDAO = watchDAO;
    }

    public static WatchDAO getWatchDAO() {
        return watchDAO;
    }

    public static boolean findById(int id) {
        return false;
    }

    public static void removeByID(int user_id) {
    }

    public static boolean findByID(int id) {
        return false;
    }
}




