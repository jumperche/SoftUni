package Uni;

import java.util.Scanner;

public class Factorial {
    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
// "long" is the biggest integer type
        long factorial = 1;
// Perform an “infinite loop"
        while (true) {
            if (n == 1) {
                break;
            }

            factorial *= n;
            n--;
        }
        System.out.println("n! = " + factorial);
    }
}
