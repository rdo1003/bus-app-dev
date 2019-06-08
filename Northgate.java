/**
 * Calculate Bill for Northgate internet and video streaming
 * Author: Ryan O'Keeffe
 */

import java.util.Scanner;
public class Northgate {
    
    
    public static void main(String[] args) { 
       
        int gig;
        int data;
        int basic = 15;
        int premium = 30;
        
        
        //choose premium or basic streaming plans
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Choose an option for your Video Streaming");
        
        System.out.printf("For the basic option enter the number 1 : for the premium option enter the number 2");
        data = keyboard.nextInt();
        
        //validate input
        while (data !=1 && data !=2) {
        System.out.println("Invalid entry! Please enter 1 for Basic, 2 for Premium.");
        data = keyboard.nextInt();
        }
        
        System.out.printf("Last month how many gigabytes of data did you use?");
        gig = keyboard.nextInt();
        
        //if statement for choosing gigs
        if (gig < 50) { 
            data = basic * 32; 
        } else if (gig  <= 100) { 
            data = basic * 42; 
        } else { 
            data = basic * 62;  
        } 
        
          if (gig < 50) { 
            data = premium * 27; 
        } else if (gig  <= 100) { 
            data = premium * 37; 
        } else { 
            data = premium * 57;  
        } 
        
        System.out.println("The premium video streaming option is $30.");
        System.out.println("Your monthly fee for internet service will be $37.");
        System.out.println("Your total monthly fee will be $67.00.");
         
        //calculate total bill
        System.out.printf("Your bill is $%,d.\n", data); 
        keyboard.close();
      
        

    }
        
    
    
}
