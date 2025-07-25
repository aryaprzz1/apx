package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class L1_OrderOfRemoval {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt() ;

        Integer arr[] = new Integer[n] ;

        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt() ;
        }
        int ans = Order(arr) ;

        System.out.println(ans);
    }
    public static int Order(Integer arr[] ){
        int mcost = 0 ;

        Arrays.sort(arr) ;//asec
        //Arrays.sort(arr,Collections.reverseOrder()); desc

        for(int i = arr.length -1 ; i >= 0 ; i-- ){
            mcost += arr[i] * (arr.length - i) ; //assend

         //   mcost += arr[i] * (i+1) ; desc
        }
        return mcost ;

    }
}
// Sorting_Order of Removal
// Success rate: 27.45%
// Given N length Array, at every step remove an array element. Cost to remove element = sum of array elements present. Find min cost to remove all the elements.

// Note: Add to cost first and then remove.

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Return the min cost to remove all the elements.

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9