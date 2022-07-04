package softUni;

import java.util.Scanner;
/* find Fibonnaci numbers recursive
 * @autor Rosalina Gramatikov
 * @ver 1.0
 * @26.6.2022
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = Integer.parseInt ( input.nextLine ( ) );
        long result = fib(n);
        System.out.println(result);

    }
    public static long fib(int n) {
        if (n<2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}


