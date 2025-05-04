package apx.bits;

import java.util.Scanner;

public class b1_SingleNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int sizeArray = input.nextInt();
        int arr[] = new int[sizeArray];

        for(int i = 0 ; i< arr.length; i++){
            arr[i] = input.nextInt() ;
        }

        int ans =unique(arr);
        System.out.println(ans);

        input.close();
    }
    public static int unique(int arr[]){
        int u = 0 ;

        for(int i =0 ; i < arr.length ; i++){
            u = u ^ arr[i];
        }

        return u ;

    }
}

// You are given a non-empty array of integers, nums, where every element appears exactly twice except for one unique element that appears only once. Your task is to find and return the unique element.

// Input Format:
// An array nums of integers with the above constraints.

// Output Format:
// A single integer that represents the unique element which appears only once in the array.

// Constraints:
// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104
// Each element in the array appears twice except for one element which appears only once.