package apx.dp.Recursion;
import java.util.Scanner;

public class R1_PowerXN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(p(a,n));
        sc.close();
    }
    // public static int pxn(int a , int n){
    //     if(n==1) return a;

    //     int recurrence = pxn(a, n-1);

    //     return recurrence * a;

    // }

    public static long p(int a, int n){
        if(n == 1 )return a;

        long recurrence = p(a, n/2);

        if(n % 2 == 0 ){
            return recurrence * recurrence;
        }else{
            return recurrence * recurrence * a ;
        }
    }


}
// Given two Integer a and n, find a^n (a raise to power n).

// Note: Use Recursion and Expected Time complexity is O(logN).

// Input Format:
// Single line contains 2 integers a and n

// Output Format:
// Return the answer a^n

// Constraints:
// 1<= a <= 10
// 1<= n <= 18