package SoftuniFundamentals;
//5.	Vehicle Catalogue
//You have to make a catalog for vehicles. You will receive two types of vehicles - a car or a truck.
//Until you receive the command "End" you will receive lines of input in the format:
//{typeOfVehicle} {model} {color} {horsepower}
//After the "End" command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
//Type: {typeOfVehicle}
//Model: {modelOfVehicle}
//Color: {colorOfVehicle}
//Horsepower: {horsepowerOfVehicle}
//
//When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower for the cars and the trucks in the format:
//"{typeOfVehicles} have average horsepower of {averageHorsepower}."
//The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    public static void main ( String[] args ) {
        List< Vehicle > list = new ArrayList<> ( );
        double sumPowerCar = 0.0;
        double sumPowerTruck = 0.0;
        double avarageCar = 0.0;
        double avarageTruck = 0.0;
        int countCar = 0;
        int countTruck = 0;
        Scanner scanner = new Scanner ( System.in );
        List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> value )
                .collect ( Collectors.toList ( ) );
        while ( !input.get ( 0 ).equals ( "End" ) ) {
            Vehicle vehicle = new Vehicle ( input.get ( 0 ) , input.get ( 1 ) , input.get ( 2 ) , Integer.parseInt ( input.get ( 3 ) ) );
            list.add ( vehicle );
            input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> value )
                    .collect ( Collectors.toList ( ) );
        }
        String inputType = scanner.nextLine ( );
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ( list.get ( i ).getType ( ).equals ( "car" ) ) {
                list.get ( i ).setType ( "Car" );
                int pow = list.get ( i ).getPower ( );
                sumPowerCar = sumPowerCar + pow;
                countCar++;
            } else {
                list.get ( i ).setType ( "Truck" );
                int pow = list.get ( i ).getPower ( );
                sumPowerTruck = sumPowerTruck + pow;
                countTruck++;
            }
        }
        while ( !inputType.equals ( "Close the Catalogue" ) ) {
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                String model = list.get ( i ).getModel ( );
                if ( model.equals ( inputType ) ) {
                    System.out.print ( list.get ( i ).printData ( ) );

                }


            }
            inputType = scanner.nextLine ( );
        }
if (sumPowerCar!=0) {
    avarageCar = sumPowerCar / countCar;}
if (sumPowerTruck!=0){
    avarageTruck = sumPowerTruck / countTruck;
}

        System.out.printf ( "Cars have average horsepower of: %.2f.%n" , avarageCar );
        System.out.printf ( "Trucks have average horsepower of: %.2f." , avarageTruck );
    }

    public static class Vehicle {
        String type;
        String model;
        String color;
        int power;

        public Vehicle ( String type , String model , String color , int power ) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.power = power;
        }

        public String getType () {
            return type;
        }

        public void setType ( String type ) {
            this.type = type;
        }

        public String getModel () {
            return model;
        }

        public void setModel ( String model ) {
            this.model = model;
        }

        public String getColor () {
            return color;
        }

        public void setColor ( String color ) {
            this.color = color;
        }

        public int getPower () {
            return power;
        }

        public void setPower ( int power ) {
            this.power = power;
        }

        public String printData () {
            return String.format ( "Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n" , this.getType ( ) , this.getModel ( ) , this.getColor ( ) , this.getPower ( ) );
        }
    }
}
