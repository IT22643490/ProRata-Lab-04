import java.util.Scanner;

public class IT22643490_Lab4Q3 {

    public static void main(String[] args) {
        // Create the  a scanner object for user input 
        Scanner scanner = new Scanner(System.in);
        
        // Prompt  the user to enter a new  number
        System.out.print("Enter a number: ");
        
        // Read the new enter number from the user
        int number = scanner.nextInt();
        
        // Use ternary  operator to determine if the number is positive, negative, or zero when user entered
        String result = (number > 0) ? "The number is: Positive" :
                        (number < 0) ? "The number is: Negative" :
                        "The number is: Zero";
        
        // print the output result 
        System.out.println(result);
        
        // close the scanner operator
        scanner.close();
    }
}