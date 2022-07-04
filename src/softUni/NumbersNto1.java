package softUni;

import java.util.Scanner;

public class NumbersNto1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());

            for(    int i = x; i>=1 ;i--){
                System.out.println(i);
            }
        }
    }



