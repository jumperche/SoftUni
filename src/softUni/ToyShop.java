package softUni;

import java.util.Scanner;

public class ToyShop {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double ex = Double.parseDouble ( scanner.nextLine () );
        int pieceP = Integer.parseInt ( scanner.nextLine () );
        int pieceD = Integer.parseInt ( scanner.nextLine () );
        int pieceB = Integer.parseInt ( scanner.nextLine () );
        int pieceM = Integer.parseInt ( scanner.nextLine () );
        int pieceT = Integer.parseInt ( scanner.nextLine () );
        int sumP=pieceP+pieceM+pieceD+pieceP+pieceT;
        double coupon=0.25;
        double sum=pieceP*2.6+pieceD*3+pieceB*4.1+pieceM*8.2+pieceT*2;

        if (sumP>50){
            sum=sum-(sum*coupon);
        }
        double tax=sum-(sum*0.1);
        if (tax>=ex){
            System.out.printf ( "Yes! %.2f lv left.",Math.abs(tax-ex) );
        }
        else {
            System.out.printf ( "Not enough money! %.2f lv needed.", Math.abs(tax-ex) );
        }
    }
}
