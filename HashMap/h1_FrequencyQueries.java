package apx.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class h1_FrequencyQueries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int m = sc.nextInt() ;

        int arr[] = new int[n];
        for(int i = 0  ; i< n ; i++){
            arr[i ] = sc.nextInt() ;
        }

        int q [] = new int[m];
        for(int i = 0 ; i < m ; i++){
            q[i] = sc.nextInt();

        }

        int newAns []= freq(arr, q);

        for (int i = 0; i < newAns.length; i++) {
            System.out.println(newAns[i]);
        }

        sc.close();

    }

    public static int[] freq(int a[] , int q[]){

        int ans []= new int [q.length];
        
        HashMap<Integer,Integer> h1 = new HashMap<>() ;
        
        for(int i = 0 ; i < a.length ; i++){
            if(!h1.containsKey(a[i])){
                h1.put(a[i],1) ;
            }else{
                int t  = h1.get(a[i]);
                h1.put(a[i], t +1);
            }
        }

        for(int  i  = 0 ; i < q.length; i++){
            if(!h1.containsKey(q[i])){
                // System.out.println(0);
                ans[i] = 0;
            }else{
                // System.out.println(h1.get(q[i]));
                ans[i] = h1.get(q[i]);
            }
        }

        return ans ;

    }
    
}
// Given N array elements and Q queries. For every query find frequency of element in array.

// Input Format:
// First line contains 2 integers N, M denoting size of the array and the number of queries.
// Second line contains the elements of the array.
// Third line contains M elements representin queries.

// Output Format:
// Output M integers in different lines denoting the frequency of each query.

