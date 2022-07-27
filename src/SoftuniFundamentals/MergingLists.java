package SoftuniFundamentals;

import java.text.*;
import java.util.*;
import java.util.stream.*;

//You are going to receive two lists with numbers. Create a result list that contains the numbers from both of the lists.
// The first element should be from the first list, the second from the second list, and so on. If the length of the two lists is not equal, just add the remaining elements at the end of the list.
public class MergingLists {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List<Integer>list=Arrays.stream(scanner.nextLine ().split ( " " )).map ( value->Integer.parseInt (value  ) )
                .collect( Collectors.toList());
        List<Integer>list1=Arrays.stream(scanner.nextLine ().split ( " " )).map ( value->Integer.parseInt (value  ) )
                .collect( Collectors.toList());
        List<Integer>result=new ArrayList<> ();
        int x=Math.min ( list.size (),list1.size () );
        result.addAll ( list);
        int count=0;
        for ( int i = 0 ; i <= x*2 ; i++ ) {



                if ( i % 2 == 1 ) {

                    result.add (i, list1.get ( count ) );
count++;
                }

        }
if (list1.size ()>x){
    for ( int i = count ; i <list1.size ()  ; i++ ) {
        result.add ( list1.get ( i ) );
    }
}
        printList ( result );
    }
    public static void printList(List<Integer> list){
        String output="";
        for ( Integer item:list
        ) {

            output=output+item+" ";

        }
        System.out.print (output );
    }
}
