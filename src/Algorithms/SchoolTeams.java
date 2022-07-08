package Algorithms;

import java.util.*;

public class SchoolTeams {
    public static String[]girls;
    public static String[]girlsComb=new String[3];
    public static String[]boys;
    public static String[]boysComb=new String[2];
    public static List<String>allGirls=new ArrayList<> (  );
    public static List<String>allBoys=new ArrayList<> (  );
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
      girls = scanner.nextLine ( ).split ( ", " );
      boys = scanner.nextLine ( ).split ( ", " );
combineGirls (0,0);
combineBoys ( 0,0 );
        for ( String allGirls:allGirls
               ) {
            for ( String allBoys:allBoys
                   ) {
                System.out.println (allGirls+", "+allBoys );
            }

        }
    }

    private static void combineGirls ( int index , int start ) {
if(index== girlsComb.length){
    allGirls.add( String.join ( ", ",girlsComb ));
}
else {
    for ( int i = start ; i < girls.length ; i++ ) {
girlsComb[index]=girls[i  ];
combineGirls ( index+1,i+1 );

    }
}

    }
    private static void combineBoys ( int index , int start ) {
        if(index== boysComb.length){
            allBoys.add( String.join ( ", ",boysComb ));
        }
        else {
            for ( int i = start ; i < boys.length ; i++ ) {
                boysComb[index]=boys[i  ];
                combineBoys ( index+1,i+1 );

            }
        }

    }
}
