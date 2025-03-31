package apx.array;

import java.util.Scanner;

public class A3_2dPrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for(int i = 0 ; i< n;i++){
            for(int j = 0 ; j< m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        zigZag(arr);
    }

    public static void zigZag(int arr[][]){
       
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+ " ");
                } 
            }else{
                for( int j = arr[0].length -1 ;  j>=0 ; j--){
                    System.out.println(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    } 
}
// Given a 2D array, Print integers in zig zag fashion.

// Note: Zig zag fashion means oth row from left to right, 1st row form right to left, 2nd row from left to right and so on

// Input Format:
// The first line contains two integers n and m representing row and column of 2D array.
// Each of next n rows contains m numbers of 2D array.

// Output Format:
// Print integers in zig zag fashion.

// Constraints:
// 2 <= n,m <= 1000
// 0 <= elements of array <= 10^4
// 2 3
// 1 2 3
// 4 5 6

// 1 2 3 
// 6 5 4 