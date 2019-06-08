/**
 * This program will calculate the interest amount on money borrowed given the principal amount, annual interest rate, and the length of time the money will be borrowed.
 * The user of the program will provide initial values for input.
 * Author: Ryan O'Keeffe
 */
import java.util.Scanner;

public class SimpleInterest {
  
  
  public static void main(String[] args) { 
    System.out.println("Hello. I would like to help you calculate simple interest.");
    System.out.print("What is the principal amount in US$?");   
    
    double principalAmount;   //This is for the principal amount in US$
    
    Scanner keyboard = new Scanner (System.in);
    principalAmount = keyboard.nextDouble();
    
    System.out.print("What is the annual interest rate, shown as a decimal?");
    double annualInterest;   //This is for the rate you annually pay in interest.
    annualInterest = keyboard.nextDouble();
    
    System.out.print("What is the length of time in years the money will borrowed?");
    double timeInYears;   //This is for the length of time in years the money will be borrowed.
    timeInYears = keyboard.nextDouble();
    
    double simpleInterest = ((principalAmount) * (annualInterest) *(timeInYears)); //This is the calculation for the simple interest taken all variables above into account.
    
    System.out.printf("The interest amount is US$ %,.2f\n", simpleInterest);
  }

  
}
