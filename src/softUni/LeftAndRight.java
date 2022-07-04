package softUni;

import java.util.Scanner;

public class LeftAndRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i <n; i++) {
            int x = Integer.parseInt(scanner.next());
            sumL = sumL + x;
        }
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(scanner.next());
            sumR = sumR + x;
        }
        if (sumL == sumR) {
            System.out.printf("Yes, sum = %d", sumL);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumL - sumR));
        }
    }
}
