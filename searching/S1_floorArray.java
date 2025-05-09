package apx.searching;

import java.util.Scanner;

public class S1_floorArray {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sc.close() ;

        System.out.println(floor(arr, k));
    }
    public static int floor(int arr[], int k ){
        int l = 0 ;
        int h =  arr.length -1 ;
        int ans = Integer.MIN_VALUE ;

        while(l <= h){
            int m = l+( h - l)/2 ;
            if(arr[m] == k){
                return k ;
            }else if(arr [m]< k){
                if(arr[m] > ans){
                    ans = arr[m];
                    l = m+1 ;
                }
            }else if(arr[m] > k){
                h = m -1 ;
            }
        }
        return ans;

    }
}
