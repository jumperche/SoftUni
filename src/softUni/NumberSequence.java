package softUni;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int xa = Integer.parseInt(scanner.next());

            if(min>xa){
                min=xa;
            }
            if (max<xa){
                max=xa;
            }

        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
