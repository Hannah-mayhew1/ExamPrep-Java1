package org.softwire.training.p3_declaring_variables;

public class L5_WhichVariablesNeedInitialising {

    public static void main(String[] args) {

        // ????????????????
        // Will these work?
        // ????????????????

//        Tiger tiger = new Tiger();
//        System.out.println("tiger.age: " + tiger.age);    // 0
//        System.out.println("tiger.hasFur: " + tiger.hasFur); // false
//        System.out.println("tiger.name: " + tiger.name); // null

        int myAge;
        boolean doIHaveFur;
        String myName;

//        System.out.println("myAge: " + myAge); //local variables need to be initialised
//        System.out.println("doIHaveFur: " + doIHaveFur); //local variables need to be initialised
//        System.out.println("myName: " + myName); //local variables need to be initialised

    }
}


class Tiger {
    public int age;
    public boolean hasFur;
    public String name;
}
