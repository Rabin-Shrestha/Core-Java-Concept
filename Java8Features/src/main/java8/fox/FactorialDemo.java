package main.java8.fox;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
 static long getFactorial(Integer n)
 {
     // Repeat the same call until n becomes 0
     if(n==0)return 1;
     else
         return n*getFactorial(n-1);
 }
}
