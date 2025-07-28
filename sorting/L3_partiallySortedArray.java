package apx.sorting;

import java.util.Scanner;

public class L3_partiallySortedArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n] ;
		for( int i = 0 ; i< n ;i++){
			arr[i] = sc.nextInt() ;
		}

		insert(arr) ;
		
		for(int i= 0 ; i< n ;i++){
		System.out.print(arr[i] + " ");
		}
        sc.close();
		
	}

	public static void insert(int arr[]){

		int n = arr.length ;

		for(int i = n -2 ; i>=0 ; i--){
			if(arr[i] > arr[i+1]){
				int t = arr[i] ;
				arr[i] = arr[i+1] ;
				arr[i+1] = t;
			}else{
				// [i] < [i+1]
				break ;
			}
		}
	}
}
