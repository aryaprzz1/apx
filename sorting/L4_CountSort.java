package apx.sorting;

import java.util.Scanner;

public class L4_CountSort {
    
    public static void countSort(int arr[]){
        int  n  = arr.length ;

        int max = Integer.MIN_VALUE ;
            for(int i = 0 ; i< n ; i++){
                if(arr[i] > max){max = arr[i];}
            }

            int freq [] = new int [ max +1] ;
            for(int i = 0 ; i< n ; i++){
                freq[arr[i]]++ ;
            }

            int k = 0 ; 
            for(int i = 0 ; i< n ;i++){
                int c = freq[i] ;
                for(int j = 0 ; j< c ;j++){
                    arr[i] = i ;
                    k++ ;
                }
            }
            System.out.print(k);
    }
    public static String count(String str1){
        int f[] = new int[26] ;

        for(char c : str1.toCharArray()){
            f[c -'a']++ ;
        }

        StringBuilder sort = new StringBuilder() ;

        for(int i= 0 ; i< 26 ; i++){
            while(f[i] --> 0){
                sort.append((char)('a' + i));
            }
        }

        return sort.toString() ;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str1 = sc.next() ;

        System.out.println(count(str1));
        sc.close();
    }
}
// LU: Sorting_Count Sort
// Success rate: 32.26%
// Given a string arr consisting of lowercase English letters, arrange all its letters in lexicographical order using the Counting Sort algorithm.

// Input Format:
// A single line containing the string arr.

// Output Format:
// A single line containing the string with its characters arranged in lexicographical order.

// Constraints:
// 1 ≤ N ≤ 10^5