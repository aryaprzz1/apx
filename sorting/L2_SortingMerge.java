package apx.sorting;

import java.util.Scanner;

public class L2_SortingMerge {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in);){

        int n = sc.nextInt();
        int arr[] = new int [n] ;

        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,arr.length -1) ;

		for(int i : arr){
			System.out.print(i + " ");
		}
        System.out.println();
        sc.close();
    }catch(Exception e){
        System.out.println(e);
    }
    }

    public static void mergeSort(int a  [] , int s , int e){

        if( s >=e) {return ;}

        int m =  s+ (e-s) /2 ;

        mergeSort(a, s,m);
        mergeSort(a,m+1,e) ;

        merge(a, s, m, e);
    }

    public static void merge(int [] a , int s,int m, int e ) {

        int t [] = new int[e -s +1];

        int p1 = s ; int p2 = m+1 ; int p3 = 0;


        while(p1 <= m && p2 <= e){
            if(a[p1] > a[p2]){
                t[p3++] = a[p2++] ;
            }else{
                t[p3++] = a[p1++] ;
            }
        }

        while( p1<= m){
            t[p3++] =a[p1++];
        }
        while (p2 <= e) {
            t[p3++] = a[p2++];
        }

        for(int i = 0 ; i< t.length ; i++){
            a[s+i] = t[i] ;
        }
    }
}






// LU: Sorting_Merge Sort
// Success rate: 7.46%
// Given an array arr[], sort the array using the merge sort algorithm. Merge sort is a divide-and-conquer algorithm that recursively splits the array into two halves, sorts each half, and then merges the sorted halves back together.

// Input Format:
// The first line contains an integer n, the size of the array.
// The second line contains n space-separated integers representing the elements of the array.

// Output Format:
// Output the sorted array as a single line of space-separated integers.

// Constraints:
// 1 <= N <= 10^5
// 1 <= arr[i] <= 10^5