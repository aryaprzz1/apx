package apx.searching;


import java.util.Scanner;

public class S1_SearchSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       int ans  = binarySearchSingle(arr);
       System.out.println(ans);
        sc.close() ;

        
    }

    public static  int binarySearchSingle(int arr[]  ){
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.length -1 ] != arr[arr.length -2]) return arr[arr.length -1];

        int l = 2 ;
        int h = arr.length -3 ;
        

        while (l <= h) {
            int m =  l + (h - l)/2;

            if(arr[m] !=  arr[m+1] && arr[m] != arr[m-1]){
                return m ;
            }
            if(arr[m] == arr[m-1]){
                m--;
            }
            if(m % 2 ==0 ){
                l = m +2 ;
            }else{
                h = m -1 ;
            }

        }
        return -1 ;

    }

}
// You are given an array consisting of n integers where every element appears exactly twice, except for one element which appears exactly once. Duplicate Numbers are adjacent to each other.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

// Input Format:
// First line contains integer n representing the length of array
// Second line contains n integers

// Output Format:
// Return the number appearing only once.