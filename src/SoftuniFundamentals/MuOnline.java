package SoftuniFundamentals;
//You have initial health 100 and initial bitcoins 0. You will be given a string representing the dungeon's rooms. Each room is separated with '|' (vertical bar): "room1|room2|room3…"
//Each room contains a command and a number, separated by space. The command can be:
//•	"potion"
//o	You are healed with the number in the second part. But your health cannot exceed your initial health (100).
//o	First print: "You healed for {amount} hp."
//o	After that, print your current health: "Current health: {health} hp."
//•	"chest"
//o	You've found some bitcoins, the number in the second part.
//o	Print: "You found {amount} bitcoins."
//•	In any other case, you are facing a monster, which you will fight. The second part of the room contains the attack of the monster. You should remove the monster's attack from your health.
//o	If you are not dead (health <= 0), you've slain the monster, and you should print: "You slayed {monster}."
//o	If you've died, print "You died! Killed by {monster}." and your quest is over. Print the best room you've manage to reach: "Best room: {room}"
//If you managed to go through all the rooms in the dungeon, print on the following three lines:
//"You've made it!"
//"Bitcoins: {bitcoins}"
//"Health: {health}"

//rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int health = 100;
        int bitcoin = 0;
        int count = 0;
        boolean dead = false;
        List< String > rooms =
                Arrays.stream ( scanner.nextLine ( ).split ( "\\Q|\\E" ) ).collect ( Collectors.toList ( ) );
        for ( int i = 0 ; i < rooms.size ( ) ; i++ ) {
            String room = rooms.get ( i ).split ( " " )[ 0 ];
            int number = Integer.parseInt ( rooms.get ( i ).split ( " " )[ 1 ] );

            switch (room) {
                case "potion":
                    int helper=0;
                    if ( health + number <= 100 ) {
                        health += number;
                        helper=number;
                    } else {
                        helper=100-health;
                        health = 100;
                    }
                    System.out.printf ( "You healed for %d hp.%n" , helper );
                    System.out.printf ( "Current health: %d hp.%n" , health );
                    count++;
                    break;
                case "chest":
                    bitcoin += number;
                    System.out.printf ( "You found %d bitcoins.%n" , number );
                    count++;
                    break;
                default:
                    health -= number;
                    count++;
                    if ( health > 0 ) {
                        System.out.printf ( "You slayed %s.%n" , room );
                    } else {
                        System.out.printf ( "You died! Killed by %s.%n" , room );
                        System.out.printf ( "Best room: %d%n" , count );
                        dead = true;
                    }

                    break;
            }
            if ( dead ) {
                break;
            }
        }
        if ( !dead ) {
            System.out.println ( "You've made it!" );
            System.out.printf ( "Bitcoins: %d%n" , bitcoin );
            System.out.printf ( "Health: %d%n" , health );
        }

    }
}
