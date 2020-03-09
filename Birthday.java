
// Importing the needed classes
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// This program consists of calculating the date of the users inputed birthday and the date of today
public class Birthday{
    // Main method
    public static void main(String[] args) {
        // Using the Scanner class
        Scanner kb = new Scanner(System.in);

        // Prompt the user and ask the users birthday in the format YYYY-MM-DD
        System.out.println("Enter your date of birth in the format of YYYY-MM-DD");
        // Getting input from the user and storing it in a String
        String birth = kb.nextLine();

        // Cutting up the input from the user and seperating each year, month and day in a string
        String yearOfBirth = birth.substring(0,4);
        String monthOfBirth = birth.substring(5,7);
        String dayOfBirth = birth.substring(8);
    
        // Converting the string of the yearOfBirth, monthOfBirth and dayOfBirth into a Interger
        int yearInInt = Integer.parseInt(yearOfBirth);
        int monthInInt = Integer.parseInt(monthOfBirth);
        int dayInInt = Integer.parseInt(dayOfBirth);

        // Getting the date of today
        LocalDate now = LocalDate.now();
        // Setting the date of birthday but the year of 2020 in the LocalDate class
        LocalDate birthday = LocalDate.of(2020, monthInInt , dayInInt);
        // Using the between method to calculate the difference between the birthday and today
        long noOfDaysBetween = ChronoUnit.DAYS.between(now, birthday);            
            
            // If the diffence between today and the users birthdays was in the past 
            if(noOfDaysBetween < 0)
            {
                // Output using the math class to not display the negative
                System.out.println("Your birthday was " + Math.abs(noOfDaysBetween) + " days ago");
            }
            else
            {
                // Output to the user the number of days
                System.out.println("Your birthday is in " + noOfDaysBetween + " days");
            }
    }
}
