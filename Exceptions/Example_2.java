///////////////////////////
// The finally statement //
///////////////////////////

public class Example_2 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};

            System.out.println(myNumbers[10]);
        } 
        catch(Exception e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

/*
Output:

java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
The 'try catch' is finished.
*/