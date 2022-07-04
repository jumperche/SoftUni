package softUni;

import java.util.Scanner;

public class HalfSumElement {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 1; i <=n ; i++) {
                int x = Integer.parseInt(scanner.nextLine());
                sum = sum + x;
                if (max < x) {
                    max = x;

                }
            }
                int total=sum-max;
                if (total==max){
                    System.out.println("Yes");
                    System.out.println("Sum = "+max);
                }
                    else {
                        int result=Math.abs(total-max);
                    System.out.println("No");
                    System.out.println("Diff = "+result);
                }

        }
    }


