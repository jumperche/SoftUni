package softUni;

import java.util.Scanner;

public class FamilyTrip {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        double budget=Double.parseDouble ( scan.nextLine ( ) );
        int br=Integer.parseInt ( scan.nextLine ( ) );
        double price=Double.parseDouble ( scan.nextLine ( ) );
        int pr=Integer.parseInt ( scan.nextLine ( ) );
        double sum=0;
double pr1=pr/100.00;
        double tax=(budget*pr1);
        if (br>7){
            price=price-(price*0.05);
            sum=br*price+tax;
                    }
        else{
            sum=br*price+tax;
        }

        if (sum<=budget){
            System.out.printf ( "Ivanovi will be left with %.2f leva after vacation.",budget-sum );

        }
        else {
            System.out.printf ( "%.2f leva needed.",Math.abs ( budget-sum ) );
        }

    }
}
