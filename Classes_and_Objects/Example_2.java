////////////////////////////////////////
// Create multiple objects of a class //
////////////////////////////////////////

public class Example_2 {
    int x = 5;

    public static void main(String[] args) {
        Example_2 myObj1 = new Example_2();
        Example_2 myObj2 = new Example_2();

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}

/*
Output:

5
5
*/