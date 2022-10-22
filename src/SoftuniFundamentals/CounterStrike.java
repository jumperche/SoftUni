package SoftuniFundamentals;
//Write a program that keeps track of every won battle against an enemy. You will receive initial energy. Afterward, you will start receiving the distance you need to reach an enemy until the "End of battle" command is given, or you run out of energy.
//The energy you need for reaching an enemy is equal to the distance you receive. Each time you reach an enemy, you win a battle, and your energy is reduced. Otherwise, if you don't have enough energy to reach an enemy, end the program and print: "Not enough energy! Game ends with {count} won battles and {energy} energy".
//Every third won battle increases your energy with the value of your current count of won battles.
//Upon receiving the "End of battle" command, print the count of won battles in the following format:
//"Won battles: {count}. Energy left: {energy}"

//100
//10
//10
//10
//1
//2
//3
//73
//10
import java.util.Scanner;

public class CounterStrike {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int energy = Integer.parseInt ( scanner.nextLine ( ) );
        String input = scanner.nextLine ( );
        int count = 0;
        boolean lose = false;
        while ( !input.equals ( "End of battle" ) ) {

            int distance = Integer.parseInt ( input );


            if ( energy >=distance ) {
                energy = energy - distance;
            }else {
                lose = true;

                break;
            }
            count++;
            if ( count % 3 == 0 ) {
                energy = energy + count;
            }



            input = scanner.nextLine ( );
        }
        if ( lose ) {


            System.out.printf ( "Not enough energy! Game ends with %d won battles and %d energy%n" , count , energy );
        } else {
            System.out.printf ( "Won battles: %d. Energy left: %d" , count , energy );
        }
    }
}
