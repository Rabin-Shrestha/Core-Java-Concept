package main.coreJava;

abstract class Shape {
    private Integer x = 10;
    final String MYName = "Rabin";
    public static void helloMethod()
    {
        System.out.println("Hello World");
    }
    abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

//In real scenario, method is called by programmer or user
class TestAbstraction1 {
    public static void main(String args[]) {
        Shape s = new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
        Shape.helloMethod();

        // Abstract class can not be insantiated directly
        Shape ss = new Shape() {
            @Override
            void draw() {
                System.out.println("This is new Implementation of the shape class");
            }
        };
        ss.draw();
    }
}