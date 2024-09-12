package myanimals;

public class Animal {

    //there is not a "static" keyword here so,
    // this method will be available to Animal objects.

    // create a public static named numOfAnimal, to be able to use it in main

    public static int numOfAnimal = 0;

    // create a constructor which is a special method
    // no return type

    public Animal(){
        numOfAnimal++;
    }

    public void animalSound(){
        System.out.println("\n A sound from the animal class.");
    }


}
