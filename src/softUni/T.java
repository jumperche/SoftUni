package softUni;

import java.util.Scanner;

public class T {
    public static void main ( String[] args ) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner ( System.in );
        System.out.println ("Input number:" );
      String number = scan.nextLine ( ) ;
int sum=0;int digit=0;
       //int number=Integer.parseInt ( number );
        for ( int i = 0; i < number.length (); i++ ) {

            digit = Character.getNumericValue ( number.charAt (i) );
             //digit=Integer.parseInt ( myChar );

           //digit=number%10;
          //number=number/10;
            sum = sum + digit;
            System.out.println (digit );
        }
        System.out.println ( "sum =" +sum);

    }
}
