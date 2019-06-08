/**
 * This program will display the future value of annunity.
 * The user of the program will provide initial values for input.
 * Author: Valerie Ehrich, Doug Rose, Ryan O'Keeffe, Collin Belt
 */
import java.util.Scanner;
public class annuityCalc {
    
    //Method used for calculating annunity
    public static double annuityCalc (double pmt, double interestRate, double numberOfPayments) {
        double annuity = pmt * ((Math.pow ((1 + interestRate), numberOfPayments) - 1.0) / interestRate);
        return annuity;
    }  
    
    public static void main(String[] args) { 
    System.out.println("To calculate the annuity of a payment.");
    Scanner keyboard = new Scanner (System.in);
    
    //read pmt, interestRate, numberOfPayments
    System.out.print("What is the periodic payment?");
    double pmt = keyboard.nextDouble();
    System.out.print("What is the rate per period?");
    double interestRate = keyboard.nextDouble();
    System.out.print("What is the number of period?");
    double numberOfPayments = keyboard.nextDouble();
   
    //display result
    System.out.printf("The Future Value of Annunity is %,.2f\n", annuityCalc (pmt, interestRate, numberOfPayments));
    }
    
    
}
