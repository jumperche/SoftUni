package SoftuniFundamentals;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DragonArmy21 {

        public static void main ( String[] args ) {

            Scanner scanner = new Scanner ( System.in );
            int n = Integer.parseInt ( scanner.nextLine ( ) );
            LinkedHashMap< String, TreeMap< String, SoftuniFundamentals.DragonArmy2.Dragon > > dragonsByType = new LinkedHashMap< String, TreeMap< String, SoftuniFundamentals.DragonArmy2.Dragon > > ( );

            for ( int i = 0 ; i < n ; i++ ) {
                String[] input = scanner.nextLine ( ).split ( " " );

                String type = input[ 0 ];
                String name = input[ 1 ];
                int damage = input[ 2 ].equals ( "null" ) ? 45 : Integer.parseInt ( input[ 2 ] );
                int health = input[ 3 ].equals ( "null" ) ? 250 : Integer.parseInt ( input[ 3 ] );
                int armor = input[ 4 ].equals ( "null" ) ? 10 : Integer.parseInt ( input[ 4 ] );

                SoftuniFundamentals.DragonArmy2.Dragon newDragon = new SoftuniFundamentals.DragonArmy2.Dragon ( type , name , damage , health , armor );

                dragonsByType.putIfAbsent ( type , new TreeMap< String, SoftuniFundamentals.DragonArmy2.Dragon > ( ) );
                dragonsByType.get ( type ).put ( name , newDragon );
            }

            Set< String > types = dragonsByType.keySet ( );
            for ( String type : types ) {
                TreeMap< String, SoftuniFundamentals.DragonArmy2.Dragon > dragonsOfType = dragonsByType.get ( type );
                double averageDamage = 0;
                double averageHealth = 0;
                double averageArmor = 0;

                Set< String > names = dragonsOfType.keySet ( );
                for ( String name : names ) {
                    SoftuniFundamentals.DragonArmy2.Dragon dragon = dragonsOfType.get ( name );
                    averageDamage += dragon.damage;
                    averageHealth += dragon.health;
                    averageArmor += dragon.armor;
                }

                averageDamage = averageDamage / dragonsOfType.size ( );
                averageHealth = averageHealth / dragonsOfType.size ( );
                averageArmor = averageArmor / dragonsOfType.size ( );
                System.out.printf ( "%s::(%.2f/%.2f/%.2f)%n" , type , averageDamage , averageHealth , averageArmor );

                for ( String name : names ) {
                    SoftuniFundamentals.DragonArmy2.Dragon dragon = dragonsOfType.get ( name );
                    System.out.printf ( "-%s -> damage: %d, health: %d, armor: %d%n" , dragon.name , dragon.damage , dragon.health , dragon.armor );
                }
            }
        }

        public static class Dragon {
            String type;
            String name;
            int damage;
            int health;
            int armor;

            public Dragon ( String type , String name , int damage , int health , int armor ) {
                this.type = type;
                this.name = name;
                this.damage = damage;
                this.health = health;
                this.armor = armor;
            }

            public String getType () {
                return type;
            }

            public void setType ( String type ) {
                this.type = type;
            }

            public String getName () {
                return name;
            }

            public void setName ( String name ) {
                this.name = name;
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



