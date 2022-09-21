package SoftuniFundamentals;
//Explosions are marked with ">". Immediately after the mark, there will be an integer, which signifies the strength of the explosion.
//You should remove x characters (where x is the strength of the explosion), starting after the punched character (">").
//If you find another explosion mark (">") while you're deleting characters, you should add the strength to your previous explosion.
//When all characters are processed, print the string without the deleted characters.
//You should not delete the explosion character – ">", but you should delete the integers, which represent the strength.
import java.util.Scanner;

public class SringExplosion {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        StringBuilder text=new StringBuilder ( input );
        int strengh=0;
        for ( int i = 0 ; i < text.length ( ) ; i++ ) {
            char current= text.charAt ( i);
            if (current=='>'){
                int helper=Integer.parseInt ( text.charAt ( i+1 )+"");
                strengh+=helper;
            }
            else if (current!='>'&&strengh>0){
                text.deleteCharAt ( i );
                strengh--;
                i--;
            }
        }
        System.out.println (text );

    }
}
