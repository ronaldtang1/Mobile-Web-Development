import java.util.Scanner;

public class Methods {

    public static void getRequirements()
    {
        System.out.println("Ronald Tang");
        System.out.println("Program evaluates integers as even or odd.");
        System.out.println("Program does *not* check for non-numeric characters.");

    }
    public static void evaluateNumber(){
        int num;
        System.out.println("Enter integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num % 2 == 0 )
        System.out.println(num+ " is an even number");
     else
        System.out.println(num+ " is an odd number");
    
        
    }
}