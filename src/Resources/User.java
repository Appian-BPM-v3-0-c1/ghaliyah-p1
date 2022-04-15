package Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    List<Integer> userID = new ArrayList<Integer>();
    List<Integer> userUsername = new ArrayList<Integer>();
    List<Integer> userPassword = new ArrayList<Integer>();
    List<String> userFirstName = new ArrayList<String>();
    List<String> userLastName = new ArrayList<>();
    List<String> userBillingAddress = new ArrayList<String>();
    List<String> userShippingAddress = new ArrayList<>();
    List<String> userCity = new ArrayList<>();
    List<Integer> userState = new ArrayList<>();

    Scanner scan = new Scanner(System.in);


    public User() {

    }

    public void AddUser() {
        System.out.print("\nEnter the ID ");

        int n = Integer.parseInt((scan.nextLine()));

        for (int i = 0; i < n; i++) {
            userID.add(n);
            break;
        }

        System.out.print("\nEnter your First Name: ");
        String name = scan.nextLine();

        for (int i = 0; i < n; i++) {
            userFirstName.add(String.valueOf(userFirstName));
            break;
        }

        System.out.print("\nEnter your Last Name: ");
        name = scan.nextLine();
        for (int i = 0; i < n; i++) {
            userLastName.add(String.valueOf(userLastName));
            break;
        }

        System.out.print("\nEnter your Billing Address: ");
        name = scan.nextLine();

        for (int i = 0; i < n; i++) {
            userBillingAddress.add(String.valueOf(userBillingAddress));
            break;
        }
        System.out.print("\nEnter your Shipping Address: ");

        n = Integer.parseInt((scan.nextLine()));

        for (int i = 0; i < n; i++) {
            userShippingAddress.add(String.valueOf(userShippingAddress));
            break;
        }

        System.out.print("\nEnter your City: ");
        name = scan.nextLine();
        for (int i = 0; i < n; i++) {
            userCity.add(String.valueOf(userCity));
            break;
        }

        System.out.print("\nEnter your State: ");
        name = scan.nextLine();
        for (int i = 0; i < n; i++) {
            userState.add(Integer.valueOf(String.valueOf(userState)));
            break;
        }

        System.out.println("Your User Id is " + userID + " First Name: " +
                userFirstName + "Last Name: " + userLastName +
                "Billing Address: " + userBillingAddress + "Shipping Address: " +
                userShippingAddress + "City:" + userCity + "State: " +
                userState);
    }}




