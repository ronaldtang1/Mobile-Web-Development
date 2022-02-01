public class Methods {
 
    public static void getRequirements(){
        System.out.println("Developer: Ronald Tang");
        System.out.println("Program loops through array of strings.");
        System.out.println("Use following values: dogs, cat, bird, fish, insect.");
        System.out.println("Use following loop structures: for, enhanced for, while, do...while");
        System.out.println("\nNote: Prestest loops: for, enhanced for, while. Posttest loop: do ...while.");
        System.out.println();
    }
    
    public static void arrayLoops(){
        String[] animals = new String[5];
            animals[0] = "dog";
            animals[1] = "cat";
            animals[2] = "bird";
            animals[3] = "fish";
            animals[4] = "insect";

        System.out.println("for loop:");
        for(int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i]);
        }

        System.out.println("\nEnhanced for loop");
        for(String test: animals)
        {
            System.out.println(test);
        }

        System.out.println("\nwhile loop");
        int i = 0;
        while(i < animals.length)
        {
            System.out.println(animals[i]);
            i++;
        }

        i=0;
        System.out.println("\ndo...while loop");
        do 
        {
            System.out.println(animals[i]);
            i++;
        }
        while (i<animals.length);
    }
}
