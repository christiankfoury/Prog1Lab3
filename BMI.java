import java.util.*;
public class BMI{ 
    public static void main(String[] args) 
    {
        // Scanner called kb (keyboard)
        Scanner kb = new Scanner(System.in);

        // Prompt the user for his weight in pounds
        System.out.println("Enter your weight in pounds:");
        // Input from the user
        double pounds = kb.nextDouble();
            // Creaating a while loop if the user inputs negative number
            while (pounds <= 0){
            // Output the user what is the problem
            System.out.println("This is not a valid number. The number inputed is a negative number");
            // Asking the question again
            System.out.println("Enter your weight in pounds:");
            // Getting input from the user, if the user inputs a negative number again, it will loop again.
            pounds = kb.nextDouble();
            }

        // Prompt the user for his height in feet
        System.out.println("Enter you height in feet");
        // Input from the user
        double feet = kb.nextDouble();
        // Creating a while loop if the user inputs a negative number
        while (feet <= 0){
            // Output the user what is the problem
            System.out.println("This is not a valid number. The number inputed is a negative number");
            // Asking the question again
            System.out.println("Enter your height in feet:");
            // Getting input from the user, if the user inputs a negative number again, it will loop again.
            feet = kb.nextDouble();
            }

        // Conversion of weight in pounds into weight in kilograms
        double kilograms = pounds / 2.2;
        // Conversion of height in feet into meters
        double meters = feet / 3.281;

        // BMI formula
        double bmi = kilograms / (meters * meters);
            // Creating if statement if bmi smaller than 18.5
            if(bmi < 18.5){
                // Output
                System.out.printf("Your BMI is %.2f and you are classified as underweight", bmi);
            }
            // Creating if statement if bmi is in between 18.5 and 25
            else if (bmi >= 18.5 && bmi < 25){
                // Output
                System.out.printf("Your BMI is %.2f and you are classified as normal", bmi);
            }
            // Creating if statemenet if bmi is in between 25 and 30
            else if (bmi >= 25 && bmi < 30){
                // Output
                System.out.printf("Your BMI is %.2f and you are classified as overweight", bmi);
            }
            // Creating if statement if bmi is in between 30 an 35
            else if (bmi >= 30 && bmi < 35){
                // Output
                System.out.printf("Your BMI is %.2f and you are classified as obese", bmi);
            }
            // Otherwise if the bmi is bigger than 35
            else{
                // Output
                System.out.printf("Your BMI is %.2f and you are classified as extremely obese", bmi);
            }
    }
}
