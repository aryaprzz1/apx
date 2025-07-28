package apx.sorting;

import java.util.Scanner;

public class L3_SortingRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n] ;
		for( int i = 0 ; i< n ;i++){
			arr[i] = sc.nextInt() ;
		}

		rearrange(arr) ;
		
		for(int i= 0 ; i< n ;i++){
		System.out.print(arr[i] + " ");
		}
        sc.close();
		
    }

    public static void rearrange(int arr[]){
        int p1  = 1 ;
        int p2  = arr.length -1 ;

        while( p1 <= p2) {
            if(arr[p1] <= arr[0]){
                p1++ ;
            }else if(arr[p2] > arr[0]){
                p2-- ;
            }else{ // points until p1 and p2 freezes
               swap(p1,p2 ,arr) ;
                p1++ ;
                p2-- ;
            }
        }

        swap(arr[0], p2, arr) ;

    } 

    public static void  swap(int a , int b , int arr[]){
        int t = arr[a] ;
        arr[a]= arr[b] ;
        arr[b] = t ;
    }
}
// LU: Sorting_Rearrange Array
// Success rate: 48.33%
// Given N elements, Rearrange the array so that

// a) arr[0] should go to correct sorted position
// b) all elements <=arr[0] should go to leftside of arr[0]
// c) all elements >arr[0] should go to rightside of arr[0]

// Input Format:
// The first line contains integer n representing the size of array
// The second line contains n elements of array.

// Output Format:
// Print the array after rearranging.

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9
