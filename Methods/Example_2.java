//////////////////////////////////
// Call a method multiple times //
//////////////////////////////////

public class Example_2 {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}

/*
Output:

I just got executed!
I just got executed!
I just got executed!
*/