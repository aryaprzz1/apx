package apx.searching;

import java.util.Arrays;
import java.util.Scanner;

public class S1_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sc.close() ;

        System.out.println(binarySearch(arr, k));
    }
    public static boolean binarySearch(int arr[] , int t){
        Arrays.sort(arr);
        int n  = arr.length ;
        int low = 0 ;
    
        int end = n -1;
        
        while(low <= end){
            int mid =  low + (end - low) /2 ;
            
            if(arr[mid] == t){
                return true;
            }else if(arr[mid] < t){
              
                low = mid + 1 ;

            }else if(arr[mid] > t){
                end = mid -1 ; 
            }
         }
        return false;
    }
}
