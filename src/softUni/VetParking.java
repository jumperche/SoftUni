package softUni;

import java.util.Scanner;

public class VetParking {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner(System.in);
        int day=Integer.parseInt ( scanner.nextLine ( ) );
        int hours=Integer.parseInt ( scanner.nextLine ( ) );
        double price=0;
        double sum=0;
        double sumDay=0;
        int i=0;
        int j=0;
        for (  i = 1 ; i <= day ; i++ ) {
sumDay=0;
            for (  j = 1 ; j <= hours ; j++ ) {


                if ( i % 2 == 0 && j % 2 != 0 ) {
price=2.5;
sum=sum+price;
sumDay=sumDay+price;

                }
                else if (i%2!=0&&j%2==0){
                    price=1.25;
                    sum=sum+price;
                    sumDay=sumDay+price;

                }
                else {price=1; sum=sum+price;sumDay=sumDay+price;}
            }
            System.out.printf ( "Day: %d - %.2f leva %n",i,sumDay );
        }
        System.out.printf ( "Total: %.2f leva %n",sum );
    }
}
