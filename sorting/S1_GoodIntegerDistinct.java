package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class S1_GoodIntegerDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(goodInt(arr));
    }
    public static int goodInt(int arr[]){
        int count = 0 ;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == i){
                count++;
            }
        }
        return count;
    }


}
// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements are distinct.

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Count of Good Integers
