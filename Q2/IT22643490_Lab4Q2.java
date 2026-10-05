import java.util.Scanner;

public class IT22643490_Lab4Q2 {

    public static void main(String[] args) {
       
	   // Create a scanner object to read user input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
		 // Variables to store the exam and lab marks as well as percentages

        double examMarks, labMarks, finalMarks;
        double examPercentage, labPercentage;

           // Prompt the user to enter the exam marks (out of 100)
		   
        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = scanner.nextDouble();
        
           // Validate the entered exam marks to ensure they're within the valid range
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;  
        }

            // Ask for the lab submission marks (out of 100)
        System.out.print("Please enter lab submission marks (out of 100): ");
        labMarks = scanner.nextDouble();
        
        
		
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;  
        }

       // Now, ask the user for the percentage that the exam marks contribute to the final score
        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = scanner.nextDouble();

       
        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = scanner.nextDouble();
        
          // Ask for the percentage that the lab submission marks contribute
	   
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;  
        }

          // Calculate the final mark based on the entered exam and lab marks and their respective percentages
        finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Output the final mark, which is the weighted average of the exam and lab marks
        System.out.println("\nFinal Exam Mark is : " + finalMarks);
        
        // Close the scanner to release the system resources
        scanner.close();
    }
}