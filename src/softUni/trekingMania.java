package softUni;

import java.util.Scanner;

public class trekingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
double peopleSum=0;
int musala=0;
int mon=0;
int kil=0;
int k2=0;
int everest=0;

        for (int i = 1; i <=n ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            peopleSum =peopleSum+ people;
            if (people<=5){
                musala=musala+people;
            }
            if (people>=6&&people<=12){
                mon=mon+people;
            }
            if (people>=13&&people<=25){
                kil=kil+people;
            }
            if (people>=26&&people<=40){
                k2=k2+people;
            }
            if (people>=41){
                everest=everest+people;
            }
        }
double prMu=musala/peopleSum*100.00;
        double prMo=mon/peopleSum*100.00;
        double prK=kil/peopleSum*100.00;
double prK2=k2/peopleSum*100.00;
double prE=everest/peopleSum*100.00;
        System.out.printf("%.2f%%%n",prMu);
        System.out.printf("%.2f%%%n",prMo);
        System.out.printf("%.2f%%%n",prK);
        System.out.printf("%.2f%%%n",prK2);
        System.out.printf("%.2f%%%n",prE);
    }
}
