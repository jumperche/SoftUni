package Uni;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;
import java.util.Scanner;

import java.util.*;

import java.util.Map.*;

public class Hash1 {
    public static String getMd5( String input) {
        try {
            // invoking the static getInstance() method of the MessageDigest class
            // Notice it has MD5 in its parameter.
            MessageDigest msgDst = MessageDigest.getInstance("MD5");

            // the digest() method is invoked to compute the message digest
            // from an input digest() and it returns an array of byte
            byte[] msgArr = msgDst.digest(input.getBytes());

            //getting signum representation from byte array msgArr
            BigInteger bi = new BigInteger(1, msgArr);

            // Converting into hex value
            String hshtxt = bi.toString(16);

            while (hshtxt.length() < 32) {
                hshtxt = "0" + hshtxt;
            }
            return hshtxt;
        } catch (NoSuchAlgorithmException abc) {
            throw new RuntimeException(abc);
        }
    }

    public static void main( String[] args) {
        Scanner scan = new Scanner (System.in);
        String input = "";
        Hashtable< String, String > hashtable = new Hashtable<>();
        int choice = 0;
        while (true) {
            System.out.println("1. Add password to hashtable.");
            System.out.println("2. Print hashtable.");
            System.out.println("3. Search element.");
            System.out.println("4. Exit");
            try {
                choice = Integer.parseInt(scan.nextLine());
            }
            catch (NumberFormatException e) {
                choice = 0;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter password:");
                    input = scan.nextLine();
                    System.out.println(stringHash(input));
                    String hash = getMd5(input);
                    hashtable.put(input, hash);
                    break;
                case 2:
                    /*
                    Iterator<String> keys = hashtable.keySet().iterator();
                    Iterator<String> vals = hashtable.values().iterator();
                    while (keys.hasNext()) {
                        System.out.println(keys.next() + ":" + vals.next());
                    }*/

                    Set<Entry< String, String >> entries = hashtable.entrySet();
                    Iterator<Entry< String, String >> iter = entries.iterator();
                    while (iter.hasNext()) {
                        Entry< String, String > entry = iter.next();
                        System.out.println(entry.getKey() + ":" + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Search for password:");
                    input = scan.nextLine();
                    System.out.println("Password in hashtable:" + hashtable.containsKey(input));
                    System.out.println(hashtable.get(input));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such option.");
                    break;
            }
        }
    }

    public static int stringHash( String s) {
        int h = s.length();
        for(char c : s.toCharArray()) {
            h ^= c;
        }
        return h;
    }
}
