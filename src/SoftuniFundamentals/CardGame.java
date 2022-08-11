package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//You will be given two hands of cards, which will be integer numbers. Assume that you have two players. You have to find out the winning deck and respectively the winner.
//You start from the beginning of both hands. Compare the cards from the first deck to the cards from the second deck. The player, who has a bigger card, takes both cards
// and puts them at the back of his hand - the second player's card is last, and the first person's card (the winning one) is before it (second to last) and the player
// with the smaller card must remove the card from his deck. If both players' cards have the same values - no one wins, and the two cards must be removed from the decks.
// The game is over when one of the decks is left without any cards. You have to print the winner on the console and the sum of the left cards: "{First/Second} player wins! Sum: {sum}".
public class CardGame {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > player1 = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        List< Integer > player2 = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );

        while ( !player1.isEmpty ()&&!player2.isEmpty () ){


            if (player1.get ( 0 )> player2.get ( 0)){
                player1.add ( player1.get ( 0) );
                player1.remove ( 0 );
                player1.add ( player2.get ( 0) );
                player2.remove ( 0 );
                //player1.add ( player1.get ( 0) );
            } else if ( player1.get ( 0 )< player2.get ( 0) ) {
                player2.add ( player2.get ( 0 ) );
                player2.remove ( 0 );
                player2.add ( player1.get ( 0) );
                player1.remove ( 0 );

            }
            else {
                player1.remove ( 0 );
                player2.remove ( 0 );
            }


        }
        if ( player1.isEmpty ( ) ){
            int sum=0;
            for ( int j = 0 ; j < player2.size () ; j++ ) {
                sum=sum+ player2.get ( j);
            }
            System.out.println ("Second player wins! Sum: "+sum );
        }
        else {
            int sum=0;
            for ( int j = 0 ; j < player1.size () ; j++ ) {
                sum=sum+ player1.get ( j);
            }
            System.out.println ("First player wins! Sum: "+sum );
        }
        }
    }

