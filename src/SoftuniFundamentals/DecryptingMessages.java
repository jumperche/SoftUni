package SoftuniFundamentals;

import java.util.*;
//You will receive a key (integer) and n characters afterward. Add the key to each of the characters and append them to the message. At the end print the message, which you decrypted.
public class DecryptingMessages {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int key = Integer.parseInt ( scanner.nextLine ( ) );
        int line = Integer.parseInt ( scanner.nextLine ( ) );
        //String message="";
        String inputOut="";
        for ( int i = 0 ; i < line ; i++ ) {
            String input=scanner.nextLine ();
            int ch=(int) input.charAt ( 0 )+key;
            char cha= (char) ch;
            inputOut=inputOut+cha;
        }
        System.out.println ( inputOut);
    }
}
