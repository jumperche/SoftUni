package SoftuniFundamentals;
//Judge statistics on the last Programing Fundamentals exam were not working correctly, so you have the task to take all the submissions and analyze them properly. You should collect all the submissions and print the final results and statistics about each language that the participants submitted their solutions in.
//You will be receiving lines in the following format: "{username}-{language}-{points}" until you receive "exam finished". You should store each username and their submissions and points.
//You can receive a command to ban a user for cheating in the following format: "{username}-banned". In that case, you should remove the user from the contest but preserve his submissions in the total count of submissions for each language.
//After receiving "exam finished", print each of the participants in the following format:
//"Results:
//{username} | {points}
//{username2} | {points}
//…
//{usernameN} | {points}"
//After that, print each language, used in the exam in the following format:
//"Submissions:
//{language1} - {submissions_count}
//{language2} - {submissions_count}
//…
//{language3} - {submissions_count}"

import java.util.*;

public class SoftUniExamResults {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        List< Student > list = new ArrayList<> ( );
        boolean ist = false;
        while ( !input.equals ( "exam finished" ) ) {
            String[] in = input.split ( "-" );
            if ( in[ 1 ].equals ( "banned" ) ) {
                for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                    if ( list.get ( i ).name.equals ( in[ 0 ] ) ) {
                        Student st = new Student ( list.get ( i ).name , list.get ( i ).language , 0 );
                        list.set ( i , st );
                    }
                }
                ist = true;
            } else {

                for ( int i = 0 ; i < list.size ( ) ; i++ ) {
int poin=list.get ( i ).getPoints ( );
int poi=Integer.parseInt ( in[ 2 ] );
                    if ( list.get ( i ).getName ( ).equals ( in[ 0 ] )==true && list.get ( i ).getLanguage ( ).equals ( in[ 1 ] ) == true ) {
                        if ( list.get ( i ).getPoints ( ) < Integer.parseInt ( in[ 2 ] ) ) {
                            Student st = new Student ( in[ 0 ] , in[ 1 ] , Integer.parseInt ( in[ 2 ] ) );
                            list.set ( i , st );

                        } else {
                            ist = true;
                            Student st = new Student ( in[ 0 ] , in[ 1 ] , 0 );
                            list.add ( st );
                            break;
                        }

                    }
                }


            }
            if ( ist == false ) {
                Student st = new Student ( in[ 0 ] , in[ 1 ] , Integer.parseInt ( in[ 2 ] ) );
                list.add ( st );
            }


            ist = false;
            input = scanner.nextLine ( );
        }
        System.out.println ( "Results:" );
        for (
                int i = 0 ; i < list.size ( ) ; i++ ) {

            if ( list.get ( i ).points != 0 ) {
                String a = String.valueOf ( list.get ( i ).getPoints ( ) );
                String helper = String.join ( " | " , list.get ( i ).getName ( ) , a );
                System.out.println ( helper );
            }
        }
        System.out.println ( "Submissions:" );
        Map< String, Integer > resultMap = new LinkedHashMap<> ( );
        for (
                int i = 0 ; i < list.size ( ) ; i++ ) {
            String help = list.get ( i ).language;

            if ( resultMap.containsKey ( help ) ) {

                resultMap.put ( help , resultMap.get ( help ) + 1 );
            } else {
                resultMap.put ( list.get ( i ).language , 1 );
            }

        }
        for (
                Map.Entry< String, Integer > entry : resultMap.entrySet ( ) ) {

            System.out.printf ( "%s - %d%n" , entry.getKey ( ) , entry.getValue ( ) );
        }
    }


    public static class Student {
        String name;
        String language;
        int points;

        public Student ( String name , String language , int points ) {
            this.name = name;
            this.language = language;
            this.points = points;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public String getLanguage () {
            return language;
        }

        public void setLanguage ( String language ) {
            this.language = language;
        }

        public int getPoints () {
            return points;
        }

        public void setPoints ( int points ) {
            this.points = points;
        }
    }
}

