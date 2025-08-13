package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class L4_sortingObjPair  implements Comparable <L4_sortingObjPair> {
    int x ;
    int y ;
    L4_sortingObjPair(int a , int b){
        x = a ;
        y = b ;
    }

    public int compareTo(L4_sortingObjPair o) {

        return this.x - o.x ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        L4_sortingObjPair arr[] = new L4_sortingObjPair[n] ;

        for(int i = 0 ; i< n;i++){
            int a1 = sc.nextInt() ;
            int a2 = sc.nextInt() ;

            arr[i] = new L4_sortingObjPair(a1, a2) ;
        }

        Arrays.sort(arr) ;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].x + " " + arr[i].y);
        }
        sc.close() ;
    }
   
}
