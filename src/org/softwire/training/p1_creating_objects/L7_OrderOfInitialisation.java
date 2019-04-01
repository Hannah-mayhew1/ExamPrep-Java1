package org.softwire.training.p1_creating_objects;

public class L7_OrderOfInitialisation {

    public static void main(String[] args) {

        Giraffe g = new Giraffe();
        System.out.println("The giraffe's age is... " + g.age);

    }
}


class Giraffe {

    {
        age = 5; //instance initialiser
    }

    public int age = 4; // instance variable

    public Giraffe() { // constructor
        age = 3;
    }

    {
        age = 6; // instance initialiser
    }

    // processes the instance/field variables first - in order they appear - age 5, age 4, then age 6
    // processes the constructor last which overrides the previous declarations
}
