package apx.sorting;

import java.util.Scanner;

public class L3_InsertionSort {
    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n] ;
		for( int i = 0 ; i< n ;i++){
			arr[i] = sc.nextInt() ;
		}

		insertionSort(arr) ;
		
		for(int i= 0 ; i< n ;i++){
		System.out.print(arr[i] + " ");
		}
        sc.close();
    }
    public static void insertionSort(int arr[]){
        for(int i = 1  ; i< arr.length ; i++){
            for(int j= i-1 ; j>=0 ; j--){
                if( arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1] ;
                    arr[j +1] = t ;
                }else{
                    break ;
                }
            }
        }
    }
}
// LU: Sorting_Insertion sort
// Success rate: 62.50%
// The task is to implement the insert() function, which is part of the Insertion Sort algorithm. This function ensures that the elements up to the i-th index in the array are sorted. The insertionSort() function sorts the entire array using the Insertion Sort algorithm.

// Input Format:
// The first line contains an integer N, the size of the array.
// The second line contains N space-separated integers representing the elements of the array.

// Output Format:
// Print the sorted array as a single line of space-separated integers.

// Constraints:
// 1 <= N <= 1000
// 1 <= arr[i] <= 1000