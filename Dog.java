public class Dog {
    //create two fields for our dog objects
    private String name;
    private int age;

    // create getters and setters for our fields
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // create constructor for the Dog object that will be created with the "new" keyword
    //a constructor is a special method taht is called or invoked when the Dog class is used
    //to create an object
    public Dog(){
        System.out.println("\n A dog object was created. This message is from the constructor.");

    }

    //create a constructor that a string data type for the dogs name.
    public Dog(String myDogName) {
        this.name = myDogName;
    }

    // create a constructor that accepts an argument when an object is created, this argument will
    // be an int
    public Dog(int theAge){
        this.age = theAge;
    }

    // create a constrcutor that accepts two arguments - a string and an int

    public Dog (String someName, int someAge){
        this.name = someName;
        this.age = someAge;
    }

}
