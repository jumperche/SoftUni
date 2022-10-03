package SoftuniFundamentals;
//Anno 1681. The Caribbean. The golden age of piracy. You are a well-known pirate captain by the name of Jack Daniels. Together with your comrades Jim (Beam) and Johnny (Walker), you have been roaming the seas, looking for gold and treasure… and the occasional killing, of course. Go ahead, target some wealthy settlements and show them the pirate's way!
//Until the "Sail" command is given, you will be receiving:
//•	You and your crew have targeted cities, with their population and gold, separated by "||".
//•	If you receive a city that has already been received, you have to increase the population and gold with the given values.
//After the "Sail" command, you will start receiving lines of text representing events until the "End" command is given.
//Events will be in the following format:
//•	"Plunder=>{town}=>{people}=>{gold}"
//o	You have successfully attacked and plundered the town, killing the given number of people and stealing the respective amount of gold.
//o	For every town you attack print this message: "{town} plundered! {gold} gold stolen, {people} citizens killed."
//o	If any of those two values (population or gold) reaches zero, the town is disbanded.
//	You need to remove it from your collection of targeted cities and print the following message: "{town} has been wiped off the map!"
//o	There will be no case of receiving more people or gold than there is in the city.
//•	"Prosper=>{town}=>{gold}"
//o	There has been dramatic economic growth in the given city, increasing its treasury by the given amount of gold.
//o	The gold amount can be a negative number, so be careful. If a negative amount of gold is given, print: "Gold added cannot be a negative number!" and ignore the command.
//o	If the given gold is a valid amount, increase the town's gold reserves by the respective amount and print the following message:
//"{gold added} gold added to the city treasury. {town} now has {total gold} gold."

//Tortuga||345000||1250
//Santo Domingo||240000||630
//Havana||410000||1100
//Sail
//Plunder=>Tortuga=>75000=>380
//Prosper=>Santo Domingo=>180
//End
import java.util.*;

public class Pirates {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( "\\|\\|" );
        Map< String, City > map = new LinkedHashMap<> ( );
        while ( !input[ 0 ].equals ( "Sail" ) ) {
            City city = new City ( input[ 0 ] , Integer.parseInt ( input[ 1 ] ) , Integer.parseInt ( input[ 2 ] ) );
            if ( map.containsKey ( input[ 0 ] ) ) {
                int people = Integer.parseInt ( input[ 1 ] ) + map.get ( input[ 0 ] ).getPeople ( );
                int gold = Integer.parseInt ( input[ 2 ] ) + map.get ( input[ 0 ] ).getGold ( );
                city = new City ( input[ 0 ] , people , gold );
                map.put ( input[ 0 ] , city );
            } else {
                map.put ( input[ 0 ] , city );
            }

            input = scanner.nextLine ( ).split ( "\\|\\|" );
        }
        input = scanner.nextLine ( ).split ( "=>" );
        while ( !input[ 0 ].equals ( "End" ) ) {
            if ( input[ 0 ].equals ( "Plunder" ) ) {
                int people = map.get ( input[ 1 ] ).getPeople ( ) - Integer.parseInt ( input[ 2 ] );
                int gold = map.get ( input[ 1 ] ).getGold ( ) - Integer.parseInt ( input[ 3 ] );
                City city = new City ( input[ 1 ] , people , gold );
                map.put ( input[ 1 ] , city );
                System.out.printf ( "%s plundered! %d gold stolen, %d citizens killed.%n" , map.get ( input[ 1 ] ).getName ( ) , Integer.parseInt ( input[ 3 ] ) , Integer.parseInt ( input[ 2 ] ) );

                if ( people <= 0 || gold <= 0 ) {
                    map.remove ( input[ 1 ] );
                    System.out.printf ( "%s has been wiped off the map!%n" , input[ 1 ] );
                }


            } else if ( input[ 0 ].equals ( "Prosper" ) ) {
                int gold = Integer.parseInt ( input[ 2 ] );
                if ( gold < 0 ) {
                    System.out.println ( " Gold added cannot be a negative number!" );
                } else {
                    gold = gold + map.get ( input[ 1 ] ).getGold ( );
                    City city = new City ( input[ 1 ] , map.get ( input[ 1 ] ).getPeople ( ) , gold );
                    map.put ( input[ 1 ] , city );
                    System.out.printf ( "%d gold added to the city treasury. %s now has %d gold.%n" , Integer.parseInt ( input[ 2 ] ) , input[ 1 ] , map.get ( input[ 1 ] ).getGold ( ) );
                }
            }
            input = scanner.nextLine ( ).split ( "=>" );
        }
        if ( map.isEmpty ( ) ) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {


            System.out.printf ( "Ahoy, Captain! There are %d wealthy settlements to go to:%n" , map.size ( ) );
            map.entrySet ( ).stream ( ).forEach ( e -> System.out.printf ( "%s -> Population: %d citizens, Gold: %d kg%n" , e.getKey ( ) , e.getValue ( ).getPeople ( ) , e.getValue ( ).getGold ( ) ) );
        }
    }
    public static class City{
        String name;
        int people;
        int gold;

        public City ( String name , int people , int gold ) {
            this.name = name;
            this.people = people;
            this.gold = gold;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public int getPeople () {
            return people;
        }

        public void setPeople ( int people ) {
            this.people = people;
        }

        public int getGold () {
            return gold;
        }

        public void setGold ( int gold ) {
            this.gold = gold;
        }
    }
}
