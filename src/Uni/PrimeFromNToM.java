package Uni;

import java.util.Scanner;

public class PrimeFromNToM {
    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        System.out.print("n=");
        int n = input.nextInt();
        System.out.print("m=");
        int m = input.nextInt();
        for (int num = n; num <= m; num++) {
            boolean prime = true;
            int divider = 2;
            int maxDivider = (int) Math.sqrt(num);
            while (divider <= maxDivider) {
                if (num % divider == 0) {
                    prime = false;
                    break;
                }
                divider++;
            }
            if (prime) {
                System.out.printf("%d ", num);
            }
        }
    }
}
