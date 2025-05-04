package apx.HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class h1_NonRepeating {
    public static void main ( String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = nonf(arr);
        System.out.println(ans);
        sc.close();

    }

    public static int nonf(int arr[]){
        HashMap <Integer,Integer> hm =  new HashMap<>();

        for(int i = 0 ; i< arr.length ; i++){
            if(hm.containsKey(arr[i]) == false){
                hm.put(arr[i] , 1);
            }else{
                int t  = hm.get(arr[i]);
                hm.put(arr[i], t +1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i]) == 1){
               return arr[i];
            }
        }

        return -1;
    }
    
}
// Find the first non-repeating element in a given array arr of N integers.

// Input Format:
// The first line contains size of array.
// Second line contains the elements of the array.

// Output Format:
// Output the required element