class Main{
    public static void main(String[] args){

        Methods.getRequirements(); //Only way to call void method: in stand-alone statement
        int[] userArray = Methods.createArray(); //java style array
        Methods.generatePseudoRandomNumbers(userArray); //pass array
    } 
}
