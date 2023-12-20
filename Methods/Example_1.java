//////////////////////////////
// Create and call a method //
//////////////////////////////

/*
myMethod() is the name of the method.
static means that the method belongs to the Main class and not an object of the Main class.
void means that this method does not have a return value.
*/

public class Example_1 {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args) {
        myMethod();
    }
}

/*
Output:

I just got executed!
*/