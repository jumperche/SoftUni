package softUni;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumO = 0;
        int sumE = 0;
        for (int i = 1; i <= n; i++) {
            int x = Integer.parseInt(scanner.next());
            if (i % 2 == 0) {
                sumE = sumE + x;

            } else {
                sumO = sumO + x;
            }
        }
        if (sumE == sumO) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumE);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumO - sumE));
        }
    }
}