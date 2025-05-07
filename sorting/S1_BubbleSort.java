package apx.sorting;

import java.util.Scanner;

public class S1_BubbleSort {
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

    public static int [] bubbleSort(int arr[]){
        int n = arr.length ;

        for(int i = 0 ; i< n -1 ; i++){
            for(int j = 0 ; j<n-1 -i ; j++){
                if(arr[j] >= arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr ;  
     }
     public static void swap(int swapArr[], int j , int j1){
        

        int temp = swapArr[j];
        swapArr[j] = swapArr[j1];
        swapArr[j1] = temp ;
     }
}
// Given N array Integers, Sort the array using Bubble sort technique

// Input Format:
// Integer representing N representing length of array
// N numbers of Array

// Output Format:
// Print the sorted array in a line separated by space

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9