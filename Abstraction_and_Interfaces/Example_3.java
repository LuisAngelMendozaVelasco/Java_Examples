/////////////////////////
// Multiple interfaces //
/////////////////////////

// To implement multiple interfaces, separate them with a comma.

interface FirstInterface {
    public void myMethod(); // Interface method
}
  
interface SecondInterface {
    public void myOtherMethod(); // Interface method
}
  
// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class Example_3 {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();

        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

/*
Output:

Some text..
Some other text...
*/