package main.coreJava.MiscCode;

public class RecursionTest {
    public static void main(String[] args) {
        //recursivePrint("RabinShrestha");
        int palinTest = 12321;
        System.out.println(" Is this Palindrome"+palinTest+"  "+ palindromeCheck(palinTest));
    }
    static void recursivePrint(String str)
    {
        if(str ==null || str.isEmpty() || str.length()<1)
            return;
        System.out.print(str.charAt(str.length()-1));
        recursivePrint(str.substring(0,str.length()-1));
    }

    static boolean palindromeCheck(int num)
    {
        int temp = num;
        int reverse = 0;
        while(temp>0){
            int r = temp%10;
            reverse = reverse*10+ r;
            temp = temp/10;
        }
        return num == reverse;

    }
}
