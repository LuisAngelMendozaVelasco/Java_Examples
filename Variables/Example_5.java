//////////////////////////////////////////////////////////
// Create a final variable (unchangeable and read-only) //
//////////////////////////////////////////////////////////

public class Example_5 {
    public static void main(String[] args) {
        final int myNum = 15;

        myNum = 20; // will generate an error
        System.out.println(myNum);
    }
}

/*
Output:

error: cannot assign a value to final variable myNum
*/