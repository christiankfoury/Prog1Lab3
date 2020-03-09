// Importing all Java classes
import java.util.*;
public class ConversionOptions{
    public static void main(String[] args) {
        // Using the Scanner class
        Scanner kb = new Scanner(System.in);

        // Outputting the different options
        System.out.println("Choose a series of options: ");
        System.out.println("Enter 1 for a conversion from meters to feet");
        System.out.println("Enter 2 for a conversion from USD to CAD");
        System.out.println("Enter 3 for a conversion from USD to EUR");
        System.out.println("Enter 4 for a conversion from Celcius to Fahrenheit");
        System.out.println("Enter 5 for a converion pounds to kilograms");

        // Getting the input from the user and storing it in a integer
        int choice = kb.nextInt();

        // Using the switch case statement for the different options
        switch (choice) {
            // If choice is equal to 1
            case 1:
            // Prompt the user for a value
            System.out.println("Enter a value of meters");
            // Input
            double meters = kb.nextDouble();
            // Conversion
            double feet = meters * 3.281;
            // Output the answer with 2 decimals after the decimal point
            System.out.printf(meters + " meter(s) is equal to %.2f \"", feet);
            // BREAK
                break;
            
            // If choice equal to 2
            case 2:
            // Prompt the user for a value
            System.out.println("Enter a value of USD");
            // Input
            double usd = kb.nextDouble();
            // Conversion
            double cad = usd * 1.36;
            // Output the answer with 2 decimals after the decimal point
            System.out.printf(usd + " $USD is equal to %.2f $CAD", cad);
            // BREAK
                break;
            
            // If choice equal to 3
            case 3:
            // Prompt the user for a value
            System.out.println("Enter a value of usd");
            // Input           
            usd = kb.nextDouble();
            // Conversion
            double eur = usd * 0.88;
            // Output the answer with a 2 decimals after the decimal point
            System.out.printf(usd + " $USD is equal to %.2f EUR", eur);
            // BREAK
                break;
            
            // If choice equal to 4
            case 4:
            // Promp the user for a value
            System.out.println("Enter a value of celcius");
            // Input
            double celcius = kb.nextDouble();
            // Conversion
            double fahrenheit = (celcius * (9/5) + 32);
            // Output the answer with 2 decimals after the decimal point
            System.out.printf(celcius + " C is equal to %.2f F", fahrenheit);
            // BREAK
                break;
                    
            // If choice equal to 5
            case 5:
            // Prompt the user for a value
            System.out.println("Enter a value of pounds");
            // Input
            double pounds = kb.nextDouble();
            // Conversion
            double kilograms = pounds / 2.205;
            // Output the answer with 2 decimals after the decimal point
            System.out.printf(pounds + " pounds is equal to %.2f kilograms", kilograms)
            // BREAK
                break;

            // If the answer is equal anything but 1,2,3,4,5
            default:
            // Output that the answer is not a valid answer
            System.out.println(choice + " is not valid");
                break;
        }

    }
}