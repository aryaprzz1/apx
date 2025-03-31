package apx.array;

import java.util.Scanner;

public class A3_2dPrintColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ar[][] = new int[n][m];

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                    ar[i][j] = sc.nextInt();
            }
        }
        printtC2d( ar);
            
        
    }
    
    public static void printtC2d( int ar[][]){
        
        for (int j = 0; j < ar[0].length; j++) {
            for ( int i = 0; i < ar.length; i++) {
                System.out.println(ar[i][j]+" ");
            }
                System.out.println();
        }
        

    }
    // public void printC2d(int n , int m , int ar[][]){
        
    //     for (int j = 0; j < m; j++) {
    //         for ( int i = 0; i < n; i++) {
    //             System.out.println(ar[i][j]+" ");
    //         }
    //             System.out.println();
    //     }
        

    // }
}
