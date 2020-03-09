// Importing all Java classes
import java.util.*;
// This program prompts the user for the temperatue outsid in celcius and it
// outputs different messsages wether ethe temperature is above or below zero
public class Temperature{
    public static void main(String[] args) {
        
        // Creating a scanner and calling it kb
        Scanner kb = new Scanner(System.in);
        
        String output;
        // Prompt the user
        System.out.println("What is the current temperature in celcius?");
        // Input from the user
        double celcius = kb.nextDouble();
        // Assigning the string output to a message depending if the celcius if larger than 0
        output = celcius >= 0 ? "It's warm outside!":"It's cold outside!";
        
        // Output
        System.out.println(output);
        
        
        
    }
}
