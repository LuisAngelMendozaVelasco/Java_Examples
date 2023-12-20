////////////////////////////
// An enum inside a class //
////////////////////////////

public class Example_2 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    
    public static void main(String[] args) { 
        Level myVar = Level.MEDIUM; 

        System.out.println(myVar); 
    } 
}

/*
Output:

MEDIUM
*/