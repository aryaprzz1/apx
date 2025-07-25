package apx.sorting;

import java.util.Scanner;

public class L1_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr [] = new int[n];

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i<= arr.length -2 ; i++){
            for( int j = 0 ; j<= arr.length-2 - i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(j ,j+1,arr);
                }
            }
        }
    }

    public static void swap(int i , int j ,int arr[]){
        int t = arr[i];
        arr[i] = arr[j] ;
        arr[j] = t ;
        
    }
}
// Sorting_Bubble Sort
// Success rate: 30.05%
// Given N array Integers, Sort the array using Bubble sort technique

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Print the sorted array in a line separated by space

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9