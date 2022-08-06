//Create a class constructor

public class Example_10 {
    int x;

    // Create a class constructor for the Main class
    public Example_10() {
        x = 5;
    }
  
    public static void main(String[] args) {
        Example_10 myObj = new Example_10();
        
        System.out.println(myObj.x);
    }
}