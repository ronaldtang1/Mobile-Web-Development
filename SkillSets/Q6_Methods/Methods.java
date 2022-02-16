import java.util.Scanner;

public class Methods {
    //Create method without returning any value (without object)
    public static void getRequirements()
    {
        System.out.println("Program prompts user for first name and age, then prints results.");
        System.out.println("Create four methods from the following requirements:");
        System.out.println("1) getRequirements(): Void method displays program requirements.");
        System.out.println("2) getUserInput(): Void method prompts for user input, \n\tthen calls two methods: myVoidMethod() and myValueReturningMethod().");
        System.out.println("3) myVoidMethod():\n" +
                        "\ta. Accepts two arguments: String and int. \n" +
                        "\tb. Prints user's first and age.");
        System.out.println("4) myValueReturningMethod():\n" +
                        "\ta. Accepts two arguments: String and int. \n" +
                        "\tb. Returns String containing first name and age.");
        
        System.out.println();  //printing blank line
    }

    public static void getUserInput()
    {
        //intialize variables, create Scanner object, capture user input
        String firstName = "";
        int userAge = 0;
        String myStr = "";
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Enter first name: ");
        firstName=sc.next();

        System.out.println("Enter age: ");
        userAge = sc.nextInt();

        System.out.println();   //print blank line

        //calling void method
        System.out.println("void method call: ");
        myVoidMethod(firstName, userAge);

        //call value-returning method
        System.out.println("value-returning method call: ");
        myStr = myValueReturningMethod(firstName, userAge);

        //myValueReturningMethod(firstName, userAge); // works, but discarded
        System.out.println(myStr);
    }

    public static void myVoidMethod(String first, int age)
    {
        System.out.println(first + " is " + age);
        return;
    }

    public static String myValueReturningMethod(String first, int age)
    {
        //implicit string conversion of age (int)
        return first + " is " + age;
    }
}
