// Chong Yang 09-12-24
// packagesandmore.java

import myanimals.Animal;
import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;


public class Main {
    public static void main(String[] args) {

        System.out.printf("\n Hello and welcome from Main! \n");

        //create a Student object
        //'Student' is class name and 'student' is object name, call class name first

        Student student = new Student();

        //create an object from a runnable class

        App app = new App();

        //use a method form the student class
        //I know that I have a static method on the Student class
        //and I know how to call a static class method, it is 'Student' uppercase S

        Student.sayHello();

        // call student from object

        student.sayHi();

        // out put the numbers of animals

        System.out.println("\n The number of animals is " + Animal.numOfAnimal);

        // create a cat Object, 'cat' is the object and 'Cat' is calling the class

        Cat cat =  new Cat();

        // use a method that is available to the Cat class object named cat
        System.out.println("\n This sound is coming from the Cat object named cat.");
        cat.animalSound();

        // create dog object

        Dog dog = new Dog();

        // call the dog object and make it print out the sound it makes from the Dog class

        System.out.println("\n This sound is coming from the Dog object named dog.");
        dog.animalSound();

        System.out.println("\n The number of animals is " + Animal.numOfAnimal);


    }
}