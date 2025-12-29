package apx.dp.Recursion;
import java.util.Scanner;
public class R1_RecursionSum {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();

        System.out.println(RecNaturalSum(n));
        input.close();
    }

    public static int RecNaturalSum(int n){
        if(n == 1){
            return 1 ;
        }
         
      int recurrence = RecNaturalSum(n-1);

      return recurrence + n ;
    }
}
// Take as input n

// Print sum of n natural numbers using recursion

// Input Format:
// Integer representing n

// Output Format:
// Integer representing sum of N Natural numbers

// Constraints:
// 1 <= n <= 10 ^ 9
