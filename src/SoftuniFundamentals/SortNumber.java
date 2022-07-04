package SoftuniFundamentals;

import java.util.*;

public class SortNumber {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner ( System.in );
        List<Integer>list=new ArrayList<> (  );
        list.add ( scanner.nextInt ( ) );
        list.add ( scanner.nextInt ( ) );
        list.add ( scanner.nextInt ( ) );
        Collections.sort ( list );
        for ( int i = list.size ( )-1;  i>=0  ; i-- ) {
            System.out.println (list.get ( i ) );
        }
    }
}
