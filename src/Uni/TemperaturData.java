package Uni;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TemperaturData {




        private static void generateTemperatureArray
                (int[][] temperature, int maxA, int minA, int maxB, int minB) {
            Random random = new Random();

            for (int month = 1; month < 13; month++) {
                for (int day = 1; day < 32; day++) {
                    if (month == 3 || month == 10) {
                        temperature[month - 1][day - 1] = random.nextInt((maxA - minA) + 1) + minA;
                    } else {
                        temperature[month - 1][day - 1] = random.nextInt((maxB - minB) + 1) + minB;
                    }
                }
            }
            System.out.println();
            printTemperatureArray(temperature);
        }

        private static void printTemperatureArray(int[][] temperature) {
            for (int month = 1; month < 13; month++) {
                System.out.printf("Month: %d:   ", month);
                for (int day = 1; day < 32; day++) {
                    System.out.print(temperature[month - 1][day - 1] + " ");
                }
                System.out.println();
            }
        }


        private static void printMinTemperature(int[][] temperature) {
            int minDay = 0;
            int minMonth = 0;
            int minT = Integer.MAX_VALUE;
            Map<Integer, Integer> minMap = new HashMap<> ();

            for (int month = 1; month < 13; month++) {
                for (int day = 1; day < 13; day++) {
                    if (temperature[month - 1][day - 1] < minT) {
                        minT = temperature[month - 1][day - 1];
                        minMap.put(month, day);
                        minDay = day;
                        minMonth = month;
                    }
                }
            }
            System.out.printf("Min temp is %d.0C on Data %d.%d.22 \n", minT, minDay, minMonth);
        }

        private static void printMaxTemperature(int[][] temperature) {
            int maxDay = 0;
            int maxMonth = 0;
            int maxT = Integer.MIN_VALUE;
            Map<Integer, Integer> maxMap = new HashMap<>();

            for (int month = 1; month < 13; month++) {
                for (int day = 1; day < 13; day++) {
                    if (temperature[month - 1][day - 1] > maxT) {
                        maxT = temperature[month - 1][day - 1];
                        maxMap.put(month, day);
                        maxDay = day;
                        maxMonth = month;
                    }
                }
            }
            System.out.printf("Max temp is %d.0C on Data %d.%d.22 \n", maxT, maxDay, maxMonth);
        }

        private static String averageTempInDate(int[][] temperature, int thisDay) {
            int[] monthTempInThisDay = new int[12];
            double sum = 0, count = 0,avrT = 0.00;

            for (int month = 1; month < 13; month++) {
                for (int day = 1; day < 32; day++) {
                    if (day == thisDay) {
                        monthTempInThisDay[month - 1] = temperature[month - 1][day - 1];
                        sum += temperature[month - 1][day - 1];
                        count++;
                        avrT = sum / count;
                    }
                }
            }

            return "Average Temperature in day " + thisDay + " is: " + Math.floor(avrT) + "C" + "\n";
        }

        private static void printMaxTempByMonth(int[][] temperature) {
            String monthName = "";
            String[] montHName = new String[12];
            Map<String,Integer> tempMap = new HashMap<>();
            int[] temp = new int[12];
            int maxT = Integer.MIN_VALUE;

            for (int month = 1; month < 13; month++) {
                maxT = 0;                                     // <- !
                switch (month) {
                    case 1 -> {monthName = "January";}
                    case 2 -> {monthName = "February";}
                    case 3 -> {monthName = "March";}
                    case 4 -> {monthName = "April";}
                    case 5 -> {monthName = "May";}
                    case 6 -> {monthName = "June";}
                    case 7 -> {monthName = "July";}
                    case 8 -> {monthName = "August";}
                    case 9 -> {monthName = "September";}
                    case 10 -> {monthName = "October";}
                    case 11 -> {monthName = "November";}
                    case 12 -> {monthName = "December";}
                }
                for (int day = 1; day < 32; day++) {
                    if (temperature[month - 1][day - 1] > maxT){
                        maxT = temperature[month - 1][day - 1];
                        montHName[month - 1] = monthName;
                        temp[month - 1] = maxT;
                        tempMap.put(monthName, maxT);
                    }
                }
            }

            printMonthByTemp(montHName, temp,12);

//        System.out.println();
//        printMap(tempMap);
//        System.out.println();
//        printStringArray(montHName);
//        printIntArray(temp);
        }

        private static void sortTemperatureArrayParallelWithMonthArray(int[] temp, String[] montHTemp) {
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    if (temp[i] > temp[j]){
                        int tmpA = temp[i];
                        String tmpB = montHTemp[i];
                        temp[i] = temp[j];
                        montHTemp[i] = montHTemp[j];
                        temp[j] = tmpA;
                        montHTemp[j] = tmpB;
                    }
                }
            }
        }

        private static void printMonthByTemp(String[] montHName, int[] temp, int monthCount) {
            sortTemperatureArrayParallelWithMonthArray(temp, montHName);
            if (monthCount > temp.length){
                System.out.print("ERROR: Month count is greater than 12");
                return;
            }
            for (int i = 0; i < monthCount; i++) {
                System.out.println();
                System.out.printf("%s", montHName[i]);
                System.out.printf(" = %d.0C", temp[i]);
            }
        }

        private static void sortMonthArrayByLexicographically(String[] monthArray){
            for (int i = 0; i < monthArray.length; i++) {
                for (int j = 0; j < monthArray.length; j++) {
                    if (monthArray[i].charAt(0) < monthArray[j].charAt(0)){
                        String tempo = monthArray[i];
                        monthArray[i] = monthArray[j];
                        monthArray[j] = tempo;
                    }
                }
            }
        }

        private static void printMap(Map<String, Integer> tempMap) {
            System.out.println();
            for (String Key : tempMap.keySet()){
                System.out.printf("%s = %d.0C \n",Key, tempMap.get(Key));
            }
        }


        public static void main(String[] args) {

        /*
         В таблица 12х31 са записани средните дневни температури за една година.
        Генерирайте случайни данни, като знаете,
        че за месеци ноември – март средните стойности са в интервал [-20; 10],
        а за останалите месеци [5; 35].
        Месеци, в които няма всички дати от календара се записват с температури -200.

        Използвайте данните и изведете следните справки:
            3.1. Изведете дата / месец на най-ниските температури
            3.2. Изведете средната температура за дата 26, независимо от месеца
            3.3. Изведете имената на трите месеца с най-високи температури,
            като ги подредите в намаляващ ред по температурите
         */

            int[][] temperature = new int[13][32];
            int maxA = 10;
            int minA = -20;
            int maxB = 35;
            int minB = 5;


            generateTemperatureArray
                    (temperature, maxA, minA, maxB, minB);
            System.out.println();

            printMinTemperature(temperature);
            // printMaxTemperature(temperature);

            System.out.println(averageTempInDate(temperature,26));

            System.out.print("Max temperature by month: ");
            printMaxTempByMonth(temperature);
        }
    }


