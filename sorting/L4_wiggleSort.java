package apx.sorting;

import java.util.Scanner;

public class L4_wiggleSort {
    
    public static void wiigle(int [] arr ){

        for( int i = 0 ; i< arr.length ; i++){
            if( i % 2 == 0 ){
                if( arr[i] > arr[i+1] ){ swap(arr,i,i+1); }
            }else{ // odd
                if( arr[i] < arr[i+1]){ swap(arr, i , i+1) ;}
            }
        }
    }
    public static void swap(int arr[] , int a , int b ){
        int t  = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = t ;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        int arr[] = new int[n] ;

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt() ;
        }

        wiigle(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close() ;
    }

}
// LU: Sorting_Wiggle Sort
// Success rate: 53.85%
// Given an unsorted array nums, reorder it in-place so that the elements follow the pattern:

// nums[0] <= nums[1] >= nums[2] <= nums[3] ...

// There may be multiple correct answers; you only need to find one valid solution.

// Input Format:
// The first line contains an integer n, representing the size of the array.
// The second line contains n space-separated integers representing the elements of the array.

// Output Format:
// Output the modified array, reordered according to the specified pattern.

// Constraints:
// 1 ≤ N ≤ 10^5