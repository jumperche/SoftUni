package SoftuniFundamentals;
//You are an astronaut who just embarked on a mission across the solar system. Since you will be in space for a long time, you have packed a lot of food with you. Create a program, which helps you identify how much food you have left and gives you information about its expiration date.
//On the first line of the input, you will be given a text string. You must extract the information about the food and calculate the total calories.
//First, you must extract the food info. It will always follow the same pattern rules:
//•	It will be surrounded by "|" or "#" (only one of the two) in the following pattern:
//#{item name}#{expiration date}#{calories}#   or
//|{item name}|{expiration date}|{calories}|
//•	The item name will contain only lowercase and uppercase letters and whitespace
//•	The expiration date will always follow the pattern: "{day}/{month}/{year}", where the day, month, and year will be exactly two digits long
//•	The calories will be an integer between 0-10000
//Calculate the total calories of all food items and then determine how many days you can last with the food you have. Keep in mind that you need 2000kcal a day.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String input = scanner.nextLine ( );
        String regex = "(#?\\|?)(?<name>[A-Za-z ]+)(?:\\1)(?<date>\\d{2}\\/\\d{2}\\/\\d{2})(?:\\1)(?<calorie>\\d+)\\1";

        Pattern pattern = Pattern.compile ( regex );
        Matcher matcher = pattern.matcher ( input );
        int calories = 0;
        while ( matcher.find ( ) ) {
            calories = calories + Integer.parseInt ( matcher.group ( "calorie" ) );
        }
        int day = calories / 2000;
        System.out.printf ( "You have food to last you for: %d days!%n" , day );
        pattern = Pattern.compile ( regex );
        matcher = pattern.matcher ( input );
        while ( matcher.find ( ) ) {
            String name = matcher.group ( "name" );
            String date = matcher.group ( "date" );
            String calorie = matcher.group ( "calorie" );
            System.out.printf ( "Item: %s, Best before: %s, Nutrition: %s%n" , name , date , calorie );
        }
     }
}
