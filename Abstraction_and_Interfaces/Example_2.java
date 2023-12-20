/////////////////////////////////
// Java interface (implements) //
/////////////////////////////////

/*
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies.
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class.
*/

interface Animal {
    // Interface methods (does not have a body)
    public void animalSound(); 
    public void sleep();
}
  
class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee.");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

public class Example_2 {
    public static void main(String[] args) {
        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();
    }
}

/*
Output:

The pig says: wee wee.
Zzz...
*/