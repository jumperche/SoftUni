package SoftuniFundamentals;

import java.util.*;
import java.util.stream.Collectors;
//You know the Judge system, right?! Your job is to create a program similar to the Judge system.
//You will receive several input lines in the following format:
//"{username} -> {contest} -> {points}"
//The constestName and username are strings. The given points will be an integer number. You need to keep track of every contest and individual statistics of every user. You should check if such a contest already exists, and if not, add it, otherwise, check if the current user is participating in the contest. If he is participating, take the higher score, otherwise, just add it.
//Also, you need to keep individual statistics for each user - the total points of all contests.
//You should end your program when you receive the command "no more time". At that point, you should print each contest in order of input. For each contest, print the participants ordered by points in descending order and then by name in ascending order. After that, you should print individual statistics for every participant ordered by total points in descending order and then by alphabetical order.
//Input / Constraints
//•	The input comes in the form of commands in the format specified above.
//•	Username and contest name always will be one word.
//•	Points will be an integer in the range [0, 1000].
//•	There will be no invalid input lines.
//•	If all sorting criteria fail, the order should be by order of input.
//•	The input ends when you receive the command "no more time".

//Peter -> Algo -> 400
//George -> Algo -> 300
//George -> Algo -> 900
//Sam -> Algo -> 200
//Peter -> DS -> 150
//Maria -> DS -> 600
//no more time
public class Judge {
    public static List< Student > list = new ArrayList<> ( );
    public static List< String > listContest = new ArrayList<> ( );
   public static Map< String, Integer > rank = new TreeMap< String, Integer > ( );

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( " -> " );

        while ( !input[ 0 ].equals ( "no more time" ) ) {
            int indexName = -1;
            listContest.add ( input[ 1 ] );
            String name = input[ 0 ];
            String contest = input[ 1 ];
            int point = Integer.parseInt ( input[ 2 ] );
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                if ( list.get ( i ).getName ( ).equals ( name ) ) {
                    indexName = i;
                    break;
                }
            }
            if ( indexName < 0 ) {

                Student student = new Student ( name , contest , point , point );
                list.add ( student );
            } else {
                String con = list.get ( indexName ).getContest ( );
                if ( list.get ( indexName ).getPoint ( ) < point & con.equals ( contest ) ) {
                    Student student = new Student ( name , contest , point , list.get ( indexName ).getSum ( ) + ( point - list.get ( indexName ).getPoint ( ) ) );
                    list.set ( indexName , student );
                } else {
                    Student student = new Student ( name , contest , point , list.get ( indexName ).getSum ( ) + point );
                    list.add ( student );
                }
            }

            input = scanner.nextLine ( ).split ( " -> " );
        }
        listContest = listContest.stream ( ).distinct ( ).collect ( Collectors.toList ( ) );


        for ( int i = 0 ; i < listContest.size ( ) ; i++ ) {

            printContest ( listContest.get ( i ),1 );
        }
        System.out.printf ( "Individual standings:%n" );

        for ( int i = 0 ; i < list.size ( ) ; i++ ) {

            rank.put ( list.get ( i ).getName ( ) , list.get ( i ).getSum ( ) );
        }
        rank = rank.entrySet ( ).stream ( ).sorted ( Map.Entry.comparingByValue ( Comparator.reverseOrder ( ) ) )
                .collect ( Collectors.toMap ( Map.Entry::getKey , Map.Entry::getValue , ( e1 , e2 ) -> e1 , LinkedHashMap::new ) );
        int index = 1;
       // rank=rank.entrySet ().stream( ).sorted (Map.Entry.comparingByKey (Comparator.naturalOrder ())).collect ( Collectors.toMap(Map.Entry ::getKey,Map.Entry ::getValue,(a1,a2)->a1,LinkedHashMap ::new) );
        for ( Map.Entry< String, Integer > entry : rank.entrySet ( ) ) {

            System.out.printf ( "%d. %s -> %d%n" , index , entry.getKey ( ) , entry.getValue ( ) );
            index++;
        }


    }

    public static void printContest ( String contest,int index ) {

        int count = 0;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ( list.get ( i ).contest.equals ( contest ) ) {
                count++;
            }

        }
        System.out.printf ( "%s: %d participants%n" , contest , count );

list.sort((Comparator.comparingInt ( Student ::getPoint ).reversed ()) );
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {

            if ( list.get ( i ).contest.equals ( contest ) ) {
                System.out.printf ( "%d. %s <::> %d%n" , index , list.get ( i ).getName ( ) , list.get ( i ).getPoint ( ) );
                index++;
            }

        }
        index=0;

    }

    static class Student {

        String name;
        String contest;
        int point;
        int sum;

        public String getContest () {
            return contest;
        }

        public void setContest ( String contest ) {
            this.contest = contest;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public int getPoint () {
            return point;
        }

        public void setPoint ( int point ) {
            this.point = point;
        }

        public int getSum () {
            return sum;
        }

        public void setSum ( int sum ) {
            this.sum = sum;
        }

        public Student ( String name , String contest , int point , int sum ) {
            this.name = name;
            this.contest = contest;

            this.point = point;
            this.sum = sum;
        }


    }
}
