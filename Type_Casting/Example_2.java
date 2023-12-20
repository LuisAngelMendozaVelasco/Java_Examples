///////////////////////
// Narrowing casting //
///////////////////////

public class Example_2 {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Explicit casting: double to int
    
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}

/*
Output:

9.78
9
*/