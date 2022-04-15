package Main.Java.com.Revature.Store.ui;
import Main.Java.com.Revature.Store.daos.WatchDAO;
import Main.Java.com.Revature.Store.daos.UserDAO;
import Main.Java.com.Revature.Store.models.Watch;
import Main.Java.com.Revature.Store.services.WatchService;

import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.services.UserService;

import java.util.Scanner;

import static Main.Java.com.Revature.Store.services.WatchService.getWatchDAO;

public class Mainmenu implements Imenu {
    public Mainmenu(UserService userService) {

    }

    @Override
    public void start() {
        char input = ' ';
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit) {
            System.out.println("\n Welcome to Ghaliyah's Watches!");
            System.out.println("[1] Purchase Watches");
            System.out.println("[2] Search for Watches");
            System.out.println("[3] Design A Watch for Fun");
            System.out.println("[4] Checkout Menu");
            System.out.println("[5] View Login Menu");
            System.out.println("[6] Create Watches");
            System.out.println("[X] Exit");

            System.out.println("\nHello valued customer, please make a selection");
            input = scan.next().charAt(0);


            switch (input) {
                case '1':
                    WatchDAO WatchDAO = new WatchDAO();
                    new WatchesMenu(new WatchService(WatchDAO)).start();
                    break;
                case '2':
                    new WatchDAO().findAllWatch();
                    break;
                case '3':
                    new DesignWatchMenu().start();
                case '4':
                    User user = new User();
                    new CheckoutMenu(user).start();
                    break;
                case '5':
                    new LoginMenu(new UserService(new UserDAO())).start();
                    break;
                case '6':
                    createWatch();
                    break;
                case 'x':
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid input!");
                    break;
            }
        }
    }

    private void createWatch() {
        char input = ' ';
        boolean exit = false;
        boolean confirm = false;

        Scanner scanner = new Scanner(System.in);

        Watch watch = new Watch();

        while (!exit) {

            System.out.println("\nCurrently creating Watch...");
            System.out.println(" What would you like the brand to be: ");
            watch.setBrand(scanner.nextLine());

            System.out.println("What type of watch would you like: ");
            watch.setType(scanner.nextLine());

            System.out.println("What is the current inventory: ");
            watch.setQty(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Please enter the price: ");
            watch.setPrice(scanner.nextDouble());


            while (!confirm) {
                System.out.println("\n Is the information correct");
                System.out.println(watch);
                System.out.println("\nPlease enter y/n");
                input = scanner.next().charAt(0);

                switch (input) {
                    case 'y':
                        WatchService watchService = new WatchService(new WatchDAO());
                        watchService.getWatchDAO().save(watch);
                        System.out.println("\n Watch created successfully");
                        exit = true;
                        User user = new User();
                        new AdminMenu(new WatchService(new WatchDAO()), user).start();

                    case 'n':
                        createWatch();
                        break;
                    default:
                        System.out.println("\nInvalid input");
                        break;
                }
            }
        }
    }
}