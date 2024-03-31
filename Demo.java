
import java.util.Scanner;
import tools.*;

import db.Data;

// enum Status{
//     Running(100), 
//     Failed(400), 
//     Pending(102),
//     Success(200);


//     private int status_code;

//     private Status(int status_code) {
//         this.status_code = status_code;
//     }

//     public int getStatus_code() {
//         return status_code;
//     }
// }

public class Demo {
    public static void main(String[] args){

        System.out.println("Welcome to the UBA leo Terminal");
        System.out.println("Kinldy reply by typing the corresponding alphabet for the action you want to perform");
        System.out.println(
            "A. NIN Update\n" + //
            "B. Check Balance\n" + //
            "C. Airtime Topup\n" + //
            "D. Send Money\n" + //
            "E. Buy Data\n" + //
            "F. Get Statement\n" + //
            "G. Self Services\n" + //
            "H. Reset Pin\n" + //
            "Q. Quit"
        );

        try (Scanner scanner = new Scanner(System.in)) {
            
            Actions newAction = new Actions();
            
            while(true){
                System.out.print("Type action : ");
                String actionType = scanner.nextLine();
                if (actionType.equals("Q")|| actionType.equals("q")){
                    System.out.println("You terminated the process");
                    break;
                }
                boolean response = newAction.startProcess(actionType);

                if(response)
                    System.out.println("Transaction completed");
                    break;

   
            }
        }

    }
}
