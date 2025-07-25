package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class L1_GooIntegerDistinct {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt() ;

        int arr[] = new int[n] ;
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt() ;
        }
        int ans = goodIntDist(arr) ;

        System.out.println(ans);
        }
        public static int goodIntDist(int arr[]){
        Arrays.sort(arr);
        int count = 0 ;

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == i){
                count++ ;
            }
        }
        return count ;
    }
}
// Sorting_Good Integer Distinct
// Success rate: 44.00%
// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements are distinct.

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Count of Good Integers

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9

