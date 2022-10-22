package SoftuniFundamentals;
//You are at the shooting gallery again, and you need a program that helps you keep track of moving targets. On the first line, you will receive a sequence of targets with their integer values, split by a single space. Then, you will start receiving commands for manipulating the targets until the "End" command. The commands are the following:
//•	"Shoot {index} {power}"
//o	Shoot the target at the index if it exists by reducing its value by the given power (integer value).
//o	Remove the target if it is shot. A target is considered shot when its value reaches 0.
//•	"Add {index} {value}"
//o	Insert a target with the received value at the received index if it exists.
//o	If not, print: "Invalid placement!"
//•	"Strike {index} {radius}"
//o	Remove the target at the given index and the ones before and after it depending on the radius.
//o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
// Example:  "Strike 2 2"
//	{radius}	{radius}	{strikeIndex}	{radius}	{radius}
//
//•	"End"
//o	Print the sequence with targets in the following format and end the program:
//"{target1}|{target2}…|{targetn}"

//52 74 23 44 96 110
//Shoot 5 10
//Shoot 1 80
//Strike 2 1
//Add 22 3
//End
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String[] input = scanner.nextLine ( ).split ( " " );
        while ( !input[ 0 ].equals ( "End" ) ) {
            int index = Integer.parseInt ( input[ 1 ] );
            int value = Integer.parseInt ( input[ 2 ] );
            boolean outBound = false;
            if ( index < 0 | index > list.size ( ) - 1 ) {
                outBound = true;
            }
            switch (input[ 0 ]) {
                case "Shoot":

                    if ( outBound ) {
                            break;
                    }
                    else if (list.get ( index )-value<=0){
                        list.remove (index);
                    }
                    else {
                        list.add(index, list.get ( index )-value);
                        list.remove ( index+1 );
                    }
                    break;
                case "Add":
if (outBound){
    System.out.println ("Invalid placement!" );
    break;
}
else {
    list.add ( index,value );
}
                    break;
                case "Strike":
                    int help=index +value;
                    int help1=index -value;
if (outBound| help > list.size ( )-1|help1<0){
    System.out.println ("Strike missed!" );
    break;
}else {
    for ( int i = 0 ; i < value * 2 + 1 ; i++ ) {
        list.remove ( index-1 );
    }
}
                    break;
            }
            input = scanner.nextLine ( ).split ( " " );
        }
        String out=list.toString().replaceAll("[\\[\\]]", "");

        System.out.println(out.toString().replaceAll ( ", ","\\|" ));
    }
}
