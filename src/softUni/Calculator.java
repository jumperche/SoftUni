package softUni;
import java.lang.Math;
import java.util.Scanner;
public class Calculator {
    static int error;
    static int ex=5;

    public static void main(String[] args) {
           int area = 100;
           int x = 0;

        for (int i = 1; i <= ex; i++) {
            x = (int) (Math.random() * 3);

            switch (x) {
                case 0:
                    Scanner scanner = new Scanner(System.in);
                    int a = (int) (Math.random() * area);
                    int b = (int) (Math.random() * area);
                    int sum = a + b;


                    while (sum >= area) {
                        a = (int) Math.random() * area;
                        b = (int) Math.random() * area;
                        sum = a + b;
                    }
                    System.out.println(a + "+" + b);
                    int input = scanner.nextInt();
                    if (sum != input) {
                        error++;
                        System.out.println("False");
                    } else {
                        System.out.println("True");
                    }
                    break;
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    int a1 = (int) (Math.random() * area);
                    int b1 = (int) (Math.random() * area);
                    int sum1 = a1 - b1;


                    while (b1 > a1) {
                        a1 = (int) (Math.random() * area);
                        b1 = (int) (Math.random() * area);
                        sum1 = a1 - b1;
                    }
                    System.out.println(a1 + "-" + b1);
                    int input1 = scanner1.nextInt();
                    if (input1 != sum1) {
                        System.out.println("False");
                        error++;
                    } else {
                        System.out.println("True");
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    int a2 = (int) (Math.random() * area);
                    int b2 = (int) (Math.random() * area);
                    int sum2 = a2 * b2;


                    while (sum2 > area) {
                        a2 = (int) (Math.random() * area);
                        b2 = (int) (Math.random() * area);
                        sum2 = a2 * b2;
                    }
                    System.out.println(a2 + "*" + b2);
                    int input2 = scanner2.nextInt();
                    if (input2 != sum2) {
                        System.out.println("False");
                        error++;
                    } else {
                        System.out.println("True");
                    }
                    break;
                default:
                    Scanner scanner3 = new Scanner(System.in);
                    int a3 = (int) (Math.random() * area);
                    int b3 = (int) (Math.random() * area) + 1;
                    int sum3 = a3 / b3;


                    while (a3 % b3 != 0) {
                        a3 = (int) (Math.random() * area);
                        b3= (int) (Math.random() * area) + 1;
                        sum = a3 / b3;
                    }
                    System.out.println(a3 + "/" + b3);
                    int input3 = scanner3.nextInt();
                    if (input3 != sum3) {
                        System.out.println("False");
                        error++;
                    } else {
                        System.out.println("True");
                    }
                    break;
            }
        }
        System.out.println("Error: " + error);
    }

}

