package apx.Recursion;

import java.util.Scanner;

public class R1_Fiboonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
    public static int fib(int n){
        if(n==1 || n == 0) return n ;

        int recurrence1 = fib(n-1);
        int recurrence2 = fib(n-2);

        return recurrence1 + recurrence2 ;

    }
    
}
// Take as input a number n.
// Print the nth number of Fibonacci sequence where
// 0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample
// 0 1 1 2 3 5 8 13 21 34 55

// Input Format:
// Integer

// Output Format:
// Integer