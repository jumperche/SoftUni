package Uni;

import java.util.Scanner;

public class Kontr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xP1, yP1, xP2, yP2;



        System.out.println("x1: ");
        xP1 = Double.parseDouble ( scanner.nextLine () );
        System.out.println("y1: ");
        yP1 = Double.parseDouble (scanner.nextLine ());
        System.out.println("x2: ");
        xP2=Double.parseDouble (scanner.nextLine ());
        System.out.println("y2: ");
        yP2=Double.parseDouble (scanner.nextLine ());
        double d=Math.sqrt(Math.pow((xP2 - xP1), 2) + Math.pow((yP2-yP1), 2));
        if (d==0) {
            System.out.println ( "no distance" );
        }
        else {
            System.out.println (d );
        }
    }
}
