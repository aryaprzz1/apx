package apx.sorting;

import java.util.Scanner;

public class L3_SortRearrangeSubarray {
   
    public static void subrearrange(int arr[], int s , int e){

        int p1 = s+1 ;
        int p2 = e ;
        while( p1 <= p2){
            if(arr[p1] <= arr[s] ){
                p1++ ;
            }else if(arr[p2] > arr[s]){
                p2-- ;
            }else{
                swap(arr, p1 ,p2) ;
                p1++;
                p2-- ;
            }
        }

        swap(arr,s,p2) ;
        
    }

    public static void swap(int arr[] , int a , int b){
        int t  = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = t;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt() ;
    int s = sc.nextInt() ;
    int e = sc.nextInt() ;

    int arr [] = new int[n] ;
    for(int i = 0 ; i< n ;i++){
        arr[i] = sc.nextInt() ;
    } 
   subrearrange(arr, s, e) ;

    for(int i = 0 ; i< n; i++){
        System.out.print(arr[i] + " ");
    }
     sc.close();
   } 
}

// LU: Sorting_Rearrange SubArray
// Success rate: 58.06%
// Given N elements and [s,e], Rearrange the SubArray so that

// a) arr[s] should go to correct sorted position in [s,e]
// b) all elements <=arr[s] should go to leftside of arr[s]
// c) all elements > arr[s] should go to rightside of arr[s]

// Input Format:
// The first line contains three integers n, s and e representing the size of array. subarray start and subarray end.
// The second line contains n elements of array.

// Output Format:
// Print the array after rearranging the subarray.

// Constraints:
// 1<= N <= 10 ^ 6
// 1<= A[i] <=10 ^ 9
