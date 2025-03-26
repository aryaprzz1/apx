package apx.array;


import java.util.Scanner;

public class A1_SwapIndices {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array [] = new int [n];

        for(int i = 0 ; i < n ; i++){
            array[i] = scanner.nextInt();
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();

       int swaped[]=  swapIndices(a, b, array);
        for (int i : swaped) {
            System.out.print(i+ " ");
        }

        scanner.close();

   
    }

    public static int[] swapIndices(int a , int b , int arr[]){
        int temp =  arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        return arr ;
    }
    
}


// Given n length Array and 2 indexes, You have to swap the elements of 2 indexes and print the array.

// Input Format:
// Each of the test cases have 3 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.
// The third line contains two index.

// Output Format:
// Print all the array element in a line separated by space after swapping

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4
// 0 <= indexs < array length

// 5
// 31 4 -7 1 -29
// 1 4

// 31 -29 -7 1 4 