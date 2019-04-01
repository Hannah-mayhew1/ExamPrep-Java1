package org.softwire.training.p2_primitive_types;

public class L5_PrimitiveVsReferenceTypes {

    public static void main(String[] args) {

        // ??????????????????????????????????????????
        // Which of the following lines will compile?
        // ??????????????????????????????????????????

//        int intOne = null; // no
//        Integer intTwo = null; // yes - non primitive type - this exists to allow you to type in to < > for instance when writing lists of primitive int types

//        string stringOne = null; // no
//        String stringTwo = null; // yes


        // ??????????????????????????????????????????
        // Which of the following lines will compile?
        // ??????????????????????????????????????????

        int intThree = 123;
        Integer intFour = 456;

        //String stringThree = intThree.toString();  No - toString is a method of class Integer. Primitive types do not have methods
        //String stringFour = intFour.toString();

    }
}
