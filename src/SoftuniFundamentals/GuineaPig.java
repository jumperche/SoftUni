package SoftuniFundamentals;
// Merry has a guinea pig named Puppy, that she loves very much. Every month she goes to the nearest pet store and buys him everything he needs – food, hay, and cover.
//On the first three lines, you will receive the quantity of food, hay, and cover, which Merry buys for a month (30 days). On the fourth line, you will receive the guinea pig's weight.
//Every day Puppy eats 300 gr of food. Every second day Merry first feeds the pet, then gives it a certain amount of hay equal to 5% of the rest of the food. On every third day, Merry puts Puppy cover with a quantity of 1/3 of its weight.
//Calculate whether the quantity of food, hay, and cover, will be enough for a month.
//If Merry runs out of food, hay, or cover, stop the program!
//Input
//•	On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0].
//•	On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0].
//•	On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0].
//•	On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0].

//10
//5
//5.2
//1

import java.util.Scanner;

public class GuineaPig {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        double food = Double.parseDouble(scanner.nextLine())*1000;
        double hay = Double.parseDouble(scanner.nextLine())*1000;
        double cover = Double.parseDouble(scanner.nextLine())*1000;
        double weight=Double.parseDouble(scanner.nextLine())*1000;
        boolean out=false;
        for ( int i = 1 ; i < 31 ; i++ ) {

            while ( !out ){
                food=food-300;
                if (i%2==0){
                    double helper=food*0.05;
                    hay=hay-helper;
                }
                if (i%3==0){
                    double helper=weight/3;
                    cover=cover-helper;
                }
                if(food<=0|hay<=0|cover<=0){
                    out=true;

                    break;
                }
                break;
            }
        }
if (out){
    System.out.printf ( "Merry must go to the pet store!%n" );
}
else {
    System.out.printf ( "Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",food/1000,hay/1000,cover/1000 );
}

    }
}