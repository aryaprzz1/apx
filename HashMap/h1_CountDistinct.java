package apx.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class h1_CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt() ;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
    

       int ans =  dist(arr);
       System.out.println(ans);
        sc.close();
    }

    public static int dist(int arr[]){
        HashSet <Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        return hs.size() ;
    }
}

// Given an array arr[] of length N, The task is to count all distinct elements in arr[].

// Input Format:
// The first line contains size of array.
// Second line contains the elements of the array.

// Output Format:
// Output the count.


