public class Student {
    public static int numOfStudents = 0;

    // create a constructor for our new objects.
    public Student(){
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    // give our Student class a few fields
    String firstName;
    String lastName;
    String major;
    double gpa;
    int age;
    boolean onProbation;



}
