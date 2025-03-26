package apx.array;

import java.util.Scanner;

public class A1_sumOfArray{

    public static int SumOfArray(int arr[]){
            int sum = 0 ;
            for( int nums : arr){
                sum += nums;
            }
            return sum ;
        }
    
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        int arr [] =  new int [ n];
    
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
    
        System.out.println(SumOfArray(arr));
        scanner.close();
    }

    
}

// Given n length Array, You have to return sum of all the elements.

// Input Format:
// Each of the test cases have 2 lines.
// First Line contains the size of the array n, while the second contains the n elements of the array.

// Output Format:
// Return an integer which is sum of all the array elements.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// 10
// 1 2 3 4 5 6 7 8 9 10
// 55