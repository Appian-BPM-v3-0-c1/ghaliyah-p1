package Main.Java.com.Revature.Store.ui;

import java.util.ArrayList;

public class WatchList {

        private ArrayList<String> watchList = new ArrayList<>();


        public void addWatchItems(String item) {
            watchList.add(item);

        }

        public void printWatchList() {
            System.out.println("There are " + watchList.size() + "watches items in your list");
            for (int i = 0; i < watchList.size(); i++) {
                System.out.println(watchList.get(i));
            }
        }

        public void modifyWatchList(int position, String newItem) {
            watchList.set(position, newItem);
            System.out.println("Watches item" + (position + 1) + "has been modified");
        }

        public void removeWatchItem(int position) {
            String theItem = watchList.get(position);
            watchList.remove(position);
        }

        public String findItem(String searchItem) {
            int position = watchList.indexOf(searchItem);
            if (position >= 0) {
                return watchList.get(position);
            }
            return null;

        }

        public void setWatchList(int i, String newItem) {
        }

    public int size() {
        return size();
    }

    public int get(int input) {
            return input;
    }

}










