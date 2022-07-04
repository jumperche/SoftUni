package softUni;

import java.util.Scanner;

public class HistogramSternCharReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int i = 10;
        while (number > 0){
            int x = number % i;
            System.out.printf("%d%s\n", x, "*".repeat(x));
            number /= i;
        }
    }
}
