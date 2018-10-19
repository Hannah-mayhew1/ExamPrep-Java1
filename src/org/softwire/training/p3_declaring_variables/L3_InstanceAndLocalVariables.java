package org.softwire.training.p3_declaring_variables;

public class L3_InstanceAndLocalVariables {

    public static void main(String[] args) {

        // ????????????????????????????
        // What is going to be printed?
        // ????????????????????????????

        MyClass myClass = new MyClass();

        myClass.doThing();
        myClass.doThing();
        myClass.doThing();

    }
}


class MyClass {
    private int instanceVariable = 0;

    void doThing() {
        int localVariable = 0;

        instanceVariable++;
        localVariable++;

        System.out.println("instanceVariable: " + instanceVariable);
        System.out.println("localVariable: " + localVariable);
        System.out.println("");
    }

}
