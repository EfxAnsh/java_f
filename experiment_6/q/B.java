package experiment_6.q;

import experiment_6.P.A; 

public class B extends A {
    public static void main(String[] args) {
        A objA = new A();
        
        objA.publicMethod(); 

         //objA.protectedMethod(); 
        // objA.defaultMethod();   
        // objA.privateMethod();   

        
        B objB = new B();
        objB.protectedMethod(); 
    }
}
