package apx.array;

import java.util.Scanner;

public class A1_ReversePart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int [] arr = new int[n];

       

        for(int i = 0 ; i< arr.length; i++){
            arr[i] = sc.nextInt() ;
        }

        int s = sc.nextInt() ;
        int e = sc.nextInt() ;

        reversPart(s, e, arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
        sc.close(); 

        
    }
    public static int[] reversPart(int s , int e , int arr[]){
        while (s<e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t ;
            s++;
            e++;
        }
        return arr;
    }
    
}

// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.

// Input Format:
// Each of the test cases have 3 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.
// The third line contains two index s and e

// Output Format:
// Print all the array element in a line separated by space after reversing part of array [s,e]

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// 10
// -3 4 2 8 3 9 6 2 8 10
// 3 7

// -3 4 2 2 6 9 3 8 8 10
