package SoftuniFundamentals;
//Heroes III is the best game ever. Everyone loves it, and everyone plays it all the time. John is not an exclusion from this rule. His favorite units in the game are all types of dragons - black, red, gold, azure, etc. He likes them so much that he gives them names and keeps logs of their stats: damage, health, and armor. The process of aggregating all the data is quite tedious, so he would like to have a program doing it. Since he is no programmer, it's your task to help him.
//You need to categorize dragons by their type. For each dragon, identified by name, keep information about his stats. Type is preserved as in the input order, but dragons are sorted alphabetically by name. For each type, you should also print the average damage, health, and armor of the dragons. For each dragon, print his stats.
//There may be missing stats in the input, though. If a stat is missing, you should assign its default values. Default values are as follows: health 250, damage 45, and armor 10. Missing stat will be marked by null.
//The input is in the following format "{type} {name} {damage} {health} {armor}". Any of the integers may be assigned a null value. See the examples below for a better understanding of your task.
//If the same dragon is added a second time, the new stats should overwrite the previous ones. Two dragons are considered equal if they match by both name and type.
//Input
//•	On the first line, you are given the number N - the number of dragons to follow.
//•	On the next N lines, you are given input in the format described above. There will be a single space separating each element.
//Output
//•	Print the aggregated data on the console.
//•	For each type print average stats of its dragons in format "{Type}::({damage}/{health}/{armor})".
//•	Damage, health, and armor should be rounded to two digits after the decimal separator.
//•	For each dragon, print its stats in the format:
//"-{Name} -> damage: {damage}, health: {health}, armor: {armor}"
//Constraints
//•	N is in the range [1…100].
//•	The dragon type and name are one word only, starting with a capital letter.
//•	Damage, health, and armor are integers in the range [0 … 100000] or null.

//5
//Red Bazgargal 100 2500 25
//Black Dargonax 200 3500 18
//Red Obsidion 220 2200 35
//Blue Kerizsa 60 2100 20
//Blue Algordox 65 1800 50

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DragonArmy {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        List< Dragon > list = new ArrayList<> ( );
        List< String > types = new ArrayList<> ( );
        for ( int i = 0 ; i < n  ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( " " );
            String name = input[ 1 ] + input[ 0 ];
            String currentType = input[ 0 ];
            int damage ;
            int health ;
            int armor ;
            if ( input[ 2 ].equals ( "null" ) ) {
                damage = 45;
            } else {
                damage = Integer.parseInt ( input[ 2 ] );
            }
            if ( input[ 3 ].equals ( "null" ) ) {
                health = 250;
            } else {
                health = Integer.parseInt ( input[ 3 ] );
            }
            if ( input[ 4 ].equals ( "null" ) ) {
                armor = 10;
            } else {
                armor = Integer.parseInt ( input[ 4 ] );
            }
            Dragon current = new Dragon ( input[ 1 ] , currentType , damage , health , armor );
            for ( int j = 0 ; j < list.size ( ) ; j++ ) {
                Dragon helper=list.get(j);
                if ( helper.name.equals ( current.name )&helper.type.equals ( current.type ) ){
                    list.add ( j,current );
                    list.remove(j+1);
                }
            }
            list.add ( current );
            types.add ( currentType );
        }

        List< String > dist = types.stream ( ).distinct ( ).toList ( ) ;
        for ( int i = 0 ; i < dist.size ( ) ; i++ ) {
            double damage = 0;
            double health = 0;
            double armore = 0;
            List< Dragon > out = new ArrayList<> ( );
            for ( int j = 0 ; j < list.size ( ) ; j++ ) {

                if ( list.get ( j ).type.equals ( dist.get ( i ) ) ) {

                    Dragon current = list.get ( j );
                    out.add ( current );
                    damage += current.damage;
                    health += current.health;
                    armore += current.armor;
                }

            }
            damage = damage / out.size ( );
            health = health / out.size ( );
            armore = armore / out.size ( );
            System.out.printf ( "%s::(%.2f/%.2f/%.2f)%n" , dist.get ( i ) , damage , health , armore );
out.sort ( (x1,x2 )->x1.name.compareTo ( x2.name ));
            for ( int k = 0 ; k < out.size ( ) ; k++ ) {
                System.out.printf ( "-%s -> damage: %d, health: %d, armor: %d%n" , out.get ( k ).name , out.get ( k ).damage , out.get ( k ).health , out.get ( k ).armor );
            }
        }

    }

    public static class Dragon {
        String name;
        String type;
        int damage;
        int health;
        int armor;

        public Dragon ( String name , String type , int damage , int health , int armor ) {
            this.name = name;
            this.type = type;
            this.damage = damage;
            this.health = health;
            this.armor = armor;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public String getType () {
            return type;
        }

        public void setType ( String type ) {
            this.type = type;
        }

        public int getDamage () {
            return damage;
        }

        public void setDamage ( int damage ) {
            this.damage = damage;
        }

        public int getHealth () {
            return health;
        }

        public void setHealth ( int health ) {
            this.health = health;
        }

        public int getArmor () {
            return armor;
        }

        public void setArmor ( int armor ) {
            this.armor = armor;
        }

    }
}



