package apx.array;

import java.util.Scanner;

public class A2_PrefixSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // pfBrute(arr);

        arr = pfOptimal(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
        sc.close();


    }
    // public static int[] pfBrute(int arr[]){
    //     int n =arr.length;
    //     int pf[] = new int[n];
    
    //     for(int i = 0 ; i <n  ; i++ ){
    //         int  s= 0;
    //         for(int j = 0 ; j<=i ; j++){
    //             s= s + arr[j];    
    //         }
    //         pf[i] =s ;
    //     }
    //     return pf ;

    // }
    public static int[] pfOptimal(int arr[]){
        int n = arr.length ;
        int pf []= new int[n];
        pf[0] =arr[0];
        for(int i = 1 ; i<n ;i++){
            pf[i] = pf[i -1] + arr[i];
        }
        return pf;
    }
    
}

// Given an array nums. We define a prefix sum of an array as prefix[i] = sum(nums[0]+nums[1]..…nums[i]).

// Return the prefix sum of nums.

// Input Format:
// The first line contains an integer n representing size of nums array.
// The second line contains n integers of array.

// Output Format:
// Return the prefix sum.

// Constraints:
// 1 <= nums.length <= 1000
