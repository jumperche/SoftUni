package Algorithms;

import java.util.*;

public class Greedy {
    public static int StartTime;
    public static int EndTime;
    public static void main ( String[] args ) {
        int [] startTime={1,3,0,5,3,5,6,8,8,2,12};
        int [] endTime={4,5,6,7,8,9,10,11,12,13,14};
        List<Integer> activity=new ArrayList<> (  );
        for ( int i = 0 ; i < startTime.length ; i++ ) {
activity.addAll ( Arrays.asList ( startTime[i],endTime[i] ) );

        }


    }

}
