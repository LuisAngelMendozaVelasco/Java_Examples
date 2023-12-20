///////////////////////////////
// The try...catch statement //
///////////////////////////////

public class Example_1 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            
            System.out.println(myNumbers[10]);
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

/*
Output:

java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
*/