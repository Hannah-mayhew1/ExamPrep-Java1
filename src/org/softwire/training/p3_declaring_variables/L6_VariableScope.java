package org.softwire.training.p3_declaring_variables;

public class L6_VariableScope {

    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountOne(int price) {

//        if (price > 100) {
//            int discount = 20;
//        }
//        else {
//            int discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount); - no because variable is only declared within if statement
    }


    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountTwo(int price) {

//        int discount;
//        if (price > 100) {
//            discount = 20;
//        }
//        else {
//            discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount); yes
    }


    // ???????????????
    // Will this work?
    // ???????????????
    private static void calculateDiscountThree(int price) {

//        int discount;
//        if (price > 100) {
//            int discount = 20; // no need to declare type again
//        }
//        else {
//            int discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount);
    }

}


// ???????????????
// Will this work?    yes
// ???????????????
class AnotherClass {

//    int discount;
//
//    void calculateDiscountThree(int price) {
//        if (price > 100) {
//            discount = 20;
//        }
//        else {
//            discount = 5;
//        }
//
//        System.out.println(price);
//        System.out.println(discount);
//    }

}
