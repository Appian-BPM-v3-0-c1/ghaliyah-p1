package Main.Java.com.Revature.Store.ui;

import java.util.ArrayList;

public class JewelryforFun {
    private static ArrayList<String> jewelryList = new ArrayList<>();

    public static void printJewelryforFun() {
    }


    public static void addJewelryItems(String item) {
        JewelryforFun.add(item);

    }

    private static void add(String item) {
    }

    public void printJewelryList() {
        System.out.println("There are " + jewelryList.size() + "jewelry items in your list");
        for (int i = 0; i < jewelryList.size(); i++) {
            System.out.println(jewelryList.get(i));
        }
    }

    private static String size() {
        return null;
    }

    public void modifyJewelryList(int position, String newItem) {
        jewelryList.set(position, newItem);
        System.out.println("Jewelry item" + (position + 1) + "has been modified");
    }

    public static void removeJewelryItem(int position) {
        String theItem = JewelryforFun.get(position);
        JewelryforFun.remove(position);
    }

    private static String get(int position) {

        return null;
    }

    private static void remove(int position) {
    }

    public static String findItem(String searchItem) {
        int position = jewelryList.indexOf(searchItem);
        if (position >= 0) {
            return jewelryList.get(position);
        }
        return null;

    }

    public static void setJewelryList(int i, String newItem) {
    }
}


