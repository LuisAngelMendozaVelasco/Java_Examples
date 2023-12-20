////////////////////////////////////////
// Override existing attribute values //
////////////////////////////////////////

public class Example_5 {
    int x = 10;

    public static void main(String[] args) {
        Example_5 myObj = new Example_5();

        myObj.x = 25; // x is now 25
        System.out.println(myObj.x);
    }
}

/*
Output:

25
*/