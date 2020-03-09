// Importing Java classes
import java.util.*;
// This program prompt the user for a radius and calculates the area from the inputed radius
public class Circle{
public static void main(String[] args) 
    {
    // Using the scanner class and calling it kb
    Scanner kb = new Scanner(System.in);
    // Prompt the user for a radius
    System.out.println("Enter a positive number for the radius of a circle");
    // Getting input of the user
    double radius = kb.nextDouble();
        
        // Creating a while loop if the input of the user inputs a radius of 0
        while (radius == 0)
        {
            // Output the user what is the problem
            System.out.println("This is not a valid number. The number inputed is 0");
            // Asking the question again
            System.out.println("Enter a positive number for the radius of a circle");
            // Getting input from the user, if the user inputs 0 again, it will loop again. 
            radius = kb.nextDouble();
        }

        // Creating a while loop if the input of the user inputs a negative radius
        while (radius <= 0)
        {
            // Output the user what is the problem
            System.out.println("This is not a valid number. The number inputed is a negative number");
            // Asking the question again
            System.out.println("Enter a positive number for the radius of a circle");
            // Getting input from the user, if the user inputs a negative number again, it will loop again.
            radius = kb.nextDouble();
        }
        
    // Formula for the area of a circle (PI * radius * radius)
    double area = radius * radius * Math.PI;
    // Outputting the area of the circle with 2 decimals after the decimal point
    System.out.printf("The area of the circle is: " + "%.2f\n", area);

    }
}

