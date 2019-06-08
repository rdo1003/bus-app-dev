/**
 * This program will display the maximum and minimum values goven three numbers.
 * Author: Ryan O'Keeffe
 */
import java.util.Scanner;
public class MinMax {
    
    
    
    public static double maxCalc (double numa, double numb, double numc) {
        double maximum = Math.max(numa, numb);// enables to take max of 3 numbers
        maximum = Math.max(maximum, numc);// enables to take max of 3 numbers
        return maximum;
        }
    
    
    public static double minCalc (double numa, double numb, double numc) { 
        double minimum = Math.min(numa, numb);// enables to take min of 3 numbers
        minimum = Math.min(minimum, numc);// enables to take min of 3 numbers
        return minimum;
        }
    
    public static void main(String[] args) { 
    System.out.println("To determine the maximum and minimum values in a list of three numbers.");
    Scanner keyboard = new Scanner (System.in);
    
    //read n1,n2, n3
    System.out.println("What is the first number?");
    double n1 = keyboard.nextDouble();
    System.out.println("What is the second number?");
    double n2 = keyboard.nextDouble();
    System.out.println("What is the third number?");
    double n3 = keyboard.nextDouble();
    
    //display result
    //in the following line, as soon as the compiler reaches maxCalc, it looks for a method named maxCalc
    System.out.println("The maximum value is " + maxCalc(n1,n2,n3));
    System.out.println("The minimum value is " + minCalc(n1,n2,n3));
    keyboard.close();
    }
    
  
    
}
