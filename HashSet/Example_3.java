///////////////////////////////////
// Remove an item from a HashSet //
///////////////////////////////////

// Import the HashSet class
import java.util.HashSet;

public class Example_3 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.remove("Volvo");
        System.out.println(cars);
    }
}

/*
Output:

[Mazda, Ford, BMW]
*/