package tools;

import java.util.List;
import java.util.Scanner;

import db.*;

public class Actions {

    /**
     * Initiates the process based on the provided action.
     * 
     * @param action The action to perform.
     * @param s      The Scanner object for user input.
     * @return       True if the action was successfully performed, false otherwise.
     */
    public boolean startProcess(String action, Scanner s) {
        System.out.println("Process started.......");

        Data data = new Data();
        List<Object> balanceFromLogin = data.login(s);

        if (!(boolean) balanceFromLogin.get(0)) {
            System.out.println("Invalid login credentials");
            return false;
        }
        int balance = (int) balanceFromLogin.get(2);
        switch (action) {
            case "A":
                System.out.println("Loading.......");
                break;
            case "B":
                System.out.printf("Your account balance is : %s \n", balance);
                break;
            case "C":
                buy_airtime(balance, s);
                break;
            case "D":
                tranfer_money(balance, s);
                break;
            case "E":
                buy_data(balance, s);
                break;
            default:
                System.out.println("Invalid action");
        }
        return true;
    }

    /**
     * Initiates the process of transferring money.
     * 
     * @param balance  The balance in the account.
     * @param scanner  The Scanner object for user input.
     * @return         0 if the process completes successfully.
     */
    private Object tranfer_money(int balance, Scanner scanner) {
        System.out.println("Transfer process started.............");
        String destination_account;
        int amount;

        System.out.print("Enter destination account : ");
        destination_account = scanner.nextLine();

        System.out.print("Enter amount to send : ");
        amount = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient fund!");
            return 0;
        }

        System.out.printf("You have successfully transferred %s to this account $(%s) \n", amount,
                destination_account);

        return 0;
    }

    /**
     * Initiates the process of buying data.
     * 
     * @param balance  The balance in the account.
     * @param scanner  The Scanner object for user input.
     * @return         0 if the process completes successfully.
     */
    private Object buy_data(int balance, Scanner scanner) {
        System.out.println("Data purchase process started.............");
        String response;
        int amount;

        System.out.print("Do you want to buy the data for yourself? Yes(Y) or No(N) : ");
        response = scanner.nextLine().toUpperCase();

        if (response.equals("YES") || response.equals("Y")) {
            System.out.print("Enter amount to purchase : ");
            amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient fund!");
                return balance;
            }
            System.out.printf("You have successfully purchase data $ %s for yourself \n", amount);
            return balance - amount;
        } else if (response.equals("NO") || response.equals("N")) {
            String destination_number;
            System.out.print("Enter destination number : ");
            destination_number = scanner.nextLine();
            System.out.print("Enter amount of data to purchase : ");
            amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient fund!");
                return balance;
            }
            System.out.printf("You have successfully purchase data $ %s for  (%s) \n", amount, destination_number);
            return balance - amount;
        } else {
            System.out.println("Invalid input enter Yes or No");
            buy_data(balance, scanner);
        }
        return 0;
    }

    /**
     * Initiates the process of buying airtime.
     * 
     * @param balance  The balance in the account.
     * @param scanner  The Scanner object for user input.
     * @return         0 if the process completes successfully.
     */
    private Object buy_airtime(int balance, Scanner scanner) {
        System.out.println("Data purchase process started.............");
        String response;
        int amount;

        System.out.print("Do you want to buy the airtime for yourself? Yes(Y) or No(N) : ");
        response = scanner.nextLine().toUpperCase();

        if (response.equals("YES") || response.equals("Y")) {
            System.out.print("Enter amount to send : ");
            amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient fund!");
                return balance;
            }
            System.out.printf("You have successfully purchase airtime  $ %s for yourself \n", amount);
            return balance - amount;
        } else if (response.equals("NO") || response.equals("N")) {
            String destination_number;
            System.out.print("Enter destination number : ");
            destination_number = scanner.nextLine();
            System.out.print("Enter amount of data to purchase : ");
            amount = scanner.nextInt();
            if (amount > balance) {
                System.out.println("Insufficient fund!");
                return balance;
            }
            System.out.printf("You have successfully purchase airtime  $ %s for (%s) \n", amount, destination_number);
            return balance - amount;
        } else {
            System.out.println("Invalid input enter Yes or No");
            buy_data(balance, scanner);
        }
        return 0;
    }

}
