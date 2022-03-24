import java.util.Scanner;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Temperature Converison Program\n");

        //Displaying operational messages
        System.out.println("Program converts user-entered temperatures into Fahrenheit or Celsius scales");
        System.out.println("Program continues to prompt for user entry until no longer requested.");
        System.out.println("Note: upper or lower case letters permitted. Though, incorrect entries are not permitted.");
        System.out.println("Note: Program does not validate numeric data (optional requirement).");

        System.out.println();   //printing blank line
    }
    public static void convertTemp()
    {
        Scanner sc = new Scanner(System.in);
        double temperature = 0.0;
        char choice = ' '; //intialize to space character
        char type = ' '; //intitalize to space character

        do 
        {
            System.out.print("Fahrenheit to Celsius? Type \"f\", or Celsius to Fahrenheit? Type \"c\": ");
            type = sc.next().charAt(0);
            type = Character.toLowerCase(type);
            if (type == 'f')
            {
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                temperature = ((temperature - 32)*5)/9;
                System.out.println("Temperature in Celsius = " + temperature);
            }
        else if (type == 'c')
            {
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                temperature = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit = " + temperature);
            }
        else 
            {
                System.out.println("Incorrect entry. Please try again.");
            }
        System.out.print("\nDo you want to convert a temperature (y or n)? ");
        choice = sc.next().charAt(0);
        choice = Character.toLowerCase(choice);            
        }
    while (choice == 'y');
    System.out.println("\nThank you for using out Temperature Conversion Program!");
    }        
}
