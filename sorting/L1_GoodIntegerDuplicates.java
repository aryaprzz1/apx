package apx.sorting;

import java.util.Arrays ;
import java.util.*;
public class L1_GoodIntegerDuplicates {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt() ;
        int arr[] = new int[n];

        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt() ;
        }
        System.out.println(goodIntDup(arr));
    }

    public static int goodIntDup(int arr[]){
        Arrays.sort(arr) ;

        int c = 0 ;
        int lc = 0 ;

        if(arr[0] == 0) {c++;}
        for(int i = 1 ; i< arr.length ; i++){
            if(arr[i] != arr[i-1]){
                lc = i ;
            }
            if(arr[i] == lc){
                c++ ;
            }
        }
        return c ;
    } 
}


// Sorting_Good Integer Duplicate
// Success rate: 33.62%
// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements can be duplicate.

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Count of Good Integers

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9

