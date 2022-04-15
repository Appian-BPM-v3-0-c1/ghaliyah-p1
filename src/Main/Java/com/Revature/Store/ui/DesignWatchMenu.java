package Main.Java.com.Revature.Store.ui;

import java.util.Scanner;
import Main.Java.com.Revature.Store.ui.JewelryforFun;
import Main.Java.com.Revature.Store.ui.WatchList;

public class DesignWatchMenu implements Imenu {
        Scanner scanner = new Scanner(System.in);
        WatchList watchList = new WatchList();

        @Override
        public void start() {
                boolean quit = false;
                int choice = 0;

                while (!quit) {
                        System.out.println("Make a selection: ");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Below you will see the types of jewelry we have in stock");
                        System.out.println("Gold Jewelry:      Necklaces $299   Bracelets $99  Earrings  $79");
                        System.out.println("Silver Jewelry:    Necklaces $199   Bracelets $89  Earrings  $59");
                        System.out.println("Rose gold Jewelry: Necklaces $99    Bracelets $59  Earrings  $39");

                        System.out.println("\nEnter a number: ");
                        System.out.println("\t 0 - to print choice options");
                        System.out.println("\t 1- to print the list of jewelry items");
                        System.out.println("\t 2- to add an item to the list");
                        System.out.println("\t 3- to modify an item in the list");
                        System.out.println("\t 4- to remove an item");
                        System.out.println("\t 5- to search for an item");
                        System.out.println("\t 6- to quit");


                        switch (choice) {
                                case 0:
                                        printInstructions();
                                        break;
                                case 1:
                                        JewelryforFun.printJewelryforFun();
                                        break;
                                case 2:
                                        addItem();
                                        break;
                                case 3:
                                        modifyItem();
                                        break;
                                case 4:
                                        removeItem();
                                        break;
                                case 5:
                                        searchForItem();
                                        break;
                                case 6:
                                        quit = false;
                                        break;
                        }
                }
        }



        private void searchForItem() {
                        System.out.println("Watch to search for: ");
                        String searchItem = scanner.nextLine();

                        JewelryforFun watchList = new JewelryforFun();
                        if (watchList.findItem(searchItem) != null) {
                                System.out.println("Found " + searchItem + "in watch list");
                        } else {
                                System.out.println(searchItem + "not in the watch list");
                }
        }

        private void removeItem() {
                System.out.println("Enter the item number: ");
                int itemNo = scanner.nextInt();
                scanner.nextLine();
                WatchList watchList = new WatchList();
                watchList.removeWatchItem(itemNo - 1);
        }



        private void modifyItem() {
                System.out.println("Enter the item number: ");
                int itemNo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter replacement watch name you created: ");
                String newItem = scanner.nextLine();
                WatchList watchList = new WatchList();
                watchList.setWatchList(itemNo - 1, newItem);
        }

        private void addItem() {
                System.out.println("Enter the watch you would like to add: ");
                WatchList watchList = new WatchList();
                watchList.addWatchItems(scanner.nextLine());
        }

        private void printInstructions() {
                System.out.println("\nPress");
                System.out.println("\t 0 - to print choice options");
                System.out.println("\t 1- to print the list of watch items");
                System.out.println("\t 2- to add a watch you created to the list");
                System.out.println("\t 3- to modify an item in the list");
                System.out.println("\t 4- to remove an item");
                System.out.println("\t 5- to search for an item");
                System.out.println("\t 6- to quit");
        }
        }


