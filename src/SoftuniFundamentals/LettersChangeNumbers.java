package SoftuniFundamentals;
//Nakov likes Math. But he also likes the English alphabet a lot. He invented a game with numbers and letters from the English alphabet. The game was simple. You get a string consisting of a number between two letters. Whether the letter was in front of the number or after it, you would perform different mathematical operations on the number to achieve the result.
//First, you start with the letter before the number.
//•	If it's uppercase, you divide the number by the letter's position in the alphabet.
//•	If it's lowercase, you multiply the number with the letter's position in the alphabet.
//Then you move to the letter after the number.
//•	If it's uppercase, you subtract its position from the resulted number.
//•	If it's lowercase, you add its position to the resulted number.
//But the game became too easy for Nakov was really quick. He complicated it a bit by doing the same but with multiple strings keeping track of only the total sum of all results. Once he started to solve this with more strings and bigger numbers, it became quite hard to do it only in his mind. So he kindly asks you to write a program that calculates the sum of all numbers after the operations on each number have been done.
//For example, you are given the sequence "A12b s17G":
//We have two strings – "A12b" and "s17G". We do the operations on each and sum them. We start with the letter before the number on the first string. A is Uppercase, and its position in the alphabet is 1. So we divide the number 12 by position 1 (12/1 = 12). Then we move to the letter after the number. b is lowercase, and its position is 2. So we add 2 to the resulting number (12+2=14). Similarly, for the second string s is lowercase, and its position is 19, so we multiply it with the number (17*19 = 323). Then we have Uppercase G with position 7, subtracting it from the resulting number (323 – 7 = 316). Finally, we sum the 2 results and get 14 + 316=330.
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( "\\s+" );
String number="";
char nex=' ';
double sumVor=0.0;
double sumAfter=0.0;
        for ( int i = 0 ; i < input.length ; i++ ) {
            char current=input[i].charAt ( 0 );
            number="";
            for ( int j = 1 ; j < input[i].length () ; j++ ) {

                char next=input[i].charAt ( j );
                if (Character.isDigit ( next )){
                    number+=next;
                }else{

                   nex=next;
                }

            }
if (Character.isUpperCase ( current )){
Character help=Character.toLowerCase ( current );
int position=help-'a'+1;
double num=Double.parseDouble ( number );
sumVor=sumVor+(num/position);
}else if (Character.isLowerCase ( current )){
    int position=current-'a'+1;
    double num=Double.parseDouble ( number );
    sumVor=sumVor+(num*position);
}
            if (Character.isUpperCase ( nex )){
                Character help=Character.toLowerCase ( nex );
                int position=help-'a'+1;
                double num=Double.parseDouble ( number );
                sumAfter=sumAfter-position;
            }else if (Character.isLowerCase ( nex )){
                int position=nex-'a'+1;
                double num=Double.parseDouble ( number );
                sumAfter=sumAfter+position;
            }


        }
        System.out.printf ("%.2f",sumVor+sumAfter );
    }
}
