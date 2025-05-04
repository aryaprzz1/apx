package apx.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class h1_PairSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt() ;

        int arr[] = new int[n];

        int sum  = sc.nextInt() ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans  = opti(arr, sum);
        if(ans == true){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

        sc.close();

    }
    public static boolean opti(int arr[], int k){

        HashMap <Integer,Integer> hm = new HashMap<>();



        for (int i = 0; i < arr.length; i++) {
           if (!hm.containsKey(arr[i])) {
            hm.put(arr[i],1);
           }else{
            int t = hm.get(arr[i]);
            hm.put(arr[i], t+1);
           }
        }

        for (int i = 0; i <arr.length; i++) {
           
            int a  = arr[i];
            int b = k -a ;

            if (a != b && hm.containsKey(b)) {
                // System.out.println("Y");
                return true ;
                
            }else if( a == b && hm.get(b)>=2){
                // System.out.println("Y");
                return true;
            }
            //else{
            //     // System.out.println("N");
            //     return false;
            // }
            
        }

        return false;
    }
    
}
// Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

// Input Format:
// The first line contains size of array and required sum
// Second line contains the elements of the array.

// Output Format:
// Output Y for Yes or N for No