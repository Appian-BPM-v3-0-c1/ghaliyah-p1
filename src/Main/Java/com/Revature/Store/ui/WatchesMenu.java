package Main.Java.com.Revature.Store.ui;

import Main.Java.com.Revature.Store.models.Watch;
import Main.Java.com.Revature.Store.models.User;

import Main.Java.com.Revature.Store.services.WatchService;


import java.util.List;
import java.util.Scanner;

import static Main.Java.com.Revature.Store.services.WatchService.getWatchDAO;

public class WatchesMenu implements Imenu {
    private final WatchService watchService;

    public WatchesMenu(WatchService watchService) {
        this.watchService = watchService;
    }

    @Override
    public void start() {
        char input = ' ';
        boolean exit = false;
        Scanner scan = new Scanner(System.in);


        while (!exit) {

            System.out.println("\n  Welcome to Ghaliyah's Watches!");
            System.out.println("[1] Watches by Brand");
            System.out.println("[2] Add Watch to Cart");
            System.out.println("[3] Checkout Menu");
            System.out.println("[X] Exit");

            System.out.println("\nHello valued customer, please make a selection");

            input = scan.next().charAt(0);

            switch (input) {
                case '1':
                    viewByBrand();
                    break;
                case '2':
                    break;
                case '3':
                    User user = null;
                    new CheckoutMenu(user).start();
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

    private void viewByBrand() {
        String brand = " ";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nView by Brand: ");
            brand = scanner.nextLine().toLowerCase();
            List<Watch> watches = getWatchDAO().findByBrand(brand);

            if (watches.isEmpty()) {
                System.out.println("Sorry that was invalid");

                }
            }
        }
    }





