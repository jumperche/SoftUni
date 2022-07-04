package softUni;

import java.util.Scanner;

public class Cinema1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
int capaz=Integer.parseInt ( scanner.nextLine ( ) );
String input= scanner.nextLine ( );
int count=0;
double sum=0;
while ( !"Movie time!".equals ( input ) ){
    int in=Integer.parseInt ( input );
    count=count+in;
    if (count>capaz){

        break;
    }
    sum=sum+in*5;
    if (in%3==0){
        sum=sum-5;
            }

    input= scanner.nextLine ( );
}
        if (count>capaz){
            System.out.println ( "The cinema is full.");

        }
        else {
            System.out.printf ("There are %d seats left in the cinema.%n", capaz-count);
        }
        System.out.printf ("Cinema income - %.0f lv.",sum );
    }
}
