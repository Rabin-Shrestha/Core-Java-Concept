package main.java8.fox;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 33, 22,66,44);
       // myList.forEach(a-> System.out.println(a));//System.out.println(myList.contains(2));
        Collections.sort(myList,Integer::compareTo);
        System.out.println(myList);
        Collections.sort(myList,Collections.reverseOrder());
        System.out.println(myList);
        Collections.sort(myList,(a,b)->{return a-b;});
        System.out.println("Using my own comparator");
        System.out.println(myList);

        // Playing with array
        System.out.println("Array Operations");
        String[] array = {"aa","bb","cc","rr","xx","AA"};
        Arrays.sort(array,(a,b)-> b.compareTo(a));
        Arrays.asList(array).forEach(a-> System.out.print(a+","));
        String[] copyResult = Arrays.copyOfRange(array, 0,2);
        Arrays.asList(copyResult).forEach(a-> System.out.print(a+","));
    }
}
class User{
    Integer id;
    String Name;

    public User(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
