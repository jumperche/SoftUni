package softUni;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );

        int length = 0;
        int count=0;
        int max=0;
        String favorite="";
        while ( !"STOP".equals ( name ) ) {
            int sum = 0;
            length = name.length ( );
            for ( int i = 0 ; i < length ; i++ ) {
                int x = name.charAt ( i );
                if ( x >= 65 && x <= 90 ) {
                    sum = sum + ( x - length );
                } else if (x>=97&&x<=122){
                    sum = sum + ( x - ( 2 * length ) );
                }
                else {
                    sum=sum+x;
                }

            }
            count++;
            if (count>=7){
                System.out.println ("The limit is reached." );
                break;
            }
            if (max<sum){
                max=sum;
                favorite=name;
            }
            name= scanner.nextLine ( );
        }
        System.out.printf ("The best movie for you is %s with %d ASCII sum.",favorite,max );
    }
}
