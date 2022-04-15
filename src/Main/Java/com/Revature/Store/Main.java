package Main.Java.com.Revature.Store;

import Main.Java.com.Revature.Store.Connection.DatabaseConnection;
import Main.Java.com.Revature.Store.daos.UserDAO;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.services.UserService;
import Main.Java.com.Revature.Store.ui.LoginMenu;
import Main.Java.com.Revature.Store.ui.Mainmenu;

import java.util.Scanner;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        Connection con = DatabaseConnection.getCon();
        System.out.println(con);

        new Mainmenu(new UserService(new UserDAO())).start();

    }
}




