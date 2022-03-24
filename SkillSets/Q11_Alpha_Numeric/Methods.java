import java.util.Scanner;

public class Methods
{
    public static void getRequirements()
    {
        System.out.println("Program determines whether user-entered value is alpha, numeric, or special character.");
        System.out.println("\nReferences:\n"
                        + "ASCII Background: https://en.wikipedia.org/wiki/ASCII\n"
                        + "ASCII Character Table: https://www.ascii-code.com/\n"
                        + "Lookup Tables: https:// www.lookuptables.com/");

        System.out.println();   //printing blank line
    }   

    public static void determineChar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch + " is alpha. ASCII value: " + (int) ch);     //cast char to int
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is numberic. ASCII value: " + (int) ch);
        }
        else 
        {
            System.out.println(ch + " is special character. ASCII value: " + (int) ch);
        }
    }
}
