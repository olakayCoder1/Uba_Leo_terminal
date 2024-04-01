package db;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * The Data class represents a database of users.
 */
public class Data {

    // Initialize an ArrayList to store user data as Map objects
    @SuppressWarnings("rawtypes")
    ArrayList<Map> users = new ArrayList<Map>();

    // Initialize an array of user PINs
    private int[] user_count = {1234, 5678, 3213, 4321, 5555};

    /**
     * Constructs a Data object and initializes user data.
     */
    public Data(){ 
        // Populate the users list with sample user data
        for (int x: user_count){
            Map<String, Object> user = new HashMap<>();
            user.put("name", "Olanrewajut"); // Sample user name
            user.put("pin", x); // User's PIN
            user.put("balance", 559055); // User's balance
            users.add(user);
        }
    }

    /**
     * Validates user login credentials.
     * 
     * @param scanner The Scanner object for user input.
     * @return        A list containing login status, user name, and balance if login is successful,
     *                otherwise returns a list with login status as false and null values for name and balance.
     */
    public List<Object> login(Scanner scanner){
        System.out.print("Enter pin : ");
        int pin = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer
        for (Map x: users){
            if (x.get("pin").equals(pin)){
                // If the provided PIN matches a user's PIN, retrieve user details
                String name = (String) x.get("name");
                int balance = (int) x.get("balance");
                // Return a list with login status as true, user name, and balance
                return Arrays.asList(true , name, balance) ;
            }
        }
        // Return a list with login status as false and null values for name and balance
        return Arrays.asList(false, null , null);
    }
}
