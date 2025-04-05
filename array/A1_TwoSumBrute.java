package apx.array;

import java.util.Arrays;
import java.util.Scanner;

public class A1_TwoSumBrute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        boolean ans = twoSum(arr, k);
        System.out.println(ans);
        sc.close();
    }

    public static boolean twoSum(int arr[],int k){
        int i = 0 ;
        int j = arr.length -1;

        Arrays.sort(arr);
        while (i< j) {
            if(arr[i] + arr[j] >k){
                j--;
            }else if (arr[i]+ arr[j]<k) {
                i++ ;
            }else if (arr[i] + arr[j] == k && i !=j){
                return true ;
            }
        }
        return false;
    }
}