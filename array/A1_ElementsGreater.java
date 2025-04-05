package apx.array;

import java.util.Scanner;

public class A1_ElementsGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int c =  countgreater(arr);
        System.out.println(c);
        sc.close();

    }
    public static int countgreater( int arr[]){
        int c = 0 ;
        int m = arr[0];
        for(int i =0 ; i < arr.length; i++){
            if(arr[i]> m){
                m =arr[i];
                c = 1 ;
            }else if(arr[i] == m){ c++;}
        }
        // for(int i = 1 ;  i< arr.length ; i++){
        //     if (arr[i]> m){
        //         m =arr[i];
        //     }
        // }
        // for(int i = 0 ; i< arr.length ; i++){
        //     if(arr[i] == m){
        //         c++;
        //     }
        // }
        return arr.length  - c;

    }
}

// Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.

// Input Format:
// Each of the test cases have 2 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.

// Output Format:
// Print a single Integer representing total no. of elements in the array having atleast 1 element greater than itself.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// 7
// -4 -3 7 9 3 9 4

// 5