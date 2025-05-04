package apx.bits;

import java.util.Scanner;

public class b1_IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		bitEven(n);
        sc.close();
    }

    public static void bitEven(int n){
        int ans =  n & 1 ;

        if( (n & 1) == 0){
            System.out.println("even");
    
        }else if(ans == 1){
            System.out.println("odd");
        }
        
    }
    
}
// Take as input a number n. Determine whether it is even or odd. If it is even,
// print "even" otherwise print "odd".

// Note: Using any mathematical operator is not allowed.

// Input Format:
// The only line contains an Integer N.

// Output Format:
// Print "even" if number is even else print "odd