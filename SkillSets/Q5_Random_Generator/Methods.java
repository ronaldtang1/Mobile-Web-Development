import java.util.Scanner;
import java.util.Random;

public class Methods
{
public static void getRequirements()
{
    //displaying operational messages
    System.out.println("Author: Ronald Tang");
    System.out.println("Print minimum and maximum integer values.");
    System.out.println("Program prompts user to enter desired number of pseudorandom-generated integers(min 1)");
    System.out.println("Use following loop structures: for, enhanved for, while, do...while.\n");

    //print min/max integer values
    System.out.println("Integer.MIN_VALUE=" + Integer.MIN_VALUE);
    System.out.println("Integer.MAX_VALUE=" + Integer.MAX_VALUE);

    System.out.println();   //printing blank line
    return;
}
 
public static int[] createArray()
{
    Scanner sc = new Scanner(System.in);
    int arraySize = 0;

    //ask user for number of randomly generated numbers
    System.out.println("Enter desired number of pseudorandom integers (min 1): ");
    arraySize = sc.nextInt();

    int yourArray[] = new int[arraySize];
    return yourArray;
}

//nonvalue-returning method accepts int array arg (static requires no object)
public static void generatePseudoRandomNumbers(int[] myArray)
{
    Random r = new Random(); //instantiate random object variable
    
    //create loops to randomize integer values
    int i = 0;     //initializing counter variable
    System.out.println("for loop:");
    for(i=0;i<myArray.length;i++)
    {
        System.out.println(r.nextInt());
    }

    System.out.println("\nEnhanced for loop:");
    for(int n: myArray)
    {
        System.out.println(r.nextInt());
    }

    System.out.println("\nwhile loop:");
    i=0; //reassign to 0
    while (i<myArray.length)
    {
        System.out.println(r.nextInt());
        i++;
    }

    i=0; //reassign to 0
    System.out.println("\ndo...while loop:");
    do
    {
        System.out.println(r.nextInt());
        i++;
    }
    while (i < myArray.length);
 }   
}
