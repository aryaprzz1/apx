package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class S1_OrderOfRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(order(arr));   
     }
    public static int order(int arr[]){
        Arrays.sort(arr);
        int mincost= 0 ;
        for(int i = arr.length -1 ; i >= 0 ; i--){
            mincost = mincost + (arr[i] * (arr.length - i));
        }
        return mincost;
    }
}


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