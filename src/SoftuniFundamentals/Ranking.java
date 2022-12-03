package SoftuniFundamentals;
//Here comes the final and the most interesting part - the Final ranking of the candidate interns. The final ranking is determined by the points of the interview tasks and from the exams in SoftUni. Here is your final task. You will receive some lines of input in the format "{contest}:{password for contest}" until you receive "end of contests". Save that data because you will need it later. After that, you will receive another type of input in the format "{contest}=>{password}=>{username}=>{points}" until you receive "end of submissions". Here is what you need to do:
//•	Check if the contest is valid (if you received it in the first type of input);
//•	Check if the password is correct for the given contest;
//•	Save the user with the contest they take part in (a user can take part in many contests) and the points the user has in the given contest. If you receive the same contest and the same user, update the points only if the new ones are more than the older ones.
//In the end, you have to print the info for the user with the most points in the format "Best candidate is {user} with total {total points} points.". After that, print all students ordered by their names. For each user, print each contest with the points in descending order. See the examples.
//Input
//•	Strings in format "{contest}:{password for contest}" until the "end of contests" command. There will be no case with two equal contests.
//•	Strings in format "{contest}=>{password}=>{username}=>{points}" until the "end of submissions" command.
//•	There will be no case with 2 or more users with the same total points!

//Part One Interview:success
//Js Fundamentals:Pesho
//C# Fundamentals:fundPass
//Algorithms:fun
//end of contests
//C# Fundamentals=>fundPass=>Tanya=>350
//Algorithms=>fun=>Tanya=>380
//Algorithms=>fun=>Tanya=>500
//Part One Interview=>success=>Nikola=>120
//Java Basics Exam=>pesho=>Petkan=>400
//Part One Interview=>success=>Tanya=>220
//OOP Advanced=>password123=>BaiIvan=>231
//C# Fundamentals=>fundPass=>Tanya=>250
//C# Fundamentals=>fundPass=>Nikola=>200
//Js Fundamentals=>Pesho=>Tanya=>400
//end of submissions
import java.util.*;

public class Ranking {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( ":" );
        Map< String, String > contestPass = new LinkedHashMap< String, String > ( );
        Map< String, List< Student > > user = new LinkedHashMap< String, List< Student > > ( );
        Map< String, Integer > rank = new TreeMap<> ( );
        while ( !input[ 0 ].equals ( "end of contests" ) ) {
            contestPass.put ( input[ 0 ] , input[ 1 ] );
            input = scanner.nextLine ( ).split ( ":" );
        }
        input = scanner.nextLine ( ).split ( "=>" );
        while ( !input[ 0 ].equals ( "end of submissions" ) ) {
            if ( !contestPass.containsKey ( input[ 0 ] ) ) {
                input = scanner.nextLine ( ).split ( "=>" );
                continue;
            }
            if ( contestPass.containsKey ( input[ 0 ] ) & contestPass.get ( input[ 0 ] ).equals ( input[ 1 ] ) ) {
                if ( !user.containsKey ( input[ 2 ] ) ) {
                    Student current = new Student ( input[ 2 ] , input[ 0 ] , Integer.parseInt ( input[ 3 ] ) );
                    user.putIfAbsent ( input[ 2 ] , new ArrayList<> ( ) );
                    user.get ( input[ 2 ] ).add ( current );

                    rank.put ( input[ 2 ] ,  Integer.parseInt ( input[ 3 ] ) );
                } else {
                    List< Student > list = user.get ( input[ 2 ] );
                    boolean exist = false;
                    for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                        if ( list.get ( i ).contest.equals ( input[ 0 ] ) ) {
                            //int index=list.indexOf(input[0])+1;
                            int newPoint = Integer.parseInt ( input[ 3 ] );
                            int point = list.get ( i ).point;

                            int max = Math.max ( point , newPoint );
                            Student student = new Student ( list.get ( i ).name , list.get ( i ).contest , max );
                            list.set ( i , student );
                            if ( point < newPoint ) {
                                rank.put ( list.get ( i ).name , list.get ( i ).point + ( newPoint - point ) );
                            }
                            exist = true;
                            break;
                        }
                    }
                    if ( !exist ) {
                        Student current = new Student ( input[ 2 ] , input[ 0 ] , Integer.parseInt ( input[ 3 ] ) );

                        user.get ( input[ 2 ] ).add ( current );
                        rank.put ( input[ 2 ] , rank.get ( input[2] ) + Integer.parseInt ( input[ 3 ] ) );
                    }


                }
            }
            input = scanner.nextLine ( ).split ( "=>" );
        }
        rank.entrySet ( ).stream ( ).sorted ( (e1,e2)->Integer.compare ( e2.getValue (), e1.getValue ( ) ) ).limit ( 1 )
                .forEach ( a -> System.out.printf ( "Best candidate is %s with total %d points.%nRanking:%n" , a.getKey ( ) , a.getValue ( ) ) );
        user.entrySet ( ).stream ( ).sorted ( ( user1 , user2 ) -> user1.getKey ( ).compareTo ( user2.getKey ( ) ) )
                .forEach ( u -> {
                    System.out.println ( u.getKey ( ) );
                    u.getValue ( ).stream ( ).sorted ( ( k1 , k2 ) -> Integer.compare ( k2.point , k1.point ) )
                            .forEach ( kurs -> System.out.printf ( "#  %s -> %d%n" , kurs.contest , kurs.point ) );
                } );
    }

    public static class Student {
        String name;
        String contest;
        int point;

        public Student ( String name , String contest , int point ) {
            this.name = name;
            this.contest = contest;
            this.point = point;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public String getContest () {
            return contest;
        }

        public void setContest ( String contest ) {
            this.contest = contest;
        }

        public int getPoint () {
            return point;
        }

        public void setPoint ( int point ) {
            this.point = point;
        }
    }
}
