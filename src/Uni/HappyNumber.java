package Uni;
//Целта е да намерим и
//отпечатаме всички четирицифрени числа от вида ABCD, за които: A+B =
//C+D (наричаме ги щастливи числа).
public class HappyNumber {
    public static void main ( String[] args ) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {

                        if ((a + b) == (c + d)) {
                            System.out.printf("%d%d%d%d%n", a, b, c, d);
                        }
                    }
                }
            }
        }

    }
}
