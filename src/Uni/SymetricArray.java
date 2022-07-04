package Uni;
import java.util.Scanner;
public class SymetricArray {
    public static void main ( String[] args ) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        boolean symmetric = true;
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            if (array[i] != array[n - i - 1])
                symmetric = false;
        }
        System.out.printf("Symmetric? %b%n", symmetric);
    }
}
