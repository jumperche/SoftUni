package SoftuniFundamentals;
//You have now returned from your world tour. On your way, you have discovered some new plants, and you want to gather some information about them and create an exhibition to see which plant is highest rated.
//On the first line, you will receive a number n. On the next n lines, you will be given some information about the plants that you have discovered in the format: "{plant}<->{rarity}". Store that information because you will need it later. If you receive a plant more than once, update its rarity.
//After that, until you receive the command "Exhibition", you will be given some of these commands:
//•	"Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
//•	"Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
//•	"Reset: {plant}" – remove all the ratings of the given plant
//Note: If any given plant name is invalid, print "error"
//After the command "Exhibition", print the information that you have about the plants in the following format:
//"Plants for the exhibition:
//- {plant_name1}; Rarity: {rarity}; Rating: {average_rating}
//- {plant_name2}; Rarity: {rarity}; Rating: {average_rating}
//…
//- {plant_nameN}; Rarity: {rarity}; Rating: {average_rating}"
//The average rating should be formatted to the second decimal place.


//3
//Arnoldii<->4
//Woodii<->7
//Welwitschia<->2
//Rate: Woodii - 10
//Rate: Welwitschia - 7
//Rate: Arnoldii - 3
//Rate: Woodii - 5
//Update: Woodii - 5
//Reset: Arnoldii
//Exhibition
import java.util.*;

public class PlanDiscovery {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        List<Plants> list=new ArrayList<> (  );
        List<Plants> listin=new ArrayList<> (  );

        for ( int i = 0 ; i < n ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( "<->" );

            Plants plant = new Plants ( input[ 0 ] , Integer.parseInt ( input[ 1 ] ) );
            boolean exist=false;
            int index=0;
            if(list.size ()!=0) {
                for ( int j = 0 ; j < list.size ( ) ; j++ ) {
                    String a = list.get ( j ).plant;
                    String b = input[ 0 ];
                    if ( list.get ( j ).plant.equals ( input[ 0 ] ) ) {
                       exist=true;
                       index=j;
                        break;
                    }
                }
                if (exist){
                    list.set ( index, plant );
                }
                else {
                    list.add ( plant );
                }
            }else {
                list.add ( plant );
            }


        }
        String[] input = scanner.nextLine ( ).split ( ": " );
            while ( !input[0].equals ( "Exhibition" ) ){
                String name=input[ 1 ].split ( " - " )[0];
               switch (input[0]){
                   case "Rate":
                       int rate=Integer.parseInt ( input[ 1 ].split ( " - " )[1] );

                       for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                           if (list.get ( i ).plant.equals ( name )     ){
                               Plants plant=new Plants ( name, list.get ( i ).rar,rate );
                               listin.add ( plant);
                               break;
                           }
                       }
                       break;
                   case "Update":
                        int rar=Integer.parseInt ( input[ 1 ].split ( " - " )[1] );
                       for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                           if (list.get ( i ).plant.equals ( name )     ){
                               Plants plant=new Plants ( list.get ( i ).plant,rar, list.get ( i ).rate );
                               list.set ( i,plant);
                           }
                       }
                       break;
                   case "Reset":
                       for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                           if ( listin.get ( i ).plant.equals ( name ) ) {
                               listin.remove ( i );
                               break;
                           }
                       }

               }
                input = scanner.nextLine ( ).split ( ": " );
            }
        System.out.println ("Plants for the exhibition:" );

        for ( int i = 0 ; i < list.size () ; i++ ) {
            double sum=0.0;
            int count=0;
            for ( int j = 0 ; j < listin.size ( ) ; j++ ) {
                if (list.get ( i ).plant.equals ( listin.get ( j).plant )){
                    sum=sum+listin.get ( j ).rate;
                    count++;
                }
            }
if (sum==0&&count==0){
    System.out.printf ( "- %s; Rarity: %d; Rating: 0.00%n",list.get ( i ).plant,list.get ( i ).rar );
}else {

    System.out.printf ( "- %s; Rarity: %d; Rating: %.2f%n" , list.get ( i ).plant , list.get ( i ).rar , sum / count );
}
        }
    }
    public static class Plants{
        String plant;
        int rar;
        int rate;

        public Plants ( String plant , int rar , int rate ) {

            this.plant = plant;
            this.rar = rar;
            this.rate = rate;
        }
        public Plants ( String plant , int rar  ) {

            this.plant = plant;
            this.rar = rar;
this.rate=0;
        }


        public String getPlant () {
            return plant;
        }

        public void setPlant ( String plant ) {
            this.plant = plant;
        }

        public int getRar () {
            return rar;
        }

        public void setRar ( int rar ) {
            this.rar = rar;
        }

        public int getRate () {
            return rate;
        }

        public void setRate ( int rate ) {
            this.rate = rate;
        }
    }
}
