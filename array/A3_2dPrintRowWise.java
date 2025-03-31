package apx.array;

import java.util.Scanner;

public class A3_2dPrintRowWise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =  sc.nextInt();
        int m = sc.nextInt() ;

        int arr[][] = new int[n][m];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }

        print2d(arr, n, m);

        sc.close();



        
    }
    public static void print2d(int arr[][],int n , int m){
            
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ;j<m ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }

}
