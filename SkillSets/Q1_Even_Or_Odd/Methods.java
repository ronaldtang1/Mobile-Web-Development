import java.util.Scanner;

public class Methods {

    public static void getRequirements()
    {
        System.out.println("Developer: Ronald Tang");
        System.out.println("Program evaluates integers as even or odd.");
        System.out.println("Program does *not* check for non-numeric characters.");
        System.out.println();
    }
    public static void evaluateNumber(){
        int num;
        System.out.println("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if ( num % 2 == 0 )
        System.out.println(num+ " is an even number");
     else
        System.out.println(num+ " is an odd number");
    
        scanner.close();
    }
}