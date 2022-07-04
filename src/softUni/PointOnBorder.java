package softUni;

import java.util.Scanner;

public class PointOnBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ax1 = Double.parseDouble(scanner.nextLine());
        double ay1 = Double.parseDouble(scanner.nextLine());
        double ax2 = Double.parseDouble(scanner.nextLine());
        double ay2 = Double.parseDouble(scanner.nextLine());
        double ax = Double.parseDouble(scanner.nextLine());
        double ay = Double.parseDouble(scanner.nextLine());
double x1=ax1;
double y1=ay1;
double x2=ax2;
double y2=ay2;
double x=ax;
double y=ay;
if ((x1<1)&&(y1<y2)){

}
    else if (((x1==x)||(x==x2))&&((y1<=y)&&(y<=y2))) {
            System.out.print("Border");
        }
    else if(((y1==y)||(y==y2))&&((x1<=x)&&(x<=x2))) {
            System.out.print("Border");
        }

    else {
        System.out.print("Inside / Outside");
    }
}
    }
