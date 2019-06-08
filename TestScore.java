/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class TestScore {
    
    
    public static void main(String[] args) { 
        
       int testScore; 
       char grade;
        
        System.out.println("this program will tell you your grade;");
        System.out.println("Enter your score;");
        Scanner keyboard = new Scanner (System.in);
        testScore = keyboard.nextInt();
        
        while (testScore < 0 || testScore >100) {
            System.out.println("Error! " + testScore + " is an invalid value. Please enter a correct value.");
            testScore = keyboard.nextInt();
        }
        
            if(testScore >= 90) {
            grade = 'A';
            }else if (testScore >=80) {
            grade = 'B';
            }else if (testScore >=70) {
            grade = 'C';
            }else if (testScore >=60) {
            grade = 'D';
            }else {
            grade = 'F';
            }
           
            if(testScore >= 0 && testScore <= 100) {
       
           
       System.out.printf("With a test score of " + testScore + " Your grade is " + grade + ".");
       } else {
       System.out.printf("You entered an invalid score please try again");
       keyboard.close();
        
  
    }

}
}
