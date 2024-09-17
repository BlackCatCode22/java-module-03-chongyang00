// Chong Yang 09-17-24
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my OOP Class Practice Program!");

        //create a couple dog objects
        //with an empty arguments ("no arg")
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // create a dog with a name
        Dog aDog = new Dog("Doodle");

        //output the dog name
        System.out.println("\n My dog's name is " + aDog.getName() );

        Dog otherDog = new Dog (4);
        System.out.println("\n My new dog's age is " + otherDog.getAge());

        // create 5th dog

        Dog fifthDog = new Dog("Candy", 8);
        System.out.println("\n My other dog's name is " + fifthDog.getName() + " and she is " + fifthDog.getAge());

        

    }




}