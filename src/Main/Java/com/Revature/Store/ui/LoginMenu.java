package Main.Java.com.Revature.Store.ui;
import Main.Java.com.Revature.Store.models.User;
import Main.Java.com.Revature.Store.services.UserService;


import java.util.Scanner;


public class LoginMenu implements Imenu {
  private UserService userService;

    public LoginMenu(UserService userService) {
        this.userService = this.userService;
    }

    Scanner scan = new Scanner(System.in);
    User user = new User();

    @Override
    public void start() {
        char input = ' ';
        boolean done = false;


        while (!done) {
            System.out.println("\n Hello, this is the login menu");
            System.out.println("[1] Login");
            System.out.println("[2] Create a new account");
            System.out.println("[x] Exit");

            input = scan.next().charAt(0);

            switch (input) {
                case '1':
                    login();
                    break;
                case '2':
                    createAccount();
                    break;
                case 'x':
                    done = true;
                    break;
                default:
                    System.out.println("\nSorry invalid");
                    break;
            }
        }
    }


    private void login() {
        while (true) {
            System.out.println("\nUsername: ");
            user.setUserName(scan.next());

            System.out.println("\nPassword: ");
            user.setPassword(scan.next());

            if (userService.isValidLogin(user)) {
                user.setId(userService.getUserDAO().getId(user.getUserName()));
                new Mainmenu(userService).start();
                break;
            } else {
                System.out.println("\nSorry your login is invalid");
            }
        }
    }

    private void createAccount() {
        String userName = "";
        String password = "";
        String password2 = "";
        String firstName = " ";
        String lastName = " ";
        String email = " ";

        boolean userOk = false;
        char input = ' ';

        System.out.println("\n Thanks, your account is being created...");

        while (true) {
            while (true) {
                System.out.println("\nEnter in a username");

                userName = scan.next();

                if (!userService.isDuplicate(userName)) {
                    if (userService.isValidUsername(userName)) {
                        user.setUserName(userName);

                        break;

                    } else {
                        System.out.println("\n Sorry that is a duplicated username :(");

                    }

                } else {
                    System.out.println("\n That username is invalid :(");
                }
            }



                while (true) {
                    System.out.println("\nEnter in a password: ");
                    password = scan.next();

                    System.out.println("\nPlease enter the password again: ");
                    password2 = scan.next();

                    if (password.equals(password2)) {
                        if (userService.isValidPassword(password)) {
                            user.setPassword(password);
                            break;
                        } else {
                            System.out.println("\nSorry invalid password");
                        }
                    } else
                        System.out.println("Passwords do not match");
                }

                while (true) {
                    System.out.println("\nEnter your first name");
                    user.setFirstName(scan.next());

                    System.out.println("Enter you last name");
                    user.setLastName(scan.next());

                    System.out.println("Enter your email please");
                    user.setEmail(scan.next());


                    System.out.println(user);

                    System.out.println("\nIs the information correct?");

                    if (scan.next().charAt(0) == 'y') {

                        System.out.println("\nPlease confirm credentials (y/n)");
                        System.out.print("Username: " + userName);
                        System.out.print("\nPassword: " + password);

                        System.out.print("\nEnter: ");

                        if (scan.next().charAt(0) == 'y') {
                            userService.getUserDAO().save(user);

                            System.out.println("Account created successfully!");
                            break;
                        } else {
                            createAccount();
                        }

                    }
                }
            }
        }
    }






    

















