package apx.sorting;

import java.util.Scanner;

public class L2_InversionCount {
    
    static long  ans = 0 ; 

    public static void merge(long arr[] , int s , int e){
        if( s >= e){return ;}

        int m  = s +(e-s) /2 ;

        merge(arr, s, m) ;
        merge(arr,m+1,e) ;

        inverc(arr, s, m , e) ;
    }

    public  static void inverc(long arr[], int s , int m , int e){
        long t[] = new long[e-s +1] ;

        int i = s , j = m+1 , k = 0 ;

        while(i <=m && j <=e){
            if(arr[i] <= arr[j]){
                t[k++] =arr[i++] ;
            }else{// [i] > [j]
                ans += (m- i +1) ;// j -i --> j= m+1
                t[k++] = arr[j++] ;
            }
        }

        while(i <= m ){t[k++] =arr[i++];  }

        while( j <= e){t[k++] = arr[j++]; }

        for( int a = 0 ; a< t.length ; a++){
            arr[s+a] = t[a] ;
        }

        // return ans ;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        long arr[] = new long[sc.nextInt()];
        for(int i = 0 ;  i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        merge(arr, 0, arr.length -1);


        System.out.println(ans);

        sc.close();
        
    }

}
// LU: Sorting_Inversion Count
// Success rate: 23.91%
// Given an array of integers, find the Inversion Count in the array. An inversion occurs if there are indices i and j such that arr[i] > arr[j] and i < j.

// The Inversion Count of an array indicates how far it is from being sorted. An already sorted array has an inversion count of 0. If the array is sorted in reverse order, the inversion count is at its maximum.

// Input Format:
// The first line contains an integer N, the size of the array.
// The second line contains N space-separated integers representing the elements of the array.

// Output Format:
// Print a single integer representing the inversion count of the array.

// Constraints:
// 1 ≤ n ≤ 5*10^5
// 1 ≤ arr[i] ≤ 10^18


// import java.util.*;

// public class Main {

//     public static long mergeSortAndCount(long[] arr, int left, int right) {
//         long count = 0;

//         if (left < right) {
//             int mid = left + (right - left) / 2;

//             count += mergeSortAndCount(arr, left, mid);
//             count += mergeSortAndCount(arr, mid + 1, right);

//             count += merge(arr, left, mid, right);
//         }

//         return count;
//     }

//     public static long merge(long[] arr, int left, int mid, int right) {
//         int n1 = mid - left + 1;
//         int n2 = right - mid;

//         long[] leftArr = new long[n1];
//         long[] rightArr = new long[n2];

//         for (int i = 0; i < n1; i++)
//             leftArr[i] = arr[left + i];
//         for (int i = 0; i < n2; i++)
//             rightArr[i] = arr[mid + 1 + i];

//         int i = 0, j = 0, k = left;
//         long inversions = 0;

//         while (i < n1 && j < n2) {
//             if (leftArr[i] <= rightArr[j]) {
//                 arr[k++] = leftArr[i++];
//             } else {
//                 arr[k++] = rightArr[j++];
//                 inversions += (n1 - i); // Count inversions
//             }
//         }

//         while (i < n1)
//             arr[k++] = leftArr[i++];
//         while (j < n2)
//             arr[k++] = rightArr[j++];

//         return inversions;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         long[] arr = new long[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextLong();
//         }

//         System.out.println(mergeSortAndCount(arr, 0, n - 1));
//     }
// }