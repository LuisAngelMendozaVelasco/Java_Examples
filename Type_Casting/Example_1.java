//////////////////////
// Widening casting //
//////////////////////

public class Example_1 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}

/*
Output:

9
9.0
*/