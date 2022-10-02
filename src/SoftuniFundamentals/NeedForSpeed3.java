package SoftuniFundamentals;
//You have just bought the latest and greatest computer game – Need for Seed III. Pick your favorite cars and drive them all you want! We know that you can't wait to start playing.
//On the first line of the standard input, you will receive an integer n – the number of cars that you can obtain. On the next n lines, the cars themselves will follow with their mileage and fuel available, separated by "|" in the following format:
//"{car}|{mileage}|{fuel}"
//Then, you will be receiving different commands, each on a new line, separated by " : ", until the "Stop" command is given:
//•	"Drive : {car} : {distance} : {fuel}":
//o	You need to drive the given distance, and you will need the given fuel to do that. If the car doesn't have enough fuel, print: "Not enough fuel to make that ride"
//o	If the car has the required fuel available in the tank, increase its mileage with the given distance, decrease its fuel with the given fuel, and print:
//"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
//o	You like driving new cars only, so if a car's mileage reaches 100 000 km, remove it from the collection(s) and print: "Time to sell the {car}!"
//•	"Refuel : {car} : {fuel}":
//o	Refill the tank of your car.
//o	Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank, take only what is required to fill it up.
//o	Print a message in the following format: "{car} refueled with {fuel} liters"
//•	"Revert : {car} : {kilometers}":
//o	Decrease the mileage of the given car with the given kilometers and print the kilometers you have decreased it with in the following format:
//"{car} mileage decreased by {amount reverted} kilometers"
//o	If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and
//DO NOT print anything.
//Upon receiving the "Stop" command, you need to print all cars in your possession in the following format:
//"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."

//3
//Audi A6|38000|62
//Mercedes CLS|11000|35
//Volkswagen Passat CC|45678|5
//Drive : Audi A6 : 543 : 47
//Drive : Mercedes CLS : 94 : 11
//Drive : Volkswagen Passat CC : 69 : 8
//Refuel : Audi A6 : 50
//Revert : Mercedes CLS : 500
//Revert : Audi A6 : 30000
//Stop
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n=Integer.parseInt ( scanner.nextLine ( ) );
        Map <String,Car> map=new LinkedHashMap<> ();

        for ( int i = 0 ; i < n ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( "\\|" );
            Car car=new Car ( input[ 0 ] ,Integer.parseInt ( input[ 1 ] ),Integer.parseInt ( input[ 2 ] ) );
            map.put ( input[ 0 ] ,car );

        }
        String[] input=scanner.nextLine ().split ( " : " );
        while ( !input[0].equals ( "Stop" ) ){
switch (input[0]){
    case "Drive":
      if (map.get ( input[1] ).fuel>=Integer.parseInt ( input[3])){
          int mileage=map.get ( input[1] ).mileage+Integer.parseInt ( input[ 2 ] );
          map.get ( input[1] ).setMileage ( mileage );
          int fluel=map.get ( input[1] ).fuel-Integer.parseInt ( input[3]);
          map.get (  input[1] ).setFuel ( fluel );
          System.out.printf ( "%s driven for %d kilometers. %d liters of fuel consumed.%n",input[1] ,Integer.parseInt ( input[2]) , Integer.parseInt ( input[3])  );
      }
      else {
          System.out.println ("Not enough fuel to make that ride" );
          break;
      }
      if (map.get ( input[1] ).mileage>=100000){
          map.remove ( input[1] );
          System.out.println ("Time to sell the "+input[1]+"!" );
      }
        break;
    case "Refuel":
        int fluel=map.get ( input[1] ).fuel+Integer.parseInt ( input[2]);
        int f=75-map.get ( input[1] ).fuel;
        if (fluel>75){
            map.get (  input[1] ).setFuel ( 75);
            System.out.printf ( "%s refueled with %d liters%n",input[1],f);
        }else {


            map.get ( input[ 1 ] ).setFuel ( fluel );
            System.out.printf ( "%s refueled with %d liters%n",input[1],Integer.parseInt ( input[2]));
        }

        break;
    case "Revert":
int km=Integer.parseInt ( input[2] );
int mileage=map.get ( input[1] ).mileage-km;
if (mileage>10000){
    map.get ( input[1] ).setMileage ( mileage );
    System.out.printf ( "%s mileage decreased by %d kilometers%n",input[1],km );
}
else {
    map.get ( input[1] ).setMileage ( 10000 );
}
        break;
}

            input=scanner.nextLine ().split ( " : " );
        }

map.entrySet ().stream ()
        .forEach ( entry->{
    System.out.printf ( "%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey (),entry.getValue ().getMileage (),entry.getValue ().getFuel ());
} );
    }
    public static class Car{
        String name;
        int mileage;
        int fuel;

        public Car ( String name , int mileage , int fuel ) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public int getMileage () {
            return mileage;
        }

        public void setMileage ( int mileage ) {
            this.mileage = mileage;
        }

        public int getFuel () {
            return fuel;
        }

        public void setFuel ( int fuel ) {
            this.fuel = fuel;
        }
    }
}
