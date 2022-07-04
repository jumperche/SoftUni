package softUni;

import java.util.Scanner;

public class SumPrimeNotPrime {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String a=scanner.nextLine ( );
        int sumPrime=0;
        int sumN=0;

        while ( !"stop".equals ( a ) ){
            int input= Integer.parseInt ( a );
          if (input<0){
              System.out.println ("Number is negative." );
              a= scanner.nextLine ( );
              continue;
          }
            boolean flagPrime=true;
            for ( int i = 2 ; i < input-1 ; i++ ) {
                if (input%i==0){
                    sumN=sumN+input;
                    flagPrime=false;
                }

                }
            if (flagPrime){
                sumPrime=sumPrime+input;
            }



            a= scanner.nextLine ( );
        }
        System.out.println ("Sum of all prime numbers is: "+sumPrime );
        System.out.println ("Sum of all non prime numbers is: "+sumN );


    }
}
