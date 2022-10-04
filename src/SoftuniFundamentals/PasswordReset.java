package SoftuniFundamentals;
//Yet again, you have forgotten your password. Naturally, it's not the first time this has happened. Actually, you got so tired of it that you decided to help yourself with an intelligent solution.
//Write a password reset program that performs a series of commands upon a predefined string. First, you will receive a string, and afterward, until the command "Done" is given, you will be receiving strings with commands split by a single space. The commands will be the following:
//•	"TakeOdd"
//o	 Takes only the characters at odd indices and concatenates them to obtain the new raw password and then prints it.
//•	"Cut {index} {length}"
//o	Gets the substring with the given length starting from the given index from the password and removes its first occurrence, then prints the password on the console.
//o	The given index and the length will always be valid.
//•	"Substitute {substring} {substitute}"
//o	If the raw password contains the given substring, replaces all of its occurrences with the substitute text given and prints the result.
//o	If it doesn't, prints "Nothing to replace!".
//Input
//•	You will be receiving strings until the "Done" command is given.
//Output
//•	After the "Done" command is received, print:
//o	"Your password is: {password}"
//Constraints
//•	The indexes from the "Cut {index} {length}" command will always be valid.

//Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr
//TakeOdd
//Cut 15 3
//Substitute :: -
//Substitute | ^
//Done
import java.util.Scanner;

public class PasswordReset {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String text = scanner.nextLine ( );
        String[] input= scanner.nextLine ( ).split ( " " );

        while ( !input[0].equals ( "Done" ) ){
            switch (input[0]) {
                case "TakeOdd":
                    String password="";
                    for ( int i = 0 ; i < text.length ( ) ; i++ ) {
                        if (i%2!=0){
                            password=password+text.charAt ( i );
                        }
                    }
                    text=password;

                    System.out.println ( password );
                    break;
                case "Cut":{

                    int index=Integer.parseInt(input[ 1 ]);
                    int length=Integer.parseInt(input[2]);
                    String sub=text.substring ( index,index+length );
                    password=text.replaceFirst ( sub,"" );
                    text=password;
                    System.out.println (password );}
                break;
                case "Substitute": {
                    String chart = input[ 1 ];
                    String newC = input[ 2 ];

                    if ( text.contains ( chart ) ) {
                        password = text.replace ( chart , newC );
                        System.out.println ( password );
                        text=password;
                    } else {
                        System.out.println ( "Nothing to replace!" );
                    }
                }
                    break;
            }
            input= scanner.nextLine ( ).split ( " " );
        }
        System.out.println ("Your password is: "+text );
    }
}

