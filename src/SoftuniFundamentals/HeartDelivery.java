package SoftuniFundamentals;
//You will receive a string with even integers, separated by a "@" - this is our neighborhood. After that, a series of Jump commands will follow until you receive "Love!". Every house in the neighborhood needs a certain number of hearts delivered by Cupid so it can celebrate Valentine's day. The integers in the neighborhood indicate those needed hearts.
//Cupid starts at the position of the first house (index 0) and must jump by a given length. The jump commands will be in this format: "Jump {length}".
//Every time he jumps from one house to another, the needed hearts for the visited house are decreased by 2:
//•	If the needed hearts for a certain house become equal to 0, print on the console "Place {house_index} has Valentine's day."
//•	If Cupid jumps to a house where the needed hearts are already 0, print on the console "Place {house_index} already had Valentine's day."
//•	Keep in mind that Cupid can have a larger jump length than the size of the neighborhood, and if he does jump outside of it, he should start from the first house again (index 0)
//For example, we are given this neighborhood: 6@6@6. Cupid is at the start and jumps with a length of 2. He will end up at index 2 and decrease the needed hearts by 2: [6, 6, 4]. Next, he jumps again with a length of 2 and goes outside the neighborhood, so he goes back to the first house (index 0) and again decreases the needed hearts there: [4, 6, 4].

//2@4@2
//Jump 2
//Jump 2
//Jump 8
//Jump 3
//Jump 1
//Love!
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        List< Integer > list = Arrays
                .stream ( scanner.nextLine ( ).split ( "@" ) )
                .map ( Integer::parseInt )
                .collect ( Collectors.toList ( ) );
        String[] input = scanner.nextLine ( ).split ( " " );
       Boolean[] valentines = new Boolean[list.size ()];
        int index=0;
        int count=0;
Arrays.fill (valentines,false  );

        while ( !input[ 0 ].equals ( "Love!" ) ) {

            int jump = Integer.parseInt ( input[ 1 ] );
            index=index + jump;
            if (index> list.size ( )-1){
                index=0;
            }
           if (list.get ( index )==0){
               System.out.printf ( "Place %d already had Valentine's day.%n",index );
           }

            int help=list.get (index )-2;
            if ( help>= 0 ) {
                list.set ( index , help);
            }
            if ( help== 0  ) {
                System.out.printf ( "Place %d has Valentine's day.%n",index );
            }
            if ( list.get(index) == 0  ) {
                valentines[index]=true ;
            }
            count++;
            input = scanner.nextLine ( ).split ( " " );
        }
        System.out.printf ( "Cupid's last position was %d.%n",index );
int counter=0;
        for ( int i = 0 ; i < valentines.length ; i++ ) {
            if (!valentines[i]) {
counter++;
            }

        }
        if (counter>0) {
            System.out.printf ( "Cupid has failed %d places.%n" , counter );
        }
else {

            System.out.printf ( "Mission was successful." );
        }
    }
}
