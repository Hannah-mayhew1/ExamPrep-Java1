package org.softwire.training.p2_primitive_types;

public class L4_Char {

    public static void main(String[] args) {

        char aChar = 'a';
        System.out.println(aChar);
        aChar++;
        System.out.println(aChar);

        String helloWorld = "Hello, World!";

        char charZero = helloWorld.charAt(0);
        System.out.println(charZero);

        char[] arrayOfChars = helloWorld.toCharArray();
        System.out.println(arrayOfChars[0]);
    }
}

//aChar ++ increments character value to 'b'
