package softUni;

import java.util.Scanner;

public class MathodGreaterOfTwoValues {
    static int getMax(int a,int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
          }

    static char getMax(char a,char b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
    static String getMax(String a,String b) {
        if ( a.compareTo ( b ) > 0 ) {
            return a;
        } else {
            return b;
        }
    }
        public static void main ( String[] args ){
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            if (input.equals("int")){
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
            } else if (input.equals("char")){
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.println(getMax(first, second));
            } else if (input.equals("String")){
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println(getMax(first, second));
            }

    }
}
