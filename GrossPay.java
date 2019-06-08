/**
 * Will calculate Grosspay given hours worked and rate of pay
 * user of program will provide initial values for input.
 * Author: Ryan O'Keeffe
 */
import java.util.Scanner;

public class GrossPay {
    
    
    public static void main(String[] args) { 
        System.out.println("This program will calculate gross pay");
        System.out.println("Please enter the number of hours you have worked");
        
        double hoursWorked;  //This is for the hours worked.
        Scanner keyboard = new Scanner (System.in);
        hoursWorked = keyboard.nextDouble();
        
        System.out.println("Please enter rate of pay");
        double rateOfPay;
        rateOfPay = keyboard.nextDouble();  //pay rate
        // output that will display on the monitor. Note that calculation in the println statement, 
        // not in a variable. I could have named a variable grossPayCalc.
        
        System.out.println("Your gross pay is: " + (hoursWorked * rateOfPay) + "dollars");
        keyboard.close();
    }
    

    
}
