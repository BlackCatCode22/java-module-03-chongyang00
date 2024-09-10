// Chong Yang 091024
// App.java
// String point to create objects from my class

import java.util.ArrayList;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        System.out.println("\n\n Welcome to classes and object-oriented programming!\n");

        Student myNewStudent = new Student();

        // new reserves memory in heap for an object from class, and returns the address of the new obejct

        myNewStudent.age = 21;
        myNewStudent.gpa = 3.8;
        myNewStudent.major = "Computer Science";
        myNewStudent.firstName = "Chong";
        myNewStudent.lastName = "Yang";
        myNewStudent.onProbation = true;

        // output some stuff about our new object
        System.out.println("\n The first name of our student is: " + myNewStudent.firstName + "\n\n");

        // create two more students
        Student anotherStudent = new Student();
        Student oneMoreStudent = new Student();

        oneMoreStudent.major = "History";

        anotherStudent.age = 20;

        // how many students?
        System.out.println("\n There were " + Student.numOfStudents + " Students objects created!");

        //create an array of studeunts
//        students = new Student[100];

//        String myObjectName = "";
//        for (int i = 0; i < 100; i++) {
//            // create 100 new student objects
//            // create names for my objects
//            // create Student objects
//            Student studentNum = new Student();

        //create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Iphone";
        myNewPhone.numOfCamera = 2;

        System.out.println("\n My new phone has " + myNewPhone.numOfCamera + " cameras.");

        // create 100 students with an ArrayList - a handy data structure
        // flexible insize

        ArrayList<Student> myStudentList = new ArrayList<>();

        for (int i = 0; i < 100 ; i++){
            Student myStudent = new Student();
            myStudent.firstName = " some first name";
            myStudent.age = 99;
            myStudentList.add(myStudent);
        }




        }



    }
