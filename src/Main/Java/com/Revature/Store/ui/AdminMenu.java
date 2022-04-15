package Main.Java.com.Revature.Store.ui;

import Main.Java.com.Revature.Store.daos.LocationDAO;
import Main.Java.com.Revature.Store.daos.UserDAO;
import Main.Java.com.Revature.Store.daos.WatchDAO;
import Main.Java.com.Revature.Store.models.Location;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;
import Main.Java.com.Revature.Store.services.LocationService;
import Main.Java.com.Revature.Store.services.UserService;
import Main.Java.com.Revature.Store.services.WatchService;


import java.util.Scanner;

public class AdminMenu implements Imenu {
    private final WatchService watchService;
    private static Scanner scanner = new Scanner(System.in);

    private final User user;

    public AdminMenu(WatchService watchService, User user) {
        this.watchService = watchService;
        this.user = user;
    }

    @Override
    public void start() {
        char input = ' ';
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("\nWelcome to the Admin Menu");
            System.out.println("[1] Login ");
            System.out.println("[2] Create Watch");
            System.out.println("[3] Location");
            System.out.println("[4] View History");
            System.out.println("[5] Watch Menu");
            System.out.println("[x] Exit");

            System.out.println("\nPlease make a selection:");


            input = scanner.next().charAt(0);
            switch (input) {
                case '1':
                    new LoginMenu(new UserService(new UserDAO())).start();
                    break;
                case '2':
                    createWatch();
                    break;
                case '3':
                    createLocation();
                    break;
                case '4':
                    break;
                case '5':
                    new WatchesMenu(new WatchService(new WatchDAO())).start();
                    break;
                case 'x':
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid ");
            }

        }
    }

    private void createLocation() {
        Scanner sc = new Scanner(System.in);
        Location location = new Location();
        LocationService locationService = new LocationService(new LocationDAO());

        boolean confirm = false;
        boolean exit = false;
        char input = ' ';

        while (!exit) {

            System.out.println("\n Input location state");
            location.setLocation(scanner.nextLine());

            System.out.println("\n Input Watch by brand: ");
            location.setLocation(scanner.nextLine());

            System.out.println("\n Inventory amount: ");
            location.setInventory_qty(scanner.nextInt());

            while (!confirm) {
                System.out.println("\n Is the information correct");
                System.out.println(location);
                System.out.println("\nPlease enter y/n");
                input = scanner.next().charAt(0);


                switch (input) {
                    case 'y':
                        locationService.getLocationDAO().save(location);
                        System.out.println("\nLocation was saved Sucessfully");
                        confirm = true;
                        new AdminMenu(new WatchService(new WatchDAO()), user).start();
                    case 'n':
                        createLocation();
                        break;
                    default:
                        System.out.println("Invalid....Try Again!");
                        break;

                }
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
                        watchService.getWatchDAO().save(watch);
                        System.out.println("\n Watch created successfully");
                        exit = true;
                        new AdminMenu(new WatchService(new WatchDAO()), user).start();
                        exit = true;

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

