package SoftuniFundamentals;

import java.util.*;

//Write a method that receives two numbers and an operator, calculates the result, and returns it.
// You will be given three lines of input. The first will be the first number, the second one will be
// the operator and the last one will be the second number. The possible operators are: / * + -
//Print the result rounded up to the second decimal point.
public class MathOperations {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        String operation=scanner.nextLine ();
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        System.out.println (calculate ( a,operation,b ) );
    }
    static int calculate(int a,String operation,int b){

        switch (operation){
            case "+":
                return a+b;


            case "-":
                return a-b;

            case "*":
                return a*b;

            case "/":
                return a/b;

            default:
                return -1;
        }
    }
}
