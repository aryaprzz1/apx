package apx.array;

import java.util.Scanner;

public class A1_MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];


        for(int i = 0 ; i<n ;i++ ){
            arr[i] = sc.nextInt();
        }

       System.out.println(maxInt(arr)); 
        

    }
    public static int maxInt(int arr[]){
        int m = Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> m){
                m = arr[i];

            } 
        }
        return m ;
    }
}
