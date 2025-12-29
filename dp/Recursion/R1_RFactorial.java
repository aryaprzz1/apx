package apx.dp.Recursion;
import java.util.Scanner;
public class R1_RFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
        sc.close();
    }

    public static int factorial(int n){

        if( n == 1 ){return 1;}

        int recurrence = factorial(n-1);

        return recurrence * n ;

    }

}
