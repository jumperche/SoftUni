package softUni;

import java.util.Scanner;

public class UniquePinCode {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int number1 = Integer.parseInt ( scanner.nextLine ( ) );
        int number2 = Integer.parseInt ( scanner.nextLine ( ) );
        int number3 = Integer.parseInt ( scanner.nextLine ( ) );
        boolean code = false;
int x=number2/2;
        for ( int first = 1 ; first <= number1 ; first++ ) {
            for ( int second = 2 ; second <= number2 ; second++ ) {
                for ( int third = 1 ; third <= number3 ; third++ ) {
                    if(second== 2 || second== 3 || second ==5 || second == 7) {

                            code=true;}
                    else {continue;}


                         if (first % 2 == 0 && third % 2 == 0&&code )


                        { System.out.printf ( "%d %d %d%n" , first , second , third );}
                    }
                }
            }


        }
    }



