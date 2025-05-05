package apx.Recursion;

import java.util.Scanner;

public class R1_Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        char ch[] = S.toCharArray();
        int chl = ch.length -1 ;

        System.out.println(palindrome(ch, 0, chl));

        sc.close();
    }
    public static boolean palindrome(char ch[] ,int s , int e){
        if(s == e) return true;
        if(s > e) return true;

        if(ch[s] == ch[e]){
            boolean recursive = palindrome(ch, s+1 ,e-1);
            return recursive;
        }else{
            return false;
        }
      
    }

    
}
// Take as input String.

// Write a Function to Check whether it is palindrome or not. if yes print true
// otherwise false. Palindrome means string and it's reversed form are same

// please Note: Lower and Upper case letter treated as equal. You have to use recursion to solve the problem.

// Input Format:
// String representing S.

// Output Format:
// print true if the string is palindrome else print false.

// Example:
// Input:
// aBcba
// output
// true

// Constraints:
// Size of String may be large.
