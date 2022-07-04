package Uni;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMd5 {
    // A Java program that uses the MD5 to do the hashing


        public static java.lang.String getMd5 ( java.lang.String input ) {
            try {
                // invoking the static getInstance() method of the MessageDigest class
                // Notice it has MD5 in its parameter.
                MessageDigest msgDst = MessageDigest.getInstance ( "MD5" );

                // the digest() method is invoked to compute the message digest
                // from an input digest() and it returns an array of byte
                byte[] msgArr = msgDst.digest ( input.getBytes ( ) );

                //getting signum representation from byte array msgArr
                BigInteger bi = new BigInteger ( 1 , msgArr );

                // Converting into hex value
                java.lang.String hshtxt = bi.toString ( 16 );

                while ( hshtxt.length ( ) < 32 ) {
                    hshtxt = "0" + hshtxt;
                }
                return hshtxt;
            } catch (NoSuchAlgorithmException abc) {
                throw new RuntimeException ( abc );
            }
        }

        public static void main ( String args[] ) throws NoSuchAlgorithmException {
            //The HashCode Generated for 'MyPassword1234' is: dbeb1c353a8a988d19460a0c30b5aa08
            //The HashCode Generated for 'MyPassword1234' is: e19d5cd5af0378da05f63f891c7467af
            java.lang.String str = "abcd1234";
            java.lang.String hash = getMd5 ( str );
            str = "'MyPassword1234'";
            System.out.println ( "The HashCode Generated for " + str + " is: " + hash );
        }
    }

