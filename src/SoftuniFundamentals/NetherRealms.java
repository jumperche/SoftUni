package SoftuniFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String []input = scanner.nextLine ( ).split ( ", " );
        int health=0;
        String regexHealth="[^\\d+\\+\\-*\\/\\.]";
                //"[a-zA-Z]*";
        Pattern patternHealth=Pattern.compile ( regexHealth );
        String regexDamage="-?\\d+\\.?\\d*";
                //"[0-9.+-]*";
        Pattern patternDamage=Pattern.compile ( regexDamage );
        double sum=0;

        for ( int i = 0 ; i < input.length ; i++ ) {
            Matcher matcherHealth=patternHealth.matcher ( input[i] );
            Matcher matcherDamage=patternDamage.matcher ( input[i]  );

            String regexMath="[\\/\\*]";
            Pattern patternMath=Pattern.compile ( regexMath );
            Matcher matcherMath=patternMath.matcher ( input[i] );
            String math="";
            String help="";
            while ( matcherHealth.find () ){

                help=help+matcherHealth.group ();

            }
            while ( matcherDamage.find () ){
                if(!matcherDamage.group ().equals ( "" )){
                    String match=matcherDamage.group ();
                    double damage=Double.parseDouble ( match );
                    sum+=damage;
                }

            }
            while ( matcherMath.find () ){
                math=math+matcherMath.group ();
            }
            for ( int j = 0 ; j < math.length ( ) ; j++ ) {
                char cha=math.charAt ( j );
                if (cha=='/'){
                    sum=sum/2;
                }
                else {
                    sum=sum*2;
                }
            }

            for ( int j = 0 ; j < help.length () ; j++ ) {

                int ascii = (int) help.charAt ( j);
                health+=ascii;
            }
            System.out.printf ( "%s - %d health, %.2f damage%n",input[i],health,sum );
            help="";
            sum=0;
            math="";
            health=0;

        }

    }
}
