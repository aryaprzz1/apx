package apx.sorting;

import java.util.Scanner;

public class L2_SelectionSort {
    public static void main ( String [] args){
        Scanner sc =  new Scanner(System.in);

		int n = sc.nextInt();
		int [] arr= new int[n];
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
		}

        selectionSort(arr);
        
		for(int result : arr){
			System.out.print(result+" ");
		}
        sc.close();
    }

     public static void selectionSort(int arr[]){
            int n =  arr.length ; 

            for(int i = 0 ; i <n -1; i++){
                int minelement = arr[i] ;
                int minInd = i ;

                for(int j = i+1 ; j< n ; j++){
                    if(arr[j] < minelement){
                        minelement = arr[j] ;
                        minInd = j ;
                    }
                }
                int t = arr[i] ;
                arr[i] = arr[minInd] ;
                arr[minInd]= t ;
            }
     }
}
