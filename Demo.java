import java.util.Scanner;
import tools.*;

public class Demo {
    public static void main(String[] args){

        // Welcome message and available actions
        System.out.println("Welcome to the UBA leo Terminal");
        System.out.println("Kinldy reply by typing the corresponding alphabet for the action you want to perform");
        System.out.println(
            "A. NIN Update\n" + //
            "B. Check Balance\n" + //
            "C. Airtime Topup\n" + //
            "D. Send Money\n" + //
            "E. Buy Data\n" + //
            "F. Reset Pin\n" + //
            "Q. Quit"
        );

        try (Scanner scanner = new Scanner(System.in)) {
            
            Actions newAction = new Actions();
            
            while(true){
                // Prompt for user input
                System.out.print("Type action : ");
                String actionType = scanner.nextLine().toUpperCase(); // Convert to uppercase to handle lowercase inputs
        
                // Check if the entered value is within the valid range of options
                if (!actionType.matches("[A-HQ]")) {
                    System.out.println("Invalid option. Please enter a valid option (A-H or Q).");
                    continue; // Restart the loop to prompt the user for input again
                }
                
                // Quit the process if the user chooses to quit
                if (actionType.equals("Q")|| actionType.equals("q")){
                    System.out.println("You terminated the process");
                    break;
                }

                // Start the process corresponding to the chosen action
                boolean response = newAction.startProcess(actionType, scanner);

                // End the loop if the process completes successfully
                if(response){
                    System.out.println("Transaction completed");
                    break;
                }
            }
        }
    }
}
