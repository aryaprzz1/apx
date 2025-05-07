package apx.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class S1_goodIntegerDuplicate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(goodInt(arr));
    }

    public static int goodInt(int arr[]){
        int count = 0 ;
        int prev = 0 ;
        Arrays.sort(arr);

        if(arr[0] == 0 ) {count++ ;}

        for(int i = 1; i < arr.length ; i++){
          if(arr[i] != arr[i-1]){
            prev = i;
          }
          if(arr[i] ==  prev){
            count++ ;
          }
        }
        return count;
    }
}
