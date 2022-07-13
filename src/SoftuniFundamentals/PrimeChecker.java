package SoftuniFundamentals;

import java.util.*;

public class PrimeChecker {
    public static void main ( String[] args ) {
        Scanner chetec = new Scanner(System.in);

        int number = Integer.parseInt(chetec.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isTrue = true;
            for (int cepitel = 2; cepitel < i; cepitel++) {
                if (i % cepitel == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isTrue);
        }

    }
}
