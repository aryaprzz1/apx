package apx.array;

import java.util.Scanner;

public class A1_RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

		rotateArrray(arr,k);

		for(int i = 0 ; i<n ; i++){
			System.out.print(arr[i] + " ");
		}
        sc.close();
        
    }

    public static int[] rotateArrray( int nums[],int k ){

        int n = nums.length;
		k = k% n ;
        reverse(0, n-1, nums);
        reverse(0, k-1 , nums);
        reverse(k, n-1, nums);
        return nums;
    }

    public static int[] reverse(int a , int b , int nums[]){
        
        while(a < b){
            int t = nums[a];
            nums[a] =nums[b];
            nums[b] = t ;
            a++ ;
            b-- ;
        }
        return nums;

    }
}