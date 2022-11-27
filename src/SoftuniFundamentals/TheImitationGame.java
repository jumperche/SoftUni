package SoftuniFundamentals;
//During World War 2, you are a mathematician who has joined the cryptography team to decipher the enemy's enigma code. Your job is to create a program to crack the codes.
//On the first line of the input, you will receive the encrypted message. After that, until the "Decode" command is given, you will be receiving strings with instructions for different operations that need to be performed upon the concealed message to interpret it and reveal its true content. There are several types of instructions, split by '|'
//•	"Move {number of letters}":
//o	Moves the first n letters to the back of the string
//•	"Insert {index} {value}":
//o	Inserts the given value before the given index in the string
//•	"ChangeAll {substring} {replacement}":
//o	Changes all occurrences of the given substring with the replacement text

//zzHe
//ChangeAll|z|l
//Insert|2|o
//Move|3
//Decode
import java.util.Scanner;

public class TheImitationGame {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String code = scanner.nextLine ( );
        String decode = code;
        String[] input = scanner.nextLine ( ).split ( "\\|" );
        while ( !input[ 0 ].equals ( "Decode" ) ) {
            String command = input[ 1 ];
            switch (input[ 0 ]) {

                case "ChangeAll":
                    for ( int i = 0 ; i < code.length() ; i++ ) {
                        String help=code.charAt(i)+"";
                        if (help.equals ( input[1])){
                            decode = decode.replace ( command , input[ 2 ] );
                        }
                    }

                    break;
                case "Insert":
                    int index =Integer.parseInt ( input[ 1 ] ) ;
                    String left = decode.substring ( 0 , index);
                    String right = decode.substring ( index  );

                    left = left.concat (  input[ 2 ]);
                    decode = left.concat ( right);
                    break;
                case "Move":
                     index = Integer.parseInt ( input[ 1 ] );
                    left = decode.substring ( 0 , index );
                    right = decode.substring ( index  );
                    decode = right.concat (  left);
                    break;
            }
            input = scanner.nextLine ( ).split ( "\\|" );
        }
        System.out.printf ( "The decrypted message is: %s",decode );
    }
}
