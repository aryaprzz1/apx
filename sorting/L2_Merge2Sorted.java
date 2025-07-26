package apx.sorting;

import java.util.Scanner;

public class L2_Merge2Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a [] = new int[n];
        int b [] = new int[m] ;

        for( int i = 0 ; i< n; i++){
            a[i] = sc.nextInt() ;
        }
        for(int i = 0 ; i< m; i++){
            b[i] = sc.nextInt() ;
        }

        int merged [] = merge(a, b) ;

        for(int k : merged){
            System.out.print(k +" ");
        }
        sc.close();
    }

    public static int [] merge(int a[] , int b []){
        int m [] = new int[a.length + b.length] ;

        int i=0 , j =0,  k = 0 ;

        while(i < a.length   && j < b.length){
                if(a[i] > b[j]){
                    m[k] = b[j] ;
                    j++ ;
                }else if(a[i] <= b[j]){
                    m[k] =a[i] ;
                    i++ ;
                }
                k++ ;
        }
        while(i < a.length ){
            m[k] = a[i];
            i++ ;
            k++ ;
        }
        while(j < b.length ){
            m[k] = b[j];
            j++ ;
            k++ ;
        }

        return m ;

    }
}
// LU: Sorting_Merge Two Sorted Array
// Success rate: 38.46%
// Given two sorted arrays with N and M elements. Merge them into one sorted array and Print them.

// Input Format:
// The first line contains two integers n and m representing the size of 2 arrays
// The second line contains n elements of first array.
// The third line contains m elements of second array.

// Output Format:
// Print the merged sorted array in a line separated by space

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9