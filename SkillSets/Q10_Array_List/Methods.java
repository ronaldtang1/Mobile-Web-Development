import java.util.ArrayList;
import java.util.Scanner;

public class Methods 
{
    public static void getRequirements()
    {
        System.out.println("Program populates ArrayList of strings with user-entered animal type values.");
        System.out.println("Examples: Polar bear, Guinea pig, dog, cat, bird.");
        System.out.println("Program continues to collect user-entered values until user types \"n\"");
        System.out.println("Program displays ArrayList tvalues after each iteration, as well as size.");

        System.out.println(); //print blank line
    }   
    
    
    public static void createArrayList()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> obj = new ArrayList<String>();
        String myStr = "";
        String choice = "y";
        int num = 0;

        while (choice.equals("y"))
        {
            System.out.print("Enter animal type: ");
            myStr = sc.nextLine();
            obj.add(myStr);
            num = obj.size();
            System.out.println("ArrayList elements:" + obj + "\nArrayList Size = " + num);
            System.out.print("\nContinue? Enter y or n: ");
            choice = sc.next().toLowerCase();
            sc.nextLine();
        }
    }
}
