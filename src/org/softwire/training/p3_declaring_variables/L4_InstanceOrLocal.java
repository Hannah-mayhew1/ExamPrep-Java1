package org.softwire.training.p3_declaring_variables;

public class L4_InstanceOrLocal {
}

// ????????????????????
// Which of these are:
// - INSTANCE variables
// - LOCAL variables
// ????????????????????

class SomeClass {
    int intA; //instance
    { int intB; } // local - inside braces
    int intC; // instance
    public SomeClass() {
        int intD; // local
    }
    private void init() {
        int intE; // local
    }
}
