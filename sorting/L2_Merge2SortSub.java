package apx.sorting;

import java.util.Scanner;

public class L2_Merge2SortSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int n = sc.nextInt() ;
        int a  [] = new int[n] ;

         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = sc.nextInt() ;
        int m = sc.nextInt() ;
        int e = sc.nextInt() ;

       int arr [] = merge(a,s,m,e) ;

       for (int i : arr) {
        System.out.print(i + " ");
       }
       sc.close();
    }

    public static int [] merge(int a[] , int s , int m ,int e  ){
        int m1 [] = new int[e-s +1] ;

        int p1 = s ;
        int p2 = m+1 ;
        int p3 = 0 ;

        while(p1 <= m && p2 <= e){
            if(a[p1] < a[p2]){
                m1[p3] = a[p1] ;
                p3++ ;
                p1++ ;
            }else if(a[p1] >= a[p2]){
                m1[p3] = a[p2] ;
                p3++ ;
                p2++ ;
            }
        }
        while(p1 <= m){
            m1[p3] =a[p1];
            p3++ ;
            p1++ ;
        }
        while(p2 <=e){
            m1[p3] = a[p2] ;
            p2++ ;
            p3++ ;
        }

        for( int i = 0 ; i< m1.length; i++){
            a[s+i] = m1[i];
        }


        return a ;
    }
    
}
// LU: Sorting_Merge Two Sorted SubArray
// Success rate: 42.22%
// Given a sorted arrays with N elements and 3 indices s, m and e such that subarray [s,m] is sorted, subarray [m+1,e] is sorted. Sort the subarray [s,e].

// Note: s to m and then m+1 to e are continuous subarray

// Input Format:
// The first line contains integer n representing size of array
// The second line contains n elements of array.
// The third line contains 3 elements representing s,m and e index.

// Output Format:
// Print the array after sorting subarray [s,e] in a line separated by space

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9