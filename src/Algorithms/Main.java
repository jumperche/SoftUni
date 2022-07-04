package Algorithms;

import java.util.regex.*;

public class Main {


        public static void main(String[] args) {
            final String regex = "[A-Z]+";
            final String string = "Most built-in functions for strings and tuples are linear in time with the exception of len() and having to index elements, these two are constant in time. Most methods for lists are linear as well but lists have a few more exceptions to this than do strings and tuples. Adding or appending elements to the end of a list is considered constant O(c) or more specifically O(1). Removing items from the end of a list is also linear. Sorting a list is O(n logn) using sort() or the time for sorting depends on the algorithm used as discussed earlier in these notes.\n"
                    + "Dictionary methods in general run in constant time. Exceptions to this are updating the dictionary, whose runtime depends in the size of the dictionary being used as a parameter, not the dictionary to be updated and looping through iterators. While looping through keys, values, and items is constant time, looping through iterators is in linear time.";

            final Pattern pattern = Pattern.compile(regex);
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()) {
                System.out.println("Full match: " + matcher.group(0));

                for (int i = 1; i <= matcher.groupCount(); i++) {
                    System.out.println("Group " + i + ": " + matcher.group(i));
                }
            }
        }
    }


