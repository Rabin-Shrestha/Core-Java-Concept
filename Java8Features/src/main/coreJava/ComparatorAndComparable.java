package main.coreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorAndComparable {
    public static void main(String[] args) {

//sorting object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);

        // Working on Array
        Arrays.sort(empArr, new mySalaryComparator());
        Arrays.sort(empArr, Comparator.comparing(employee -> employee.getAge()));

        //sorting employees array using Comparable interface implementation
        // Working on List
        List<Employee> list = Arrays.asList(empArr);
        // Using Lamda Expression
        List<Employee> sortedListBasedOnAge = list.stream().sorted((a, b) -> a.getAge() - b.getAge()).collect(Collectors.toList());
        // USing Custom Camparator
        List<Employee> sortedBasedOnSalary = list.stream().sorted(new mySalaryComparator().reversed()).collect(Collectors.toList());
        // Using in built method in Comparator class
        list.stream().sorted(Comparator.comparing(employee -> employee.getSalary()));

        // Multiple level of comparing
        Collections.sort(list,
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getAge)
                        .thenComparing(Employee::getSalary)
        );


        //Printing the Employee Details
        System.out.println("Based on Age");
        sortedListBasedOnAge.stream().forEach(emp -> System.out.println(emp.toString()));
        //Based on Salary
        System.out.println("Based on Salary");
        sortedBasedOnSalary.stream().forEach(emp -> System.out.println(emp.toString()));

        // Stream to the Array
        Integer[] myConvertedArray = Stream.of(1, 2, 3, 4, 5, 9, 8).toArray(Integer[]::new);
        System.out.println(myConvertedArray.length);

        Boolean teneryResult = "Rabin".endsWith("n") ? true : false;

    }
}

class Employee implements Comparable<Employee> {

    public int compareTo(Employee e) {
        return this.name.compareToIgnoreCase(e.getName());
    }

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
}

class mySalaryComparator implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp1.getSalary() - emp2.getSalary());
    }
}
