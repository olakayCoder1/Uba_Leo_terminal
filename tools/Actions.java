package tools;
import java.util.List;

import db.*;

enum UserAction{
    Login,
    Withdraw,
    Deposit,
    Transfer,
    Balance
}


public class Actions {

    public boolean startProcess(String action){
        System.out.println("Process started.......");

        Data data = new Data();
        List balanceFromLogin = data.login();

        System.out.println(balanceFromLogin);
        // if (balanceFromLogin){
        //     System.out.println("Invalid login credential");
        //     return false;
        // }
        // System.out.println(balanceFromLogin);
        // return true;
        return true;
    }


    private int tranfer_money(String destination_account , int amount , int balance){

        System.out.printf(
            "You have successfully transferred %s to this account (%s)", amount , destination_account);

        return balance - amount;
    }
    
    public void processUserAction(UserAction s){ 

        switch(s){
            case Login:
                System.out.println("Loging.......");
                break;
            case Withdraw:
                System.out.println("Withdrawing.......");
                break;
            case Deposit:
                System.out.println("Depositing.......");
                break;
            case Transfer:
                System.out.println("Transfering.......");
                break;
            case Balance:
               System.out.println("Balance.......");
                break;
            default:
                System.out.println("Invalid action");
        }
    }
    
}
