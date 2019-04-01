package org.softwire.training.p2_primitive_types;

public class L1_Boolean {

    public static void main(String[] args) {

        boolean thisIsTrue = true;
        boolean thisIsFalse = false;

        System.out.println("thisIsTrue: " + thisIsTrue); //true
        System.out.println("thisIsFalse: " + thisIsFalse); //false
        System.out.println("");


        boolean oneEqualsTwo = (1 == 2);
        boolean twoGreaterThanOne = (2 > 1);

        System.out.println("oneEqualsTwo: " + oneEqualsTwo); // false
        System.out.println("twoGreaterThanOne: " + twoGreaterThanOne); // true
        System.out.println("");


        String hello = "Hello";
        String sumOfLetters = "H" + "e" + "l" + "l" + "o";

        boolean helloEqualsSumOfLetters = hello.equals(sumOfLetters);

        System.out.println("helloEqualsSumOfLetters: " + helloEqualsSumOfLetters); //true
        System.out.println("");


        if (2 > 1) {
            System.out.println("2 > 1 is true");
        }
        if (twoGreaterThanOne) {
            System.out.println("twoGreaterThanOne is true");
        }
        if (hello.equals(sumOfLetters)) {
            System.out.println("hello equals h + e + l + l + o");
        }

    }
}
