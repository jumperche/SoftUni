package SoftuniFundamentals;

import java.util.*;

public class TheatrePromotion {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String day = scanner.nextLine ( );

        int age = Integer.parseInt ( scanner.nextLine ( ) );
        int price = 0;
        switch (day) {
            case "Weekday":
                if (age<0){
                    System.out.println ( "Error!" );
                    break;
                }
                else if ( age >= 0 && age <= 18 ) {
                    price = 12;}
                    else if ( age <= 64 ) {
                        price = 18;
                    }
                    else if ( age <= 122 ) {
                        price = 12;

                }else {
                        System.out.println ( "Error!" );
                        break;
                }
                    if (price!=0) {
                        System.out.println ( price + "$" );
                    }
                    else {
                        System.out.println ( "Error!" );
                        break;
                    }
                break;
            case "Weekend":
                if (age<0){
                    System.out.println ( "Error!" );
                    break;
                }
                else if ( age >= 0 && age <= 18 ) {
                    price = 15;}
                    else if ( age <= 64 ) {
                        price = 20;
                    }
                   else if ( age <= 122 ) {
                        price = 15;

                }else {
                    System.out.println ( "Error!" );
                    break;
                }
                if (price!=0) {
                    System.out.println ( price + "$" );
                }
                else {
                    System.out.println ( "Error!" );
                    break;
                }

                break;
            case "Holiday":
                if (age<0){
                    System.out.println ( "Error!" );
                    break;
                }
                else if ( age >= 0 && age <= 18 ) {
                    price = 5;}
                    else if ( age <= 64 ) {
                        price = 12;
                    }
                    else if ( age <= 122 ) {
                        price = 10;

                }else {
                    System.out.println ( "Error!" );
                    break;
                }
                if (price!=0) {
                    System.out.println ( price + "$" );
                }


                break;
            default:
                System.out.println ( "Error!" );
                break;
        }
    }
}