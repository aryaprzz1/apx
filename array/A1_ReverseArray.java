package apx.array;

import java.util.Scanner;

public class A1_ReverseArray {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n =  sc.nextInt();
    int arr[] =  new int[n];

    for(int i = 0 ; i< n ; i++){
        arr[i] = sc.nextInt() ;
    }

    int []krev = ReverseArray(arr);
    
    for (int i = 0; i < krev.length; i++) {
        System.out.print(krev[i] + "");
    }
    sc.close();
  } 

  public static int[] ReverseArray(int arr[]){

    int s  = 0 ; 
    int e  = arr.length -1 ;
    while(s < e){
        int temp =  arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
    }
    return arr ;
    // int p = 0;
    // for (int i = arr.length -1 ; i >= 0; i--) {
    //     rev[p++] = arr[i];   
    // }

    // return rev;
    

  }
}
// Given n length Array, You have to Reverse the entire array and print it.

// Input Format:
// Each of the test cases have 2 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.

// Output Format:
// Print all the array element in a line separated by space after reversing it

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// 5
// 10 20 30 40 50

// 50 40 30 20 10 