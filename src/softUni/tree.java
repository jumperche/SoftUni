package softUni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tree {
    public static void main ( String[] args ) {

        List<Double> grade=new ArrayList<Double> ();
        grade.add ( 3.0 );
        grade.add ( 4.00 );
        grade.add ( 5.5 );
        grade.add ( 6.0 );
        grade.add ( 3.5 );
int number=grade.size ();
double sum=0;
        for ( int i = 0; i < number; i++ ) {
sum+= grade.get ( i);
        }
        System.out.printf ("average : %.2f %n",
                sum/number );
        Collections.sort ( grade );

        System.out.println ("smallest : "+ grade.get ( 0 ) );
        System.out.println ("largest :" +grade.get ( grade.size ( )-1 ) );
        System.out.print ("excellent : " );
        for ( int i = 0; i < number; i++ ) {
            if (grade.get ( i )>=5.5&&grade.get ( i )<=6.0){
                System.out.print (grade.get ( i )+" " );
            }
        }
    }

}
