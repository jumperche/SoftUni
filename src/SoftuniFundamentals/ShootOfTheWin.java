package SoftuniFundamentals;
//Write a program that helps you keep track of your shot targets. You will receive a sequence with integers, separated by a single space, representing targets and their value. Afterward, you will be receiving indices until the "End" command is given, and you need to print the targets and the count of shot targets.
//Every time you receive an index, you need to shoot the target on that index, if it is possible.
//Every time you shoot a target, its value becomes -1, and it is considered shot. Along with that, you also need to:
//•	Reduce all the other targets, which have greater values than your current target, with its value.
//•	Increase all the other targets, which have less than or equal value to the shot target, with its value.
//Keep in mind that you can't shoot a target, which is already shot. You also can't increase or reduce a target, which is considered shot.
//When you receive the "End" command, print the targets in their current state and the count of shot targets in the following format:
//"Shot targets: {count} -> {target1} {target2}… {targetn}"

//24 50 36 70
//0
//4
//3
//1
//End
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootOfTheWin {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String input = scanner.nextLine ( );
        int count=0;
        while ( !input.equals ( "End" ) ) {
            int shoot = Integer.parseInt ( input );
            if (shoot> list.size ( )-1|shoot<0){
                input = scanner.nextLine ( );
                continue;
            }
            if ( list.get ( shoot ) != -1 ) {
                int helper = list.get ( shoot );
                list.add ( shoot , -1 );
                list.remove ( shoot + 1 );
                count++;
                for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                    if (i==shoot){
                        continue;
                    }
                    if ( helper < list.get ( i ) &list.get ( i )!=-1) {
                        list.add ( i , list.get ( i ) - helper );
                        list.remove ( i + 1 );

                    } else if ( helper >= list.get ( i ) &list.get ( i )!=-1) {
                        list.add ( i , list.get ( i ) + helper );
                        list.remove ( i + 1 );

                    }
                }
            }
            input = scanner.nextLine ( );
        }
        System.out.printf ( "Shot targets: %d -> ",count );
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
