package Main.Java.com.Revature.Store.services;
import Main.Java.com.Revature.Store.daos.CrudDAO;
import Main.Java.com.Revature.Store.daos.HistoryDAO;
import Main.Java.com.Revature.Store.models.History;



public class HistoryService {
    private static HistoryDAO historyDAO = new HistoryDAO();

    public HistoryService(HistoryDAO historyDAO) {
        this.historyDAO = historyDAO;
    }

    public static CrudDAO<History> getHistoryDAO() {
        return historyDAO;
    }

    public static CrudDAO<Object> getHistoryDA0() {
        return null;
    }
}

