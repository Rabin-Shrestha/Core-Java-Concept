package main.java8.fox;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeris {
    public static void main(String[] args) {
// 1 1 2 3 5 8 13
        System.out.println(getFiboList(10));
        System.out.println("10th fibo number is: "+ fiboSpaceOptimized(10));
        System.out.println("10th fibo number using recursion is:( 0 based args) "+ fiboUsingRecursion(9));
        System.out.println("10th fibo number using dynamic programming: "+ fiboUsingDynamicProgramming(9));


    }
    static List<Integer> getFiboList(Integer n)
    {
        List<Integer> fiboList = new ArrayList<>();
        Integer a =0, b=1;
        fiboList.add(a);
        fiboList.add(b);
        Integer c;
        for(int i=0;i<n-2;i++){
            c= a+b;
            a = b;
            b = c;
            fiboList.add(c);
        }
        return fiboList;

    }
   // Lots of repetitive work
   // Time: exponential
   // space 0(n) stack space
    static Integer fiboUsingRecursion(Integer n)
    {
        if(n<=1)
            return n;
        else
            return fiboUsingRecursion(n-1)+ fiboUsingRecursion(n-2);
    }

    // Un necessary use of memory Space
    // O(n) space
    static Integer fiboUsingDynamicProgramming(Integer n)
    {
        Integer[] fiboArray = new Integer[n+2];
        fiboArray[0]=0;
        fiboArray[1]=1;
        for(int i = 2; i<=n ; i++)
        {
            fiboArray[i]= fiboArray[i-1]+ fiboArray[i-2];
        }
        return fiboArray[n];
    }
    // Optimized code
    // Time O(n)
    // Space O(1)
    static Integer fiboSpaceOptimized(Integer n)
    {
        if(n<2) return n;
        Integer a = 0;
        Integer b = 1;
        Integer c = 0;
        for(int i=0;i<n-2;i++){
            c= a+b;
            a = b;
            b = c;
        }
        return c;
    }

}
