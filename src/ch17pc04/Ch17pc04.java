package ch17pc04;

import java.util.Scanner;
import static ch17pc04.AccountValidator.*;

/**
 * 
 * @author frank
 */
public class Ch17pc04 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        int x = 0;
        
        // Instantiate Scanner
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Account Number Validator.");
        System.out.print("Please enter an integer (7 digits): ");
        x = keyboard.nextInt();
        System.out.println("Calculating...");
        
        if (validated(x)) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is invalid.");
        }
    }
}
