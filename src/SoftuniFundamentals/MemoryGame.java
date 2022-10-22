package SoftuniFundamentals;
//Write a program that recreates the Memory game.
//On the first line, you will receive a sequence of elements. Each element in the sequence will have a twin. Until the player receives "end" from the console, you will receive strings with two integers separated by a space, representing the indexes of elements in the sequence.
//If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence, you should add two matching elements at the middle of the sequence in the following format:
//"-{number of moves until now}a"
//Then print this message on the console:
//"Invalid input! Adding additional elements to the board"
//Input
//•	On the first line, you will receive a sequence of elements
//•	On the following lines, you will receive integers until the command "end"
//Output
//•	Every time the player hit two matching elements, you should remove them from the sequence and print on the console the following message:
//"Congrats! You have found matching elements - ${element}!"
//•	If the player hit two different elements, you should print on the console the following message:
//"Try again!"
//•	If the player hit all matching elements before he receives "end" from the console, you should print on the console the following message:
//"You have won in {number of moves until now} turns!"
//•	If the player receives "end" before he hits all matching elements, you should print on the console the following message:
//"Sorry you lose :(
//{the current sequence's state}"

//a 2 4 a 2 4
//0 3
//0 2
//0 1
//0 1
//end
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        List< String > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) )
                .collect ( Collectors.toList ( ) );
        String[] input =scanner.nextLine().split ( " " );
        int count=0;
        boolean win=false;
        while ( !input[0].equals ( "end" ) ){

            int number1=Integer.parseInt(input[0]);
            int number2=Integer.parseInt(input[1]);
            count++;
            if (number1==number2|number2<0|number1<0|number1>list.size ()-1|number2>list.size ()-1){
                System.out.printf ( "Invalid input! Adding additional elements to the board%n" );
                String helper="-"+count+"a";
                int index=(list.size ( ) )/2;
                list.add( index, helper);
                list.add( index, helper);
                input=scanner.nextLine ().split ( " " );
                continue;
            }
            if (list.get ( number1 ).equals ( list.get(number2) )){
                System.out.printf ( "Congrats! You have found matching elements - %s!%n",list.get ( number1 ) );
                if (number1>number2){
                    int swap=number2;
                    number2=number1;
                    number1 = swap;
                }
                list.remove(number2);
                list.remove(number1);
            }
            else {
                System.out.printf ( "Try again!%n" );
            }
            if (list.isEmpty ()){
                System.out.printf ( "You have won in %d turns!%n",count );
                win=true;
                break;
            }
            input=scanner.nextLine ().split ( " " );
        }
        if (!win){
            System.out.println ("Sorry you lose :(" );
            System.out.println (String.join ( " ",list ) );
        }
    }
}
