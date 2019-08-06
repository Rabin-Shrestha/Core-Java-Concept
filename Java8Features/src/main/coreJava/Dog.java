package main.coreJava;

public class Dog {

    String dog ;
    static int x_static;
    int y_not_static;

    public String getName()
    {
        return this.dog;
    }

    public Dog(String dog)
    {
        this.dog = dog;
    }

    public void setName(String name)
    {
        this.dog = name;
    }

    public static void foo(Dog someDog)
    {
        x_static = 1;
        // y_not_static = 2;  // not possible !!
        someDog.setName("Max");     // AAA
        someDog = new Dog("Fifi");  // BBB
        someDog.setName("Rowlf");   // CCC
    }

    public static void main(String args[])
    {
        Dog myDog = new Dog("Rover");
        foo(myDog);
        System.out.println(myDog.getName());
    }
}