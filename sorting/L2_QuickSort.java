package apx.sorting;

import java.util.Scanner ;

public class L2_QuickSort {


    public static void quickSort(int arr[], int s , int e ){
        if( s >=e){return ;}
        int p = rearrange(arr, s, e);
        quickSort(arr,s, p-1) ;
        quickSort(arr,p+1,e) ; 
    }   

    public static int rearrange(int arr[], int s , int e){
        int p1 = s+1 ;
        int p2 = e ;

        while(p1<= p2){
            if(arr[p1] <= arr[s]){ p1++;}
            else if( arr[p2] > arr[s]){ p2--;} 
            else{
                swap(arr,p1,p2) ;
                p1++ ; p2-- ;
            }
        }
        swap(arr, s , p2) ;

        return p2 ; // after swapp [s] at p2
    }

    public static void swap (int arr[] , int a, int b ){
        int t= arr[a] ;
        arr[a] = arr[b] ;
        arr[b] =t ;

    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        int arr[] = new int[n] ;

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt() ;
        }
        quickSort(arr,0 , arr.length -1 ) ;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " ");
        }
         sc.close() ;
    }
   
}
// LU: Sorting_Quick Sort
// Success rate: 46.88%
// Quick Sort is a Divide and Conquer algorithm that selects a pivot element and partitions the given array around the chosen pivot. The goal is to sort the array using the Quick Sort algorithm.

// Given an array arr[], where the starting position is low (the index of the first element) and the ending position is high (the index of the last element), implement the Quick Sort algorithm to sort the array.

// Input Format:
// The first line contains an integer N, representing the size of the array.
// The second line contains N space-separated integers representing the elements of the array.

// Output Format:
// Print the sorted array as a single line of space-separated integers.

// Constraints:
// 1 <= N <= 10^3
// 1 <= arr[i] <= 10^4