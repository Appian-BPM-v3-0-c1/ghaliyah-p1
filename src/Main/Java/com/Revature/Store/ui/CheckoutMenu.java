package Main.Java.com.Revature.Store.ui;

import Main.Java.com.Revature.Store.models.Cart;
import Main.Java.com.Revature.Store.models.History;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.models.Watch;
import Main.Java.com.Revature.Store.services.CartService;
import Main.Java.com.Revature.Store.services.HistoryService;
import Main.Java.com.Revature.Store.services.WatchService;

import java.util.List;
import java.util.Scanner;

import static Main.Java.com.Revature.Store.services.WatchService.getWatchDAO;

public class CheckoutMenu implements Imenu {
    private final User user;

    private CartService cartService;
    private Object List;

    public CheckoutMenu(User user) {
        this.user = user;
    }

    @Override
    public void start() {
        char input = ' ';
        boolean exit = false;
        Scanner scan = new Scanner(System.in);


        while (!exit) {
            System.out.println("\n  Welcome to Ghaliyah's Watches Checkout Menu!");
            System.out.println("[1] Show Watches");
            System.out.println("[2] History");
            System.out.println("[3] Checkout");
            System.out.println("[4] Watches Menu");
            System.out.println("[X] Exit");

            System.out.println("What is you decision: ");
            input = scan.next().charAt(0);

            switch (input) {
                case '1':
                    showItems();
                    break;
                case '2':
                    viewHistory();
                    break;
                case '3':
                    viewCart();
                case '4':
                    WatchService watchService = null;
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

    private void viewCart() {
        List<Cart> carts = (List<Cart>) CartService.getCartDAO().findByID(user.getId());

        while (true) {
            Scanner scan = new Scanner(System.in);
            for (Cart c : carts) {
                System.out.println(WatchService.findById(c.getId()));
            }

            System.out.println("Want to checkout your items??");
            if (scan.nextLine().charAt(0) == 'y') {
                CheckOut(carts);
                break;
            }
        }
    }

    private void CheckOut(java.util.List<Cart> carts) {
        History history = new History();

        for (Cart c : carts) {
            history.setWatch_id(c.getWatch_id());
            history.setUser_id(c.getUser_id());
            history.setCart_id(c.getId());

            HistoryService.getHistoryDAO().save(history);

            WatchService.removeByID(c.getUser_id());

        }
        System.out.println("Thanks for purchasing with us");

        for (Cart c : carts) {
            CartService.getCartDAO().removeByID(c.getUser_id());

        }
    }


    private void viewHistory() {
        List<History> historyList = HistoryService.getHistoryDAO().findAll();

        for (History h : historyList) {
            System.out.println(WatchService.findByID(h.getId()));
        }
    }


    private void showItems() {
        List<Watch> watchList = getWatchDAO().findAll();
        for (Watch i : watchList) {
            System.out.println(i);
        }
        System.out.println("Do you want to buy a watch today?");
        Scanner scan = new Scanner(System.in);
        if (scan.next().charAt(0) == 'y') {
            addItems(watchList);
        } else {
            System.out.println("Invalid...");
        }
    }

    private void addItems(java.util.List<Watch> watchList) {
        int input = 0;
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit) {
            System.out.println(" Which watch would you like to purchase:");
            input = scan.nextInt();

            if (input > watchList.size()) {
                Watch thisWatch = watchList.get(input);
                System.out.println("Would you like to add this watch to your cart?");

                if (scan.next().charAt(0) == 'y') {
                    if (thisWatch.getQty() < 0) {
                        Cart cart = new Cart();
                        cart.setWatch_id(thisWatch.getId());
                        cart.setUser_id(user.getId());
                        cart.setInventory_id(thisWatch.getId());
                        cartService.getCartDAO().save(cart);

                        System.out.println("Wonderful, the watch was added to your cart successfully");
                        break;
                    } else {
                        if (thisWatch.getQty() == 0) {
                            System.out.println("We are sorry for the inconvience that watch is currently out of stock");
                            break;
                        } else {
                            if (scan.next().charAt(0) == 'n') {
                                break;
                            } else {
                                System.out.println("Your response was invalid");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}



