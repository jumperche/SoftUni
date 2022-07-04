package softUni;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
//double x=xa.nextDouble();

        if (!(x > 0)) {
            System.out.println("Negative number!");}
        else
            do {

                x = x * 2;
                System.out.printf("Result: %.2f%n",x);
                double  xa = Double.parseDouble(scanner.next());
                x=xa;
            }
                while (x>=0) ;

        if (!(x >= 0)) {
            System.out.println("Negative number!");}

            }
        }


